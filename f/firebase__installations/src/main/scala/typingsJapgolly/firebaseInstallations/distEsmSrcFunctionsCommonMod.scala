package typingsJapgolly.firebaseInstallations

import org.scalajs.dom.Headers
import org.scalajs.dom.Response
import typingsJapgolly.firebaseInstallations.anon.Code
import typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesApiResponseMod.GenerateAuthTokenResponse
import typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.CompletedAuthToken
import typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.RegisteredInstallationEntry
import typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationImplMod.AppConfig
import typingsJapgolly.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcFunctionsCommonMod {
  
  @JSImport("@firebase/installations/dist/esm/src/functions/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractAuthTokenInfoFromResponse(response: GenerateAuthTokenResponse): CompletedAuthToken = ^.asInstanceOf[js.Dynamic].applyDynamic("extractAuthTokenInfoFromResponse")(response.asInstanceOf[js.Any]).asInstanceOf[CompletedAuthToken]
  
  inline def getErrorFromResponse(requestName: String, response: Response): js.Promise[FirebaseError] = (^.asInstanceOf[js.Dynamic].applyDynamic("getErrorFromResponse")(requestName.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FirebaseError]]
  
  inline def getHeaders(hasApiKey: AppConfig): Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeaders")(hasApiKey.asInstanceOf[js.Any]).asInstanceOf[Headers]
  
  inline def getHeadersWithAuth(appConfig: AppConfig, hasRefreshToken: RegisteredInstallationEntry): Headers = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeadersWithAuth")(appConfig.asInstanceOf[js.Any], hasRefreshToken.asInstanceOf[js.Any])).asInstanceOf[Headers]
  
  inline def getInstallationsEndpoint(hasProjectId: AppConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallationsEndpoint")(hasProjectId.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def retryIfServerError(fn: js.Function0[js.Promise[Response]]): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryIfServerError")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  
  trait ErrorResponse extends StObject {
    
    var error: Code
  }
  object ErrorResponse {
    
    inline def apply(error: Code): ErrorResponse = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorResponse]
    }
    
    extension [Self <: ErrorResponse](x: Self) {
      
      inline def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
}
