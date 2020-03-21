package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsipdump extends js.Object {
  def send(stag: String): Double
}

object Typeofsipdump {
  @scala.inline
  def apply(send: String => CallbackTo[Double]): Typeofsipdump = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: java.lang.String) => send(t0).runNow()))
    __obj.asInstanceOf[Typeofsipdump]
  }
}

