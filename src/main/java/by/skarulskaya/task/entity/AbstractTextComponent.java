package by.skarulskaya.task.entity;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public abstract class AbstractTextComponent implements Iterable<AbstractTextComponent> {
    protected final TextComponentType componentType;

    public AbstractTextComponent(TextComponentType componentType) {
        this.componentType = componentType;
    }

    @Override
    public abstract Iterator<AbstractTextComponent> iterator();

    @Override
    public abstract void forEach(Consumer<? super AbstractTextComponent> action);

    @Override
    public abstract Spliterator<AbstractTextComponent> spliterator();

    public abstract void addChild(AbstractTextComponent component);
    public abstract void removeChild(AbstractTextComponent component);
}
