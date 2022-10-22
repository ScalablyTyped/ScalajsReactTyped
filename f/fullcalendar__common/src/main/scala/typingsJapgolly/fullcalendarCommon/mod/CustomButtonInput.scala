package typingsJapgolly.fullcalendarCommon.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomButtonInput extends StObject {
  
  var bootstrapFontAwesome: js.UndefOr[String] = js.undefined
  
  var click: js.UndefOr[js.Function2[/* ev */ MouseEvent, /* element */ HTMLElement, Unit]] = js.undefined
  
  var hint: js.UndefOr[String] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var themeIcon: js.UndefOr[String] = js.undefined
}
object CustomButtonInput {
  
  inline def apply(): CustomButtonInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomButtonInput]
  }
  
  extension [Self <: CustomButtonInput](x: Self) {
    
    inline def setBootstrapFontAwesome(value: String): Self = StObject.set(x, "bootstrapFontAwesome", value.asInstanceOf[js.Any])
    
    inline def setBootstrapFontAwesomeUndefined: Self = StObject.set(x, "bootstrapFontAwesome", js.undefined)
    
    inline def setClick(value: (/* ev */ MouseEvent, /* element */ HTMLElement) => Callback): Self = StObject.set(x, "click", js.Any.fromFunction2((t0: /* ev */ MouseEvent, t1: /* element */ HTMLElement) => (value(t0, t1)).runNow()))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setThemeIcon(value: String): Self = StObject.set(x, "themeIcon", value.asInstanceOf[js.Any])
    
    inline def setThemeIconUndefined: Self = StObject.set(x, "themeIcon", js.undefined)
  }
}
