package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.postcss.mod.Plugin
import typingsJapgolly.webpack.mod.LoaderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackPluginsPostcssCliResourcesMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins/postcss-cli-resources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin]
  inline def default(options: PostcssCliResourcesOptions): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins/postcss-cli-resources", "postcss")
  @js.native
  val postcss: /* true */ Boolean = js.native
  
  trait PostcssCliResourcesOptions extends StObject {
    
    var baseHref: js.UndefOr[String] = js.undefined
    
    var deployUrl: js.UndefOr[String] = js.undefined
    
    var emitFile: Boolean
    
    /** CSS is extracted to a `.css` or is embedded in a `.js` file. */
    var extracted: js.UndefOr[Boolean] = js.undefined
    
    def filename(resourcePath: String): String
    
    var loader: LoaderContext[Any]
    
    var rebaseRootRelative: js.UndefOr[Boolean] = js.undefined
    
    var resourcesOutputPath: js.UndefOr[String] = js.undefined
  }
  object PostcssCliResourcesOptions {
    
    inline def apply(emitFile: Boolean, filename: String => String, loader: LoaderContext[Any]): PostcssCliResourcesOptions = {
      val __obj = js.Dynamic.literal(emitFile = emitFile.asInstanceOf[js.Any], filename = js.Any.fromFunction1(filename), loader = loader.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostcssCliResourcesOptions]
    }
    
    extension [Self <: PostcssCliResourcesOptions](x: Self) {
      
      inline def setBaseHref(value: String): Self = StObject.set(x, "baseHref", value.asInstanceOf[js.Any])
      
      inline def setBaseHrefUndefined: Self = StObject.set(x, "baseHref", js.undefined)
      
      inline def setDeployUrl(value: String): Self = StObject.set(x, "deployUrl", value.asInstanceOf[js.Any])
      
      inline def setDeployUrlUndefined: Self = StObject.set(x, "deployUrl", js.undefined)
      
      inline def setEmitFile(value: Boolean): Self = StObject.set(x, "emitFile", value.asInstanceOf[js.Any])
      
      inline def setExtracted(value: Boolean): Self = StObject.set(x, "extracted", value.asInstanceOf[js.Any])
      
      inline def setExtractedUndefined: Self = StObject.set(x, "extracted", js.undefined)
      
      inline def setFilename(value: String => String): Self = StObject.set(x, "filename", js.Any.fromFunction1(value))
      
      inline def setLoader(value: LoaderContext[Any]): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setRebaseRootRelative(value: Boolean): Self = StObject.set(x, "rebaseRootRelative", value.asInstanceOf[js.Any])
      
      inline def setRebaseRootRelativeUndefined: Self = StObject.set(x, "rebaseRootRelative", js.undefined)
      
      inline def setResourcesOutputPath(value: String): Self = StObject.set(x, "resourcesOutputPath", value.asInstanceOf[js.Any])
      
      inline def setResourcesOutputPathUndefined: Self = StObject.set(x, "resourcesOutputPath", js.undefined)
    }
  }
}
