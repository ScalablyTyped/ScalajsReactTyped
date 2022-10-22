package typingsJapgolly.asn1js.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDateConvertible extends StObject {
  
  /**
    * Creates a class object from the JavaScript Date object
    * @param date Date object
    */
  def fromDate(date: js.Date): Unit
  
  /**
    * Converts a class object into the JavaScrip Date Object
    * @returns Date object
    */
  def toDate(): js.Date
}
object IDateConvertible {
  
  inline def apply(fromDate: js.Date => Callback, toDate: CallbackTo[js.Date]): IDateConvertible = {
    val __obj = js.Dynamic.literal(fromDate = js.Any.fromFunction1((t0: js.Date) => fromDate(t0).runNow()), toDate = toDate.toJsFn)
    __obj.asInstanceOf[IDateConvertible]
  }
  
  extension [Self <: IDateConvertible](x: Self) {
    
    inline def setFromDate(value: js.Date => Callback): Self = StObject.set(x, "fromDate", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setToDate(value: CallbackTo[js.Date]): Self = StObject.set(x, "toDate", value.toJsFn)
  }
}
