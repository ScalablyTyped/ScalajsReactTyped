package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/dropdown.html#javascript-reference
trait Dropdown extends js.Object {
  def close(): Unit
  def destroy(): Unit
  def getPositionClass(): String
  def open(): Unit
  def toggle(): Unit
}

object Dropdown {
  @scala.inline
  def apply(
    close: Callback,
    destroy: Callback,
    getPositionClass: CallbackTo[String],
    open: Callback,
    toggle: Callback
  ): Dropdown = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getPositionClass")(getPositionClass.toJsFn)
    __obj.updateDynamic("open")(open.toJsFn)
    __obj.updateDynamic("toggle")(toggle.toJsFn)
    __obj.asInstanceOf[Dropdown]
  }
}

