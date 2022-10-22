package typingsJapgolly.licenseWebpackPlugin

import typingsJapgolly.licenseWebpackPlugin.distPluginOptionsMod.PluginOptions
import typingsJapgolly.licenseWebpackPlugin.distWebpackCompilerMod.WebpackCompiler
import typingsJapgolly.licenseWebpackPlugin.distWebpackPluginMod.WebpackPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLicenseWebpackPluginMod {
  
  @JSImport("license-webpack-plugin/dist/LicenseWebpackPlugin", "LicenseWebpackPlugin")
  @js.native
  open class LicenseWebpackPlugin ()
    extends StObject
       with WebpackPlugin {
    def this(pluginOptions: PluginOptions) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: WebpackCompiler): Unit = js.native
    
    /* private */ var pluginOptions: Any = js.native
  }
}
