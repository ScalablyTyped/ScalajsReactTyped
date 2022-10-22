package typingsJapgolly.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfig extends StObject {
  
  /** Logging components configuration */
  var componentConfig: js.UndefOr[LoggingComponentConfig] = js.undefined
}
object LoggingConfig {
  
  inline def apply(): LoggingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingConfig]
  }
  
  extension [Self <: LoggingConfig](x: Self) {
    
    inline def setComponentConfig(value: LoggingComponentConfig): Self = StObject.set(x, "componentConfig", value.asInstanceOf[js.Any])
    
    inline def setComponentConfigUndefined: Self = StObject.set(x, "componentConfig", js.undefined)
  }
}
