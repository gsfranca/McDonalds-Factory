package buttons;

/**
 * Interface que define o que um botão deve ter.
 * Todo botão precisa saber como se "renderizar" e reagir a "cliques".
 */
public interface Button {
    void render();
    void onClick();
}
