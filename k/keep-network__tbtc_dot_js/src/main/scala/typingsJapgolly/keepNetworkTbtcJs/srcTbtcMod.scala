package typingsJapgolly.keepNetworkTbtcJs

import typingsJapgolly.keepNetworkTbtcJs.srcCommonTypesMod.TBTCConfig
import typingsJapgolly.keepNetworkTbtcJs.srcConstantsMod.Constants
import typingsJapgolly.keepNetworkTbtcJs.srcDepositMod.DepositFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTbtcMod {
  
  @JSImport("@keep-network/tbtc.js/src/TBTC", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@keep-network/tbtc.js/src/TBTC", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TBTC {
    def this(depositFactory: DepositFactory, constants: Constants, config: TBTCConfig) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@keep-network/tbtc.js/src/TBTC", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def withConfig(config: TBTCConfig): js.Promise[TBTC] = ^.asInstanceOf[js.Dynamic].applyDynamic("withConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TBTC]]
    inline def withConfig(config: TBTCConfig, networkMatchCheck: Boolean): js.Promise[TBTC] = (^.asInstanceOf[js.Dynamic].applyDynamic("withConfig")(config.asInstanceOf[js.Any], networkMatchCheck.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TBTC]]
  }
  
  inline def getNetworkIdFromArtifact(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkIdFromArtifact")().asInstanceOf[String]
  
  @js.native
  trait TBTC extends StObject {
    
    def Constants: typingsJapgolly.keepNetworkTbtcJs.srcConstantsMod.Constants = js.native
    
    def Deposit: DepositFactory = js.native
    
    var config: TBTCConfig = js.native
    
    var constants: Constants = js.native
    
    var depositFactory: DepositFactory = js.native
    
    var satoshisPerTbtc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
  }
}
