package typingsJapgolly.elasticsearch.mod

import typingsJapgolly.elasticsearch.anon.Alias
import typingsJapgolly.elasticsearch.anon.Index
import typingsJapgolly.elasticsearch.anon.IndexString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesUpdateAliasesParamsAction extends StObject {
  
  var add: js.UndefOr[Alias] = js.undefined
  
  var remove: js.UndefOr[Index] = js.undefined
  
  var remove_index: js.UndefOr[IndexString] = js.undefined
}
object IndicesUpdateAliasesParamsAction {
  
  inline def apply(): IndicesUpdateAliasesParamsAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesUpdateAliasesParamsAction]
  }
  
  extension [Self <: IndicesUpdateAliasesParamsAction](x: Self) {
    
    inline def setAdd(value: Alias): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setRemove(value: Index): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setRemove_index(value: IndexString): Self = StObject.set(x, "remove_index", value.asInstanceOf[js.Any])
    
    inline def setRemove_indexUndefined: Self = StObject.set(x, "remove_index", js.undefined)
  }
}
