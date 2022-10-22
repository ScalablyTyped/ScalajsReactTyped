package typingsJapgolly.atom.srcOtherTypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleableErrorEvent extends StObject {
  
  /** The error object. */
  var error: js.Error
  
  /**
    *  Call this function to indicate you have handled the error.
    *  The error will not be thrown if this function is called.
    */
  def handle(): Unit
}
object HandleableErrorEvent {
  
  inline def apply(error: js.Error, handle: Callback): HandleableErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], handle = handle.toJsFn)
    __obj.asInstanceOf[HandleableErrorEvent]
  }
  
  extension [Self <: HandleableErrorEvent](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setHandle(value: Callback): Self = StObject.set(x, "handle", value.toJsFn)
  }
}
