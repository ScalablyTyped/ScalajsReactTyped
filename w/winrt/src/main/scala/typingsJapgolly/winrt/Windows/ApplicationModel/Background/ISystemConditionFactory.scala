package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISystemConditionFactory extends js.Object {
  def create(conditionType: SystemConditionType): SystemCondition
}

object ISystemConditionFactory {
  @scala.inline
  def apply(create: SystemConditionType => CallbackTo[SystemCondition]): ISystemConditionFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.ApplicationModel.Background.SystemConditionType) => create(t0).runNow()))
    __obj.asInstanceOf[ISystemConditionFactory]
  }
}

