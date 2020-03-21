package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkflowAssignment extends js.Object {
  var AssignedTo_DEPRECATED: IPropertyValue
  var CompletedBy_DEPRECATED: IPropertyValue
  var Deadline_DEPRECATED: IPropertyValue
  var Description_DEPRECATED: IPropertyValue
  var MonitoredBy_DEPRECATED: IPropertyValue
  def Clone_DEPRECATED(): IWorkflowAssignment
}

object IWorkflowAssignment {
  @scala.inline
  def apply(
    AssignedTo_DEPRECATED: IPropertyValue,
    Clone_DEPRECATED: CallbackTo[IWorkflowAssignment],
    CompletedBy_DEPRECATED: IPropertyValue,
    Deadline_DEPRECATED: IPropertyValue,
    Description_DEPRECATED: IPropertyValue,
    MonitoredBy_DEPRECATED: IPropertyValue
  ): IWorkflowAssignment = {
    val __obj = js.Dynamic.literal(AssignedTo_DEPRECATED = AssignedTo_DEPRECATED.asInstanceOf[js.Any], CompletedBy_DEPRECATED = CompletedBy_DEPRECATED.asInstanceOf[js.Any], Deadline_DEPRECATED = Deadline_DEPRECATED.asInstanceOf[js.Any], Description_DEPRECATED = Description_DEPRECATED.asInstanceOf[js.Any], MonitoredBy_DEPRECATED = MonitoredBy_DEPRECATED.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone_DEPRECATED")(Clone_DEPRECATED.toJsFn)
    __obj.asInstanceOf[IWorkflowAssignment]
  }
}

