package typingsJapgolly.ethersprojectProviders

import typingsJapgolly.ethersprojectNetworks.libTypesMod.Network
import typingsJapgolly.ethersprojectNetworks.libTypesMod.Networkish
import typingsJapgolly.ethersprojectProviders.libUrlJsonRpcProviderMod.UrlJsonRpcProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodesmithProviderMod {
  
  @JSImport("@ethersproject/providers/lib/nodesmith-provider", "NodesmithProvider")
  @js.native
  open class NodesmithProvider () extends UrlJsonRpcProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: Any) = this()
    def this(network: Networkish, apiKey: Any) = this()
  }
  /* static members */
  object NodesmithProvider {
    
    @JSImport("@ethersproject/providers/lib/nodesmith-provider", "NodesmithProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getApiKey(apiKey: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getUrl(network: Network): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getUrl(network: Network, apiKey: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
