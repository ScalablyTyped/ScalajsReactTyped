package typingsJapgolly.reactOnsenui.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputId extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var inputId: js.UndefOr[String] = js.undefined
  
  var modifier: js.UndefOr[String] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* e */ ReactEventFrom[Any & Element], Unit]] = js.undefined
  
  var onInput: js.UndefOr[js.Function1[/* e */ ReactEventFrom[Any & Element], Unit]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object InputId {
  
  inline def apply(): InputId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputId]
  }
  
  extension [Self <: InputId](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
    
    inline def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
    
    inline def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setOnChange(value: /* e */ ReactEventFrom[Any & Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnInput(value: /* e */ ReactEventFrom[Any & Element] => Callback): Self = StObject.set(x, "onInput", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
