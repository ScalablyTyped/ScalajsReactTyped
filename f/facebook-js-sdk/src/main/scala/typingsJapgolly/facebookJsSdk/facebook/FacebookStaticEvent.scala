package typingsJapgolly.facebookJsSdk.facebook

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacebookStaticEvent extends js.Object {
  def subscribe[TEvent /* <: FacebookEventType */](event: TEvent, callback: FacebookEventCallback[TEvent]): Unit
  def unsubscribe[TEvent /* <: FacebookEventType */](event: TEvent, callback: FacebookEventCallback[TEvent]): Unit
}

object FacebookStaticEvent {
  @scala.inline
  def apply(
    subscribe: (js.Any, FacebookEventCallback[js.Any]) => Callback,
    unsubscribe: (js.Any, FacebookEventCallback[js.Any]) => Callback
  ): FacebookStaticEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subscribe")(js.Any.fromFunction2((t0: js.Any, t1: typingsJapgolly.facebookJsSdk.facebook.FacebookEventCallback[js.Any]) => subscribe(t0, t1).runNow()))
    __obj.updateDynamic("unsubscribe")(js.Any.fromFunction2((t0: js.Any, t1: typingsJapgolly.facebookJsSdk.facebook.FacebookEventCallback[js.Any]) => unsubscribe(t0, t1).runNow()))
    __obj.asInstanceOf[FacebookStaticEvent]
  }
}

