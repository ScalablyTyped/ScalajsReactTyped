package typingsJapgolly.winrtUwp.Windows.UI.WebUI

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages an app suspension operation. */
trait SuspendingOperation extends StObject {
  
  /** Gets the time remaining before a delayed app suspension operation continues. */
  var deadline: js.Date
  
  /**
    * Requests that the app suspension operation be delayed.
    * @return The suspension deferral.
    */
  def getDeferral(): typingsJapgolly.winrtUwp.Windows.ApplicationModel.SuspendingDeferral
}
object SuspendingOperation {
  
  inline def apply(
    deadline: js.Date,
    getDeferral: CallbackTo[typingsJapgolly.winrtUwp.Windows.ApplicationModel.SuspendingDeferral]
  ): SuspendingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn)
    __obj.asInstanceOf[SuspendingOperation]
  }
  
  extension [Self <: SuspendingOperation](x: Self) {
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: CallbackTo[typingsJapgolly.winrtUwp.Windows.ApplicationModel.SuspendingDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
  }
}
