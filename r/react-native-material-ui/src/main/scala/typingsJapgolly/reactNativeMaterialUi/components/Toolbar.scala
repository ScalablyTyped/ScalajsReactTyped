package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeMaterialUi.mod.RightElementPressEvent
import typingsJapgolly.reactNativeMaterialUi.mod.Searchable
import typingsJapgolly.reactNativeMaterialUi.mod.ToolBarRightElement
import typingsJapgolly.reactNativeMaterialUi.mod.ToolbarProps
import typingsJapgolly.reactNativeMaterialUi.mod.ToolbarStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toolbar {
  
  @JSImport("react-native-material-ui", "Toolbar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.Toolbar] {
    
    inline def centerElement(value: Element | String): this.type = set("centerElement", value.asInstanceOf[js.Any])
    
    inline def centerElementVdomElement(value: VdomElement): this.type = set("centerElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def isSearchActive(value: Boolean): this.type = set("isSearchActive", value.asInstanceOf[js.Any])
    
    inline def leftElement(value: Element | String): this.type = set("leftElement", value.asInstanceOf[js.Any])
    
    inline def leftElementVdomElement(value: VdomElement): this.type = set("leftElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def onLeftElementPress(value: Callback): this.type = set("onLeftElementPress", value.toJsFn)
    
    inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
    
    inline def onRightElementPress(value: /* e */ RightElementPressEvent => Callback): this.type = set("onRightElementPress", js.Any.fromFunction1((t0: /* e */ RightElementPressEvent) => value(t0).runNow()))
    
    inline def rightElement(value: Element | String | js.Array[String] | ToolBarRightElement): this.type = set("rightElement", value.asInstanceOf[js.Any])
    
    inline def rightElementVarargs(value: String*): this.type = set("rightElement", js.Array(value*))
    
    inline def rightElementVdomElement(value: VdomElement): this.type = set("rightElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def searchable(value: Searchable): this.type = set("searchable", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: ToolbarStyle): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Toolbar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ToolbarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
