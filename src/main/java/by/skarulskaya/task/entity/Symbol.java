package by.skarulskaya.task.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Symbol extends AbstractTextComponent{
    private static final Logger logger = LogManager.getLogger();
    private char value;

    public Symbol(char value) {
        super(TextComponentType.SYMBOL);
        this.value = value;
    }
    @Override
    public Iterator<AbstractTextComponent> iterator() {
        return Collections.emptyIterator();
    }

    @Override
    public void forEach(Consumer<? super AbstractTextComponent> action) {

    }

    @Override
    public Spliterator<AbstractTextComponent> spliterator() {
        return null;
    }

    @Override
    public void addChild(AbstractTextComponent component) {
        logger.error("Cannot use addChild method for Symbol object");
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeChild(AbstractTextComponent component) {
        logger.error("Cannot use removeChild method for Symbol object");
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Symbol{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
