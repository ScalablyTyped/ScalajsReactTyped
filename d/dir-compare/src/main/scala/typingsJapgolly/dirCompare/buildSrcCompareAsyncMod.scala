package typingsJapgolly.dirCompare

import typingsJapgolly.dirCompare.buildSrcEntryEntryTypeMod.OptionalEntry
import typingsJapgolly.dirCompare.buildSrcExtOptionsMod.ExtOptions
import typingsJapgolly.dirCompare.buildSrcSymlinkLoopDetectorMod.SymlinkCache
import typingsJapgolly.dirCompare.buildSrcTypesMod.Difference
import typingsJapgolly.dirCompare.buildSrcTypesMod.InitialStatistics
import typingsJapgolly.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompareAsyncMod {
  
  @JSImport("dir-compare/build/src/compareAsync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareAsync(
    rootEntry1: OptionalEntry,
    rootEntry2: OptionalEntry,
    level: Double,
    relativePath: String,
    options: ExtOptions,
    statistics: InitialStatistics,
    asyncDiffSet: AsyncDiffSet,
    symlinkCache: SymlinkCache
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("compareAsync")(rootEntry1.asInstanceOf[js.Any], rootEntry2.asInstanceOf[js.Any], level.asInstanceOf[js.Any], relativePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any], statistics.asInstanceOf[js.Any], asyncDiffSet.asInstanceOf[js.Any], symlinkCache.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @js.native
  trait AsyncDiffSet
    extends StObject
       with Array[Difference | AsyncDiffSet]
}
