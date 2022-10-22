package typingsJapgolly.ahooks.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeCurrent extends StObject {
  
  def changeCurrent(current: Double): Unit
  
  def changePageSize(pageSize: Double): Unit
  
  var current: Double
  
  def onChange(current: Double, pageSize: Double): Unit
  
  var pageSize: Double
  
  var total: Double
  
  var totalPage: Double
}
object ChangeCurrent {
  
  inline def apply(
    changeCurrent: Double => Callback,
    changePageSize: Double => Callback,
    current: Double,
    onChange: (Double, Double) => Callback,
    pageSize: Double,
    total: Double,
    totalPage: Double
  ): ChangeCurrent = {
    val __obj = js.Dynamic.literal(changeCurrent = js.Any.fromFunction1((t0: Double) => changeCurrent(t0).runNow()), changePageSize = js.Any.fromFunction1((t0: Double) => changePageSize(t0).runNow()), current = current.asInstanceOf[js.Any], onChange = js.Any.fromFunction2((t0: Double, t1: Double) => (onChange(t0, t1)).runNow()), pageSize = pageSize.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], totalPage = totalPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeCurrent]
  }
  
  extension [Self <: ChangeCurrent](x: Self) {
    
    inline def setChangeCurrent(value: Double => Callback): Self = StObject.set(x, "changeCurrent", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setChangePageSize(value: Double => Callback): Self = StObject.set(x, "changePageSize", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: (Double, Double) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalPage(value: Double): Self = StObject.set(x, "totalPage", value.asInstanceOf[js.Any])
  }
}
