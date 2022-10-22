package typingsJapgolly.ethersprojectProviders

import typingsJapgolly.ethersprojectNetworks.libTypesMod.Network
import typingsJapgolly.ethersprojectNetworks.libTypesMod.Networkish
import typingsJapgolly.ethersprojectProviders.libUrlJsonRpcProviderMod.UrlJsonRpcProvider
import typingsJapgolly.ethersprojectWeb.mod.ConnectionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPocketProviderMod {
  
  @JSImport("@ethersproject/providers/lib/pocket-provider", "PocketProvider")
  @js.native
  open class PocketProvider () extends UrlJsonRpcProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: Any) = this()
    def this(network: Networkish, apiKey: Any) = this()
    
    val applicationId: String = js.native
    
    val applicationSecretKey: String = js.native
    
    val loadBalancer: Boolean = js.native
  }
  /* static members */
  object PocketProvider {
    
    @JSImport("@ethersproject/providers/lib/pocket-provider", "PocketProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getApiKey(apiKey: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getUrl(network: Network, apiKey: Any): ConnectionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[ConnectionInfo]
  }
}
