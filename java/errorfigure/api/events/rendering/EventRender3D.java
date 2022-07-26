/*
 * Decompiled with CFR 0_132.
 */
package errorfigure.api.events.rendering;

import com.darkmagician6.eventapi.events.Event;
import shadersmod.client.Shaders;

public class EventRender3D
        implements Event {
    private float ticks;
    private boolean isUsingShaders;

    public EventRender3D() {
        this.isUsingShaders = Shaders.getShaderPackName() != null;
    }

    public EventRender3D(float ticks) {
        this.ticks = ticks;
        this.isUsingShaders = Shaders.getShaderPackName() != null;
    }

    public float getPartialTicks() {
        return this.ticks;
    }

    public boolean isUsingShaders() {
        return this.isUsingShaders;
    }
}

