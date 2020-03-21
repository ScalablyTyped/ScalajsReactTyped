package typingsJapgolly.winrt.Windows.System.Threading.Core

import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.System.Threading.WorkItemHandler
import typingsJapgolly.winrt.Windows.System.Threading.WorkItemOptions
import typingsJapgolly.winrt.Windows.System.Threading.WorkItemPriority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.Threading.Core.PreallocatedWorkItem")
@js.native
class PreallocatedWorkItem protected () extends IPreallocatedWorkItem {
  def this(handler: WorkItemHandler) = this()
  def this(handler: WorkItemHandler, priority: WorkItemPriority) = this()
  def this(handler: WorkItemHandler, priority: WorkItemPriority, options: WorkItemOptions) = this()
  /* CompleteClass */
  override def runAsync(): IAsyncAction = js.native
}

