package typingsJapgolly.uikit.mod.UIkit

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitDropdownElement extends js.Object {
  def hide(): Unit
  def show(): Unit
}

object UIkitDropdownElement {
  @scala.inline
  def apply(hide: Callback, show: Callback): UIkitDropdownElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[UIkitDropdownElement]
  }
}

