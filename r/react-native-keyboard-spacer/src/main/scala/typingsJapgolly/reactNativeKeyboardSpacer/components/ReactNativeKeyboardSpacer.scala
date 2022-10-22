package typingsJapgolly.reactNativeKeyboardSpacer.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeKeyboardSpacer.mod.KeyboardSpacerProps
import typingsJapgolly.reactNativeKeyboardSpacer.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeKeyboardSpacer {
  
  @JSImport("react-native-keyboard-spacer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def onToggle(value: (/* keyboardIsOpen */ Boolean, /* keyboardSpace */ Double) => Callback): this.type = set("onToggle", js.Any.fromFunction2((t0: /* keyboardIsOpen */ Boolean, t1: /* keyboardSpace */ Double) => (value(t0, t1)).runNow()))
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def topSpacing(value: Double): this.type = set("topSpacing", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeKeyboardSpacer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: KeyboardSpacerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
