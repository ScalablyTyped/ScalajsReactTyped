package typingsJapgolly.ethersprojectProviders

import typingsJapgolly.ethersprojectNetworks.libTypesMod.Network
import typingsJapgolly.ethersprojectNetworks.libTypesMod.Networkish
import typingsJapgolly.ethersprojectProviders.libFormatterMod.CommunityResourcable
import typingsJapgolly.ethersprojectProviders.libUrlJsonRpcProviderMod.UrlJsonRpcProvider
import typingsJapgolly.ethersprojectProviders.libWebsocketProviderMod.WebSocketProvider
import typingsJapgolly.ethersprojectWeb.ethersprojectWebStrings.block
import typingsJapgolly.ethersprojectWeb.mod.ConnectionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInfuraProviderMod {
  
  @JSImport("@ethersproject/providers/lib/infura-provider", "InfuraProvider")
  @js.native
  open class InfuraProvider () extends UrlJsonRpcProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: Any) = this()
    def this(network: Networkish, apiKey: Any) = this()
    
    val projectId: String = js.native
    
    val projectSecret: String = js.native
  }
  /* static members */
  object InfuraProvider {
    
    @JSImport("@ethersproject/providers/lib/infura-provider", "InfuraProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getApiKey(apiKey: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getUrl(network: Network, apiKey: Any): ConnectionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[ConnectionInfo]
    
    inline def getWebSocketProvider(): InfuraWebSocketProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")().asInstanceOf[InfuraWebSocketProvider]
    inline def getWebSocketProvider(network: Unit, apiKey: Any): InfuraWebSocketProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[InfuraWebSocketProvider]
    inline def getWebSocketProvider(network: Networkish): InfuraWebSocketProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any]).asInstanceOf[InfuraWebSocketProvider]
    inline def getWebSocketProvider(network: Networkish, apiKey: Any): InfuraWebSocketProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[InfuraWebSocketProvider]
  }
  
  @JSImport("@ethersproject/providers/lib/infura-provider", "InfuraWebSocketProvider")
  @js.native
  open class InfuraWebSocketProvider ()
    extends WebSocketProvider
       with CommunityResourcable {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: Any) = this()
    def this(network: Networkish, apiKey: Any) = this()
    
    val apiKey: String = js.native
    
    /* CompleteClass */
    override def isCommunityResource(): Boolean = js.native
    
    /* InferMemberOverrides */
    override def lookupAddress(address: String): js.Promise[Null | String] = js.native
    
    /* CompleteClass */
    /* InferMemberOverrides */
    @JSName("once")
    override def once_block(eventName: block, handler: js.Function0[Unit]): Unit = js.native
    
    val projectId: String = js.native
    
    val projectSecret: String = js.native
    
    /* InferMemberOverrides */
    override def resolveName(name: String): js.Promise[Null | String] = js.native
  }
}
