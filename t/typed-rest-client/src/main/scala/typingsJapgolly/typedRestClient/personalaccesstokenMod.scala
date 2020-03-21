package typingsJapgolly.typedRestClient

import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.typedRestClient.interfacesMod.IHttpClient
import typingsJapgolly.typedRestClient.interfacesMod.IHttpClientResponse
import typingsJapgolly.typedRestClient.interfacesMod.IRequestHandler
import typingsJapgolly.typedRestClient.interfacesMod.IRequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/handlers/personalaccesstoken", JSImport.Namespace)
@js.native
object personalaccesstokenMod extends js.Object {
  @js.native
  class PersonalAccessTokenCredentialHandler protected () extends IRequestHandler {
    def this(token: String) = this()
    var token: String = js.native
    /* CompleteClass */
    override def canHandleAuthentication(response: IHttpClientResponse): Boolean = js.native
    /* CompleteClass */
    override def handleAuthentication(httpClient: IHttpClient, requestInfo: IRequestInfo, objs: js.Any): js.Promise[IHttpClientResponse] = js.native
    def prepareRequest(options: js.Any): Unit = js.native
    /* CompleteClass */
    override def prepareRequest(options: RequestOptions): Unit = js.native
  }
  
}

