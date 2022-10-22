package typingsJapgolly.vueNiceDates.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGridType extends StObject {
  
  def getGridType(`type`: String, isReverse: Boolean): String
  
  def handleClickDate(date: js.Date, `type`: String): Unit
  
  def handleClickTitle(): Unit
  
  def handleMouseEnterDate(date: js.Date): Unit
  
  def handleMouseLeaveDates(): Unit
  
  def handleNavigate(date: js.Date): Unit
}
object GetGridType {
  
  inline def apply(
    getGridType: (String, Boolean) => String,
    handleClickDate: (js.Date, String) => Callback,
    handleClickTitle: Callback,
    handleMouseEnterDate: js.Date => Callback,
    handleMouseLeaveDates: Callback,
    handleNavigate: js.Date => Callback
  ): GetGridType = {
    val __obj = js.Dynamic.literal(getGridType = js.Any.fromFunction2(getGridType), handleClickDate = js.Any.fromFunction2((t0: js.Date, t1: String) => (handleClickDate(t0, t1)).runNow()), handleClickTitle = handleClickTitle.toJsFn, handleMouseEnterDate = js.Any.fromFunction1((t0: js.Date) => handleMouseEnterDate(t0).runNow()), handleMouseLeaveDates = handleMouseLeaveDates.toJsFn, handleNavigate = js.Any.fromFunction1((t0: js.Date) => handleNavigate(t0).runNow()))
    __obj.asInstanceOf[GetGridType]
  }
  
  extension [Self <: GetGridType](x: Self) {
    
    inline def setGetGridType(value: (String, Boolean) => String): Self = StObject.set(x, "getGridType", js.Any.fromFunction2(value))
    
    inline def setHandleClickDate(value: (js.Date, String) => Callback): Self = StObject.set(x, "handleClickDate", js.Any.fromFunction2((t0: js.Date, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setHandleClickTitle(value: Callback): Self = StObject.set(x, "handleClickTitle", value.toJsFn)
    
    inline def setHandleMouseEnterDate(value: js.Date => Callback): Self = StObject.set(x, "handleMouseEnterDate", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setHandleMouseLeaveDates(value: Callback): Self = StObject.set(x, "handleMouseLeaveDates", value.toJsFn)
    
    inline def setHandleNavigate(value: js.Date => Callback): Self = StObject.set(x, "handleNavigate", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
  }
}
