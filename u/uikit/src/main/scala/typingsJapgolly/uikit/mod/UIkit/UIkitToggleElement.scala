package typingsJapgolly.uikit.mod.UIkit

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitToggleElement extends js.Object {
  def toggle(): Unit
}

object UIkitToggleElement {
  @scala.inline
  def apply(toggle: Callback): UIkitToggleElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toggle")(toggle.toJsFn)
    __obj.asInstanceOf[UIkitToggleElement]
  }
}

