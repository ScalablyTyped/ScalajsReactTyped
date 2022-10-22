package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typingsJapgolly.elasticElasticsearch.anon.Querystring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySamlCompleteLogoutRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Querystring] = js.undefined
}
object SecuritySamlCompleteLogoutRequest {
  
  inline def apply(): SecuritySamlCompleteLogoutRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecuritySamlCompleteLogoutRequest]
  }
  
  extension [Self <: SecuritySamlCompleteLogoutRequest](x: Self) {
    
    inline def setBody(value: Querystring): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
