package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.libCoreMod.Logger
import typingsJapgolly.sipJs.libPlatformWebTransportTransportOptionsMod.TransportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlatformWebTransportMod {
  
  @JSImport("sip.js/lib/platform/web/transport", "Transport")
  @js.native
  open class Transport protected ()
    extends typingsJapgolly.sipJs.libPlatformWebTransportTransportMod.Transport {
    def this(logger: Logger) = this()
    def this(logger: Logger, options: TransportOptions) = this()
  }
  /* static members */
  object Transport {
    
    @JSImport("sip.js/lib/platform/web/transport", "Transport")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sip.js/lib/platform/web/transport", "Transport.defaultOptions")
    @js.native
    def defaultOptions: Any = js.native
    inline def defaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  }
}
