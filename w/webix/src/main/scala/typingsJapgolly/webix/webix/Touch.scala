package typingsJapgolly.webix.webix

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Touch extends StObject {
  
  var config: Any
  
  def disable(): Unit
  
  def enable(): Unit
  
  def limit(mode: Boolean): Unit
  
  def scrollTo(node: HTMLElement, x: Double, y: Double, speed: String): Unit
}
object Touch {
  
  inline def apply(
    config: Any,
    disable: Callback,
    enable: Callback,
    limit: Boolean => Callback,
    scrollTo: (HTMLElement, Double, Double, String) => Callback
  ): Touch = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], disable = disable.toJsFn, enable = enable.toJsFn, limit = js.Any.fromFunction1((t0: Boolean) => limit(t0).runNow()), scrollTo = js.Any.fromFunction4((t0: HTMLElement, t1: Double, t2: Double, t3: String) => (scrollTo(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[Touch]
  }
  
  extension [Self <: Touch](x: Self) {
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDisable(value: Callback): Self = StObject.set(x, "disable", value.toJsFn)
    
    inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
    
    inline def setLimit(value: Boolean => Callback): Self = StObject.set(x, "limit", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setScrollTo(value: (HTMLElement, Double, Double, String) => Callback): Self = StObject.set(x, "scrollTo", js.Any.fromFunction4((t0: HTMLElement, t1: Double, t2: Double, t3: String) => (value(t0, t1, t2, t3)).runNow()))
  }
}
