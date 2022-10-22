package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.inputTypesMod.Size
import typingsJapgolly.baseui.selectTypesMod.Option
import typingsJapgolly.baseui.timezonepickerTypesMod.Timezone
import typingsJapgolly.baseui.timezonepickerTypesMod.TimezonePickerOverrides
import typingsJapgolly.baseui.timezonepickerTypesMod.TimezonePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimezonePicker {
  
  @JSImport("baseui/datepicker", "TimezonePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.datepickerMod.TimezonePicker] {
    
    inline def additionalTimezones(value: js.Array[Timezone]): this.type = set("additionalTimezones", value.asInstanceOf[js.Any])
    
    inline def additionalTimezonesVarargs(value: Timezone*): this.type = set("additionalTimezones", js.Array(value*))
    
    inline def date(value: js.Date): this.type = set("date", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def includeAbbreviations(value: Boolean): this.type = set("includeAbbreviations", value.asInstanceOf[js.Any])
    
    inline def mapLabels(value: /* option */ Option => String): this.type = set("mapLabels", js.Any.fromFunction1(value))
    
    inline def onChange(value: /* value */ js.UndefOr[Timezone | Null] => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def overrides(value: TimezonePickerOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def positive(value: Boolean): this.type = set("positive", value.asInstanceOf[js.Any])
    
    inline def size(value: Size): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueNull: this.type = set("value", null)
  }
  
  implicit def make(companion: TimezonePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TimezonePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
