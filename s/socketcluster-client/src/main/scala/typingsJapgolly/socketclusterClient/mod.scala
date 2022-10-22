package typingsJapgolly.socketclusterClient

import typingsJapgolly.socketclusterClient.libClientsocketMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socketcluster-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("socketcluster-client", "AGClientSocket")
  @js.native
  open class AGClientSocket protected ()
    extends typingsJapgolly.socketclusterClient.libClientsocketMod.^ {
    def this(opts: ClientOptions) = this()
  }
  
  inline def create(): AGClientSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[AGClientSocket]
  inline def create(options: ClientOptions): AGClientSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[AGClientSocket]
  
  object factory {
    
    @JSImport("socketcluster-client", "factory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): typingsJapgolly.socketclusterClient.libClientsocketMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.socketclusterClient.libClientsocketMod.^]
    inline def create(options: ClientOptions): typingsJapgolly.socketclusterClient.libClientsocketMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.socketclusterClient.libClientsocketMod.^]
  }
  
  @JSImport("socketcluster-client", "version")
  @js.native
  val version: String = js.native
}
