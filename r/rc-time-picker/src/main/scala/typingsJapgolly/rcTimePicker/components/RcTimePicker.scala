package typingsJapgolly.rcTimePicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.rcTimePicker.anon.Open
import typingsJapgolly.rcTimePicker.anon.`0`
import typingsJapgolly.rcTimePicker.mod.Panel
import typingsJapgolly.rcTimePicker.mod.TimePickerProps
import typingsJapgolly.rcTimePicker.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcTimePicker {
  
  @JSImport("rc-time-picker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def addon(value: /* instance */ Instantiable0[Panel] => Node): this.type = set("addon", js.Any.fromFunction1(value))
    
    inline def allowEmpty(value: Boolean): this.type = set("allowEmpty", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def clearIcon(value: VdomNode): this.type = set("clearIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def clearIconNull: this.type = set("clearIcon", null)
    
    inline def clearIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("clearIcon", js.Array(value*))
    
    inline def clearIconVdomElement(value: VdomElement): this.type = set("clearIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def clearText(value: String): this.type = set("clearText", value.asInstanceOf[js.Any])
    
    inline def defaultOpenValue(value: Moment): this.type = set("defaultOpenValue", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: Moment): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def disabledHours(value: CallbackTo[js.Array[Double]]): this.type = set("disabledHours", value.toJsFn)
    
    inline def disabledMinutes(value: /* hour */ Double => js.Array[Double]): this.type = set("disabledMinutes", js.Any.fromFunction1(value))
    
    inline def disabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): this.type = set("disabledSeconds", js.Any.fromFunction2(value))
    
    inline def focusOnOpen(value: Boolean): this.type = set("focusOnOpen", value.asInstanceOf[js.Any])
    
    inline def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
    
    inline def hideDisabledOptions(value: Boolean): this.type = set("hideDisabledOptions", value.asInstanceOf[js.Any])
    
    inline def hourStep(value: Double): this.type = set("hourStep", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def inputIcon(value: VdomNode): this.type = set("inputIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def inputIconNull: this.type = set("inputIcon", null)
    
    inline def inputIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("inputIcon", js.Array(value*))
    
    inline def inputIconVdomElement(value: VdomElement): this.type = set("inputIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def inputReadOnly(value: Boolean): this.type = set("inputReadOnly", value.asInstanceOf[js.Any])
    
    inline def minuteStep(value: Double): this.type = set("minuteStep", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* newValue */ Moment => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* newValue */ Moment) => value(t0).runNow()))
    
    inline def onClose(value: /* newState */ `0` => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: /* newState */ `0`) => value(t0).runNow()))
    
    inline def onOpen(value: /* newState */ Open => Callback): this.type = set("onOpen", js.Any.fromFunction1((t0: /* newState */ Open) => value(t0).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def placement(value: String): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def popupClassName(value: String): this.type = set("popupClassName", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def secondStep(value: Double): this.type = set("secondStep", value.asInstanceOf[js.Any])
    
    inline def showHour(value: Boolean): this.type = set("showHour", value.asInstanceOf[js.Any])
    
    inline def showMinute(value: Boolean): this.type = set("showMinute", value.asInstanceOf[js.Any])
    
    inline def showSecond(value: Boolean): this.type = set("showSecond", value.asInstanceOf[js.Any])
    
    inline def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
    
    inline def use12Hours(value: Boolean): this.type = set("use12Hours", value.asInstanceOf[js.Any])
    
    inline def value(value: Moment): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: RcTimePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TimePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
