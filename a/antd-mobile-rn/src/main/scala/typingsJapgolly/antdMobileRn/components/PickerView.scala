package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.libPickerPropsTypeMod.PickerData
import typingsJapgolly.antdMobileRn.libPickerViewPickerViewMod.IPickerView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PickerView {
  
  @JSImport("antd-mobile-rn", "PickerView")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antdMobileRn.mod.PickerView] {
    
    inline def cascade(value: Boolean): this.type = set("cascade", value.asInstanceOf[js.Any])
    
    inline def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
    
    inline def data(value: js.Array[js.Array[PickerData] | PickerData]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: (js.Array[PickerData] | PickerData)*): this.type = set("data", js.Array(value*))
    
    inline def indicatorStyle(value: Any): this.type = set("indicatorStyle", value.asInstanceOf[js.Any])
    
    inline def itemStyle(value: Any): this.type = set("itemStyle", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* value */ js.UndefOr[Any] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def onScrollChange(value: /* value */ js.UndefOr[Any] => Callback): this.type = set("onScrollChange", js.Any.fromFunction1((t0: /* value */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def pickerPrefixCls(value: String): this.type = set("pickerPrefixCls", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def styles(value: Any): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Array[Any]): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: Any*): this.type = set("value", js.Array(value*))
  }
  
  implicit def make(companion: PickerView.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IPickerView): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
