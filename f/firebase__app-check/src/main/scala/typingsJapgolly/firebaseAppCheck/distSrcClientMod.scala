package typingsJapgolly.firebaseAppCheck

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseAppCheck.distSrcTypesMod.AppCheckTokenInternal
import typingsJapgolly.firebaseAppCheck.firebaseAppCheckStrings.heartbeat
import typingsJapgolly.firebaseComponent.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClientMod {
  
  @JSImport("@firebase/app-check/dist/src/client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exchangeToken_heartbeat(hasUrlBody: AppCheckRequest, heartbeatServiceProvider: Provider[heartbeat]): js.Promise[AppCheckTokenInternal] = (^.asInstanceOf[js.Dynamic].applyDynamic("exchangeToken")(hasUrlBody.asInstanceOf[js.Any], heartbeatServiceProvider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AppCheckTokenInternal]]
  
  inline def getExchangeDebugTokenRequest(app: FirebaseApp, debugToken: String): AppCheckRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getExchangeDebugTokenRequest")(app.asInstanceOf[js.Any], debugToken.asInstanceOf[js.Any])).asInstanceOf[AppCheckRequest]
  
  inline def getExchangeRecaptchaEnterpriseTokenRequest(app: FirebaseApp, reCAPTCHAToken: String): AppCheckRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getExchangeRecaptchaEnterpriseTokenRequest")(app.asInstanceOf[js.Any], reCAPTCHAToken.asInstanceOf[js.Any])).asInstanceOf[AppCheckRequest]
  
  inline def getExchangeRecaptchaV3TokenRequest(app: FirebaseApp, reCAPTCHAToken: String): AppCheckRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("getExchangeRecaptchaV3TokenRequest")(app.asInstanceOf[js.Any], reCAPTCHAToken.asInstanceOf[js.Any])).asInstanceOf[AppCheckRequest]
  
  trait AppCheckRequest extends StObject {
    
    var body: StringDictionary[String]
    
    var url: String
  }
  object AppCheckRequest {
    
    inline def apply(body: StringDictionary[String], url: String): AppCheckRequest = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppCheckRequest]
    }
    
    extension [Self <: AppCheckRequest](x: Self) {
      
      inline def setBody(value: StringDictionary[String]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
