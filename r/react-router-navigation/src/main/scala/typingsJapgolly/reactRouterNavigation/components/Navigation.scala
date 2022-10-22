package typingsJapgolly.reactRouterNavigation.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactRouterNavigation.mod.CardSubViewProps
import typingsJapgolly.reactRouterNavigation.mod.NavigationComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Navigation {
  
  @JSImport("react-router-navigation", "Navigation")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactRouterNavigation.mod.Navigation] {
    
    inline def backButtonTintColor(value: String): this.type = set("backButtonTintColor", value.asInstanceOf[js.Any])
    
    inline def backButtonTitle(value: String): this.type = set("backButtonTitle", value.asInstanceOf[js.Any])
    
    inline def cardStyle(value: StyleProp[ViewStyle]): this.type = set("cardStyle", value.asInstanceOf[js.Any])
    
    inline def cardStyleNull: this.type = set("cardStyle", null)
    
    inline def children(value: js.Array[Element]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenVarargs(value: Element*): this.type = set("children", js.Array(value*))
    
    inline def configureTransition(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ /* transitionProps */ Any, /* prevTransitionProps */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ Any
        ]) => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionSpec */ Any
    ): this.type = set("configureTransition", js.Any.fromFunction2(value))
    
    inline def hideBackButton(value: Boolean): this.type = set("hideBackButton", value.asInstanceOf[js.Any])
    
    inline def hideNavBar(value: Boolean): this.type = set("hideNavBar", value.asInstanceOf[js.Any])
    
    inline def navBarStyle(value: StyleProp[ViewStyle]): this.type = set("navBarStyle", value.asInstanceOf[js.Any])
    
    inline def navBarStyleNull: this.type = set("navBarStyle", null)
    
    inline def onTransitionEnd(value: /* repeated */ Any => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def onTransitionStart(value: /* repeated */ Any => Callback): this.type = set("onTransitionStart", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def renderLeftButton(value: /* props */ CardSubViewProps => Node): this.type = set("renderLeftButton", js.Any.fromFunction1(value))
    
    inline def renderNavBar(value: /* props */ CardSubViewProps => Node): this.type = set("renderNavBar", js.Any.fromFunction1(value))
    
    inline def renderRightButton(value: /* props */ CardSubViewProps => Node): this.type = set("renderRightButton", js.Any.fromFunction1(value))
    
    inline def renderTitle(value: /* props */ CardSubViewProps => Node): this.type = set("renderTitle", js.Any.fromFunction1(value))
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleStyle(value: StyleProp[TextStyle]): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    
    inline def titleStyleNull: this.type = set("titleStyle", null)
  }
  
  implicit def make(companion: Navigation.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NavigationComponentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
