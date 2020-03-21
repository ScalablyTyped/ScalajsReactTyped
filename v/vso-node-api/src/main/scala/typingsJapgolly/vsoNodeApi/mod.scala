package typingsJapgolly.vsoNodeApi

import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IHttpResponse
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/handlers/basiccreds", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BasicCredentialHandler protected () extends IRequestHandler {
    def this(username: String, password: String) = this()
    var password: String = js.native
    var username: String = js.native
    /* CompleteClass */
    override def canHandleAuthentication(res: IHttpResponse): Boolean = js.native
    /* CompleteClass */
    override def handleAuthentication(httpClient: js.Any, protocol: js.Any, options: js.Any, objs: js.Any, finalCallback: js.Any): Unit = js.native
    /* CompleteClass */
    override def prepareRequest(options: js.Any): Unit = js.native
  }
  
}

