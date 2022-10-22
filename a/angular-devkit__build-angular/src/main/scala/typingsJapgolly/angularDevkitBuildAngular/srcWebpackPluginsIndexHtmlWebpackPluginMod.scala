package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.srcUtilsIndexFileAugmentIndexHtmlMod.CrossOriginValue
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsIndexFileAugmentIndexHtmlMod.Entrypoint
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsIndexFileIndexHtmlGeneratorMod.IndexHtmlGenerator
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsIndexFileIndexHtmlGeneratorMod.IndexHtmlTransform
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsNormalizeCacheMod.NormalizedCachedOptions
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsNormalizeOptimizationMod.NormalizedOptimizationOptions
import typingsJapgolly.webpack.mod.Compilation
import typingsJapgolly.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackPluginsIndexHtmlWebpackPluginMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins/index-html-webpack-plugin", "IndexHtmlWebpackPlugin")
  @js.native
  open class IndexHtmlWebpackPlugin protected () extends IndexHtmlGenerator {
    def this(options: IndexHtmlWebpackPluginOptions) = this()
    
    /* private */ var _compilation: Any = js.native
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    def compilation: Compilation = js.native
    
    @JSName("options")
    val options_IndexHtmlWebpackPlugin: IndexHtmlWebpackPluginOptions = js.native
  }
  
  /* Inlined parent @angular-devkit/build-angular.@angular-devkit/build-angular/src/utils/index-file/index-html-generator.IndexHtmlGeneratorOptions */
  /* Inlined parent std.Omit<@angular-devkit/build-angular.@angular-devkit/build-angular/src/utils/index-file/index-html-generator.IndexHtmlGeneratorProcessOptions, 'files'> */
  trait IndexHtmlWebpackPluginOptions extends StObject {
    
    var baseHref: js.UndefOr[String] = js.undefined
    
    var cache: js.UndefOr[NormalizedCachedOptions] = js.undefined
    
    var crossOrigin: js.UndefOr[CrossOriginValue] = js.undefined
    
    var deployUrl: js.UndefOr[String] = js.undefined
    
    var entrypoints: js.Array[Entrypoint]
    
    var indexPath: String
    
    var lang: js.UndefOr[String] = js.undefined
    
    var optimization: js.UndefOr[NormalizedOptimizationOptions] = js.undefined
    
    var outputPath: String
    
    var postTransform: js.UndefOr[IndexHtmlTransform] = js.undefined
    
    var sri: js.UndefOr[Boolean] = js.undefined
  }
  object IndexHtmlWebpackPluginOptions {
    
    inline def apply(entrypoints: js.Array[Entrypoint], indexPath: String, outputPath: String): IndexHtmlWebpackPluginOptions = {
      val __obj = js.Dynamic.literal(entrypoints = entrypoints.asInstanceOf[js.Any], indexPath = indexPath.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexHtmlWebpackPluginOptions]
    }
    
    extension [Self <: IndexHtmlWebpackPluginOptions](x: Self) {
      
      inline def setBaseHref(value: String): Self = StObject.set(x, "baseHref", value.asInstanceOf[js.Any])
      
      inline def setBaseHrefUndefined: Self = StObject.set(x, "baseHref", js.undefined)
      
      inline def setCache(value: NormalizedCachedOptions): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCrossOrigin(value: CrossOriginValue): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDeployUrl(value: String): Self = StObject.set(x, "deployUrl", value.asInstanceOf[js.Any])
      
      inline def setDeployUrlUndefined: Self = StObject.set(x, "deployUrl", js.undefined)
      
      inline def setEntrypoints(value: js.Array[Entrypoint]): Self = StObject.set(x, "entrypoints", value.asInstanceOf[js.Any])
      
      inline def setEntrypointsVarargs(value: Entrypoint*): Self = StObject.set(x, "entrypoints", js.Array(value*))
      
      inline def setIndexPath(value: String): Self = StObject.set(x, "indexPath", value.asInstanceOf[js.Any])
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setOptimization(value: NormalizedOptimizationOptions): Self = StObject.set(x, "optimization", value.asInstanceOf[js.Any])
      
      inline def setOptimizationUndefined: Self = StObject.set(x, "optimization", js.undefined)
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setPostTransform(value: /* content */ String => js.Promise[String]): Self = StObject.set(x, "postTransform", js.Any.fromFunction1(value))
      
      inline def setPostTransformUndefined: Self = StObject.set(x, "postTransform", js.undefined)
      
      inline def setSri(value: Boolean): Self = StObject.set(x, "sri", value.asInstanceOf[js.Any])
      
      inline def setSriUndefined: Self = StObject.set(x, "sri", js.undefined)
    }
  }
}
