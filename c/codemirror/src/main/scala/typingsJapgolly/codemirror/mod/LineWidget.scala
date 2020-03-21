package typingsJapgolly.codemirror.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineWidget extends js.Object {
  /** Call this if you made some change to the widget's DOM node that might affect its height.
    It'll force CodeMirror to update the height of the line that contains the widget. */
  def changed(): Unit
  /** Removes the widget. */
  def clear(): Unit
}

object LineWidget {
  @scala.inline
  def apply(changed: Callback, clear: Callback): LineWidget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changed")(changed.toJsFn)
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.asInstanceOf[LineWidget]
  }
}

