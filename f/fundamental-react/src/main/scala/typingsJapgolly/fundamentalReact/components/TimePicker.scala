package typingsJapgolly.fundamentalReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fundamentalReact.anon.Hour
import typingsJapgolly.fundamentalReact.anon.MeridiemPM
import typingsJapgolly.fundamentalReact.libTimePickerTimePickerMod.TimePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimePicker {
  
  @JSImport("fundamental-react", "TimePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.fundamentalReact.mod.TimePicker] {
    
    inline def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def format12Hours(value: Boolean): this.type = set("format12Hours", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def localizedText(value: MeridiemPM): this.type = set("localizedText", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* repeated */ Any => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def showHour(value: Boolean): this.type = set("showHour", value.asInstanceOf[js.Any])
    
    inline def showMinute(value: Boolean): this.type = set("showMinute", value.asInstanceOf[js.Any])
    
    inline def showSecond(value: Boolean): this.type = set("showSecond", value.asInstanceOf[js.Any])
    
    inline def spinners(value: Boolean): this.type = set("spinners", value.asInstanceOf[js.Any])
    
    inline def time(value: Hour): this.type = set("time", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TimePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TimePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
