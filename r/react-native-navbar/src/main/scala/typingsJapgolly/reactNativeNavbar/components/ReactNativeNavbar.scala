package typingsJapgolly.reactNativeNavbar.components

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeNavbar.mod.NavigationBarButton
import typingsJapgolly.reactNativeNavbar.mod.NavigationBarProps
import typingsJapgolly.reactNativeNavbar.mod.NavigationBarTitle
import typingsJapgolly.reactNativeNavbar.mod.StatusBar
import typingsJapgolly.reactNativeNavbar.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeNavbar {
  
  @JSImport("react-native-navbar", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def leftButton(value: NavigationBarButton | Element): this.type = set("leftButton", value.asInstanceOf[js.Any])
    
    inline def leftButtonNull: this.type = set("leftButton", null)
    
    inline def leftButtonVdomElement(value: VdomElement): this.type = set("leftButton", value.rawElement.asInstanceOf[js.Any])
    
    inline def rightButton(value: NavigationBarButton | Element): this.type = set("rightButton", value.asInstanceOf[js.Any])
    
    inline def rightButtonNull: this.type = set("rightButton", null)
    
    inline def rightButtonVdomElement(value: VdomElement): this.type = set("rightButton", value.rawElement.asInstanceOf[js.Any])
    
    inline def statusBar(value: StatusBar): this.type = set("statusBar", value.asInstanceOf[js.Any])
    
    inline def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
    
    inline def title(value: NavigationBarTitle | Element): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeNavbar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NavigationBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
