package typingsJapgolly.blessed.mod.Widgets

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDestroyable extends js.Object {
  def destroy(): Unit
}

object IDestroyable {
  @scala.inline
  def apply(destroy: Callback): IDestroyable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.asInstanceOf[IDestroyable]
  }
}

