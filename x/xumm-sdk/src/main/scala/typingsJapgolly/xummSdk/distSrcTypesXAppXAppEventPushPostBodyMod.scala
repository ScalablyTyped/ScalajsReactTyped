package typingsJapgolly.xummSdk

import typingsJapgolly.xummSdk.distSrcTypesMetaAnyJsonMod.AnyJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesXAppXAppEventPushPostBodyMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait xAppEventPushPostBody extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[AnyJson] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var user_token: String
  }
  object xAppEventPushPostBody {
    
    inline def apply(user_token: String): xAppEventPushPostBody = {
      val __obj = js.Dynamic.literal(user_token = user_token.asInstanceOf[js.Any])
      __obj.asInstanceOf[xAppEventPushPostBody]
    }
    
    extension [Self <: xAppEventPushPostBody](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setData(value: AnyJson): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setUser_token(value: String): Self = StObject.set(x, "user_token", value.asInstanceOf[js.Any])
    }
  }
}
