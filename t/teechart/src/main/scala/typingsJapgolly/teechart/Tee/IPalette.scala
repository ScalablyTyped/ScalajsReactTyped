package typingsJapgolly.teechart.Tee

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPalette extends js.Object {
  var colors: js.Array[String]
  def get(index: Double): String
}

object IPalette {
  @scala.inline
  def apply(colors: js.Array[String], get: Double => CallbackTo[String]): IPalette = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: scala.Double) => get(t0).runNow()))
    __obj.asInstanceOf[IPalette]
  }
}

