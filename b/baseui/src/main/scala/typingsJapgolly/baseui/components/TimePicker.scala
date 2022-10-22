package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.baseuiStrings.`12`
import typingsJapgolly.baseui.baseuiStrings.`24`
import typingsJapgolly.baseui.datepickerUtilsTypesMod.DateIOAdapter
import typingsJapgolly.baseui.inputTypesMod.Size
import typingsJapgolly.baseui.timepickerTypesMod.TimePickerOverrides
import typingsJapgolly.baseui.timepickerTypesMod.TimePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimePicker {
  
  inline def apply[T](adapter: DateIOAdapter[T]): Builder[T] = {
    val __props = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[TimePickerProps[T]]))
  }
  
  @JSImport("baseui/datepicker", "TimePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.datepickerMod.TimePicker[T]] {
    
    inline def creatable(value: Boolean): this.type = set("creatable", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def format(value: `12` | `24`): this.type = set("format", value.asInstanceOf[js.Any])
    
    inline def ignoreMinMaxDateComponent(value: Boolean): this.type = set("ignoreMinMaxDateComponent", value.asInstanceOf[js.Any])
    
    inline def maxTime(value: T): this.type = set("maxTime", value.asInstanceOf[js.Any])
    
    inline def minTime(value: T): this.type = set("minTime", value.asInstanceOf[js.Any])
    
    inline def nullable(value: Boolean): this.type = set("nullable", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* a */ T | Null => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def overrides(value: TimePickerOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def positive(value: Boolean): this.type = set("positive", value.asInstanceOf[js.Any])
    
    inline def size(value: Size): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def value(value: T): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueNull: this.type = set("value", null)
  }
  
  def withProps[T](p: TimePickerProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
