package typingsJapgolly.reactNativePaper.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePaper.anon.DeepPartialTheme
import typingsJapgolly.reactNativePaper.anon.PickPropsstyleanchorchild
import typingsJapgolly.reactNativePaper.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Menu {
  
  inline def apply(onDismiss: Callback, visible: Boolean): Builder = {
    val __props = js.Dynamic.literal(onDismiss = onDismiss.toJsFn, visible = visible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PickPropsstyleanchorchild]))
  }
  
  @JSImport("react-native-paper", "Menu")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def anchor(value: Node | X): this.type = set("anchor", value.asInstanceOf[js.Any])
    
    inline def anchorNull: this.type = set("anchor", null)
    
    inline def anchorVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("anchor", js.Array(value*))
    
    inline def anchorVdomElement(value: VdomElement): this.type = set("anchor", value.rawElement.asInstanceOf[js.Any])
    
    inline def contentStyle(value: StyleProp[ViewStyle]): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    inline def contentStyleNull: this.type = set("contentStyle", null)
    
    inline def overlayAccessibilityLabel(value: String): this.type = set("overlayAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def statusBarHeight(value: Double): this.type = set("statusBarHeight", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def theme(value: DeepPartialTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickPropsstyleanchorchild): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
