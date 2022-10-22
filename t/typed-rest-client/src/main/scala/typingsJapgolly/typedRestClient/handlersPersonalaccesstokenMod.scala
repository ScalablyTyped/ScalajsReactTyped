package typingsJapgolly.typedRestClient

import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.typedRestClient.interfacesMod.IHttpClient
import typingsJapgolly.typedRestClient.interfacesMod.IHttpClientResponse
import typingsJapgolly.typedRestClient.interfacesMod.IRequestHandler
import typingsJapgolly.typedRestClient.interfacesMod.IRequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlersPersonalaccesstokenMod {
  
  @JSImport("typed-rest-client/handlers/personalaccesstoken", "PersonalAccessTokenCredentialHandler")
  @js.native
  open class PersonalAccessTokenCredentialHandler protected ()
    extends StObject
       with IRequestHandler {
    def this(token: String) = this()
    def this(token: String, allowCrossOriginAuthentication: Boolean) = this()
    
    var allowCrossOriginAuthentication: Boolean = js.native
    
    /* CompleteClass */
    override def canHandleAuthentication(response: IHttpClientResponse): Boolean = js.native
    
    /* CompleteClass */
    override def handleAuthentication(httpClient: IHttpClient, requestInfo: IRequestInfo, objs: Any): js.Promise[IHttpClientResponse] = js.native
    
    var origin: String = js.native
    
    def prepareRequest(options: Any): Unit = js.native
    /* CompleteClass */
    override def prepareRequest(options: RequestOptions): Unit = js.native
    
    var token: String = js.native
  }
}
