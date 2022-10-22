package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.libPickerCascaderCascaderTypesMod.CascaderDataItem
import typingsJapgolly.antDesignReactNative.libPickerCascaderCascaderTypesMod.CascaderOneValue
import typingsJapgolly.antDesignReactNative.libPickerCascaderCascaderTypesMod.CascaderProps
import typingsJapgolly.antDesignReactNative.libPickerCascaderCascaderTypesMod.CascaderValue
import typingsJapgolly.antDesignReactNative.libPickerCascaderMod.default
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cascader {
  
  inline def apply(data: js.Array[CascaderDataItem]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CascaderProps]))
  }
  
  @JSImport("@ant-design/react-native/lib/picker/cascader", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: CascaderValue): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueVarargs(value: CascaderOneValue*): this.type = set("defaultValue", js.Array(value*))
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def indicatorStyle(value: StyleProp[ViewStyle]): this.type = set("indicatorStyle", value.asInstanceOf[js.Any])
    
    inline def indicatorStyleNull: this.type = set("indicatorStyle", null)
    
    inline def onChange(value: /* value */ CascaderValue => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ CascaderValue) => value(t0).runNow()))
    
    inline def onScrollChange(value: /* value */ CascaderValue => Callback): this.type = set("onScrollChange", js.Any.fromFunction1((t0: /* value */ CascaderValue) => value(t0).runNow()))
    
    inline def pickerItemStyle(value: StyleProp[TextStyle]): this.type = set("pickerItemStyle", value.asInstanceOf[js.Any])
    
    inline def pickerItemStyleNull: this.type = set("pickerItemStyle", null)
    
    inline def rootNativeProps(value: js.Object): this.type = set("rootNativeProps", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def value(value: CascaderValue): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: CascaderOneValue*): this.type = set("value", js.Array(value*))
  }
  
  def withProps(p: CascaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
