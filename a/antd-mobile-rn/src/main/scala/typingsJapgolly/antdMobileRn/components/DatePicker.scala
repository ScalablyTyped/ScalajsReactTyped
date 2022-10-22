package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.anon.DatePickerLocale
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.date
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.datetime
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.month
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.time
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.year
import typingsJapgolly.antdMobileRn.libDatePickerIndexDotnativeMod.DatePickerNativeProps
import typingsJapgolly.antdMobileRn.libPickerStyleIndexDotnativeMod.IPickerStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePicker {
  
  @JSImport("antd-mobile-rn", "DatePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antdMobileRn.mod.DatePicker] {
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def dismissText(value: VdomNode): this.type = set("dismissText", value.rawNode.asInstanceOf[js.Any])
    
    inline def dismissTextNull: this.type = set("dismissText", null)
    
    inline def dismissTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("dismissText", js.Array(value*))
    
    inline def dismissTextVdomElement(value: VdomElement): this.type = set("dismissText", value.rawElement.asInstanceOf[js.Any])
    
    inline def extra(value: String): this.type = set("extra", value.asInstanceOf[js.Any])
    
    inline def format(value: String | (js.Function1[/* value */ js.Date, String])): this.type = set("format", value.asInstanceOf[js.Any])
    
    inline def formatFunction1(value: /* value */ js.Date => String): this.type = set("format", js.Any.fromFunction1(value))
    
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
    
    inline def onDismiss(value: Callback): this.type = set("onDismiss", value.toJsFn)
    
    inline def onValueChange(value: (/* vals */ Any, /* index */ Double) => Callback): this.type = set("onValueChange", js.Any.fromFunction2((t0: /* vals */ Any, t1: /* index */ Double) => (value(t0, t1)).runNow()))
    
    inline def styles(value: IPickerStyle): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def triggerTypes(value: String): this.type = set("triggerTypes", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DatePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DatePickerNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
