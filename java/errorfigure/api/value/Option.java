/*
 * Decompiled with CFR 0_132.
 */
package errorfigure.api.value;

public class Option<V>
extends Value<V> {
    public Option(String displayName, String name, V enabled) {
        super(displayName, name);
        this.setValue(enabled);
    }
}

