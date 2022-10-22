package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutOptions extends StObject {
  
  var hide: js.UndefOr[js.Function1[/* e */ LayoutHideEvent, Unit]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var init: js.UndefOr[js.Function1[/* e */ LayoutInitEvent, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var platform: js.UndefOr[String] = js.undefined
  
  var show: js.UndefOr[js.Function1[/* e */ LayoutShowEvent, Unit]] = js.undefined
}
object LayoutOptions {
  
  inline def apply(): LayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutOptions]
  }
  
  extension [Self <: LayoutOptions](x: Self) {
    
    inline def setHide(value: /* e */ LayoutHideEvent => Callback): Self = StObject.set(x, "hide", js.Any.fromFunction1((t0: /* e */ LayoutHideEvent) => value(t0).runNow()))
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInit(value: /* e */ LayoutInitEvent => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: /* e */ LayoutInitEvent) => value(t0).runNow()))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setShow(value: /* e */ LayoutShowEvent => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: /* e */ LayoutShowEvent) => value(t0).runNow()))
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
