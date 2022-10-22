package typingsJapgolly.awsSdkCredentialProviderImds

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.httpMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRemoteProviderHttpRequestMod {
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/remoteProvider/httpRequest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def httpRequest(options: RequestOptions): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("httpRequest")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
}
