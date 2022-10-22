package typingsJapgolly.reactRouterNavigation.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactRouter.distLibComponentsMod.RouterProps
import typingsJapgolly.reactRouterNavigation.mod.CardProps
import typingsJapgolly.reactRouterNavigation.mod.CardSubViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Card {
  
  @JSImport("react-router-navigation", "Card")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def backButtonTintColor(value: String): this.type = set("backButtonTintColor", value.asInstanceOf[js.Any])
    
    inline def backButtonTitle(value: String): this.type = set("backButtonTitle", value.asInstanceOf[js.Any])
    
    inline def children(value: (js.Function1[/* props */ RouterProps, Node]) | Node): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* props */ RouterProps => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def component(value: ComponentClassP[RouterProps & js.Object]): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def exact(value: Boolean): this.type = set("exact", value.asInstanceOf[js.Any])
    
    inline def hideBackButton(value: Boolean): this.type = set("hideBackButton", value.asInstanceOf[js.Any])
    
    inline def hideNavBar(value: Boolean): this.type = set("hideNavBar", value.asInstanceOf[js.Any])
    
    inline def navBarStyle(value: StyleProp[ViewStyle]): this.type = set("navBarStyle", value.asInstanceOf[js.Any])
    
    inline def navBarStyleNull: this.type = set("navBarStyle", null)
    
    inline def path(value: String): this.type = set("path", value.asInstanceOf[js.Any])
    
    inline def render(value: /* props */ RouterProps => Node): this.type = set("render", js.Any.fromFunction1(value))
    
    inline def renderLeftButton(value: /* props */ CardSubViewProps => Node): this.type = set("renderLeftButton", js.Any.fromFunction1(value))
    
    inline def renderNavBar(value: /* props */ CardSubViewProps => Node): this.type = set("renderNavBar", js.Any.fromFunction1(value))
    
    inline def renderRightButton(value: /* props */ CardSubViewProps => Node): this.type = set("renderRightButton", js.Any.fromFunction1(value))
    
    inline def renderTitle(value: /* props */ CardSubViewProps => Node): this.type = set("renderTitle", js.Any.fromFunction1(value))
    
    inline def strict(value: Boolean): this.type = set("strict", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleStyle(value: StyleProp[TextStyle]): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    
    inline def titleStyleNull: this.type = set("titleStyle", null)
  }
  
  implicit def make(companion: Card.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
