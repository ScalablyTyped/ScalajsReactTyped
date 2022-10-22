package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.AssetPattern
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.AssetPatternClass
import typingsJapgolly.angularDevkitCore.mod.BaseException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsNormalizeAssetPatternsMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/normalize-asset-patterns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-angular/src/utils/normalize-asset-patterns", "MissingAssetSourceRootException")
  @js.native
  open class MissingAssetSourceRootException protected () extends BaseException {
    def this(path: String) = this()
  }
  
  inline def normalizeAssetPatterns(assetPatterns: js.Array[AssetPattern], workspaceRoot: String, projectRoot: String): js.Array[AssetPatternClass] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAssetPatterns")(assetPatterns.asInstanceOf[js.Any], workspaceRoot.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any])).asInstanceOf[js.Array[AssetPatternClass]]
  inline def normalizeAssetPatterns(
    assetPatterns: js.Array[AssetPattern],
    workspaceRoot: String,
    projectRoot: String,
    projectSourceRoot: String
  ): js.Array[AssetPatternClass] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAssetPatterns")(assetPatterns.asInstanceOf[js.Any], workspaceRoot.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], projectSourceRoot.asInstanceOf[js.Any])).asInstanceOf[js.Array[AssetPatternClass]]
}
