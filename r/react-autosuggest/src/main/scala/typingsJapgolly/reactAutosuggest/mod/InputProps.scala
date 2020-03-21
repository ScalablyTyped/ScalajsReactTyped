package typingsJapgolly.reactAutosuggest.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof react.react.InputHTMLAttributes<any> ]: P} & {[ P in 'onChange' | 'onBlur' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.InputHTMLAttributes<any>] ]: react.react.InputHTMLAttributes<any>[P]} */ trait InputProps[TSuggestion] extends js.Object {
  var onBlur: js.UndefOr[
    js.Function2[
      /* event */ ReactFocusEventFrom[Element], 
      /* params */ js.UndefOr[BlurEvent[TSuggestion]], 
      Unit
    ]
  ] = js.undefined
  var value: String
  def onChange(event: ReactEventFrom[Element], params: ChangeEvent): Unit
}

object InputProps {
  @scala.inline
  def apply[TSuggestion](
    onChange: (ReactEventFrom[Element], ChangeEvent) => Callback,
    value: String,
    onBlur: (/* event */ ReactFocusEventFrom[Element], /* params */ js.UndefOr[BlurEvent[TSuggestion]]) => Callback = null
  ): InputProps[TSuggestion] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element], t1: typingsJapgolly.reactAutosuggest.mod.ChangeEvent) => onChange(t0, t1).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.Element], t1: /* params */ js.UndefOr[typingsJapgolly.reactAutosuggest.mod.BlurEvent[TSuggestion]]) => onBlur(t0, t1).runNow()))
    __obj.asInstanceOf[InputProps[TSuggestion]]
  }
}

