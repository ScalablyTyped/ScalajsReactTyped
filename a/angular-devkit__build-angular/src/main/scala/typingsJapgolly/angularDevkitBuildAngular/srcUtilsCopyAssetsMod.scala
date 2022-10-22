package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.anon.Flatten
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsCopyAssetsMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/copy-assets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copyAssets(entries: js.Array[Flatten], basePaths: js.Iterable[String], root: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAssets")(entries.asInstanceOf[js.Any], basePaths.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def copyAssets(entries: js.Array[Flatten], basePaths: js.Iterable[String], root: String, changed: Set[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAssets")(entries.asInstanceOf[js.Any], basePaths.asInstanceOf[js.Any], root.asInstanceOf[js.Any], changed.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
