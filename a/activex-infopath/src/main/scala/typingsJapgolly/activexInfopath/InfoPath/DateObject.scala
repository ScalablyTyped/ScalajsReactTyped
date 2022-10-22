package typingsJapgolly.activexInfopath.InfoPath

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateObject extends StObject {
  
  def AddDays(pvarDate: Any, pvarDays: Any): Any
  
  def AddSeconds(pvarTime: Any, pvarSeconds: Any): Any
  
  /* private */ @JSName("InfoPath.DateObject_typekey")
  var InfoPathDotDateObject_typekey: DateObject
  
  def Now(): Any
  
  def Today(): Any
}
object DateObject {
  
  inline def apply(
    AddDays: (Any, Any) => Any,
    AddSeconds: (Any, Any) => Any,
    InfoPathDotDateObject_typekey: DateObject,
    Now: CallbackTo[Any],
    Today: CallbackTo[Any]
  ): DateObject = {
    val __obj = js.Dynamic.literal(AddDays = js.Any.fromFunction2(AddDays), AddSeconds = js.Any.fromFunction2(AddSeconds), Now = Now.toJsFn, Today = Today.toJsFn)
    __obj.updateDynamic("InfoPath.DateObject_typekey")(InfoPathDotDateObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateObject]
  }
  
  extension [Self <: DateObject](x: Self) {
    
    inline def setAddDays(value: (Any, Any) => Any): Self = StObject.set(x, "AddDays", js.Any.fromFunction2(value))
    
    inline def setAddSeconds(value: (Any, Any) => Any): Self = StObject.set(x, "AddSeconds", js.Any.fromFunction2(value))
    
    inline def setInfoPathDotDateObject_typekey(value: DateObject): Self = StObject.set(x, "InfoPath.DateObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setNow(value: CallbackTo[Any]): Self = StObject.set(x, "Now", value.toJsFn)
    
    inline def setToday(value: CallbackTo[Any]): Self = StObject.set(x, "Today", value.toJsFn)
  }
}
