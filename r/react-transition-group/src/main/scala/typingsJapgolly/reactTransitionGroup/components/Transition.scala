package typingsJapgolly.reactTransitionGroup.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactTransitionGroup.anon.Appear
import typingsJapgolly.reactTransitionGroup.transitionMod.EndHandler
import typingsJapgolly.reactTransitionGroup.transitionMod.EnterHandler
import typingsJapgolly.reactTransitionGroup.transitionMod.ExitHandler
import typingsJapgolly.reactTransitionGroup.transitionMod.TransitionChildren
import typingsJapgolly.reactTransitionGroup.transitionMod.TransitionStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transition {
  
  object EndListenerProps {
    
    inline def apply[RefElement /* <: js.UndefOr[HTMLElement] */](addEndListener: EndHandler[RefElement]): Builder[RefElement] = {
      val __props = js.Dynamic.literal(addEndListener = addEndListener.asInstanceOf[js.Any])
      new Builder[RefElement](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactTransitionGroup.transitionMod.EndListenerProps[RefElement]]))
    }
    
    @JSImport("react-transition-group", "Transition")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder[RefElement /* <: js.UndefOr[HTMLElement] */] (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactTransitionGroup.mod.Transition[RefElement]] {
      
      inline def children(value: TransitionChildren): this.type = set("children", value.asInstanceOf[js.Any])
      
      inline def childrenFunction1(value: /* status */ TransitionStatus => Node): this.type = set("children", js.Any.fromFunction1(value))
      
      inline def childrenNull: this.type = set("children", null)
      
      inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
      
      inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
      
      inline def in(value: Boolean): this.type = set("in", value.asInstanceOf[js.Any])
      
      inline def mountOnEnter(value: Boolean): this.type = set("mountOnEnter", value.asInstanceOf[js.Any])
      
      inline def nodeRef(value: Ref[RefElement]): this.type = set("nodeRef", value.asInstanceOf[js.Any])
      
      inline def nodeRefFunction1(value: RefElement | Null => Callback): this.type = set("nodeRef", js.Any.fromFunction1((t0: RefElement | Null) => value(t0).runNow()))
      
      inline def nodeRefNull: this.type = set("nodeRef", null)
      
      inline def onEnter(value: EnterHandler[RefElement]): this.type = set("onEnter", value.asInstanceOf[js.Any])
      
      inline def onEntered(value: EnterHandler[RefElement]): this.type = set("onEntered", value.asInstanceOf[js.Any])
      
      inline def onEntering(value: EnterHandler[RefElement]): this.type = set("onEntering", value.asInstanceOf[js.Any])
      
      inline def onExit(value: ExitHandler[RefElement]): this.type = set("onExit", value.asInstanceOf[js.Any])
      
      inline def onExited(value: ExitHandler[RefElement]): this.type = set("onExited", value.asInstanceOf[js.Any])
      
      inline def onExiting(value: ExitHandler[RefElement]): this.type = set("onExiting", value.asInstanceOf[js.Any])
      
      inline def timeout(value: Double | Appear): this.type = set("timeout", value.asInstanceOf[js.Any])
      
      inline def unmountOnExit(value: Boolean): this.type = set("unmountOnExit", value.asInstanceOf[js.Any])
    }
    
    def withProps[RefElement /* <: js.UndefOr[HTMLElement] */](p: typingsJapgolly.reactTransitionGroup.transitionMod.EndListenerProps[RefElement]): Builder[RefElement] = new Builder[RefElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object TimeoutProps {
    
    inline def apply[RefElement /* <: js.UndefOr[HTMLElement] */](timeout: Double | Appear): Builder[RefElement] = {
      val __props = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
      new Builder[RefElement](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactTransitionGroup.transitionMod.TimeoutProps[RefElement]]))
    }
    
    @JSImport("react-transition-group", "Transition")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder[RefElement /* <: js.UndefOr[HTMLElement] */] (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactTransitionGroup.mod.Transition[RefElement]] {
      
      inline def addEndListener(value: EndHandler[RefElement]): this.type = set("addEndListener", value.asInstanceOf[js.Any])
      
      inline def children(value: TransitionChildren): this.type = set("children", value.asInstanceOf[js.Any])
      
      inline def childrenFunction1(value: /* status */ TransitionStatus => Node): this.type = set("children", js.Any.fromFunction1(value))
      
      inline def childrenNull: this.type = set("children", null)
      
      inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
      
      inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
      
      inline def in(value: Boolean): this.type = set("in", value.asInstanceOf[js.Any])
      
      inline def mountOnEnter(value: Boolean): this.type = set("mountOnEnter", value.asInstanceOf[js.Any])
      
      inline def nodeRef(value: Ref[RefElement]): this.type = set("nodeRef", value.asInstanceOf[js.Any])
      
      inline def nodeRefFunction1(value: RefElement | Null => Callback): this.type = set("nodeRef", js.Any.fromFunction1((t0: RefElement | Null) => value(t0).runNow()))
      
      inline def nodeRefNull: this.type = set("nodeRef", null)
      
      inline def onEnter(value: EnterHandler[RefElement]): this.type = set("onEnter", value.asInstanceOf[js.Any])
      
      inline def onEntered(value: EnterHandler[RefElement]): this.type = set("onEntered", value.asInstanceOf[js.Any])
      
      inline def onEntering(value: EnterHandler[RefElement]): this.type = set("onEntering", value.asInstanceOf[js.Any])
      
      inline def onExit(value: ExitHandler[RefElement]): this.type = set("onExit", value.asInstanceOf[js.Any])
      
      inline def onExited(value: ExitHandler[RefElement]): this.type = set("onExited", value.asInstanceOf[js.Any])
      
      inline def onExiting(value: ExitHandler[RefElement]): this.type = set("onExiting", value.asInstanceOf[js.Any])
      
      inline def unmountOnExit(value: Boolean): this.type = set("unmountOnExit", value.asInstanceOf[js.Any])
    }
    
    def withProps[RefElement /* <: js.UndefOr[HTMLElement] */](p: typingsJapgolly.reactTransitionGroup.transitionMod.TimeoutProps[RefElement]): Builder[RefElement] = new Builder[RefElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
