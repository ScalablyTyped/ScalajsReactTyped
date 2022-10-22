package typingsJapgolly.activexInterop

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date extends StObject {
  
  def getVarDate(): VarDate
}
object Date {
  
  inline def apply(getVarDate: CallbackTo[VarDate]): Date = {
    val __obj = js.Dynamic.literal(getVarDate = getVarDate.toJsFn)
    __obj.asInstanceOf[Date]
  }
  
  extension [Self <: Date](x: Self) {
    
    inline def setGetVarDate(value: CallbackTo[VarDate]): Self = StObject.set(x, "getVarDate", value.toJsFn)
  }
}
