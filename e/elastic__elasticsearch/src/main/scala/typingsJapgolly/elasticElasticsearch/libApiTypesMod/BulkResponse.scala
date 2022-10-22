package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import typingsJapgolly.elasticElasticsearch.anon.PartialRecordBulkOperatio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkResponse extends StObject {
  
  var errors: Boolean
  
  var ingest_took: js.UndefOr[long] = js.undefined
  
  var items: js.Array[PartialRecordBulkOperatio]
  
  var took: long
}
object BulkResponse {
  
  inline def apply(errors: Boolean, items: js.Array[PartialRecordBulkOperatio], took: long): BulkResponse = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkResponse]
  }
  
  extension [Self <: BulkResponse](x: Self) {
    
    inline def setErrors(value: Boolean): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setIngest_took(value: long): Self = StObject.set(x, "ingest_took", value.asInstanceOf[js.Any])
    
    inline def setIngest_tookUndefined: Self = StObject.set(x, "ingest_took", js.undefined)
    
    inline def setItems(value: js.Array[PartialRecordBulkOperatio]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: PartialRecordBulkOperatio*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setTook(value: long): Self = StObject.set(x, "took", value.asInstanceOf[js.Any])
  }
}
