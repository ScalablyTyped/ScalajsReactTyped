package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdleDeadline extends StObject {
  
  /* standard dom */
  val didTimeout: scala.Boolean
  
  /* standard dom */
  def timeRemaining(): DOMHighResTimeStamp
}
object IdleDeadline {
  
  inline def apply(didTimeout: scala.Boolean, timeRemaining: CallbackTo[DOMHighResTimeStamp]): IdleDeadline = {
    val __obj = js.Dynamic.literal(didTimeout = didTimeout.asInstanceOf[js.Any], timeRemaining = timeRemaining.toJsFn)
    __obj.asInstanceOf[IdleDeadline]
  }
  
  extension [Self <: IdleDeadline](x: Self) {
    
    inline def setDidTimeout(value: scala.Boolean): Self = StObject.set(x, "didTimeout", value.asInstanceOf[js.Any])
    
    inline def setTimeRemaining(value: CallbackTo[DOMHighResTimeStamp]): Self = StObject.set(x, "timeRemaining", value.toJsFn)
  }
}
