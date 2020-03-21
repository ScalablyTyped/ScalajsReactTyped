package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofevapi extends js.Object {
  def async_relay(sdata: String): Double
  def close(): Double
  def relay(sdata: String): Double
  def relay_multicast(sdata: String, stag: String): Double
  def relay_unicast(sdata: String, stag: String): Double
  def set_tag(stag: String): Double
}

object Typeofevapi {
  @scala.inline
  def apply(
    async_relay: String => CallbackTo[Double],
    close: CallbackTo[Double],
    relay: String => CallbackTo[Double],
    relay_multicast: (String, String) => CallbackTo[Double],
    relay_unicast: (String, String) => CallbackTo[Double],
    set_tag: String => CallbackTo[Double]
  ): Typeofevapi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("async_relay")(js.Any.fromFunction1((t0: java.lang.String) => async_relay(t0).runNow()))
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("relay")(js.Any.fromFunction1((t0: java.lang.String) => relay(t0).runNow()))
    __obj.updateDynamic("relay_multicast")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => relay_multicast(t0, t1).runNow()))
    __obj.updateDynamic("relay_unicast")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => relay_unicast(t0, t1).runNow()))
    __obj.updateDynamic("set_tag")(js.Any.fromFunction1((t0: java.lang.String) => set_tag(t0).runNow()))
    __obj.asInstanceOf[Typeofevapi]
  }
}

