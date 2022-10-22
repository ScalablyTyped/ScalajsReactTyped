package typingsJapgolly.reactRouterTransition.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMotion.mod.TransitionStyle
import typingsJapgolly.reactRouterTransition.mod.AnimatableStyles
import typingsJapgolly.reactRouterTransition.mod.AnimatedRouteProps
import typingsJapgolly.reactRouterTransition.mod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AnimatedRoute {
  
  inline def apply(atActive: AnimatableStyles, atEnter: Styles, atLeave: AnimatableStyles): Builder = {
    val __props = js.Dynamic.literal(atActive = atActive.asInstanceOf[js.Any], atEnter = atEnter.asInstanceOf[js.Any], atLeave = atLeave.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AnimatedRouteProps]))
  }
  
  @JSImport("react-router-transition", "AnimatedRoute")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactRouterTransition.mod.AnimatedRoute] {
    
    inline def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def component(value: Any): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def didLeave(value: /* styleThatLeft */ TransitionStyle => Callback): this.type = set("didLeave", js.Any.fromFunction1((t0: /* styleThatLeft */ TransitionStyle) => value(t0).runNow()))
    
    inline def exact(value: Any): this.type = set("exact", value.asInstanceOf[js.Any])
    
    inline def mapStyles(value: /* originalStylesObject */ Any => AnimatableStyles): this.type = set("mapStyles", js.Any.fromFunction1(value))
    
    inline def path(value: Any): this.type = set("path", value.asInstanceOf[js.Any])
    
    inline def render(value: Any): this.type = set("render", value.asInstanceOf[js.Any])
    
    inline def runOnMount(value: Boolean): this.type = set("runOnMount", value.asInstanceOf[js.Any])
    
    inline def sensitive(value: Any): this.type = set("sensitive", value.asInstanceOf[js.Any])
    
    inline def strict(value: Any): this.type = set("strict", value.asInstanceOf[js.Any])
    
    inline def wrapperComponent(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 114, starting with typingsJapgolly.reactRouterTransition.reactRouterTransitionBooleans.`false`, typingsJapgolly.reactRouterTransition.reactRouterTransitionStrings.a, typingsJapgolly.reactRouterTransition.reactRouterTransitionStrings.abbr */ Any
    ): this.type = set("wrapperComponent", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AnimatedRouteProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
