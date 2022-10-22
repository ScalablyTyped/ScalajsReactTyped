package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings._empty
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.android
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.down
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.empty
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.ios
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.middle
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.top
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.up
import typingsJapgolly.antDesignReactNative.libListListItemMod.ListItemProps
import typingsJapgolly.antDesignReactNative.libListListItemMod.default
import typingsJapgolly.antDesignReactNative.libListStyleMod.ListStyle
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItem {
  
  @JSImport("@ant-design/react-native/lib/list/ListItem", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def activeStyle(value: StyleProp[ViewStyle]): this.type = set("activeStyle", value.asInstanceOf[js.Any])
    
    inline def activeStyleNull: this.type = set("activeStyle", null)
    
    inline def align(value: top | middle | bottom): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def arrow(value: horizontal | down | up | empty | _empty): this.type = set("arrow", value.asInstanceOf[js.Any])
    
    inline def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def extra(value: VdomNode): this.type = set("extra", value.rawNode.asInstanceOf[js.Any])
    
    inline def extraNull: this.type = set("extra", null)
    
    inline def extraVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("extra", js.Array(value*))
    
    inline def extraVdomElement(value: VdomElement): this.type = set("extra", value.rawElement.asInstanceOf[js.Any])
    
    inline def multipleLine(value: Boolean): this.type = set("multipleLine", value.asInstanceOf[js.Any])
    
    inline def onLongPress(value: /* event */ GestureResponderEvent => Callback): this.type = set("onLongPress", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onPress(value: /* event */ GestureResponderEvent => Callback): this.type = set("onPress", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onPressIn(value: /* event */ GestureResponderEvent => Callback): this.type = set("onPressIn", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onPressOut(value: /* event */ GestureResponderEvent => Callback): this.type = set("onPressOut", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def platform(value: android | ios): this.type = set("platform", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: Partial[ListStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def thumb(value: VdomNode): this.type = set("thumb", value.rawNode.asInstanceOf[js.Any])
    
    inline def thumbNull: this.type = set("thumb", null)
    
    inline def thumbVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("thumb", js.Array(value*))
    
    inline def thumbVdomElement(value: VdomElement): this.type = set("thumb", value.rawElement.asInstanceOf[js.Any])
    
    inline def wrap(value: Boolean): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ListItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
