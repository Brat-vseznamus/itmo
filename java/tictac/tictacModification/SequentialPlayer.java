package tictac.tictacModification;

/**
 * @author Georgiy Korneev (kgeorgiy@kgeorgiy.info)
 */
public class SequentialPlayer implements Player {
    
    @Override
    public Move move(final Position position, final Cell cell) {
        for (int r = 0; r < position.getSettings().getM(); r++) {
            for (int c = 0; c < position.getSettings().getN(); c++) {
                final Move move = new Move(r, c, cell);
                if (position.isValid(move)) {
                    return move;
                }
            }
        }
        throw new IllegalStateException("No valid moves");
    }
}
