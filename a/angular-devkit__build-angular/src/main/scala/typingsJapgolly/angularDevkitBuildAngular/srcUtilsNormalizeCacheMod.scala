package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsNormalizeCacheMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/normalize-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeCacheOptions(metadata: JsonObject, worspaceRoot: String): NormalizedCachedOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeCacheOptions")(metadata.asInstanceOf[js.Any], worspaceRoot.asInstanceOf[js.Any])).asInstanceOf[NormalizedCachedOptions]
  
  trait NormalizedCachedOptions extends StObject {
    
    /** Disk cache base path. Example: `/.angular/cache`. */
    var basePath: String
    
    /** Whether disk cache is enabled. */
    var enabled: Boolean
    
    /** Disk cache path. Example: `/.angular/cache/v12.0.0`. */
    var path: String
  }
  object NormalizedCachedOptions {
    
    inline def apply(basePath: String, enabled: Boolean, path: String): NormalizedCachedOptions = {
      val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedCachedOptions]
    }
    
    extension [Self <: NormalizedCachedOptions](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
