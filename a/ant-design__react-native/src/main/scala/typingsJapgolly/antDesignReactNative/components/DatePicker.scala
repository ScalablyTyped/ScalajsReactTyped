package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.anon.DatePickerLocale
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.date
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.datetime
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.month
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.time
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.year
import typingsJapgolly.antDesignReactNative.libDatePickerMod.DatePickerProps
import typingsJapgolly.antDesignReactNative.libPickerStyleMod.PickerStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePicker {
  
  @JSImport("@ant-design/react-native", "DatePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignReactNative.mod.DatePicker] {
    
    inline def date(value: Any): this.type = set("date", value.asInstanceOf[js.Any])
    
    inline def defaultDate(value: js.Date): this.type = set("defaultDate", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def dismissText(value: VdomNode): this.type = set("dismissText", value.rawNode.asInstanceOf[js.Any])
    
    inline def dismissTextNull: this.type = set("dismissText", null)
    
    inline def dismissTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("dismissText", js.Array(value*))
    
    inline def dismissTextVdomElement(value: VdomElement): this.type = set("dismissText", value.rawElement.asInstanceOf[js.Any])
    
    inline def extra(value: String): this.type = set("extra", value.asInstanceOf[js.Any])
    
    inline def format(value: String | (js.Function1[/* value */ js.Date, String])): this.type = set("format", value.asInstanceOf[js.Any])
    
    inline def formatDay(value: (/* day */ Double, /* date */ js.UndefOr[Any]) => Any): this.type = set("formatDay", js.Any.fromFunction2(value))
    
    inline def formatFunction1(value: /* value */ js.Date => String): this.type = set("format", js.Any.fromFunction1(value))
    
    inline def formatMonth(value: (/* month */ Double, /* date */ js.UndefOr[Any]) => Any): this.type = set("formatMonth", js.Any.fromFunction2(value))
    
    inline def itemStyle(value: StyleProp[TextStyle]): this.type = set("itemStyle", value.asInstanceOf[js.Any])
    
    inline def itemStyleNull: this.type = set("itemStyle", null)
    
    inline def locale(value: DatePickerLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def minuteStep(value: Double): this.type = set("minuteStep", value.asInstanceOf[js.Any])
    
    inline def mode(value: datetime | date | year | month | time): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def okText(value: VdomNode): this.type = set("okText", value.rawNode.asInstanceOf[js.Any])
    
    inline def okTextNull: this.type = set("okText", null)
    
    inline def okTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("okText", js.Array(value*))
    
    inline def okTextVdomElement(value: VdomElement): this.type = set("okText", value.rawElement.asInstanceOf[js.Any])
    
    inline def onChange(value: /* value */ js.Date => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ js.Date) => value(t0).runNow()))
    
    inline def onDateChange(value: /* date */ Any => Callback): this.type = set("onDateChange", js.Any.fromFunction1((t0: /* date */ Any) => value(t0).runNow()))
    
    inline def onDismiss(value: Callback): this.type = set("onDismiss", value.toJsFn)
    
    inline def onOk(value: Callback): this.type = set("onOk", value.toJsFn)
    
    inline def onScrollChange(value: (/* date */ Any, /* vals */ Any, /* index */ Double) => Callback): this.type = set("onScrollChange", js.Any.fromFunction3((t0: /* date */ Any, t1: /* vals */ Any, t2: /* index */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def onValueChange(value: (/* vals */ Any, /* index */ Double) => Callback): this.type = set("onValueChange", js.Any.fromFunction2((t0: /* vals */ Any, t1: /* index */ Double) => (value(t0, t1)).runNow()))
    
    inline def rootNativeProps(value: js.Object): this.type = set("rootNativeProps", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: Partial[PickerStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def triggerTypes(value: String): this.type = set("triggerTypes", value.asInstanceOf[js.Any])
    
    inline def use12Hours(value: Boolean): this.type = set("use12Hours", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DatePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DatePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
