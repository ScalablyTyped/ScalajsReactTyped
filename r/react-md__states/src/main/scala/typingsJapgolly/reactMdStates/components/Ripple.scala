package typingsJapgolly.reactMdStates.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMdStates.typesRipplesRippleMod.RippleProps
import typingsJapgolly.reactMdStates.typesRipplesTypesMod.RippleState
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ripple {
  
  inline def apply(entered: RippleState => Callback, exited: RippleState => Callback, ripple: RippleState): Builder = {
    val __props = js.Dynamic.literal(entered = js.Any.fromFunction1((t0: RippleState) => entered(t0).runNow()), exited = js.Any.fromFunction1((t0: RippleState) => exited(t0).runNow()), ripple = ripple.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RippleProps]))
  }
  
  @JSImport("@react-md/states/types/ripples/Ripple", "Ripple")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classNames(value: CSSTransitionClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
    
    inline def timeout(value: TransitionTimeout): this.type = set("timeout", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RippleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
