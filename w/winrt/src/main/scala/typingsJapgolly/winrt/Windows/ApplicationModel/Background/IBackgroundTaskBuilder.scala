package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTaskBuilder extends js.Object {
  var name: String
  var taskEntryPoint: String
  def addCondition(condition: IBackgroundCondition): Unit
  def register(): BackgroundTaskRegistration
  def setTrigger(trigger: IBackgroundTrigger): Unit
}

object IBackgroundTaskBuilder {
  @scala.inline
  def apply(
    addCondition: IBackgroundCondition => Callback,
    name: String,
    register: CallbackTo[BackgroundTaskRegistration],
    setTrigger: IBackgroundTrigger => Callback,
    taskEntryPoint: String
  ): IBackgroundTaskBuilder = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], taskEntryPoint = taskEntryPoint.asInstanceOf[js.Any])
    __obj.updateDynamic("addCondition")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.ApplicationModel.Background.IBackgroundCondition) => addCondition(t0).runNow()))
    __obj.updateDynamic("register")(register.toJsFn)
    __obj.updateDynamic("setTrigger")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.ApplicationModel.Background.IBackgroundTrigger) => setTrigger(t0).runNow()))
    __obj.asInstanceOf[IBackgroundTaskBuilder]
  }
}

