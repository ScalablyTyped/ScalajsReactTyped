package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetoxUIHierarchyArtifactsPluginConfig extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object DetoxUIHierarchyArtifactsPluginConfig {
  
  inline def apply(): DetoxUIHierarchyArtifactsPluginConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetoxUIHierarchyArtifactsPluginConfig]
  }
  
  extension [Self <: DetoxUIHierarchyArtifactsPluginConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
