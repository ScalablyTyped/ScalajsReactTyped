package typingsJapgolly.requestidlecallback

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.DOMHighResTimeStamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdleDeadline extends StObject {
  
  val didTimeout: Boolean
  
  def timeRemaining(): DOMHighResTimeStamp
}
object IdleDeadline {
  
  inline def apply(didTimeout: Boolean, timeRemaining: CallbackTo[DOMHighResTimeStamp]): IdleDeadline = {
    val __obj = js.Dynamic.literal(didTimeout = didTimeout.asInstanceOf[js.Any], timeRemaining = timeRemaining.toJsFn)
    __obj.asInstanceOf[IdleDeadline]
  }
  
  extension [Self <: IdleDeadline](x: Self) {
    
    inline def setDidTimeout(value: Boolean): Self = StObject.set(x, "didTimeout", value.asInstanceOf[js.Any])
    
    inline def setTimeRemaining(value: CallbackTo[DOMHighResTimeStamp]): Self = StObject.set(x, "timeRemaining", value.toJsFn)
  }
}
