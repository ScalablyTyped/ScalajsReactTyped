package typingsJapgolly.detox.mod.global.Detox

import typingsJapgolly.detox.anon.DictpluginId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetoxArtifactsConfig extends StObject {
  
  var pathBuilder: js.UndefOr[String] = js.undefined
  
  var plugins: js.UndefOr[DictpluginId] = js.undefined
  
  var rootDir: js.UndefOr[String] = js.undefined
}
object DetoxArtifactsConfig {
  
  inline def apply(): DetoxArtifactsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetoxArtifactsConfig]
  }
  
  extension [Self <: DetoxArtifactsConfig](x: Self) {
    
    inline def setPathBuilder(value: String): Self = StObject.set(x, "pathBuilder", value.asInstanceOf[js.Any])
    
    inline def setPathBuilderUndefined: Self = StObject.set(x, "pathBuilder", js.undefined)
    
    inline def setPlugins(value: DictpluginId): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
    
    inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
  }
}
