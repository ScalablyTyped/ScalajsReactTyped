package typingsJapgolly.licenseWebpackPlugin

import typingsJapgolly.licenseWebpackPlugin.distWebpackChunkModuleMod.WebpackChunkModule
import typingsJapgolly.licenseWebpackPlugin.distWebpackStatsMod.WebpackStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWebpackStatsIteratorMod {
  
  @JSImport("license-webpack-plugin/dist/WebpackStatsIterator", "WebpackStatsIterator")
  @js.native
  open class WebpackStatsIterator () extends StObject {
    
    def collectModules(stats: WebpackStats, chunkName: String): js.Array[WebpackChunkModule] = js.native
    
    /* private */ var traverseModules: Any = js.native
  }
}
