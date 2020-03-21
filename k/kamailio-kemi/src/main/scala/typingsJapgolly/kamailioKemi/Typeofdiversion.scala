package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdiversion extends js.Object {
  def add_diversion(reason: String): Double
  def add_diversion_uri(reason: String, uri: String): Double
}

object Typeofdiversion {
  @scala.inline
  def apply(
    add_diversion: String => CallbackTo[Double],
    add_diversion_uri: (String, String) => CallbackTo[Double]
  ): Typeofdiversion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add_diversion")(js.Any.fromFunction1((t0: java.lang.String) => add_diversion(t0).runNow()))
    __obj.updateDynamic("add_diversion_uri")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => add_diversion_uri(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofdiversion]
  }
}

