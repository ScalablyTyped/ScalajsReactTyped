package typingsJapgolly.reactMdTransition.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactMdTransition.typesCsstransitionMod.CSSTransitionProps
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CSSTransition {
  
  inline def apply[E /* <: HTMLElement */](classNames: CSSTransitionClassNames, timeout: TransitionTimeout, transitionIn: Boolean): Builder[E] = {
    val __props = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], transitionIn = transitionIn.asInstanceOf[js.Any])
    new Builder[E](js.Array(this.component, __props.asInstanceOf[CSSTransitionProps[E]]))
  }
  
  @JSImport("@react-md/transition", "CSSTransition")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[E /* <: HTMLElement */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def appear(value: Boolean): this.type = set("appear", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def enter(value: Boolean): this.type = set("enter", value.asInstanceOf[js.Any])
    
    inline def exit(value: Boolean): this.type = set("exit", value.asInstanceOf[js.Any])
    
    inline def nodeRef(value: Ref[E]): this.type = set("nodeRef", value.asInstanceOf[js.Any])
    
    inline def nodeRefFunction1(value: E | Null => Callback): this.type = set("nodeRef", js.Any.fromFunction1((t0: E | Null) => value(t0).runNow()))
    
    inline def nodeRefNull: this.type = set("nodeRef", null)
    
    inline def onEnter(value: /* appearing */ Boolean => Callback): this.type = set("onEnter", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
    
    inline def onEntered(value: /* appearing */ Boolean => Callback): this.type = set("onEntered", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
    
    inline def onEntering(value: /* appearing */ Boolean => Callback): this.type = set("onEntering", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
    
    inline def onExit(value: Callback): this.type = set("onExit", value.toJsFn)
    
    inline def onExited(value: Callback): this.type = set("onExited", value.toJsFn)
    
    inline def onExiting(value: Callback): this.type = set("onExiting", value.toJsFn)
    
    inline def temporary(value: Boolean): this.type = set("temporary", value.asInstanceOf[js.Any])
  }
  
  def withProps[E /* <: HTMLElement */](p: CSSTransitionProps[E]): Builder[E] = new Builder[E](js.Array(this.component, p.asInstanceOf[js.Any]))
}
