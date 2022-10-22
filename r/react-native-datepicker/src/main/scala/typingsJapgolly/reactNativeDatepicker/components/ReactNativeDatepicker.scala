package typingsJapgolly.reactNativeDatepicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNativeDatepicker.mod.DatePickerCustomStylesProps
import typingsJapgolly.reactNativeDatepicker.mod.DatePickerProps
import typingsJapgolly.reactNativeDatepicker.mod.default
import typingsJapgolly.reactNativeDatepicker.reactNativeDatepickerStrings.calendar
import typingsJapgolly.reactNativeDatepicker.reactNativeDatepickerStrings.date
import typingsJapgolly.reactNativeDatepicker.reactNativeDatepickerStrings.datetime
import typingsJapgolly.reactNativeDatepicker.reactNativeDatepickerStrings.spinner
import typingsJapgolly.reactNativeDatepicker.reactNativeDatepickerStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeDatepicker {
  
  @JSImport("react-native-datepicker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def TouchableComponent(value: Component[js.Object, js.Object]): this.type = set("TouchableComponent", value.asInstanceOf[js.Any])
    
    inline def allowFontScaling(value: Boolean): this.type = set("allowFontScaling", value.asInstanceOf[js.Any])
    
    inline def androidMode(
      value: typingsJapgolly.reactNativeDatepicker.reactNativeDatepickerStrings.default | calendar | spinner
    ): this.type = set("androidMode", value.asInstanceOf[js.Any])
    
    inline def cancelBtnTestID(value: String): this.type = set("cancelBtnTestID", value.asInstanceOf[js.Any])
    
    inline def cancelBtnText(value: String): this.type = set("cancelBtnText", value.asInstanceOf[js.Any])
    
    inline def confirmBtnTestID(value: String): this.type = set("confirmBtnTestID", value.asInstanceOf[js.Any])
    
    inline def confirmBtnText(value: String): this.type = set("confirmBtnText", value.asInstanceOf[js.Any])
    
    inline def customStyles(value: DatePickerCustomStylesProps): this.type = set("customStyles", value.asInstanceOf[js.Any])
    
    inline def date(value: String | js.Date | Moment): this.type = set("date", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
    
    inline def getDateStr(value: /* date */ js.Date => String): this.type = set("getDateStr", js.Any.fromFunction1(value))
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def hideText(value: Boolean): this.type = set("hideText", value.asInstanceOf[js.Any])
    
    inline def iconComponent(value: VdomElement): this.type = set("iconComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def iconSource(value: ImageURISource): this.type = set("iconSource", value.asInstanceOf[js.Any])
    
    inline def is24Hour(value: Boolean): this.type = set("is24Hour", value.asInstanceOf[js.Any])
    
    inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def maxDate(value: String | js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def minDate(value: String | js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def minuteInterval(value: Double): this.type = set("minuteInterval", value.asInstanceOf[js.Any])
    
    inline def modalOnResponderTerminationRequest(value: /* e */ Any => Boolean): this.type = set("modalOnResponderTerminationRequest", js.Any.fromFunction1(value))
    
    inline def mode(value: date | datetime | time): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def onCloseModal(value: Callback): this.type = set("onCloseModal", value.toJsFn)
    
    inline def onDateChange(value: (/* dateStr */ String, /* date */ js.Date) => Callback): this.type = set("onDateChange", js.Any.fromFunction2((t0: /* dateStr */ String, t1: /* date */ js.Date) => (value(t0, t1)).runNow()))
    
    inline def onOpenModal(value: Callback): this.type = set("onOpenModal", value.toJsFn)
    
    inline def onPressMask(value: Callback): this.type = set("onPressMask", value.toJsFn)
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def showIcon(value: Boolean): this.type = set("showIcon", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[Any]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def timeZoneOffsetInMinutes(value: Double): this.type = set("timeZoneOffsetInMinutes", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeDatepicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DatePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
