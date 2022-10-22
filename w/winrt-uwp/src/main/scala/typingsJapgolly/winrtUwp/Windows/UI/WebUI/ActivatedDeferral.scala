package typingsJapgolly.winrtUwp.Windows.UI.WebUI

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages delayed activation for an app. */
trait ActivatedDeferral extends StObject {
  
  /** Notifies the system that the app has set up its state and initial UI and is ready to be displayed. */
  def complete(): Unit
}
object ActivatedDeferral {
  
  inline def apply(complete: Callback): ActivatedDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[ActivatedDeferral]
  }
  
  extension [Self <: ActivatedDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
