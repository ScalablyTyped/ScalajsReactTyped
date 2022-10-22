package typingsJapgolly.licenseWebpackPlugin

import typingsJapgolly.licenseWebpackPlugin.distWebpackChunkMod.WebpackChunk
import typingsJapgolly.licenseWebpackPlugin.distWebpackChunkModuleMod.WebpackChunkModule
import typingsJapgolly.licenseWebpackPlugin.distWebpackCompilationMod.WebpackCompilation
import typingsJapgolly.licenseWebpackPlugin.distWebpackStatsMod.WebpackStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWebpackChunkModuleIteratorMod {
  
  @JSImport("license-webpack-plugin/dist/WebpackChunkModuleIterator", "WebpackChunkModuleIterator")
  @js.native
  open class WebpackChunkModuleIterator () extends StObject {
    
    def iterateModules(
      compilation: WebpackCompilation,
      chunk: WebpackChunk,
      stats: Unit,
      callback: js.Function1[/* module */ WebpackChunkModule, Unit]
    ): Unit = js.native
    def iterateModules(
      compilation: WebpackCompilation,
      chunk: WebpackChunk,
      stats: WebpackStats,
      callback: js.Function1[/* module */ WebpackChunkModule, Unit]
    ): Unit = js.native
    
    /* private */ var statsIterator: Any = js.native
  }
}
