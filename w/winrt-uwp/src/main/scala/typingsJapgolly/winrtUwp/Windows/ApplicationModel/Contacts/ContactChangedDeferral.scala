package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The deferral object to use while asynchronously processing ContactChanged events. */
trait ContactChangedDeferral extends StObject {
  
  /** Call this method in order to release the deferral object when all asynchronous processing has finished. */
  def complete(): Unit
}
object ContactChangedDeferral {
  
  inline def apply(complete: Callback): ContactChangedDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[ContactChangedDeferral]
  }
  
  extension [Self <: ContactChangedDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
