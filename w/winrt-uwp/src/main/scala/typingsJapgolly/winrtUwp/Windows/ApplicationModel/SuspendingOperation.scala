package typingsJapgolly.winrtUwp.Windows.ApplicationModel

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides info about an app suspending operation. */
trait SuspendingOperation extends StObject {
  
  /** Gets the time remaining before a delayed app suspending operation continues. */
  var deadline: js.Date
  
  /**
    * Requests that the app suspending operation be delayed.
    * @return The suspension deferral.
    */
  def getDeferral(): SuspendingDeferral
}
object SuspendingOperation {
  
  inline def apply(deadline: js.Date, getDeferral: CallbackTo[SuspendingDeferral]): SuspendingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn)
    __obj.asInstanceOf[SuspendingOperation]
  }
  
  extension [Self <: SuspendingOperation](x: Self) {
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: CallbackTo[SuspendingDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
  }
}
