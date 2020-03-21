package typingsJapgolly.winrt.Windows.System.Threading.Core

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPreallocatedWorkItem extends js.Object {
  def runAsync(): IAsyncAction
}

object IPreallocatedWorkItem {
  @scala.inline
  def apply(runAsync: CallbackTo[IAsyncAction]): IPreallocatedWorkItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("runAsync")(runAsync.toJsFn)
    __obj.asInstanceOf[IPreallocatedWorkItem]
  }
}

