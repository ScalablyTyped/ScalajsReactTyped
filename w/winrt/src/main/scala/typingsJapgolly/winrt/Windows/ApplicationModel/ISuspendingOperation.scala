package typingsJapgolly.winrt.Windows.ApplicationModel

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISuspendingOperation extends StObject {
  
  var deadline: js.Date
  
  def getDeferral(): SuspendingDeferral
}
object ISuspendingOperation {
  
  inline def apply(deadline: js.Date, getDeferral: CallbackTo[SuspendingDeferral]): ISuspendingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn)
    __obj.asInstanceOf[ISuspendingOperation]
  }
  
  extension [Self <: ISuspendingOperation](x: Self) {
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: CallbackTo[SuspendingDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
  }
}
