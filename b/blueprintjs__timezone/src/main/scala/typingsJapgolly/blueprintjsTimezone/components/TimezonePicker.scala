package typingsJapgolly.blueprintjsTimezone.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmComponentsFormsInputGroupMod.InputGroupProps2
import typingsJapgolly.blueprintjsTimezone.anon.PartialButtonPropsHTMLBut
import typingsJapgolly.blueprintjsTimezone.anon.PartialIPopoverProps
import typingsJapgolly.blueprintjsTimezone.libEsmComponentsTimezonePickerTimezoneDisplayFormatMod.TimezoneDisplayFormat
import typingsJapgolly.blueprintjsTimezone.libEsmComponentsTimezonePickerTimezonePickerMod.ITimezonePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimezonePicker {
  
  inline def apply(onChange: String => Callback): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: String) => onChange(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[ITimezonePickerProps]))
  }
  
  @JSImport("@blueprintjs/timezone", "TimezonePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsTimezone.mod.TimezonePicker] {
    
    inline def buttonProps(value: PartialButtonPropsHTMLBut): this.type = set("buttonProps", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def date(value: js.Date): this.type = set("date", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def inputProps(value: InputGroupProps2): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def popoverProps(value: PartialIPopoverProps): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    
    inline def showLocalTimezone(value: Boolean): this.type = set("showLocalTimezone", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueDisplayFormat(value: TimezoneDisplayFormat): this.type = set("valueDisplayFormat", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITimezonePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
