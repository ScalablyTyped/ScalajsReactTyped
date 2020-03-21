package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofx extends js.Object {
  // Equivalent of drop from native kamailio.cfg scripting language, stop the execution of the SIP routing script
  // and drop routing further the SIP request branch or response.
  def drop(): Unit
  // Equivalent of exit from native kamailio.cfg scripting language, stop the execution of the SIP routing script.
  def exit(): Unit
  // Execute a function (specified by fname) exported by a Kamailio module. Additional parameters must be string
  // and they are passed to the Kamailio module function.
  def modf(name: String, params: String*): Double
}

object Typeofx {
  @scala.inline
  def apply(drop: Callback, exit: Callback, modf: (String, /* repeated */ String) => CallbackTo[Double]): Typeofx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("drop")(drop.toJsFn)
    __obj.updateDynamic("exit")(exit.toJsFn)
    __obj.updateDynamic("modf")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ java.lang.String) => modf(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofx]
  }
}

