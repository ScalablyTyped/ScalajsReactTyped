package typingsJapgolly.reactBigScheduler.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactBigScheduler.mod.SchedulerData
import typingsJapgolly.reactBigScheduler.mod.SchedulerProps
import typingsJapgolly.reactBigScheduler.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Scheduler {
  def apply(
    schedulerData: SchedulerData,
    nextClick: SchedulerData => Callback,
    onSelectDate: (SchedulerData, String) => Callback,
    onViewChange: (SchedulerData, View) => Callback,
    prevClick: SchedulerData => Callback,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SchedulerProps, typingsJapgolly.reactBigScheduler.mod.Scheduler, Unit, SchedulerProps] = {
    val __obj = js.Dynamic.literal(schedulerData = schedulerData.asInstanceOf[js.Any])
  
      __obj.updateDynamic("nextClick")(js.Any.fromFunction1((t0: typingsJapgolly.reactBigScheduler.mod.SchedulerData) => nextClick(t0).runNow()))
    __obj.updateDynamic("onSelectDate")(js.Any.fromFunction2((t0: typingsJapgolly.reactBigScheduler.mod.SchedulerData, t1: java.lang.String) => onSelectDate(t0, t1).runNow()))
    __obj.updateDynamic("onViewChange")(js.Any.fromFunction2((t0: typingsJapgolly.reactBigScheduler.mod.SchedulerData, t1: typingsJapgolly.reactBigScheduler.mod.View) => onViewChange(t0, t1).runNow()))
    __obj.updateDynamic("prevClick")(js.Any.fromFunction1((t0: typingsJapgolly.reactBigScheduler.mod.SchedulerData) => prevClick(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBigScheduler.mod.SchedulerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBigScheduler.mod.Scheduler](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBigScheduler.mod.SchedulerProps])(children: _*)
  }
  @JSImport("react-big-scheduler", "Scheduler")
  @js.native
  object componentImport extends js.Object
  
}

