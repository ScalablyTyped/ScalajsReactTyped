package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitCore.mod.logging.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackPluginsSingleTestTransformMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins/single-test-transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(source: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins/single-test-transform", "SingleTestTransformLoader")
  @js.native
  val SingleTestTransformLoader: String = js.native
  
  trait SingleTestTransformLoaderOptions extends StObject {
    
    var files: js.UndefOr[js.Array[String]] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
  }
  object SingleTestTransformLoaderOptions {
    
    inline def apply(): SingleTestTransformLoaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SingleTestTransformLoaderOptions]
    }
    
    extension [Self <: SingleTestTransformLoaderOptions](x: Self) {
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
}
