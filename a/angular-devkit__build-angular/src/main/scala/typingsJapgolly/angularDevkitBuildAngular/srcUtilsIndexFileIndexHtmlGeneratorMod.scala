package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.srcUtilsIndexFileAugmentIndexHtmlMod.CrossOriginValue
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsIndexFileAugmentIndexHtmlMod.Entrypoint
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsIndexFileAugmentIndexHtmlMod.FileInfo
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsNormalizeCacheMod.NormalizedCachedOptions
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsNormalizeOptimizationMod.NormalizedOptimizationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsIndexFileIndexHtmlGeneratorMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/index-file/index-html-generator", "IndexHtmlGenerator")
  @js.native
  open class IndexHtmlGenerator protected () extends StObject {
    def this(options: IndexHtmlGeneratorOptions) = this()
    
    val options: IndexHtmlGeneratorOptions = js.native
    
    /* private */ val plugins: Any = js.native
    
    def process(options: IndexHtmlGeneratorProcessOptions): js.Promise[IndexHtmlTransformResult] = js.native
    
    def readAsset(path: String): js.Promise[String] = js.native
    
    /* protected */ def readIndex(path: String): js.Promise[String] = js.native
  }
  
  trait IndexHtmlGeneratorOptions extends StObject {
    
    var cache: js.UndefOr[NormalizedCachedOptions] = js.undefined
    
    var crossOrigin: js.UndefOr[CrossOriginValue] = js.undefined
    
    var deployUrl: js.UndefOr[String] = js.undefined
    
    var entrypoints: js.Array[Entrypoint]
    
    var indexPath: String
    
    var optimization: js.UndefOr[NormalizedOptimizationOptions] = js.undefined
    
    var postTransform: js.UndefOr[IndexHtmlTransform] = js.undefined
    
    var sri: js.UndefOr[Boolean] = js.undefined
  }
  object IndexHtmlGeneratorOptions {
    
    inline def apply(entrypoints: js.Array[Entrypoint], indexPath: String): IndexHtmlGeneratorOptions = {
      val __obj = js.Dynamic.literal(entrypoints = entrypoints.asInstanceOf[js.Any], indexPath = indexPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexHtmlGeneratorOptions]
    }
    
    extension [Self <: IndexHtmlGeneratorOptions](x: Self) {
      
      inline def setCache(value: NormalizedCachedOptions): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCrossOrigin(value: CrossOriginValue): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDeployUrl(value: String): Self = StObject.set(x, "deployUrl", value.asInstanceOf[js.Any])
      
      inline def setDeployUrlUndefined: Self = StObject.set(x, "deployUrl", js.undefined)
      
      inline def setEntrypoints(value: js.Array[Entrypoint]): Self = StObject.set(x, "entrypoints", value.asInstanceOf[js.Any])
      
      inline def setEntrypointsVarargs(value: Entrypoint*): Self = StObject.set(x, "entrypoints", js.Array(value*))
      
      inline def setIndexPath(value: String): Self = StObject.set(x, "indexPath", value.asInstanceOf[js.Any])
      
      inline def setOptimization(value: NormalizedOptimizationOptions): Self = StObject.set(x, "optimization", value.asInstanceOf[js.Any])
      
      inline def setOptimizationUndefined: Self = StObject.set(x, "optimization", js.undefined)
      
      inline def setPostTransform(value: /* content */ String => js.Promise[String]): Self = StObject.set(x, "postTransform", js.Any.fromFunction1(value))
      
      inline def setPostTransformUndefined: Self = StObject.set(x, "postTransform", js.undefined)
      
      inline def setSri(value: Boolean): Self = StObject.set(x, "sri", value.asInstanceOf[js.Any])
      
      inline def setSriUndefined: Self = StObject.set(x, "sri", js.undefined)
    }
  }
  
  trait IndexHtmlGeneratorProcessOptions extends StObject {
    
    var baseHref: js.UndefOr[String] = js.undefined
    
    var files: js.Array[FileInfo]
    
    var lang: js.UndefOr[String] = js.undefined
    
    var outputPath: String
  }
  object IndexHtmlGeneratorProcessOptions {
    
    inline def apply(files: js.Array[FileInfo], outputPath: String): IndexHtmlGeneratorProcessOptions = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexHtmlGeneratorProcessOptions]
    }
    
    extension [Self <: IndexHtmlGeneratorProcessOptions](x: Self) {
      
      inline def setBaseHref(value: String): Self = StObject.set(x, "baseHref", value.asInstanceOf[js.Any])
      
      inline def setBaseHrefUndefined: Self = StObject.set(x, "baseHref", js.undefined)
      
      inline def setFiles(value: js.Array[FileInfo]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: FileInfo*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    }
  }
  
  type IndexHtmlTransform = js.Function1[/* content */ String, js.Promise[String]]
  
  trait IndexHtmlTransformResult extends StObject {
    
    var content: String
    
    var errors: js.Array[String]
    
    var warnings: js.Array[String]
  }
  object IndexHtmlTransformResult {
    
    inline def apply(content: String, errors: js.Array[String], warnings: js.Array[String]): IndexHtmlTransformResult = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexHtmlTransformResult]
    }
    
    extension [Self <: IndexHtmlTransformResult](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
}
