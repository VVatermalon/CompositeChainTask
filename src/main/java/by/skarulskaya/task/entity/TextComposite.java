package by.skarulskaya.task.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class TextComposite extends AbstractTextComponent{
    protected final List<AbstractTextComponent> components = new ArrayList<>();

    public TextComposite(TextComponentType type) {
        super(type);
    }
    @Override
    public Iterator<AbstractTextComponent> iterator() {
        return components.iterator();
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
        components.add(component);
    }

    @Override
    public void removeChild(AbstractTextComponent component) {
        components.remove(component);
    }
}
