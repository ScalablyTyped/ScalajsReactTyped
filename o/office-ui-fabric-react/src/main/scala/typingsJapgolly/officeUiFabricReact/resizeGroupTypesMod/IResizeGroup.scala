package typingsJapgolly.officeUiFabricReact.resizeGroupTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResizeGroup extends js.Object {
  /**
    * Remeasures the available space.
    */
  def remeasure(): Unit
}

object IResizeGroup {
  @scala.inline
  def apply(remeasure: Callback): IResizeGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remeasure")(remeasure.toJsFn)
    __obj.asInstanceOf[IResizeGroup]
  }
}

