package typingsJapgolly.dhtmlxscheduler

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerEnterprise extends js.Object {
  /**
  	 * Creates a new instance of Scheduler
  	 */
  def getSchedulerInstance(): SchedulerStatic
}

object SchedulerEnterprise {
  @scala.inline
  def apply(getSchedulerInstance: CallbackTo[SchedulerStatic]): SchedulerEnterprise = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getSchedulerInstance")(getSchedulerInstance.toJsFn)
    __obj.asInstanceOf[SchedulerEnterprise]
  }
}

