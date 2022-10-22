package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetoxSessionConfig extends StObject {
  
  var autoStart: js.UndefOr[Boolean] = js.undefined
  
  var debugSynchronization: js.UndefOr[Double] = js.undefined
  
  var server: js.UndefOr[String] = js.undefined
  
  var sessionId: js.UndefOr[String] = js.undefined
}
object DetoxSessionConfig {
  
  inline def apply(): DetoxSessionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetoxSessionConfig]
  }
  
  extension [Self <: DetoxSessionConfig](x: Self) {
    
    inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
    
    inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
    
    inline def setDebugSynchronization(value: Double): Self = StObject.set(x, "debugSynchronization", value.asInstanceOf[js.Any])
    
    inline def setDebugSynchronizationUndefined: Self = StObject.set(x, "debugSynchronization", js.undefined)
    
    inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
  }
}
