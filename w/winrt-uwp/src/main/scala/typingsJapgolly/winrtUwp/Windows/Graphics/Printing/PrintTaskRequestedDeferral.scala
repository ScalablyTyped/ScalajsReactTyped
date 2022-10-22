package typingsJapgolly.winrtUwp.Windows.Graphics.Printing

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to defer the request for a print task. */
trait PrintTaskRequestedDeferral extends StObject {
  
  /** Indicates when the deferral for the print task request is over. */
  def complete(): Unit
}
object PrintTaskRequestedDeferral {
  
  inline def apply(complete: Callback): PrintTaskRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[PrintTaskRequestedDeferral]
  }
  
  extension [Self <: PrintTaskRequestedDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
