package typingsJapgolly.reactMdTransition.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactMdTransition.typesCrossFadeMod.CrossFadeProps
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CrossFade {
  
  inline def apply[E /* <: HTMLElement */](): Builder[E] = {
    val __props = js.Dynamic.literal()
    new Builder[E](js.Array(this.component, __props.asInstanceOf[CrossFadeProps[E]]))
  }
  
  @JSImport("@react-md/transition", "CrossFade")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[E /* <: HTMLElement */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def appear(value: Boolean): this.type = set("appear", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classNames(value: CSSTransitionClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
    
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
    
    inline def timeout(value: TransitionTimeout): this.type = set("timeout", value.asInstanceOf[js.Any])
    
    inline def transitionIn(value: Boolean): this.type = set("transitionIn", value.asInstanceOf[js.Any])
  }
  
  implicit def make[E /* <: HTMLElement */](companion: CrossFade.type): Builder[E] = new Builder[E](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[E /* <: HTMLElement */](p: CrossFadeProps[E]): Builder[E] = new Builder[E](js.Array(this.component, p.asInstanceOf[js.Any]))
}
