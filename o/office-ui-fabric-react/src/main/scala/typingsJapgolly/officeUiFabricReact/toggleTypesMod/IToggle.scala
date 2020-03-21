package typingsJapgolly.officeUiFabricReact.toggleTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToggle extends js.Object {
  def focus(): Unit
}

object IToggle {
  @scala.inline
  def apply(focus: Callback): IToggle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.asInstanceOf[IToggle]
  }
}

