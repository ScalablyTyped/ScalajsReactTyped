package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetoxLogArtifactsPluginConfig extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var keepOnlyFailedTestsArtifacts: js.UndefOr[Boolean] = js.undefined
}
object DetoxLogArtifactsPluginConfig {
  
  inline def apply(): DetoxLogArtifactsPluginConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetoxLogArtifactsPluginConfig]
  }
  
  extension [Self <: DetoxLogArtifactsPluginConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setKeepOnlyFailedTestsArtifacts(value: Boolean): Self = StObject.set(x, "keepOnlyFailedTestsArtifacts", value.asInstanceOf[js.Any])
    
    inline def setKeepOnlyFailedTestsArtifactsUndefined: Self = StObject.set(x, "keepOnlyFailedTestsArtifacts", js.undefined)
  }
}
