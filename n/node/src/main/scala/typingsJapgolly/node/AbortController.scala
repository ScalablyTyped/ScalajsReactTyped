package typingsJapgolly.node

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region borrowed
// from https://github.com/microsoft/TypeScript/blob/38da7c600c83e7b31193a62495239a0fe478cb67/lib/lib.webworker.d.ts#L633 until moved to separate lib
/** A controller object that allows you to abort one or more DOM requests as and when desired. */
trait AbortController extends StObject {
  
  /**
    * Invoking this method will set this object's AbortSignal's aborted flag and signal to any observers that the associated activity is to be aborted.
    */
  def abort(): Unit
  
  /**
    * Returns the AbortSignal object associated with this object.
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
