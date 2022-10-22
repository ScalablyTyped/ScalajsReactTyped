package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.anon.PartialCheckboxStyle
import typingsJapgolly.antDesignReactNative.anon.RadioPropsrefRefRadioForw
import typingsJapgolly.antDesignReactNative.libCheckboxPropsTypeMod.OnChangeParams
import typingsJapgolly.antDesignReactNative.libRadioPropsTypeMod.RadioForwardedRef
import typingsJapgolly.antDesignReactNative.libRadioPropsTypeMod.RadioValue
import typingsJapgolly.antDesignReactNative.libRadioRadioGroupMod.RadioGroupProps
import typingsJapgolly.antDesignReactNative.libRadioRadioItemMod.RadioItemProps
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Radio {
  
  object Group {
    
    object Type {
      
      @JSImport("@ant-design/react-native", "Radio.Group.type")
      @js.native
      val component: js.Object = js.native
      
      implicit def make(companion: Type.type): SharedBuilder_RadioGroupPropsRefAttributes308805308 = new SharedBuilder_RadioGroupPropsRefAttributes308805308(js.Array(this.component, js.Dictionary.empty))()
      
      def withProps(p: RadioGroupProps & RefAttributes[Any]): SharedBuilder_RadioGroupPropsRefAttributes308805308 = new SharedBuilder_RadioGroupPropsRefAttributes308805308(js.Array(this.component, p.asInstanceOf[js.Any]))
    }
    
    @JSImport("@ant-design/react-native", "Radio.Group")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Group.type): SharedBuilder_RadioGroupPropsRefAttributes308805308 = new SharedBuilder_RadioGroupPropsRefAttributes308805308(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: RadioGroupProps & RefAttributes[Any]): SharedBuilder_RadioGroupPropsRefAttributes308805308 = new SharedBuilder_RadioGroupPropsRefAttributes308805308(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object RadioItem {
    
    @JSImport("@ant-design/react-native", "Radio.RadioItem")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: RadioItem.type): SharedBuilder_RadioItemProps_202278406[typingsJapgolly.antDesignReactNative.mod.Radio.RadioItem] = new SharedBuilder_RadioItemProps_202278406[typingsJapgolly.antDesignReactNative.mod.Radio.RadioItem](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: RadioItemProps): SharedBuilder_RadioItemProps_202278406[typingsJapgolly.antDesignReactNative.mod.Radio.RadioItem] = new SharedBuilder_RadioItemProps_202278406[typingsJapgolly.antDesignReactNative.mod.Radio.RadioItem](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@ant-design/react-native", "Radio")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[RadioForwardedRef & js.Object] {
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def indeterminate(value: Boolean): this.type = set("indeterminate", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* _e */ OnChangeParams => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* _e */ OnChangeParams) => value(t0).runNow()))
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: PartialCheckboxStyle): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def value(value: RadioValue): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Radio.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadioPropsrefRefRadioForw): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
