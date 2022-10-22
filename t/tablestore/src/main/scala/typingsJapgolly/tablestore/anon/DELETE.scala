package typingsJapgolly.tablestore.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tablestore.mod.AttributesInput
import typingsJapgolly.tablestore.mod.int64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DELETE extends StObject {
  
  var DELETE: js.UndefOr[js.Array[StringDictionary[int64]]] = js.undefined
  
  var DELETE_ALL: js.UndefOr[js.Array[String]] = js.undefined
  
  var PUT: js.UndefOr[AttributesInput] = js.undefined
}
object DELETE {
  
  inline def apply(): DELETE = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DELETE]
  }
  
  extension [Self <: DELETE](x: Self) {
    
    inline def setDELETE(value: js.Array[StringDictionary[int64]]): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
    
    inline def setDELETEUndefined: Self = StObject.set(x, "DELETE", js.undefined)
    
    inline def setDELETEVarargs(value: StringDictionary[int64]*): Self = StObject.set(x, "DELETE", js.Array(value*))
    
    inline def setDELETE_ALL(value: js.Array[String]): Self = StObject.set(x, "DELETE_ALL", value.asInstanceOf[js.Any])
    
    inline def setDELETE_ALLUndefined: Self = StObject.set(x, "DELETE_ALL", js.undefined)
    
    inline def setDELETE_ALLVarargs(value: String*): Self = StObject.set(x, "DELETE_ALL", js.Array(value*))
    
    inline def setPUT(value: AttributesInput): Self = StObject.set(x, "PUT", value.asInstanceOf[js.Any])
    
    inline def setPUTUndefined: Self = StObject.set(x, "PUT", js.undefined)
    
    inline def setPUTVarargs(value: Dictname*): Self = StObject.set(x, "PUT", js.Array(value*))
  }
}
