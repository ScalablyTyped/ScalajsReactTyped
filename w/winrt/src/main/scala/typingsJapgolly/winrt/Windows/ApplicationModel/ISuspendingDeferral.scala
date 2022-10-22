package typingsJapgolly.winrt.Windows.ApplicationModel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISuspendingDeferral extends StObject {
  
  def complete(): Unit
}
object ISuspendingDeferral {
  
  inline def apply(complete: Callback): ISuspendingDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[ISuspendingDeferral]
  }
  
  extension [Self <: ISuspendingDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
