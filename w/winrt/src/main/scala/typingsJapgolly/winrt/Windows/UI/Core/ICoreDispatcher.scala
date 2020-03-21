package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreDispatcher extends ICoreAcceleratorKeys {
  var hasThreadAccess: Boolean
  def processEvents(options: CoreProcessEventsOption): Unit
  def runAsync(priority: CoreDispatcherPriority, agileCallback: DispatchedHandler): IAsyncAction
  def runIdleAsync(agileCallback: IdleDispatchedHandler): IAsyncAction
}

object ICoreDispatcher {
  @scala.inline
  def apply(
    hasThreadAccess: Boolean,
    onacceleratorkeyactivated: js.Any,
    processEvents: CoreProcessEventsOption => Callback,
    runAsync: (CoreDispatcherPriority, DispatchedHandler) => CallbackTo[IAsyncAction],
    runIdleAsync: IdleDispatchedHandler => CallbackTo[IAsyncAction]
  ): ICoreDispatcher = {
    val __obj = js.Dynamic.literal(hasThreadAccess = hasThreadAccess.asInstanceOf[js.Any], onacceleratorkeyactivated = onacceleratorkeyactivated.asInstanceOf[js.Any])
    __obj.updateDynamic("processEvents")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Core.CoreProcessEventsOption) => processEvents(t0).runNow()))
    __obj.updateDynamic("runAsync")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.UI.Core.CoreDispatcherPriority, t1: typingsJapgolly.winrt.Windows.UI.Core.DispatchedHandler) => runAsync(t0, t1).runNow()))
    __obj.updateDynamic("runIdleAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Core.IdleDispatchedHandler) => runIdleAsync(t0).runNow()))
    __obj.asInstanceOf[ICoreDispatcher]
  }
}

