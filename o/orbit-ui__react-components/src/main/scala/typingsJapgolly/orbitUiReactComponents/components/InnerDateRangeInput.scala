package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distDateInputSrcDateRangeInputMod.DateRangePreset
import typingsJapgolly.orbitUiReactComponents.distDateInputSrcDateRangeInputMod.InnerDateRangeInputProps
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.compact
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.expanded
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InnerDateRangeInput {
  
  @JSImport("@orbit-ui/react-components", "InnerDateRangeInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def as(value: ElementType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean | Double): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def defaultEndDate(value: js.Date): this.type = set("defaultEndDate", value.asInstanceOf[js.Any])
    
    inline def defaultStartDate(value: js.Date): this.type = set("defaultStartDate", value.asInstanceOf[js.Any])
    
    inline def endDate(value: js.Date): this.type = set("endDate", value.asInstanceOf[js.Any])
    
    inline def endDateNull: this.type = set("endDate", null)
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def focus(value: Boolean): this.type = set("focus", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[Any]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ Any | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def hover(value: Boolean): this.type = set("hover", value.asInstanceOf[js.Any])
    
    inline def max(value: js.Date): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def min(value: js.Date): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: ReactFocusEventFrom[Element & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def onDatesChange(
      value: (/* event */ ReactEventFrom[Element], /* startDate */ js.Date, /* endDate */ js.Date) => Callback
    ): this.type = set("onDatesChange", js.Any.fromFunction3((t0: /* event */ ReactEventFrom[Element], t1: /* startDate */ js.Date, t2: /* endDate */ js.Date) => (value(t0, t1, t2)).runNow()))
    
    inline def onFocus(value: ReactFocusEventFrom[Element & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def presets(value: js.Array[DateRangePreset]): this.type = set("presets", value.asInstanceOf[js.Any])
    
    inline def presetsVarargs(value: DateRangePreset*): this.type = set("presets", js.Array(value*))
    
    inline def presetsVariant(value: compact | expanded): this.type = set("presetsVariant", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def startDate(value: js.Date): this.type = set("startDate", value.asInstanceOf[js.Any])
    
    inline def startDateNull: this.type = set("startDate", null)
    
    inline def validationState(value: valid | invalid): this.type = set("validationState", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InnerDateRangeInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InnerDateRangeInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
