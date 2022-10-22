package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typingsJapgolly.elasticElasticsearch.anon.Actions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesModifyDataStreamRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Actions] = js.undefined
}
object IndicesModifyDataStreamRequest {
  
  inline def apply(): IndicesModifyDataStreamRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesModifyDataStreamRequest]
  }
  
  extension [Self <: IndicesModifyDataStreamRequest](x: Self) {
    
    inline def setBody(value: Actions): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
