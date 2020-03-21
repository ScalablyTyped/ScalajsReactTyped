package typingsJapgolly.reactBigScheduler.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactBigScheduler.AnonCellUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerDataBehaviors extends js.Object {
  var getCustomDateFunc: js.UndefOr[
    js.Function3[
      /* schedulerData */ SchedulerData, 
      /* num */ Double, 
      /* date */ js.UndefOr[String], 
      AnonCellUnit
    ]
  ] = js.undefined
  var isNonWorkingTimeFunc: js.UndefOr[js.Function2[/* schedulerData */ SchedulerData, /* time */ String, Boolean]] = js.undefined
}

object SchedulerDataBehaviors {
  @scala.inline
  def apply(
    getCustomDateFunc: (/* schedulerData */ SchedulerData, /* num */ Double, /* date */ js.UndefOr[String]) => CallbackTo[AnonCellUnit] = null,
    isNonWorkingTimeFunc: (/* schedulerData */ SchedulerData, /* time */ String) => CallbackTo[Boolean] = null
  ): SchedulerDataBehaviors = {
    val __obj = js.Dynamic.literal()
    if (getCustomDateFunc != null) __obj.updateDynamic("getCustomDateFunc")(js.Any.fromFunction3((t0: /* schedulerData */ typingsJapgolly.reactBigScheduler.mod.SchedulerData, t1: /* num */ scala.Double, t2: /* date */ js.UndefOr[java.lang.String]) => getCustomDateFunc(t0, t1, t2).runNow()))
    if (isNonWorkingTimeFunc != null) __obj.updateDynamic("isNonWorkingTimeFunc")(js.Any.fromFunction2((t0: /* schedulerData */ typingsJapgolly.reactBigScheduler.mod.SchedulerData, t1: /* time */ java.lang.String) => isNonWorkingTimeFunc(t0, t1).runNow()))
    __obj.asInstanceOf[SchedulerDataBehaviors]
  }
}

