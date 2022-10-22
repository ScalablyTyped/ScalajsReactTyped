package typingsJapgolly.winrtUwp.Windows.UI.WebUI

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages delayed suspension for an app. GetDeferral */
trait SuspendingDeferral extends StObject {
  
  /** Notifies the system that the app has saved its data and is ready to be suspended. */
  def complete(): Unit
}
object SuspendingDeferral {
  
  inline def apply(complete: Callback): SuspendingDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[SuspendingDeferral]
  }
  
  extension [Self <: SuspendingDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
