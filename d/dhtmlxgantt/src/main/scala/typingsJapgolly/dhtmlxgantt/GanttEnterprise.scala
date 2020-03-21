package typingsJapgolly.dhtmlxgantt

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttEnterprise extends js.Object {
  def getGanttInstance(): GanttStatic
}

object GanttEnterprise {
  @scala.inline
  def apply(getGanttInstance: CallbackTo[GanttStatic]): GanttEnterprise = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getGanttInstance")(getGanttInstance.toJsFn)
    __obj.asInstanceOf[GanttEnterprise]
  }
}

