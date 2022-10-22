package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetoxInstrumentsArtifactsPluginConfig extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object DetoxInstrumentsArtifactsPluginConfig {
  
  inline def apply(): DetoxInstrumentsArtifactsPluginConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetoxInstrumentsArtifactsPluginConfig]
  }
  
  extension [Self <: DetoxInstrumentsArtifactsPluginConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
