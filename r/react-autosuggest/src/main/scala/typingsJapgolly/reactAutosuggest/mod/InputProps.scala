package typingsJapgolly.reactAutosuggest.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof react.react.InputHTMLAttributes<std.HTMLElement> ]: P} & {[ P in 'onChange' | 'onBlur' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.InputHTMLAttributes<std.HTMLElement>] ]: react.react.InputHTMLAttributes<std.HTMLElement>[P]} */ trait InputProps[TSuggestion] extends StObject {
  
  var onBlur: js.UndefOr[
    js.Function2[
      /* event */ ReactFocusEventFrom[HTMLElement], 
      /* params */ js.UndefOr[BlurEvent[TSuggestion]], 
      Unit
    ]
  ] = js.undefined
  
  def onChange(event: ReactEventFrom[HTMLElement], params: ChangeEvent): Unit
  
  var ref: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
  
  var value: String
}
object InputProps {
  
  inline def apply[TSuggestion](onChange: (ReactEventFrom[HTMLElement], ChangeEvent) => Callback, value: String): InputProps[TSuggestion] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2((t0: ReactEventFrom[HTMLElement], t1: ChangeEvent) => (onChange(t0, t1)).runNow()), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProps[TSuggestion]]
  }
  
  extension [Self <: InputProps[?], TSuggestion](x: Self & InputProps[TSuggestion]) {
    
    inline def setOnBlur(
      value: (/* event */ ReactFocusEventFrom[HTMLElement], /* params */ js.UndefOr[BlurEvent[TSuggestion]]) => Callback
    ): Self = StObject.set(x, "onBlur", js.Any.fromFunction2((t0: /* event */ ReactFocusEventFrom[HTMLElement], t1: /* params */ js.UndefOr[BlurEvent[TSuggestion]]) => (value(t0, t1)).runNow()))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: (ReactEventFrom[HTMLElement], ChangeEvent) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: ReactEventFrom[HTMLElement], t1: ChangeEvent) => (value(t0, t1)).runNow()))
    
    inline def setRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: HTMLInputElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLInputElement | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
