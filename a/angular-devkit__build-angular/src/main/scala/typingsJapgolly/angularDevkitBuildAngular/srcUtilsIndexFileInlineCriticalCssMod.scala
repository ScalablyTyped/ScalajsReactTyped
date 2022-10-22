package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsIndexFileInlineCriticalCssMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/index-file/inline-critical-css", "InlineCriticalCssProcessor")
  @js.native
  open class InlineCriticalCssProcessor protected () extends StObject {
    def this(options: InlineCriticalCssProcessorOptions) = this()
    
    /* protected */ val options: InlineCriticalCssProcessorOptions = js.native
    
    def process(html: String, options: InlineCriticalCssProcessOptions): js.Promise[Content] = js.native
  }
  
  trait InlineCriticalCssProcessOptions extends StObject {
    
    var outputPath: String
  }
  object InlineCriticalCssProcessOptions {
    
    inline def apply(outputPath: String): InlineCriticalCssProcessOptions = {
      val __obj = js.Dynamic.literal(outputPath = outputPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineCriticalCssProcessOptions]
    }
    
    extension [Self <: InlineCriticalCssProcessOptions](x: Self) {
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait InlineCriticalCssProcessorOptions extends StObject {
    
    var deployUrl: js.UndefOr[String] = js.undefined
    
    var minify: js.UndefOr[Boolean] = js.undefined
    
    var readAsset: js.UndefOr[js.Function1[/* path */ String, js.Promise[String]]] = js.undefined
  }
  object InlineCriticalCssProcessorOptions {
    
    inline def apply(): InlineCriticalCssProcessorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InlineCriticalCssProcessorOptions]
    }
    
    extension [Self <: InlineCriticalCssProcessorOptions](x: Self) {
      
      inline def setDeployUrl(value: String): Self = StObject.set(x, "deployUrl", value.asInstanceOf[js.Any])
      
      inline def setDeployUrlUndefined: Self = StObject.set(x, "deployUrl", js.undefined)
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setReadAsset(value: /* path */ String => js.Promise[String]): Self = StObject.set(x, "readAsset", js.Any.fromFunction1(value))
      
      inline def setReadAssetUndefined: Self = StObject.set(x, "readAsset", js.undefined)
    }
  }
}
