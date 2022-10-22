package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typingsJapgolly.elasticElasticsearch.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityActivateUserProfileRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Accesstoken] = js.undefined
}
object SecurityActivateUserProfileRequest {
  
  inline def apply(): SecurityActivateUserProfileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityActivateUserProfileRequest]
  }
  
  extension [Self <: SecurityActivateUserProfileRequest](x: Self) {
    
    inline def setBody(value: Accesstoken): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
