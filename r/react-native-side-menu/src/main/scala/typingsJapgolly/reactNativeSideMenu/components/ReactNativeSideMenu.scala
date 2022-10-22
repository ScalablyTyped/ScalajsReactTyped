package typingsJapgolly.reactNativeSideMenu.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.Animated.CompositeAnimation
import typingsJapgolly.reactNative.mod.Animated.EndCallback
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSideMenu.mod.ReactNativeSideMenuProps
import typingsJapgolly.reactNativeSideMenu.mod.default
import typingsJapgolly.reactNativeSideMenu.reactNativeSideMenuStrings.left
import typingsJapgolly.reactNativeSideMenu.reactNativeSideMenuStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeSideMenu {
  
  @JSImport("react-native-side-menu", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def animationFunction(value: (/* prop */ Value, /* value */ Double) => CompositeAnimation): this.type = set("animationFunction", js.Any.fromFunction2(value))
    
    inline def animationStyle(value: /* value */ Double => ViewStyle): this.type = set("animationStyle", js.Any.fromFunction1(value))
    
    inline def autoClosing(value: Boolean): this.type = set("autoClosing", value.asInstanceOf[js.Any])
    
    inline def bounceBackOnOverdraw(value: Boolean): this.type = set("bounceBackOnOverdraw", value.asInstanceOf[js.Any])
    
    inline def disableGestures(value: Boolean): this.type = set("disableGestures", value.asInstanceOf[js.Any])
    
    inline def edgeHitWidth(value: Double): this.type = set("edgeHitWidth", value.asInstanceOf[js.Any])
    
    inline def hiddenMenuOffset(value: Double): this.type = set("hiddenMenuOffset", value.asInstanceOf[js.Any])
    
    inline def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    inline def menu(value: VdomNode): this.type = set("menu", value.rawNode.asInstanceOf[js.Any])
    
    inline def menuNull: this.type = set("menu", null)
    
    inline def menuPosition(value: left | right): this.type = set("menuPosition", value.asInstanceOf[js.Any])
    
    inline def menuVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("menu", js.Array(value*))
    
    inline def menuVdomElement(value: VdomElement): this.type = set("menu", value.rawElement.asInstanceOf[js.Any])
    
    inline def onAnimationComplete(value: /* event */ EndCallback => Callback): this.type = set("onAnimationComplete", js.Any.fromFunction1((t0: /* event */ EndCallback) => value(t0).runNow()))
    
    inline def onChange(value: /* isOpen */ Boolean => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* isOpen */ Boolean) => value(t0).runNow()))
    
    inline def onMove(value: /* left */ Double => Callback): this.type = set("onMove", js.Any.fromFunction1((t0: /* left */ Double) => value(t0).runNow()))
    
    inline def onSliding(value: /* fraction */ Double => Callback): this.type = set("onSliding", js.Any.fromFunction1((t0: /* fraction */ Double) => value(t0).runNow()))
    
    inline def onStartShouldSetResponderCapture(value: /* e */ GestureResponderEvent => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def openMenuOffset(value: Double): this.type = set("openMenuOffset", value.asInstanceOf[js.Any])
    
    inline def toleranceX(value: Double): this.type = set("toleranceX", value.asInstanceOf[js.Any])
    
    inline def toleranceY(value: Double): this.type = set("toleranceY", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeSideMenu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactNativeSideMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
