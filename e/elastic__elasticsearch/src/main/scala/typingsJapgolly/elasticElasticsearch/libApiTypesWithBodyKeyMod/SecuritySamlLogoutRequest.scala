package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typingsJapgolly.elasticElasticsearch.anon.Refreshtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySamlLogoutRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Refreshtoken] = js.undefined
}
object SecuritySamlLogoutRequest {
  
  inline def apply(): SecuritySamlLogoutRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecuritySamlLogoutRequest]
  }
  
  extension [Self <: SecuritySamlLogoutRequest](x: Self) {
    
    inline def setBody(value: Refreshtoken): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
