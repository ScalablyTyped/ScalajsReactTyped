package typingsJapgolly.wnumb.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  /**
    * get number from formatted string
    */
  def from(`val`: String): Double
  /**
    * format to string
    */
  def to(`val`: Double): String
}

object Instance {
  @scala.inline
  def apply(from: String => CallbackTo[Double], to: Double => CallbackTo[String]): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(js.Any.fromFunction1((t0: java.lang.String) => from(t0).runNow()))
    __obj.updateDynamic("to")(js.Any.fromFunction1((t0: scala.Double) => to(t0).runNow()))
    __obj.asInstanceOf[Instance]
  }
}

