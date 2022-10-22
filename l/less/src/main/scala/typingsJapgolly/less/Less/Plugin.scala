package typingsJapgolly.less.Less

import japgolly.scalajs.react.Callback
import typingsJapgolly.less.LessStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugin extends StObject {
  
  def install(less: LessStatic, pluginManager: PluginManager): Unit
  
  var minVersion: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.undefined
}
object Plugin {
  
  inline def apply(install: (LessStatic, PluginManager) => Callback): Plugin = {
    val __obj = js.Dynamic.literal(install = js.Any.fromFunction2((t0: LessStatic, t1: PluginManager) => (install(t0, t1)).runNow()))
    __obj.asInstanceOf[Plugin]
  }
  
  extension [Self <: Plugin](x: Self) {
    
    inline def setInstall(value: (LessStatic, PluginManager) => Callback): Self = StObject.set(x, "install", js.Any.fromFunction2((t0: LessStatic, t1: PluginManager) => (value(t0, t1)).runNow()))
    
    inline def setMinVersion(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
    
    inline def setMinVersionUndefined: Self = StObject.set(x, "minVersion", js.undefined)
  }
}
