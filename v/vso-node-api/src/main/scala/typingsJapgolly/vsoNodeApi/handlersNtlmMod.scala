package typingsJapgolly.vsoNodeApi

import typingsJapgolly.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IHttpResponse
import typingsJapgolly.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlersNtlmMod {
  
  @JSImport("vso-node-api/handlers/ntlm", "NtlmCredentialHandler")
  @js.native
  open class NtlmCredentialHandler protected ()
    extends StObject
       with IRequestHandler {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, workstation: String) = this()
    def this(username: String, password: String, workstation: String, domain: String) = this()
    def this(username: String, password: String, workstation: Unit, domain: String) = this()
    
    /* CompleteClass */
    override def canHandleAuthentication(res: IHttpResponse): Boolean = js.native
    
    var domain: String = js.native
    
    /* CompleteClass */
    override def handleAuthentication(httpClient: Any, protocol: Any, options: Any, objs: Any, finalCallback: Any): Unit = js.native
    
    var password: String = js.native
    
    /* CompleteClass */
    override def prepareRequest(options: Any): Unit = js.native
    
    /* private */ def sendType1Message(httpClient: Any, protocol: Any, options: Any, objs: Any, keepaliveAgent: Any, callback: Any): Any = js.native
    
    /* private */ def sendType3Message(
      httpClient: Any,
      protocol: Any,
      options: Any,
      objs: Any,
      keepaliveAgent: Any,
      res: Any,
      callback: Any
    ): Any = js.native
    
    var username: String = js.native
    
    var workstation: String = js.native
  }
}
