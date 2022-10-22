package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.`inline`
import typingsJapgolly.angularDevkitBuildAngular.angularDevkitBuildAngularStrings.external
import typingsJapgolly.angularDevkitBuildAngular.anon.Contents
import typingsJapgolly.angularDevkitBuildAngular.anon.Media
import typingsJapgolly.angularDevkitBuildAngular.anon.ResolvePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersBrowserEsbuildStylesheetsMod {
  
  @JSImport("@angular-devkit/build-angular/src/builders/browser-esbuild/stylesheets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bundleStylesheetFile(filename: String, options: BundleStylesheetOptions): js.Promise[Contents] = (^.asInstanceOf[js.Dynamic].applyDynamic("bundleStylesheetFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Contents]]
  
  inline def bundleStylesheetText(data: String, dataOptions: ResolvePath, bundleOptions: BundleStylesheetOptions): js.Promise[Contents] = (^.asInstanceOf[js.Dynamic].applyDynamic("bundleStylesheetText")(data.asInstanceOf[js.Any], dataOptions.asInstanceOf[js.Any], bundleOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Contents]]
  
  trait BundleStylesheetOptions extends StObject {
    
    var externalDependencies: js.UndefOr[js.Array[String]] = js.undefined
    
    var includePaths: js.UndefOr[js.Array[String]] = js.undefined
    
    var optimization: Boolean
    
    var outputNames: js.UndefOr[Media] = js.undefined
    
    var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
    
    var sourcemap: Boolean | external | `inline`
    
    var workspaceRoot: String
  }
  object BundleStylesheetOptions {
    
    inline def apply(optimization: Boolean, sourcemap: Boolean | external | `inline`, workspaceRoot: String): BundleStylesheetOptions = {
      val __obj = js.Dynamic.literal(optimization = optimization.asInstanceOf[js.Any], sourcemap = sourcemap.asInstanceOf[js.Any], workspaceRoot = workspaceRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleStylesheetOptions]
    }
    
    extension [Self <: BundleStylesheetOptions](x: Self) {
      
      inline def setExternalDependencies(value: js.Array[String]): Self = StObject.set(x, "externalDependencies", value.asInstanceOf[js.Any])
      
      inline def setExternalDependenciesUndefined: Self = StObject.set(x, "externalDependencies", js.undefined)
      
      inline def setExternalDependenciesVarargs(value: String*): Self = StObject.set(x, "externalDependencies", js.Array(value*))
      
      inline def setIncludePaths(value: js.Array[String]): Self = StObject.set(x, "includePaths", value.asInstanceOf[js.Any])
      
      inline def setIncludePathsUndefined: Self = StObject.set(x, "includePaths", js.undefined)
      
      inline def setIncludePathsVarargs(value: String*): Self = StObject.set(x, "includePaths", js.Array(value*))
      
      inline def setOptimization(value: Boolean): Self = StObject.set(x, "optimization", value.asInstanceOf[js.Any])
      
      inline def setOutputNames(value: Media): Self = StObject.set(x, "outputNames", value.asInstanceOf[js.Any])
      
      inline def setOutputNamesUndefined: Self = StObject.set(x, "outputNames", js.undefined)
      
      inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
      
      inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
      
      inline def setSourcemap(value: Boolean | external | `inline`): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceRoot(value: String): Self = StObject.set(x, "workspaceRoot", value.asInstanceOf[js.Any])
    }
  }
}
