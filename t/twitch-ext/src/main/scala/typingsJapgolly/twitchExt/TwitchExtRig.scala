package typingsJapgolly.twitchExt

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The developer rig object as available under window.Twitch.ext.rig.
  *
  * @see TwitchExt.rig
  */
trait TwitchExtRig extends js.Object {
  /**
  	 * Print a message to the developer rig console.
  	 *
  	 * @param message The message to print.
  	 * @see https://github.com/twitchdev/developer-rig#rig-console
  	 */
  def log(message: String): Unit
}

object TwitchExtRig {
  @scala.inline
  def apply(log: String => Callback): TwitchExtRig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: java.lang.String) => log(t0).runNow()))
    __obj.asInstanceOf[TwitchExtRig]
  }
}

