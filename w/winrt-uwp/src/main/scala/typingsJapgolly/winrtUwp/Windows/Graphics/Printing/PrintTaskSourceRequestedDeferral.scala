package typingsJapgolly.winrtUwp.Windows.Graphics.Printing

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to defer the request for a print task source. */
trait PrintTaskSourceRequestedDeferral extends StObject {
  
  /** Indicates when the deferral for a print task source request is over. */
  def complete(): Unit
}
object PrintTaskSourceRequestedDeferral {
  
  inline def apply(complete: Callback): PrintTaskSourceRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[PrintTaskSourceRequestedDeferral]
  }
  
  extension [Self <: PrintTaskSourceRequestedDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
