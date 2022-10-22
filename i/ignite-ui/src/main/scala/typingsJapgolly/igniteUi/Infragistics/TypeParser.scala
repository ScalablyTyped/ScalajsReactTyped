package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeParser extends StObject {
  
  def empty(): Unit
  
  def isNullOrUndefined(obj: js.Object): Unit
  
  def num(): Unit
  
  def toBool(obj: js.Object): Unit
  
  /**
    * L.A. 18 June 2012 Fixing bug #113265 Column 'date' shows empty values as 'NaN'
    *
    * @param obj
    */
  def toDate(obj: js.Object): Unit
  
  def toNumber(obj: js.Object): Unit
  
  def toStr(obj: js.Object): Unit
  
  def toTime(obj: js.Object): Unit
}
object TypeParser {
  
  inline def apply(
    empty: Callback,
    isNullOrUndefined: js.Object => Callback,
    num: Callback,
    toBool: js.Object => Callback,
    toDate: js.Object => Callback,
    toNumber: js.Object => Callback,
    toStr: js.Object => Callback,
    toTime: js.Object => Callback
  ): TypeParser = {
    val __obj = js.Dynamic.literal(empty = empty.toJsFn, isNullOrUndefined = js.Any.fromFunction1((t0: js.Object) => isNullOrUndefined(t0).runNow()), num = num.toJsFn, toBool = js.Any.fromFunction1((t0: js.Object) => toBool(t0).runNow()), toDate = js.Any.fromFunction1((t0: js.Object) => toDate(t0).runNow()), toNumber = js.Any.fromFunction1((t0: js.Object) => toNumber(t0).runNow()), toStr = js.Any.fromFunction1((t0: js.Object) => toStr(t0).runNow()), toTime = js.Any.fromFunction1((t0: js.Object) => toTime(t0).runNow()))
    __obj.asInstanceOf[TypeParser]
  }
  
  extension [Self <: TypeParser](x: Self) {
    
    inline def setEmpty(value: Callback): Self = StObject.set(x, "empty", value.toJsFn)
    
    inline def setIsNullOrUndefined(value: js.Object => Callback): Self = StObject.set(x, "isNullOrUndefined", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setNum(value: Callback): Self = StObject.set(x, "num", value.toJsFn)
    
    inline def setToBool(value: js.Object => Callback): Self = StObject.set(x, "toBool", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setToDate(value: js.Object => Callback): Self = StObject.set(x, "toDate", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setToNumber(value: js.Object => Callback): Self = StObject.set(x, "toNumber", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setToStr(value: js.Object => Callback): Self = StObject.set(x, "toStr", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setToTime(value: js.Object => Callback): Self = StObject.set(x, "toTime", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
  }
}
