package com.game.Model;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TextEmitter {
    private FlyingText[] items;

    public TextEmitter() {
        items = new FlyingText[50];
        for (int i = 0; i < items.length; i++) {
            items[i] = new FlyingText();
        }
    }

    public void render(SpriteBatch batch, BitmapFont font24) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].isActive()) {
                font24.draw(batch, items[i].getText(), items[i].getPosition().x, items[i].getPosition().y);
            }
        }
    }

    public void setup(float x, float y, StringBuilder text) {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].isActive()) {
                items[i].setup(x, y, text);
                break;
            }
        }
    }

    public void update(float dt) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].isActive()) {
                items[i].update(dt);
            }
        }
    }

    public static class Weapon {
        private String name;
        private float attackRadius;
        private float attackPeriod;
        private float damage;

        public String getName() {
            return name;
        }

        public float getAttackRadius() {
            return attackRadius;
        }

        public float getAttackPeriod() {
            return attackPeriod;
        }

        public float getDamage() {
            return damage;
        }

        public Weapon(String name, float attackRadius, float attackPeriod, float damage) {
            this.name = name;
            this.attackRadius = attackRadius;
            this.attackPeriod = attackPeriod;
            this.damage = damage;
        }
    }
}
