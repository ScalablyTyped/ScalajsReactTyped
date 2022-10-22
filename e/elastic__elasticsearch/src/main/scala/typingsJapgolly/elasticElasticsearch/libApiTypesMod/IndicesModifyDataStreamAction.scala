package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesModifyDataStreamAction extends StObject {
  
  var add_backing_index: js.UndefOr[IndicesModifyDataStreamIndexAndDataStreamAction] = js.undefined
  
  var remove_backing_index: js.UndefOr[IndicesModifyDataStreamIndexAndDataStreamAction] = js.undefined
}
object IndicesModifyDataStreamAction {
  
  inline def apply(): IndicesModifyDataStreamAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesModifyDataStreamAction]
  }
  
  extension [Self <: IndicesModifyDataStreamAction](x: Self) {
    
    inline def setAdd_backing_index(value: IndicesModifyDataStreamIndexAndDataStreamAction): Self = StObject.set(x, "add_backing_index", value.asInstanceOf[js.Any])
    
    inline def setAdd_backing_indexUndefined: Self = StObject.set(x, "add_backing_index", js.undefined)
    
    inline def setRemove_backing_index(value: IndicesModifyDataStreamIndexAndDataStreamAction): Self = StObject.set(x, "remove_backing_index", value.asInstanceOf[js.Any])
    
    inline def setRemove_backing_indexUndefined: Self = StObject.set(x, "remove_backing_index", js.undefined)
  }
}
