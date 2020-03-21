package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISystemCondition extends IBackgroundCondition {
  var conditionType: SystemConditionType
}

object ISystemCondition {
  @scala.inline
  def apply(conditionType: SystemConditionType): ISystemCondition = {
    val __obj = js.Dynamic.literal(conditionType = conditionType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISystemCondition]
  }
}

