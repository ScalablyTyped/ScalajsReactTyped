package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typingsJapgolly.elasticElasticsearch.anon.Items
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutFilterRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Items] = js.undefined
  
  var filter_id: Id
}
object MlPutFilterRequest {
  
  inline def apply(filter_id: Id): MlPutFilterRequest = {
    val __obj = js.Dynamic.literal(filter_id = filter_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutFilterRequest]
  }
  
  extension [Self <: MlPutFilterRequest](x: Self) {
    
    inline def setBody(value: Items): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setFilter_id(value: Id): Self = StObject.set(x, "filter_id", value.asInstanceOf[js.Any])
  }
}
