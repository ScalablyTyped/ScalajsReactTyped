package typingsJapgolly.chayns

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * UI Functions
  * chayns.ui.modeswitch
  * interfaces
  */
// chayns.ui.modeswitch.init()
trait ModeSwitchConfig extends StObject {
  
  def callback(result: ModeSwitchItem): Unit
  
  var headline: js.UndefOr[String] = js.undefined
  
  var items: js.Array[ModeSwitchItem]
  
  var preventclose: js.UndefOr[Boolean] = js.undefined
}
object ModeSwitchConfig {
  
  inline def apply(callback: ModeSwitchItem => Callback, items: js.Array[ModeSwitchItem]): ModeSwitchConfig = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1((t0: ModeSwitchItem) => callback(t0).runNow()), items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModeSwitchConfig]
  }
  
  extension [Self <: ModeSwitchConfig](x: Self) {
    
    inline def setCallback(value: ModeSwitchItem => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: ModeSwitchItem) => value(t0).runNow()))
    
    inline def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
    
    inline def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
    
    inline def setItems(value: js.Array[ModeSwitchItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ModeSwitchItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPreventclose(value: Boolean): Self = StObject.set(x, "preventclose", value.asInstanceOf[js.Any])
    
    inline def setPreventcloseUndefined: Self = StObject.set(x, "preventclose", js.undefined)
  }
}
