package typingsJapgolly.youtube.YT

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  /**
  		 * Event fired to indicate thath the player has loaded, or unloaded, a module
  		 * with exposed API methods. This currently only occurs for closed captioning.
  		 */
  var onApiChange: js.UndefOr[PlayerEventHandler[PlayerEvent]] = js.undefined
  /**
  		 * Event fired when an error in the player occurs
  		 */
  var onError: js.UndefOr[PlayerEventHandler[OnErrorEvent]] = js.undefined
  /**
  		 * Event fired when the playback quality of the player changes.
  		 */
  var onPlaybackQualityChange: js.UndefOr[PlayerEventHandler[OnPlaybackQualityChangeEvent]] = js.undefined
  /**
  		 * Event fired when the playback rate of the player changes.
  		 */
  var onPlaybackRateChange: js.UndefOr[PlayerEventHandler[OnPlaybackRateChangeEvent]] = js.undefined
  /**
  		 * Event fired when a player has finished loading and is ready to begin receiving API calls.
  		 */
  var onReady: js.UndefOr[PlayerEventHandler[PlayerEvent]] = js.undefined
  /**
  		 * Event fired when the player's state changes.
  		 */
  var onStateChange: js.UndefOr[PlayerEventHandler[OnStateChangeEvent]] = js.undefined
}

object Events {
  @scala.inline
  def apply(
    onApiChange: PlayerEvent => Callback = null,
    onError: OnErrorEvent => Callback = null,
    onPlaybackQualityChange: OnPlaybackQualityChangeEvent => Callback = null,
    onPlaybackRateChange: OnPlaybackRateChangeEvent => Callback = null,
    onReady: PlayerEvent => Callback = null,
    onStateChange: OnStateChangeEvent => Callback = null
  ): Events = {
    val __obj = js.Dynamic.literal()
    if (onApiChange != null) __obj.updateDynamic("onApiChange")(js.Any.fromFunction1((t0: typingsJapgolly.youtube.YT.PlayerEvent) => onApiChange(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: typingsJapgolly.youtube.YT.OnErrorEvent) => onError(t0).runNow()))
    if (onPlaybackQualityChange != null) __obj.updateDynamic("onPlaybackQualityChange")(js.Any.fromFunction1((t0: typingsJapgolly.youtube.YT.OnPlaybackQualityChangeEvent) => onPlaybackQualityChange(t0).runNow()))
    if (onPlaybackRateChange != null) __obj.updateDynamic("onPlaybackRateChange")(js.Any.fromFunction1((t0: typingsJapgolly.youtube.YT.OnPlaybackRateChangeEvent) => onPlaybackRateChange(t0).runNow()))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1((t0: typingsJapgolly.youtube.YT.PlayerEvent) => onReady(t0).runNow()))
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1((t0: typingsJapgolly.youtube.YT.OnStateChangeEvent) => onStateChange(t0).runNow()))
    __obj.asInstanceOf[Events]
  }
}

