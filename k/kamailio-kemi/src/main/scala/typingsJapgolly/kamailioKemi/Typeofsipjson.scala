package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsipjson extends js.Object {
  def sj_serialize(smode: String, pvn: String): Double
}

object Typeofsipjson {
  @scala.inline
  def apply(sj_serialize: (String, String) => CallbackTo[Double]): Typeofsipjson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sj_serialize")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => sj_serialize(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofsipjson]
  }
}

