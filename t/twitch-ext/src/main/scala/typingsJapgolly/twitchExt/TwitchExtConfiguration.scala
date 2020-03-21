package typingsJapgolly.twitchExt

import japgolly.scalajs.react.Callback
import typingsJapgolly.twitchExt.twitchExtStrings.broadcaster
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see TwitchExt.configuration
  */
trait TwitchExtConfiguration extends js.Object {
  /**
  	 * This property returns the record for the broadcaster segment if one is found; otherwise, undefined.
  	 */
  var broadcaster: js.UndefOr[AnonContent] = js.undefined
  /**
  	 * This property returns the record for the developer segment if one is found; otherwise, undefined.
  	 */
  var developer: js.UndefOr[AnonContent] = js.undefined
  /**
  	 * This property returns the record for the global segment if one is found; otherwise, undefined.
  	 */
  var global: js.UndefOr[AnonContent] = js.undefined
  /**
  	 * This function registers a callback that is called whenever an extension configuration is received.
  	 * The callback function takes no input and returns nothing. After this is called for the first time,
  	 * the records for the global, developer and broadcaster segments will be set if the data is available.
  	 * @param callback The callback that is fired.
  	 */
  def onChanged(callback: js.Function0[Unit]): Unit
  /**
  	 * This function can be called by the front end to set an extension configuration.
  	 * @param segment The configuration segment to set. Valid value. "broadcaster".
  	 * @param version The version of configuration with which the segment is stored.
  	 * @param content The string-encoded configuration.
  	 */
  @JSName("set")
  def set_broadcaster(segment: broadcaster, version: String, content: String): Unit
}

object TwitchExtConfiguration {
  @scala.inline
  def apply(
    onChanged: js.Function0[Unit] => Callback,
    set: (broadcaster, String, String) => Callback,
    broadcaster: AnonContent = null,
    developer: AnonContent = null,
    global: AnonContent = null
  ): TwitchExtConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onChanged")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => onChanged(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction3((t0: typingsJapgolly.twitchExt.twitchExtStrings.broadcaster, t1: java.lang.String, t2: java.lang.String) => set(t0, t1, t2).runNow()))
    if (broadcaster != null) __obj.updateDynamic("broadcaster")(broadcaster.asInstanceOf[js.Any])
    if (developer != null) __obj.updateDynamic("developer")(developer.asInstanceOf[js.Any])
    if (global != null) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitchExtConfiguration]
  }
}

