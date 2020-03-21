package typingsJapgolly.twitchExt

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Twitch actions add first-party Twitch functionality to extensions.
  *
  * @see TwitchExt.actions
  */
trait TwitchExtActions extends js.Object {
  /**
  	 * This function prompts users to follow the specified channel, with a dialog controlled by Twitch.
  	 *
  	 * @see https://dev.twitch.tv/docs/extensions/reference/#followchannel
  	 */
  def followChannel(channelName: String): Unit
  /**
  	 * This function causes your video-component or video-overlay extension to be minimized.
  	 *
  	 * @see https://dev.twitch.tv/docs/extensions/reference/#minimize
  	 */
  def minimize(): Unit
  /**
  	 * This function registers a callback that is invoked whenever a user completes an interaction prompted by the followChannel action.
  	 *
  	 * @see https://dev.twitch.tv/docs/extensions/reference/#onfollow
  	 */
  def onFollow(callback: js.Function2[/* didFollow */ Boolean, /* channelName */ String, Unit]): Unit
  /**
  	 * This function opens a prompt for users to share their identity.
  	 * After a successful identity link, the Twitch.ext.onAuthorized callback is invoked with the user’s ID.
  	 *
  	 * @see https://dev.twitch.tv/docs/extensions/reference/#requestidshare
  	 */
  def requestIdShare(): Unit
}

object TwitchExtActions {
  @scala.inline
  def apply(
    followChannel: String => Callback,
    minimize: Callback,
    onFollow: js.Function2[/* didFollow */ Boolean, /* channelName */ String, Unit] => Callback,
    requestIdShare: Callback
  ): TwitchExtActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("followChannel")(js.Any.fromFunction1((t0: java.lang.String) => followChannel(t0).runNow()))
    __obj.updateDynamic("minimize")(minimize.toJsFn)
    __obj.updateDynamic("onFollow")(js.Any.fromFunction1((t0: js.Function2[/* didFollow */ scala.Boolean, /* channelName */ java.lang.String, scala.Unit]) => onFollow(t0).runNow()))
    __obj.updateDynamic("requestIdShare")(requestIdShare.toJsFn)
    __obj.asInstanceOf[TwitchExtActions]
  }
}

