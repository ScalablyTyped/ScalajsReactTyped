package typingsJapgolly.vsoNodeApi

import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IHttpResponse
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/handlers/personalaccesstoken", JSImport.Namespace)
@js.native
object personalaccesstokenMod extends js.Object {
  @js.native
  class PersonalAccessTokenCredentialHandler protected () extends IRequestHandler {
    def this(token: String) = this()
    var token: String = js.native
    /* CompleteClass */
    override def canHandleAuthentication(res: IHttpResponse): Boolean = js.native
    /* CompleteClass */
    override def handleAuthentication(httpClient: js.Any, protocol: js.Any, options: js.Any, objs: js.Any, finalCallback: js.Any): Unit = js.native
    /* CompleteClass */
    override def prepareRequest(options: js.Any): Unit = js.native
  }
  
}

