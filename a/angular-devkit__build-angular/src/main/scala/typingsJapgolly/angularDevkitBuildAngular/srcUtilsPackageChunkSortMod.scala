package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.anon.IsHMREnabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsPackageChunkSortMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/package-chunk-sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateEntryPoints(options: IsHMREnabled): js.Array[EntryPointsType] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateEntryPoints")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[EntryPointsType]]
  
  type EntryPointsType = js.Tuple2[/* name */ String, /* isModule */ Boolean]
}
