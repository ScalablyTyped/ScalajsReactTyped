package typingsJapgolly.androiduix.android.widget

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checkable extends js.Object {
  def isChecked(): Boolean
  def setChecked(checked: Boolean): Unit
  def toggle(): Unit
}

object Checkable {
  @scala.inline
  def apply(isChecked: CallbackTo[Boolean], setChecked: Boolean => Callback, toggle: Callback): Checkable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isChecked")(isChecked.toJsFn)
    __obj.updateDynamic("setChecked")(js.Any.fromFunction1((t0: scala.Boolean) => setChecked(t0).runNow()))
    __obj.updateDynamic("toggle")(toggle.toJsFn)
    __obj.asInstanceOf[Checkable]
  }
}

