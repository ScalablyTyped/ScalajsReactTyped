package typingsJapgolly.sipJs.simpleUserDelegateMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleUserDelegate extends js.Object {
  /**
    * Called when a call is answered.
    * @remarks
    * Callback for handling establishment of a new Session.
    */
  var onCallAnswered: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called when a call is created.
    * @remarks
    * Callback for handling the creation of a new Session.
    */
  var onCallCreated: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called when a call is hungup.
    * @remarks
    * Callback for handling termination of a Session.
    */
  var onCallHangup: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called when a call is put on hold or taken off hold.
    * @remarks
    * Callback for handling re-INVITE responses.
    */
  var onCallHold: js.UndefOr[js.Function1[/* held */ Boolean, Unit]] = js.undefined
  /**
    * Called when a call is received.
    * @remarks
    * Callback for handling incoming INVITE requests.
    * The callback must either accept or reject the incoming call by calling `answer()` or `decline()` respectively.
    */
  var onCallReceived: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called upon receiving a message.
    * @remarks
    * Callback for handling incoming MESSAGE requests.
    * @param message - The message received.
    */
  var onMessageReceived: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  /**
    * Called when user is registered to received calls.
    */
  var onRegistered: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called when user is connected to server.
    * @remarks
    * Callback for handling user becomes connected.
    */
  var onServerConnect: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called when user is no longer connected.
    * @remarks
    * Callback for handling user becomes disconnected.
    *
    * @param error - An Error if server caused the disconnect. Otherwise undefined.
    */
  var onServerDisconnect: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Error], Unit]] = js.undefined
  /**
    * Called when user is no longer registered to received calls.
    */
  var onUnregistered: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SimpleUserDelegate {
  @scala.inline
  def apply(
    onCallAnswered: js.UndefOr[Callback] = js.undefined,
    onCallCreated: js.UndefOr[Callback] = js.undefined,
    onCallHangup: js.UndefOr[Callback] = js.undefined,
    onCallHold: /* held */ Boolean => Callback = null,
    onCallReceived: js.UndefOr[Callback] = js.undefined,
    onMessageReceived: /* message */ String => Callback = null,
    onRegistered: js.UndefOr[Callback] = js.undefined,
    onServerConnect: js.UndefOr[Callback] = js.undefined,
    onServerDisconnect: /* error */ js.UndefOr[js.Error] => Callback = null,
    onUnregistered: js.UndefOr[Callback] = js.undefined
  ): SimpleUserDelegate = {
    val __obj = js.Dynamic.literal()
    onCallAnswered.foreach(p => __obj.updateDynamic("onCallAnswered")(p.toJsFn))
    onCallCreated.foreach(p => __obj.updateDynamic("onCallCreated")(p.toJsFn))
    onCallHangup.foreach(p => __obj.updateDynamic("onCallHangup")(p.toJsFn))
    if (onCallHold != null) __obj.updateDynamic("onCallHold")(js.Any.fromFunction1((t0: /* held */ scala.Boolean) => onCallHold(t0).runNow()))
    onCallReceived.foreach(p => __obj.updateDynamic("onCallReceived")(p.toJsFn))
    if (onMessageReceived != null) __obj.updateDynamic("onMessageReceived")(js.Any.fromFunction1((t0: /* message */ java.lang.String) => onMessageReceived(t0).runNow()))
    onRegistered.foreach(p => __obj.updateDynamic("onRegistered")(p.toJsFn))
    onServerConnect.foreach(p => __obj.updateDynamic("onServerConnect")(p.toJsFn))
    if (onServerDisconnect != null) __obj.updateDynamic("onServerDisconnect")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Error]) => onServerDisconnect(t0).runNow()))
    onUnregistered.foreach(p => __obj.updateDynamic("onUnregistered")(p.toJsFn))
    __obj.asInstanceOf[SimpleUserDelegate]
  }
}

