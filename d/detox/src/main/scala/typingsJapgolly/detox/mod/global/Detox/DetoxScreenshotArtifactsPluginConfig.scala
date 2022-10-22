package typingsJapgolly.detox.mod.global.Detox

import typingsJapgolly.detox.anon.AppNotReady
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetoxScreenshotArtifactsPluginConfig extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var keepOnlyFailedTestsArtifacts: js.UndefOr[Boolean] = js.undefined
  
  var shouldTakeAutomaticSnapshots: js.UndefOr[Boolean] = js.undefined
  
  var takeWhen: js.UndefOr[AppNotReady] = js.undefined
}
object DetoxScreenshotArtifactsPluginConfig {
  
  inline def apply(): DetoxScreenshotArtifactsPluginConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetoxScreenshotArtifactsPluginConfig]
  }
  
  extension [Self <: DetoxScreenshotArtifactsPluginConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setKeepOnlyFailedTestsArtifacts(value: Boolean): Self = StObject.set(x, "keepOnlyFailedTestsArtifacts", value.asInstanceOf[js.Any])
    
    inline def setKeepOnlyFailedTestsArtifactsUndefined: Self = StObject.set(x, "keepOnlyFailedTestsArtifacts", js.undefined)
    
    inline def setShouldTakeAutomaticSnapshots(value: Boolean): Self = StObject.set(x, "shouldTakeAutomaticSnapshots", value.asInstanceOf[js.Any])
    
    inline def setShouldTakeAutomaticSnapshotsUndefined: Self = StObject.set(x, "shouldTakeAutomaticSnapshots", js.undefined)
    
    inline def setTakeWhen(value: AppNotReady): Self = StObject.set(x, "takeWhen", value.asInstanceOf[js.Any])
    
    inline def setTakeWhenUndefined: Self = StObject.set(x, "takeWhen", js.undefined)
  }
}
