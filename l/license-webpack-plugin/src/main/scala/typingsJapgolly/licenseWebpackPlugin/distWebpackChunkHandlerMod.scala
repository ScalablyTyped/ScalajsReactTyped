package typingsJapgolly.licenseWebpackPlugin

import typingsJapgolly.licenseWebpackPlugin.distLicenseIdentifiedModuleMod.LicenseIdentifiedModule
import typingsJapgolly.licenseWebpackPlugin.distModuleCacheMod.ModuleCache
import typingsJapgolly.licenseWebpackPlugin.distWebpackChunkMod.WebpackChunk
import typingsJapgolly.licenseWebpackPlugin.distWebpackCompilationMod.WebpackCompilation
import typingsJapgolly.licenseWebpackPlugin.distWebpackStatsMod.WebpackStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWebpackChunkHandlerMod {
  
  @js.native
  trait WebpackChunkHandler extends StObject {
    
    def processChunk(compilation: WebpackCompilation, chunk: WebpackChunk, moduleCache: ModuleCache): Unit = js.native
    def processChunk(
      compilation: WebpackCompilation,
      chunk: WebpackChunk,
      moduleCache: ModuleCache,
      stats: WebpackStats
    ): Unit = js.native
    
    def processModule(
      compilation: WebpackCompilation,
      chunk: WebpackChunk,
      moduleCache: ModuleCache,
      module: LicenseIdentifiedModule
    ): Unit = js.native
  }
}
