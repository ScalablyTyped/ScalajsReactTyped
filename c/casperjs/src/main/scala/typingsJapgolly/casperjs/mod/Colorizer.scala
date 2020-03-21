package typingsJapgolly.casperjs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colorizer extends js.Object {
  def colorize(text: String, styleName: String): Unit
  def format(text: String, style: js.Any): Unit
}

object Colorizer {
  @scala.inline
  def apply(colorize: (String, String) => Callback, format: (String, js.Any) => Callback): Colorizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("colorize")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => colorize(t0, t1).runNow()))
    __obj.updateDynamic("format")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => format(t0, t1).runNow()))
    __obj.asInstanceOf[Colorizer]
  }
}

