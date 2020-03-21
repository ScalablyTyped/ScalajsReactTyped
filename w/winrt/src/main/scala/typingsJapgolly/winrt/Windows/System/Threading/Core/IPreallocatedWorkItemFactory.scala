package typingsJapgolly.winrt.Windows.System.Threading.Core

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.System.Threading.WorkItemHandler
import typingsJapgolly.winrt.Windows.System.Threading.WorkItemOptions
import typingsJapgolly.winrt.Windows.System.Threading.WorkItemPriority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPreallocatedWorkItemFactory extends js.Object {
  def createWorkItem(handler: WorkItemHandler): PreallocatedWorkItem
  def createWorkItemWithPriority(handler: WorkItemHandler, priority: WorkItemPriority): PreallocatedWorkItem
  def createWorkItemWithPriorityAndOptions(handler: WorkItemHandler, priority: WorkItemPriority, options: WorkItemOptions): PreallocatedWorkItem
}

object IPreallocatedWorkItemFactory {
  @scala.inline
  def apply(
    createWorkItem: WorkItemHandler => CallbackTo[PreallocatedWorkItem],
    createWorkItemWithPriority: (WorkItemHandler, WorkItemPriority) => CallbackTo[PreallocatedWorkItem],
    createWorkItemWithPriorityAndOptions: (WorkItemHandler, WorkItemPriority, WorkItemOptions) => CallbackTo[PreallocatedWorkItem]
  ): IPreallocatedWorkItemFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createWorkItem")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.System.Threading.WorkItemHandler) => createWorkItem(t0).runNow()))
    __obj.updateDynamic("createWorkItemWithPriority")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.System.Threading.WorkItemHandler, t1: typingsJapgolly.winrt.Windows.System.Threading.WorkItemPriority) => createWorkItemWithPriority(t0, t1).runNow()))
    __obj.updateDynamic("createWorkItemWithPriorityAndOptions")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.System.Threading.WorkItemHandler, t1: typingsJapgolly.winrt.Windows.System.Threading.WorkItemPriority, t2: typingsJapgolly.winrt.Windows.System.Threading.WorkItemOptions) => createWorkItemWithPriorityAndOptions(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IPreallocatedWorkItemFactory]
  }
}

