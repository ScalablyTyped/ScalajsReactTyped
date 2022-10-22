package typingsJapgolly.vsoNodeApi

import typingsJapgolly.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IHttpResponse
import typingsJapgolly.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlersBasiccredsMod {
  
  @JSImport("vso-node-api/handlers/basiccreds", "BasicCredentialHandler")
  @js.native
  open class BasicCredentialHandler protected ()
    extends StObject
       with IRequestHandler {
    def this(username: String, password: String) = this()
    
    /* CompleteClass */
    override def canHandleAuthentication(res: IHttpResponse): Boolean = js.native
    
    /* CompleteClass */
    override def handleAuthentication(httpClient: Any, protocol: Any, options: Any, objs: Any, finalCallback: Any): Unit = js.native
    
    var password: String = js.native
    
    /* CompleteClass */
    override def prepareRequest(options: Any): Unit = js.native
    
    var username: String = js.native
  }
}
