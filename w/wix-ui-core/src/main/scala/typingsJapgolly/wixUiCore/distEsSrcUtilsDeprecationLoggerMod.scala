package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcUtilsDeprecationLoggerMod {
  
  @JSImport("wix-ui-core/dist/es/src/utils/deprecation-logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("wix-ui-core/dist/es/src/utils/deprecation-logger", "depLogger")
  @js.native
  def depLogger: Logger = js.native
  inline def depLogger_=(x: Logger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("depLogger")(x.asInstanceOf[js.Any])
  
  trait Logger extends StObject {
    
    def log(msg: String): Unit
  }
  object Logger {
    
    inline def apply(log: String => Callback): Logger = {
      val __obj = js.Dynamic.literal(log = js.Any.fromFunction1((t0: String) => log(t0).runNow()))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setLog(value: String => Callback): Self = StObject.set(x, "log", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
