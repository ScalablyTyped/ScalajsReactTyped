package typingsJapgolly.reactMdTransition

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionComponentImplementation
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionHookOptions
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCsstransitionMod {
  
  @JSImport("@react-md/transition/types/CSSTransition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CSSTransition[E /* <: HTMLElement */](hasChildrenClassNameOptions: CSSTransitionProps[E]): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("CSSTransition")(hasChildrenClassNameOptions.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  trait CSSTransitionProps[E /* <: HTMLElement */]
    extends StObject
       with CSSTransitionHookOptions[E]
       with CSSTransitionComponentImplementation[E]
  object CSSTransitionProps {
    
    inline def apply[E /* <: HTMLElement */](
      children: VdomElement,
      classNames: CSSTransitionClassNames,
      timeout: TransitionTimeout,
      transitionIn: Boolean
    ): CSSTransitionProps[E] = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], classNames = classNames.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], transitionIn = transitionIn.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSSTransitionProps[E]]
    }
  }
}
