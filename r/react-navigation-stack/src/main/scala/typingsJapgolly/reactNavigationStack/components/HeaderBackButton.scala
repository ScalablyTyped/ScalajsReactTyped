package typingsJapgolly.reactNavigationStack.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.Animated.WithAnimatedValue
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNavigationStack.anon.TintColor
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Layout
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderLeftButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HeaderBackButton {
  
  @JSImport("react-navigation-stack", "HeaderBackButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def allowFontScaling(value: Boolean): this.type = set("allowFontScaling", value.asInstanceOf[js.Any])
    
    inline def backImage(value: /* props */ TintColor => Node): this.type = set("backImage", js.Any.fromFunction1(value))
    
    inline def canGoBack(value: Boolean): this.type = set("canGoBack", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelStyle(value: WithAnimatedValue[StyleProp[TextStyle]]): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    
    inline def labelVisible(value: Boolean): this.type = set("labelVisible", value.asInstanceOf[js.Any])
    
    inline def onLabelLayout(value: /* e */ LayoutChangeEvent => Callback): this.type = set("onLabelLayout", js.Any.fromFunction1((t0: /* e */ LayoutChangeEvent) => value(t0).runNow()))
    
    inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
    
    inline def pressColorAndroid(value: String): this.type = set("pressColorAndroid", value.asInstanceOf[js.Any])
    
    inline def screenLayout(value: Layout): this.type = set("screenLayout", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
    
    inline def titleLayout(value: Layout): this.type = set("titleLayout", value.asInstanceOf[js.Any])
    
    inline def truncatedLabel(value: String): this.type = set("truncatedLabel", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: HeaderBackButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StackHeaderLeftButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
