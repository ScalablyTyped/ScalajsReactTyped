package typingsJapgolly.backboneRadio.mod.backboneAugmentingMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.backboneRadio.mod.backboneAugmentingMod.Radio.Channel_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Radio_ extends js.Object {
  def channel(channelName: String): Channel_
  def log(channelName: String, eventName: String, args: js.Any*): Unit
  def tuneIn(channelName: String): Radio
  def tuneOut(channelName: String): Radio
}

object Radio_ {
  @scala.inline
  def apply(
    channel: String => CallbackTo[Channel_],
    log: (String, String, /* repeated */ js.Any) => Callback,
    tuneIn: String => CallbackTo[Radio],
    tuneOut: String => CallbackTo[Radio]
  ): Radio_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channel")(js.Any.fromFunction1((t0: java.lang.String) => channel(t0).runNow()))
    __obj.updateDynamic("log")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: /* repeated */ js.Any) => log(t0, t1, t2).runNow()))
    __obj.updateDynamic("tuneIn")(js.Any.fromFunction1((t0: java.lang.String) => tuneIn(t0).runNow()))
    __obj.updateDynamic("tuneOut")(js.Any.fromFunction1((t0: java.lang.String) => tuneOut(t0).runNow()))
    __obj.asInstanceOf[Radio_]
  }
}

