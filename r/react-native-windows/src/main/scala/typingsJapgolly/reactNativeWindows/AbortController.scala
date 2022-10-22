package typingsJapgolly.reactNativeWindows

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortController extends StObject {
  
  /**
    * Abort and signal to any observers that the associated activity is to be aborted.
    */
  def abort(): Unit
  
  /**
    * Returns the `AbortSignal` object associated with this object.
    */
  val signal: AbortSignal
}
object AbortController {
  
  inline def apply(abort: Callback, signal: AbortSignal): AbortController = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn, signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortController]
  }
  
  extension [Self <: AbortController](x: Self) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
  }
}
