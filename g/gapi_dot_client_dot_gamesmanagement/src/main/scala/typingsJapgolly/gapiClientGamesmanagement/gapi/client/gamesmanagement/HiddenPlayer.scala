package typingsJapgolly.gapiClientGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HiddenPlayer extends js.Object {
  /** The time this player was hidden. */
  var hiddenTimeMillis: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#hiddenPlayer. */
  var kind: js.UndefOr[String] = js.undefined
  /** The player information. */
  var player: js.UndefOr[Player] = js.undefined
}

object HiddenPlayer {
  @scala.inline
  def apply(hiddenTimeMillis: String = null, kind: String = null, player: Player = null): HiddenPlayer = {
    val __obj = js.Dynamic.literal()
    if (hiddenTimeMillis != null) __obj.updateDynamic("hiddenTimeMillis")(hiddenTimeMillis.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (player != null) __obj.updateDynamic("player")(player.asInstanceOf[js.Any])
    __obj.asInstanceOf[HiddenPlayer]
  }
}

