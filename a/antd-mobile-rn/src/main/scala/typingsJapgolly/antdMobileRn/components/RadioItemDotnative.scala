package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.anon.Target
import typingsJapgolly.antdMobileRn.libRadioRadioItemDotnativeMod.RadioItemNativeProps
import typingsJapgolly.antdMobileRn.libRadioRadioItemDotnativeMod.default
import typingsJapgolly.antdMobileRn.libRadioStyleIndexDotnativeMod.IRadioStyle
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioItemDotnative {
  
  @JSImport("antd-mobile-rn/lib/radio/RadioItem.native", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* e */ Target => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* e */ Target) => value(t0).runNow()))
    
    inline def onClick(value: CallbackTo[Any]): this.type = set("onClick", value.toJsFn)
    
    inline def radioProps(value: js.Object): this.type = set("radioProps", value.asInstanceOf[js.Any])
    
    inline def radioStyle(value: StyleProp[ImageStyle]): this.type = set("radioStyle", value.asInstanceOf[js.Any])
    
    inline def radioStyleNull: this.type = set("radioStyle", null)
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: IRadioStyle): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def wrapLabel(value: Boolean): this.type = set("wrapLabel", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: RadioItemDotnative.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadioItemNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
