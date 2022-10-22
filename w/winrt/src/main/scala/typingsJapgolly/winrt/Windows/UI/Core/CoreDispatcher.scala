package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreDispatcher
  extends StObject
     with ICoreDispatcher
object CoreDispatcher {
  
  inline def apply(
    hasThreadAccess: Boolean,
    onacceleratorkeyactivated: Any,
    processEvents: CoreProcessEventsOption => Callback,
    runAsync: (CoreDispatcherPriority, DispatchedHandler) => IAsyncAction,
    runIdleAsync: IdleDispatchedHandler => IAsyncAction
  ): CoreDispatcher = {
    val __obj = js.Dynamic.literal(hasThreadAccess = hasThreadAccess.asInstanceOf[js.Any], onacceleratorkeyactivated = onacceleratorkeyactivated.asInstanceOf[js.Any], processEvents = js.Any.fromFunction1((t0: CoreProcessEventsOption) => processEvents(t0).runNow()), runAsync = js.Any.fromFunction2(runAsync), runIdleAsync = js.Any.fromFunction1(runIdleAsync))
    __obj.asInstanceOf[CoreDispatcher]
  }
}
