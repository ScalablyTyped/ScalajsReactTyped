package typingsJapgolly.devexpressUtils

import typingsJapgolly.std.ActiveXObject
import typingsJapgolly.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPdfPluginHelperMod {
  
  @JSImport("@devexpress/utils/lib/pdf/plugin-helper", "PdfPluginHelper")
  @js.native
  open class PdfPluginHelper () extends StObject
  /* static members */
  object PdfPluginHelper {
    
    @JSImport("@devexpress/utils/lib/pdf/plugin-helper", "PdfPluginHelper")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getActiveXObject(name: String): ActiveXObject | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveXObject")(name.asInstanceOf[js.Any]).asInstanceOf[ActiveXObject | Null]
    
    inline def getNavigatorPlugin(name: String): Plugin | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNavigatorPlugin")(name.asInstanceOf[js.Any]).asInstanceOf[Plugin | Null]
    
    inline def getPdfPlugin(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPdfPlugin")().asInstanceOf[Any]
    
    inline def getVersion(): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")().asInstanceOf[Double | Null]
    
    inline def isInstalled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstalled")().asInstanceOf[Boolean]
    
    @JSImport("@devexpress/utils/lib/pdf/plugin-helper", "PdfPluginHelper.plugin")
    @js.native
    def plugin: Any = js.native
    inline def plugin_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugin")(x.asInstanceOf[js.Any])
  }
}
