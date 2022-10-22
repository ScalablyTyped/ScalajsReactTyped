package typingsJapgolly.reactBootstrapTypeahead

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactBootstrapTypeahead.mod.EventHandler
import typingsJapgolly.reactBootstrapTypeahead.mod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Active extends StObject {
    
    var active: Boolean
    
    var onBlur: js.UndefOr[EventHandler[HTMLElement]] = js.undefined
    
    var onClick: js.UndefOr[EventHandler[HTMLElement]] = js.undefined
    
    var onFocus: js.UndefOr[EventHandler[HTMLElement]] = js.undefined
    
    var onKeyDown: EventHandler[HTMLElement]
    
    var onRemove: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var ref: RefHandle[HTMLDivElement]
  }
  object Active {
    
    inline def apply(
      active: Boolean,
      onKeyDown: /* e */ ReactEventFrom[HTMLElement & Element] => Callback,
      ref: RefHandle[HTMLDivElement]
    ): Active = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1((t0: /* e */ ReactEventFrom[HTMLElement & Element]) => onKeyDown(t0).runNow()), ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[Active]
    }
    
    extension [Self <: Active](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: /* e */ ReactEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnClick(value: /* e */ ReactEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnFocus(value: /* e */ ReactEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ ReactEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
      
      inline def setOnRemove(value: Callback): Self = StObject.set(x, "onRemove", value.toJsFn)
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setRef(value: RefHandle[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomOption extends StObject {
    
    var customOption: Boolean
  }
  object CustomOption {
    
    inline def apply(customOption: Boolean): CustomOption = {
      val __obj = js.Dynamic.literal(customOption = customOption.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomOption]
    }
    
    extension [Self <: CustomOption](x: Self) {
      
      inline def setCustomOption(value: Boolean): Self = StObject.set(x, "customOption", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnBlur extends StObject {
    
    var onBlur: js.UndefOr[EventHandler[HTMLElement]] = js.undefined
    
    var onClick: js.UndefOr[EventHandler[HTMLElement]] = js.undefined
    
    var onFocus: js.UndefOr[EventHandler[HTMLElement]] = js.undefined
    
    var onRemove: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var option: Option
  }
  object OnBlur {
    
    inline def apply(option: Option): OnBlur = {
      val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnBlur]
    }
    
    extension [Self <: OnBlur](x: Self) {
      
      inline def setOnBlur(value: /* e */ ReactEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnClick(value: /* e */ ReactEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnFocus(value: /* e */ ReactEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[HTMLElement & Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnRemove(value: Callback): Self = StObject.set(x, "onRemove", value.toJsFn)
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setOption(value: Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    }
  }
}
