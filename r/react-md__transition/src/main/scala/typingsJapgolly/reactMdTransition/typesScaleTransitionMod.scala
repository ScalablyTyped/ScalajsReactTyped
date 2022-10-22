package typingsJapgolly.reactMdTransition

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactMdPortal.typesConditionalPortalMod.RenderConditionalPortalProps
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionComponentImplementation
import typingsJapgolly.reactMdTransition.typesUseScaleTransitionMod.ScaleTransitionHookOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesScaleTransitionMod {
  
  @JSImport("@react-md/transition/types/ScaleTransition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ScaleTransition[E /* <: HTMLElement */](hasPortalPortalIntoPortalIntoIdChildrenClassNameOptions: ScaleTransitionProps[E]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ScaleTransition")(hasPortalPortalIntoPortalIntoIdChildrenClassNameOptions.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ScaleTransitionProps[E /* <: HTMLElement */]
    extends StObject
       with CSSTransitionComponentImplementation[E]
       with RenderConditionalPortalProps
       with ScaleTransitionHookOptions[E]
  object ScaleTransitionProps {
    
    inline def apply[E /* <: HTMLElement */](children: VdomElement, transitionIn: Boolean): ScaleTransitionProps[E] = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], transitionIn = transitionIn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaleTransitionProps[E]]
    }
  }
}
