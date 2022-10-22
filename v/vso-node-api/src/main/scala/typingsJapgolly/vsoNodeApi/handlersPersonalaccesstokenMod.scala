package typingsJapgolly.vsoNodeApi

import typingsJapgolly.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IHttpResponse
import typingsJapgolly.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlersPersonalaccesstokenMod {
  
  @JSImport("vso-node-api/handlers/personalaccesstoken", "PersonalAccessTokenCredentialHandler")
  @js.native
  open class PersonalAccessTokenCredentialHandler protected ()
    extends StObject
       with IRequestHandler {
    def this(token: String) = this()
    
    /* CompleteClass */
    override def canHandleAuthentication(res: IHttpResponse): Boolean = js.native
    
    /* CompleteClass */
    override def handleAuthentication(httpClient: Any, protocol: Any, options: Any, objs: Any, finalCallback: Any): Unit = js.native
    
    /* CompleteClass */
    override def prepareRequest(options: Any): Unit = js.native
    
    var token: String = js.native
  }
}
