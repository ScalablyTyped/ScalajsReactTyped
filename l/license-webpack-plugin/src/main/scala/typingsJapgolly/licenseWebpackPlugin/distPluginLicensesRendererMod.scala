package typingsJapgolly.licenseWebpackPlugin

import typingsJapgolly.licenseWebpackPlugin.distLicenseIdentifiedModuleMod.LicenseIdentifiedModule
import typingsJapgolly.licenseWebpackPlugin.distLicensesRendererMod.LicensesRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginLicensesRendererMod {
  
  @JSImport("license-webpack-plugin/dist/PluginLicensesRenderer", "PluginLicensesRenderer")
  @js.native
  open class PluginLicensesRenderer protected ()
    extends StObject
       with LicensesRenderer {
    def this(
      renderLicenses: js.Function1[/* modules */ js.Array[LicenseIdentifiedModule], String],
      renderBanner: js.Function2[/* filename */ String, /* modules */ js.Array[LicenseIdentifiedModule], String]
    ) = this()
    
    /* CompleteClass */
    override def renderBanner(filename: String, modules: js.Array[LicenseIdentifiedModule]): String = js.native
    
    /* CompleteClass */
    override def renderLicenses(modules: js.Array[LicenseIdentifiedModule]): String = js.native
  }
}
