package typingsJapgolly.jqueryWindow

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jqueryWindow.JQueryWindow.Window
import typingsJapgolly.jqueryWindow.JQueryWindow.WindowOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Register with JQuery instance
trait JQuery extends js.Object {
  def window(options: WindowOptions): Window
}

object JQuery {
  @scala.inline
  def apply(window: WindowOptions => CallbackTo[Window]): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("window")(js.Any.fromFunction1((t0: typingsJapgolly.jqueryWindow.JQueryWindow.WindowOptions) => window(t0).runNow()))
    __obj.asInstanceOf[JQuery]
  }
}

