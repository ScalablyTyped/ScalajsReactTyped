package typingsJapgolly.jschannel.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelConfiguration extends js.Object {
  var debugOutput: js.UndefOr[Boolean] = js.undefined
  var gotMessageObserver: js.UndefOr[js.Function2[/* origin */ String, /* message */ Message, Unit]] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* channel */ MessagingChannel, Unit]] = js.undefined
  var origin: String
  var postMessageObserver: js.UndefOr[js.Function2[/* origin */ String, /* message */ Message, Unit]] = js.undefined
  var publish: js.UndefOr[Boolean] = js.undefined
  var reconnect: js.UndefOr[Boolean] = js.undefined
  var remote: js.UndefOr[String | js.Array[String]] = js.undefined
  var scope: String
  var window: Window_
}

object ChannelConfiguration {
  @scala.inline
  def apply(
    origin: String,
    scope: String,
    window: Window_,
    debugOutput: js.UndefOr[Boolean] = js.undefined,
    gotMessageObserver: (/* origin */ String, /* message */ Message) => Callback = null,
    onReady: /* channel */ MessagingChannel => Callback = null,
    postMessageObserver: (/* origin */ String, /* message */ Message) => Callback = null,
    publish: js.UndefOr[Boolean] = js.undefined,
    reconnect: js.UndefOr[Boolean] = js.undefined,
    remote: String | js.Array[String] = null
  ): ChannelConfiguration = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    if (!js.isUndefined(debugOutput)) __obj.updateDynamic("debugOutput")(debugOutput.asInstanceOf[js.Any])
    if (gotMessageObserver != null) __obj.updateDynamic("gotMessageObserver")(js.Any.fromFunction2((t0: /* origin */ java.lang.String, t1: /* message */ typingsJapgolly.jschannel.mod.Message) => gotMessageObserver(t0, t1).runNow()))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1((t0: /* channel */ typingsJapgolly.jschannel.mod.MessagingChannel) => onReady(t0).runNow()))
    if (postMessageObserver != null) __obj.updateDynamic("postMessageObserver")(js.Any.fromFunction2((t0: /* origin */ java.lang.String, t1: /* message */ typingsJapgolly.jschannel.mod.Message) => postMessageObserver(t0, t1).runNow()))
    if (!js.isUndefined(publish)) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnect)) __obj.updateDynamic("reconnect")(reconnect.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelConfiguration]
  }
}

