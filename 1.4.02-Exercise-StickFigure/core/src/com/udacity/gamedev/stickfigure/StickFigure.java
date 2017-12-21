package com.udacity.gamedev.stickfigure;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * TODO: Start here
 *
 * In this exercise you'll set up a ShapeRenderer, and use it to draw a stick figure. At minimum,
 * you'll need a circle for the head, and five lines for the torso, arms, and legs.
 *
 * Remember to set up a ShapeRenderer you'll need to declare it, initialize it, and dispose of it.
 * Then to actually use the ShapeRenderer you'll need to start a batch of the appropriate type, draw
 * your shapes, and end the batch.
 *
 * We don't have step-by-step TODOs for this one, since the aim is for you to remember the steps for
 * setting up a ShapeRenderer and be able to set one up on your own. Of course, the solution is
 * available if you run into anything confusing.
 */
public class StickFigure extends ApplicationAdapter {

    ShapeRenderer renderer;

    @Override
    public void create() {
        renderer = new ShapeRenderer();
    }

    @Override
    public void dispose() {
        renderer.dispose();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        float mid = Gdx.graphics.getWidth() / 2;

        renderer.begin(ShapeRenderer.ShapeType.Filled);
        renderer.circle(mid, 350, 50);
        renderer.end();

        renderer.begin(ShapeRenderer.ShapeType.Line);
        renderer.line(mid, 130, mid, 310);
        renderer.line(mid - 70, 70, mid, 130);
        renderer.line(mid + 70, 70, mid, 130);
        renderer.line(mid - 70, 220, mid, 270);
        renderer.line(mid + 70, 220, mid, 270);
        renderer.end();

    }
}
