package typingsJapgolly.blueprintjsDatetime.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsDatetime.libEsmCommonTimeUnitMod.TimeUnit
import typingsJapgolly.blueprintjsDatetime.libEsmTimePickerMod.ITimePickerProps
import typingsJapgolly.blueprintjsDatetime.libEsmTimePickerMod.TimePrecision
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimePicker {
  
  @JSImport("@blueprintjs/datetime", "TimePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsDatetime.mod.TimePicker] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: js.Date): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def maxTime(value: js.Date): this.type = set("maxTime", value.asInstanceOf[js.Any])
    
    inline def minTime(value: js.Date): this.type = set("minTime", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: (/* event */ ReactFocusEventFrom[HTMLInputElement], /* unit */ TimeUnit) => Callback): this.type = set("onBlur", js.Any.fromFunction2((t0: /* event */ ReactFocusEventFrom[HTMLInputElement], t1: /* unit */ TimeUnit) => (value(t0, t1)).runNow()))
    
    inline def onChange(value: /* newTime */ js.Date => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* newTime */ js.Date) => value(t0).runNow()))
    
    inline def onFocus(value: (/* event */ ReactFocusEventFrom[HTMLInputElement], /* unit */ TimeUnit) => Callback): this.type = set("onFocus", js.Any.fromFunction2((t0: /* event */ ReactFocusEventFrom[HTMLInputElement], t1: /* unit */ TimeUnit) => (value(t0, t1)).runNow()))
    
    inline def onKeyDown(value: (/* event */ ReactKeyboardEventFrom[HTMLInputElement], /* unit */ TimeUnit) => Callback): this.type = set("onKeyDown", js.Any.fromFunction2((t0: /* event */ ReactKeyboardEventFrom[HTMLInputElement], t1: /* unit */ TimeUnit) => (value(t0, t1)).runNow()))
    
    inline def onKeyUp(value: (/* event */ ReactKeyboardEventFrom[HTMLInputElement], /* unit */ TimeUnit) => Callback): this.type = set("onKeyUp", js.Any.fromFunction2((t0: /* event */ ReactKeyboardEventFrom[HTMLInputElement], t1: /* unit */ TimeUnit) => (value(t0, t1)).runNow()))
    
    inline def precision(value: TimePrecision): this.type = set("precision", value.asInstanceOf[js.Any])
    
    inline def selectAllOnFocus(value: Boolean): this.type = set("selectAllOnFocus", value.asInstanceOf[js.Any])
    
    inline def showArrowButtons(value: Boolean): this.type = set("showArrowButtons", value.asInstanceOf[js.Any])
    
    inline def useAmPm(value: Boolean): this.type = set("useAmPm", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueNull: this.type = set("value", null)
  }
  
  implicit def make(companion: TimePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ITimePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
