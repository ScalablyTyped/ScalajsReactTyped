package typingsJapgolly.reactMdTransition

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionComponentImplementation
import typingsJapgolly.reactMdTransition.typesUseCrossFadeTransitionMod.CrossFadeTransitionHookOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCrossFadeMod {
  
  @JSImport("@react-md/transition/types/CrossFade", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CrossFade[E /* <: HTMLElement */](hasAppearTransitionInChildrenClassNameOptions: CrossFadeProps[E]): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("CrossFade")(hasAppearTransitionInChildrenClassNameOptions.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  trait CrossFadeProps[E /* <: HTMLElement */]
    extends StObject
       with CrossFadeTransitionHookOptions[E]
       with CSSTransitionComponentImplementation[E]
  object CrossFadeProps {
    
    inline def apply[E /* <: HTMLElement */](children: VdomElement): CrossFadeProps[E] = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[CrossFadeProps[E]]
    }
  }
}
