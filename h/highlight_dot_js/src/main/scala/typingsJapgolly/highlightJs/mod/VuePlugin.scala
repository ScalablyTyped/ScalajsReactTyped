package typingsJapgolly.highlightJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VuePlugin extends StObject {
  
  def install(vue: Any): Unit
}
object VuePlugin {
  
  inline def apply(install: Any => Callback): VuePlugin = {
    val __obj = js.Dynamic.literal(install = js.Any.fromFunction1((t0: Any) => install(t0).runNow()))
    __obj.asInstanceOf[VuePlugin]
  }
  
  extension [Self <: VuePlugin](x: Self) {
    
    inline def setInstall(value: Any => Callback): Self = StObject.set(x, "install", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
