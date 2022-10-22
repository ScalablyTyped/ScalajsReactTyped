package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.anon.False
import typingsJapgolly.antDesignReactNative.libSwitchStyleMod.SwitchStyle
import typingsJapgolly.antDesignReactNative.libSwitchSwitchMod.SwitchProps
import typingsJapgolly.reactNative.mod.ColorValue
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Switch {
  
  @JSImport("@ant-design/react-native", "Switch")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def checkedChildren(value: String | Node): this.type = set("checkedChildren", value.asInstanceOf[js.Any])
    
    inline def checkedChildrenNull: this.type = set("checkedChildren", null)
    
    inline def checkedChildrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("checkedChildren", js.Array(value*))
    
    inline def checkedChildrenVdomElement(value: VdomElement): this.type = set("checkedChildren", value.rawElement.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* checked */ Boolean => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* checked */ Boolean) => value(t0).runNow()))
    
    inline def onPress(value: /* checked */ Boolean => Callback): this.type = set("onPress", js.Any.fromFunction1((t0: /* checked */ Boolean) => value(t0).runNow()))
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: Partial[SwitchStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def thumbColor(value: ColorValue): this.type = set("thumbColor", value.asInstanceOf[js.Any])
    
    inline def thumbTintColor(value: ColorValue): this.type = set("thumbTintColor", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def trackColor(value: False): this.type = set("trackColor", value.asInstanceOf[js.Any])
    
    inline def unCheckedChildren(value: String | Node): this.type = set("unCheckedChildren", value.asInstanceOf[js.Any])
    
    inline def unCheckedChildrenNull: this.type = set("unCheckedChildren", null)
    
    inline def unCheckedChildrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("unCheckedChildren", js.Array(value*))
    
    inline def unCheckedChildrenVdomElement(value: VdomElement): this.type = set("unCheckedChildren", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Switch.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwitchProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
