package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.angularLocalize.toolsSrcBabelCoreMod.PluginObj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticsPlugins extends StObject {
  
  var diagnostics: typingsJapgolly.angularLocalize.toolsMod.Diagnostics
  
  var plugins: js.Array[PluginObj]
}
object DiagnosticsPlugins {
  
  inline def apply(diagnostics: typingsJapgolly.angularLocalize.toolsMod.Diagnostics, plugins: js.Array[PluginObj]): DiagnosticsPlugins = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticsPlugins]
  }
  
  extension [Self <: DiagnosticsPlugins](x: Self) {
    
    inline def setDiagnostics(value: typingsJapgolly.angularLocalize.toolsMod.Diagnostics): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setPlugins(value: js.Array[PluginObj]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsVarargs(value: PluginObj*): Self = StObject.set(x, "plugins", js.Array(value*))
  }
}
