package typingsJapgolly.tuyaPanelKit.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.tuyaPanelKit.anon.Color
import typingsJapgolly.tuyaPanelKit.mod.TopBarActionProps
import typingsJapgolly.tuyaPanelKit.mod.TopBarProps
import typingsJapgolly.tuyaPanelKit.themeMod.BackgroundProps
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.center
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.left
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TopBar {
  
  @JSImport("tuya-panel-kit", "TopBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.tuyaPanelKit.mod.TopBar] {
    
    inline def actions(value: js.Array[TopBarActionProps]): this.type = set("actions", value.asInstanceOf[js.Any])
    
    inline def actionsVarargs(value: TopBarActionProps*): this.type = set("actions", js.Array(value*))
    
    inline def background(value: BackgroundProps): this.type = set("background", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def contentStyle(value: StyleProp[ViewStyle]): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    inline def contentStyleNull: this.type = set("contentStyle", null)
    
    inline def leftActions(value: js.Array[TopBarActionProps]): this.type = set("leftActions", value.asInstanceOf[js.Any])
    
    inline def leftActionsVarargs(value: TopBarActionProps*): this.type = set("leftActions", js.Array(value*))
    
    inline def onBack(value: /* repeated */ Any => Callback): this.type = set("onBack", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def onPress(value: /* event */ GestureResponderEvent => Callback): this.type = set("onPress", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def position(value: left | center | right): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def subTitle(value: String): this.type = set("subTitle", value.asInstanceOf[js.Any])
    
    inline def subTitleStyle(value: StyleProp[TextStyle]): this.type = set("subTitleStyle", value.asInstanceOf[js.Any])
    
    inline def subTitleStyleNull: this.type = set("subTitleStyle", null)
    
    inline def theme(value: Color): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleStyle(value: StyleProp[TextStyle]): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    
    inline def titleStyleNull: this.type = set("titleStyle", null)
  }
  
  implicit def make(companion: TopBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TopBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
