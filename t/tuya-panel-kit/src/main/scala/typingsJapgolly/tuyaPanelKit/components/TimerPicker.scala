package typingsJapgolly.tuyaPanelKit.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.tuyaPanelKit.mod.TimerPickerProps
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.left
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimerPicker {
  
  @JSImport("tuya-panel-kit", "TimerPicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.tuyaPanelKit.mod.TimerPicker] {
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def amText(value: String): this.type = set("amText", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def endTime(value: Double): this.type = set("endTime", value.asInstanceOf[js.Any])
    
    inline def is12Hours(value: Boolean): this.type = set("is12Hours", value.asInstanceOf[js.Any])
    
    inline def onTimerChange(value: (/* startTime */ Double, /* endTime */ Double) => Callback): this.type = set("onTimerChange", js.Any.fromFunction2((t0: /* startTime */ Double, t1: /* endTime */ Double) => (value(t0, t1)).runNow()))
    
    inline def pickerFontColor(value: String): this.type = set("pickerFontColor", value.asInstanceOf[js.Any])
    
    inline def pmText(value: String): this.type = set("pmText", value.asInstanceOf[js.Any])
    
    inline def prefixPosition(value: js.Array[String] | left | right): this.type = set("prefixPosition", value.asInstanceOf[js.Any])
    
    inline def prefixPositionVarargs(value: String*): this.type = set("prefixPosition", js.Array(value*))
    
    inline def singlePicker(value: Boolean): this.type = set("singlePicker", value.asInstanceOf[js.Any])
    
    inline def startTime(value: Double): this.type = set("startTime", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def symbol(value: String): this.type = set("symbol", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TimerPicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TimerPickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
