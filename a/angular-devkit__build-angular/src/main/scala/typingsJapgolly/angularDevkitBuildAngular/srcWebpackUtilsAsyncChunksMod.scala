package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.srcWebpackUtilsHelpersMod.NormalizedEntryPoint
import typingsJapgolly.webpack.mod.StatsChunk
import typingsJapgolly.webpack.mod.StatsCompilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackUtilsAsyncChunksMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/utils/async-chunks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def markAsyncChunksNonInitial(webpackStats: StatsCompilation, extraEntryPoints: js.Array[NormalizedEntryPoint]): js.Array[StatsChunk] = (^.asInstanceOf[js.Dynamic].applyDynamic("markAsyncChunksNonInitial")(webpackStats.asInstanceOf[js.Any], extraEntryPoints.asInstanceOf[js.Any])).asInstanceOf[js.Array[StatsChunk]]
}
