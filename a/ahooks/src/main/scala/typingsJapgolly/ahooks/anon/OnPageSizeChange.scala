package typingsJapgolly.ahooks.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPageSizeChange extends StObject {
  
  var current: Double
  
  def onChange(current: Double): Unit
  
  def onPageSizeChange(size: Double): Unit
  
  var pageSize: Double
  
  var total: Double
}
object OnPageSizeChange {
  
  inline def apply(
    current: Double,
    onChange: Double => Callback,
    onPageSizeChange: Double => Callback,
    pageSize: Double,
    total: Double
  ): OnPageSizeChange = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: Double) => onChange(t0).runNow()), onPageSizeChange = js.Any.fromFunction1((t0: Double) => onPageSizeChange(t0).runNow()), pageSize = pageSize.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPageSizeChange]
  }
  
  extension [Self <: OnPageSizeChange](x: Self) {
    
    inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Double => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setOnPageSizeChange(value: Double => Callback): Self = StObject.set(x, "onPageSizeChange", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
