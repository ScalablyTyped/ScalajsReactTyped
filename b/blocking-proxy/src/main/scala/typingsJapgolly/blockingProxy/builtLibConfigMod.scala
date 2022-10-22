package typingsJapgolly.blockingProxy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtLibConfigMod {
  
  @JSImport("blocking-proxy/built/lib/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def printHelp(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printHelp")().asInstanceOf[Unit]
  
  inline def processArgs(argv: js.Array[String]): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("processArgs")(argv.asInstanceOf[js.Any]).asInstanceOf[Config]
  
  trait Config extends StObject {
    
    var fork: js.UndefOr[Boolean] = js.undefined
    
    var help: js.UndefOr[Boolean] = js.undefined
    
    var highlightDelay: js.UndefOr[String] = js.undefined
    
    var logDir: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var seleniumAddress: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setFork(value: Boolean): Self = StObject.set(x, "fork", value.asInstanceOf[js.Any])
      
      inline def setForkUndefined: Self = StObject.set(x, "fork", js.undefined)
      
      inline def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setHighlightDelay(value: String): Self = StObject.set(x, "highlightDelay", value.asInstanceOf[js.Any])
      
      inline def setHighlightDelayUndefined: Self = StObject.set(x, "highlightDelay", js.undefined)
      
      inline def setLogDir(value: String): Self = StObject.set(x, "logDir", value.asInstanceOf[js.Any])
      
      inline def setLogDirUndefined: Self = StObject.set(x, "logDir", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSeleniumAddress(value: String): Self = StObject.set(x, "seleniumAddress", value.asInstanceOf[js.Any])
      
      inline def setSeleniumAddressUndefined: Self = StObject.set(x, "seleniumAddress", js.undefined)
    }
  }
}
