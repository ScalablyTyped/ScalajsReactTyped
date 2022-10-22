package typingsJapgolly.rmcPicker.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rmcPicker.libPickerDotnativeMod.default
import typingsJapgolly.rmcPicker.libPickerTypesMod.IPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PickerDotnative {
  
  @JSImport("rmc-picker/lib/Picker.native", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultSelectedValue(value: Any): this.type = set("defaultSelectedValue", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def indicatorClassName(value: String): this.type = set("indicatorClassName", value.asInstanceOf[js.Any])
    
    inline def indicatorStyle(value: Any): this.type = set("indicatorStyle", value.asInstanceOf[js.Any])
    
    inline def itemStyle(value: Any): this.type = set("itemStyle", value.asInstanceOf[js.Any])
    
    inline def noAnimate(value: Boolean): this.type = set("noAnimate", value.asInstanceOf[js.Any])
    
    inline def onScrollChange(value: /* value */ Any => Callback): this.type = set("onScrollChange", js.Any.fromFunction1((t0: /* value */ Any) => value(t0).runNow()))
    
    inline def onValueChange(value: /* value */ Any => Callback): this.type = set("onValueChange", js.Any.fromFunction1((t0: /* value */ Any) => value(t0).runNow()))
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def selectedValue(value: Any): this.type = set("selectedValue", value.asInstanceOf[js.Any])
    
    inline def style(value: Any): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PickerDotnative.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IPickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
