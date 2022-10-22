package typingsJapgolly.detox.mod.global.Detox

import typingsJapgolly.detox.anon.Partialcodecstring
import typingsJapgolly.detox.anon.Partialsizenumbernumberbi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetoxVideoArtifactsPluginConfig extends StObject {
  
  var android: js.UndefOr[Partialsizenumbernumberbi] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var keepOnlyFailedTestsArtifacts: js.UndefOr[Boolean] = js.undefined
  
  var simulator: js.UndefOr[Partialcodecstring] = js.undefined
}
object DetoxVideoArtifactsPluginConfig {
  
  inline def apply(): DetoxVideoArtifactsPluginConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetoxVideoArtifactsPluginConfig]
  }
  
  extension [Self <: DetoxVideoArtifactsPluginConfig](x: Self) {
    
    inline def setAndroid(value: Partialsizenumbernumberbi): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setKeepOnlyFailedTestsArtifacts(value: Boolean): Self = StObject.set(x, "keepOnlyFailedTestsArtifacts", value.asInstanceOf[js.Any])
    
    inline def setKeepOnlyFailedTestsArtifactsUndefined: Self = StObject.set(x, "keepOnlyFailedTestsArtifacts", js.undefined)
    
    inline def setSimulator(value: Partialcodecstring): Self = StObject.set(x, "simulator", value.asInstanceOf[js.Any])
    
    inline def setSimulatorUndefined: Self = StObject.set(x, "simulator", js.undefined)
  }
}
