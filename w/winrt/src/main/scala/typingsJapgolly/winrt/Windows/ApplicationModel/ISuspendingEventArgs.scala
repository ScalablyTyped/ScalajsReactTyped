package typingsJapgolly.winrt.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISuspendingEventArgs extends StObject {
  
  var suspendingOperation: SuspendingOperation
}
object ISuspendingEventArgs {
  
  inline def apply(suspendingOperation: SuspendingOperation): ISuspendingEventArgs = {
    val __obj = js.Dynamic.literal(suspendingOperation = suspendingOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuspendingEventArgs]
  }
  
  extension [Self <: ISuspendingEventArgs](x: Self) {
    
    inline def setSuspendingOperation(value: SuspendingOperation): Self = StObject.set(x, "suspendingOperation", value.asInstanceOf[js.Any])
  }
}
