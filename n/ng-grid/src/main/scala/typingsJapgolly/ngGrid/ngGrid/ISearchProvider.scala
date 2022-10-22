package typingsJapgolly.ngGrid.ngGrid

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchProvider extends StObject {
  
  def evalFilter(): Unit
  
  var extFilter: Boolean
  
  var fieldMap: Any
}
object ISearchProvider {
  
  inline def apply(evalFilter: Callback, extFilter: Boolean, fieldMap: Any): ISearchProvider = {
    val __obj = js.Dynamic.literal(evalFilter = evalFilter.toJsFn, extFilter = extFilter.asInstanceOf[js.Any], fieldMap = fieldMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchProvider]
  }
  
  extension [Self <: ISearchProvider](x: Self) {
    
    inline def setEvalFilter(value: Callback): Self = StObject.set(x, "evalFilter", value.toJsFn)
    
    inline def setExtFilter(value: Boolean): Self = StObject.set(x, "extFilter", value.asInstanceOf[js.Any])
    
    inline def setFieldMap(value: Any): Self = StObject.set(x, "fieldMap", value.asInstanceOf[js.Any])
  }
}
