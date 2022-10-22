package typingsJapgolly.angularCore

import typingsJapgolly.angularCore.anon.BuildPaths
import typingsJapgolly.angularDevkitSchematics.mod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsUtilsProjectTsconfigPathsMod {
  
  @JSImport("@angular/core/schematics/utils/project_tsconfig_paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getProjectTsConfigPaths(tree: Tree): js.Promise[BuildPaths] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectTsConfigPaths")(tree.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BuildPaths]]
}
