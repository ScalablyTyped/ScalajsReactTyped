package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosePointInTimeRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[typingsJapgolly.elasticElasticsearch.anon.Id] = js.undefined
}
object ClosePointInTimeRequest {
  
  inline def apply(): ClosePointInTimeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosePointInTimeRequest]
  }
  
  extension [Self <: ClosePointInTimeRequest](x: Self) {
    
    inline def setBody(value: typingsJapgolly.elasticElasticsearch.anon.Id): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
