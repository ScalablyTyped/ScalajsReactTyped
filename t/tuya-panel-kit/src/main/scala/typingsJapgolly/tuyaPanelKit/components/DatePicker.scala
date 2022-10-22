package typingsJapgolly.tuyaPanelKit.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.tuyaPanelKit.anon.Am
import typingsJapgolly.tuyaPanelKit.mod.DatePickerProps
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.date
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.datetime
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.month
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.time
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePicker {
  
  @JSImport("tuya-panel-kit", "DatePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.tuyaPanelKit.mod.DatePicker] {
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def date(value: js.Date): this.type = set("date", value.asInstanceOf[js.Any])
    
    inline def dateSortKeys(value: js.Array[String]): this.type = set("dateSortKeys", value.asInstanceOf[js.Any])
    
    inline def dateSortKeysVarargs(value: String*): this.type = set("dateSortKeys", js.Array(value*))
    
    inline def defaultDate(value: js.Date): this.type = set("defaultDate", value.asInstanceOf[js.Any])
    
    inline def isAmpmFirst(value: Boolean): this.type = set("isAmpmFirst", value.asInstanceOf[js.Any])
    
    inline def isPlusZero(value: Boolean): this.type = set("isPlusZero", value.asInstanceOf[js.Any])
    
    inline def isTimeFirst(value: Boolean): this.type = set("isTimeFirst", value.asInstanceOf[js.Any])
    
    inline def locale(value: String | Am): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    inline def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def mode(value: datetime | date | time | month | year): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def onDateChange(value: /* value */ js.UndefOr[js.Date] => Callback): this.type = set("onDateChange", js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Date]) => value(t0).runNow()))
    
    inline def onValueChange(value: (/* value */ js.UndefOr[String | Double], /* index */ js.UndefOr[Double]) => Callback): this.type = set("onValueChange", js.Any.fromFunction2((t0: /* value */ js.UndefOr[String | Double], t1: /* index */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def pickerFontColor(value: String): this.type = set("pickerFontColor", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def use12Hours(value: Boolean): this.type = set("use12Hours", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DatePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DatePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
