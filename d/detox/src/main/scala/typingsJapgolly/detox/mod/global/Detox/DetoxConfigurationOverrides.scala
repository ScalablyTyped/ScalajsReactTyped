package typingsJapgolly.detox.mod.global.Detox

import typingsJapgolly.detox.detoxBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetoxConfigurationOverrides extends StObject {
  
  var artifacts: js.UndefOr[`false` | DetoxArtifactsConfig] = js.undefined
  
  var behavior: js.UndefOr[DetoxBehaviorConfig] = js.undefined
  
  var session: js.UndefOr[DetoxSessionConfig] = js.undefined
}
object DetoxConfigurationOverrides {
  
  inline def apply(): DetoxConfigurationOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetoxConfigurationOverrides]
  }
  
  extension [Self <: DetoxConfigurationOverrides](x: Self) {
    
    inline def setArtifacts(value: `false` | DetoxArtifactsConfig): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    inline def setBehavior(value: DetoxBehaviorConfig): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    
    inline def setSession(value: DetoxSessionConfig): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
