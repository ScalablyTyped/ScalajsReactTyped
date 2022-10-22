package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsIndexFileAugmentIndexHtmlMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/index-file/augment-index-html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def augmentIndexHtml(params: AugmentIndexHtmlOptions): js.Promise[Content] = ^.asInstanceOf[js.Dynamic].applyDynamic("augmentIndexHtml")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Content]]
  
  trait AugmentIndexHtmlOptions extends StObject {
    
    var baseHref: js.UndefOr[String] = js.undefined
    
    /** crossorigin attribute setting of elements that provide CORS support */
    var crossOrigin: js.UndefOr[CrossOriginValue] = js.undefined
    
    var deployUrl: js.UndefOr[String] = js.undefined
    
    /** Used to sort the inseration of files in the HTML file */
    var entrypoints: js.Array[Entrypoint]
    
    var files: js.Array[FileInfo]
    
    var html: String
    
    /** Used to set the document default locale */
    var lang: js.UndefOr[String] = js.undefined
    
    def loadOutputFile(file: String): js.Promise[String]
    @JSName("loadOutputFile")
    var loadOutputFile_Original: LoadOutputFileFunctionType
    
    var sri: Boolean
  }
  object AugmentIndexHtmlOptions {
    
    inline def apply(
      entrypoints: js.Array[Entrypoint],
      files: js.Array[FileInfo],
      html: String,
      loadOutputFile: /* file */ String => js.Promise[String],
      sri: Boolean
    ): AugmentIndexHtmlOptions = {
      val __obj = js.Dynamic.literal(entrypoints = entrypoints.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], loadOutputFile = js.Any.fromFunction1(loadOutputFile), sri = sri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AugmentIndexHtmlOptions]
    }
    
    extension [Self <: AugmentIndexHtmlOptions](x: Self) {
      
      inline def setBaseHref(value: String): Self = StObject.set(x, "baseHref", value.asInstanceOf[js.Any])
      
      inline def setBaseHrefUndefined: Self = StObject.set(x, "baseHref", js.undefined)
      
      inline def setCrossOrigin(value: CrossOriginValue): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDeployUrl(value: String): Self = StObject.set(x, "deployUrl", value.asInstanceOf[js.Any])
      
      inline def setDeployUrlUndefined: Self = StObject.set(x, "deployUrl", js.undefined)
      
      inline def setEntrypoints(value: js.Array[Entrypoint]): Self = StObject.set(x, "entrypoints", value.asInstanceOf[js.Any])
      
      inline def setEntrypointsVarargs(value: Entrypoint*): Self = StObject.set(x, "entrypoints", js.Array(value*))
      
      inline def setFiles(value: js.Array[FileInfo]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: FileInfo*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setLoadOutputFile(value: /* file */ String => js.Promise[String]): Self = StObject.set(x, "loadOutputFile", js.Any.fromFunction1(value))
      
      inline def setSri(value: Boolean): Self = StObject.set(x, "sri", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.none
    - typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.anonymous
    - typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.`use-credentials`
  */
  trait CrossOriginValue extends StObject
  object CrossOriginValue {
    
    inline def anonymous: typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.anonymous = "anonymous".asInstanceOf[typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.anonymous]
    
    inline def none: typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.none = "none".asInstanceOf[typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.none]
    
    inline def `use-credentials`: typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.`use-credentials` = "use-credentials".asInstanceOf[typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.`use-credentials`]
  }
  
  type Entrypoint = js.Tuple2[/* name */ String, /* isModule */ Boolean]
  
  trait FileInfo extends StObject {
    
    var `extension`: String
    
    var file: String
    
    var name: String
  }
  object FileInfo {
    
    inline def apply(`extension`: String, file: String, name: String): FileInfo = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInfo]
    }
    
    extension [Self <: FileInfo](x: Self) {
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type LoadOutputFileFunctionType = js.Function1[/* file */ String, js.Promise[String]]
}
