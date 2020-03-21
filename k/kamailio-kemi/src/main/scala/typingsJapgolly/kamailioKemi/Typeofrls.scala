package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrls extends js.Object {
  def handle_notify(): Double
  def handle_subscribe(): Double
  def handle_subscribe_uri(wuri: String): Double
  def update_subs(uri: String, event: String): Double
}

object Typeofrls {
  @scala.inline
  def apply(
    handle_notify: CallbackTo[Double],
    handle_subscribe: CallbackTo[Double],
    handle_subscribe_uri: String => CallbackTo[Double],
    update_subs: (String, String) => CallbackTo[Double]
  ): Typeofrls = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handle_notify")(handle_notify.toJsFn)
    __obj.updateDynamic("handle_subscribe")(handle_subscribe.toJsFn)
    __obj.updateDynamic("handle_subscribe_uri")(js.Any.fromFunction1((t0: java.lang.String) => handle_subscribe_uri(t0).runNow()))
    __obj.updateDynamic("update_subs")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => update_subs(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofrls]
  }
}

