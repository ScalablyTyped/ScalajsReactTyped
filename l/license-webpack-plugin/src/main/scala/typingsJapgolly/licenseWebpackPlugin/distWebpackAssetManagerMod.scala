package typingsJapgolly.licenseWebpackPlugin

import typingsJapgolly.licenseWebpackPlugin.distAssetManagerMod.AssetManager
import typingsJapgolly.licenseWebpackPlugin.distLicenseIdentifiedModuleMod.LicenseIdentifiedModule
import typingsJapgolly.licenseWebpackPlugin.distLicensesRendererMod.LicensesRenderer
import typingsJapgolly.licenseWebpackPlugin.distWebpackChunkMod.WebpackChunk
import typingsJapgolly.licenseWebpackPlugin.distWebpackCompilationMod.WebpackCompilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWebpackAssetManagerMod {
  
  @JSImport("license-webpack-plugin/dist/WebpackAssetManager", "WebpackAssetManager")
  @js.native
  open class WebpackAssetManager protected ()
    extends StObject
       with AssetManager {
    def this(outputFilename: String, licensesRenderer: LicensesRenderer) = this()
    
    /* private */ var licensesRenderer: Any = js.native
    
    /* private */ var outputFilename: Any = js.native
    
    /* CompleteClass */
    override def writeAllLicenses(modules: js.Array[LicenseIdentifiedModule], compilation: WebpackCompilation): Unit = js.native
    
    /* CompleteClass */
    override def writeChunkBanners(modules: js.Array[LicenseIdentifiedModule], compilation: WebpackCompilation, chunk: WebpackChunk): Unit = js.native
    
    /* CompleteClass */
    override def writeChunkLicenses(modules: js.Array[LicenseIdentifiedModule], compilation: WebpackCompilation, chunk: WebpackChunk): Unit = js.native
  }
}
