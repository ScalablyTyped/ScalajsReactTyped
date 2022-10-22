package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a deferred process that will halt a thread until the deferral is complete. */
trait EmailMailboxChangedDeferral extends StObject {
  
  /** Indicates to waiting processes that the deferral is complete. */
  def complete(): Unit
}
object EmailMailboxChangedDeferral {
  
  inline def apply(complete: Callback): EmailMailboxChangedDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[EmailMailboxChangedDeferral]
  }
  
  extension [Self <: EmailMailboxChangedDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
