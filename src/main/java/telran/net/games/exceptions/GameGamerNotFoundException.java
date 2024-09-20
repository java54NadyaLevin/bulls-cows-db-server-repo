package telran.net.games.exceptions;

@SuppressWarnings("serial")
public class GameGamerNotFoundException extends IllegalArgumentException {
	public GameGamerNotFoundException(long gameId, String gamerId) {
		super("Not found game with " + gameId + " and " + gamerId);
	}
}
