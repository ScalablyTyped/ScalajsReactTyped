package typingsJapgolly.reactRouterTransition.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMotion.mod.TransitionStyle
import typingsJapgolly.reactRouterTransition.mod.AnimatableStyles
import typingsJapgolly.reactRouterTransition.mod.AnimatedSwitchProps
import typingsJapgolly.reactRouterTransition.mod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AnimatedSwitch {
  
  inline def apply(atActive: AnimatableStyles, atEnter: Styles, atLeave: AnimatableStyles): Builder = {
    val __props = js.Dynamic.literal(atActive = atActive.asInstanceOf[js.Any], atEnter = atEnter.asInstanceOf[js.Any], atLeave = atLeave.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AnimatedSwitchProps]))
  }
  
  @JSImport("react-router-transition", "AnimatedSwitch")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactRouterTransition.mod.AnimatedSwitch] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def didLeave(value: /* styleThatLeft */ TransitionStyle => Callback): this.type = set("didLeave", js.Any.fromFunction1((t0: /* styleThatLeft */ TransitionStyle) => value(t0).runNow()))
    
    inline def mapStyles(value: /* originalStylesObject */ Any => AnimatableStyles): this.type = set("mapStyles", js.Any.fromFunction1(value))
    
    inline def runOnMount(value: Boolean): this.type = set("runOnMount", value.asInstanceOf[js.Any])
    
    inline def wrapperComponent(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 114, starting with typingsJapgolly.reactRouterTransition.reactRouterTransitionBooleans.`false`, typingsJapgolly.reactRouterTransition.reactRouterTransitionStrings.a, typingsJapgolly.reactRouterTransition.reactRouterTransitionStrings.abbr */ Any
    ): this.type = set("wrapperComponent", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AnimatedSwitchProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
