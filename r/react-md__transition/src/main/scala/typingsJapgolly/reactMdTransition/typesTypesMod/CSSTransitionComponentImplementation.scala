package typingsJapgolly.reactMdTransition.typesTypesMod

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSTransitionComponentImplementation[E /* <: HTMLElement */] extends StObject {
  
  /**
    * The child element that should have a `ref` and `className` cloned into
    * using the `cloneElement` API. If the child is a custom component, you
    * **must** use `React.forwardRef` and pass both of these to a DOM element for
    * the transition to work.
    */
  var children: Element
}
object CSSTransitionComponentImplementation {
  
  inline def apply[E /* <: HTMLElement */](children: VdomElement): CSSTransitionComponentImplementation[E] = {
    val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSTransitionComponentImplementation[E]]
  }
  
  extension [Self <: CSSTransitionComponentImplementation[?], E /* <: HTMLElement */](x: Self & CSSTransitionComponentImplementation[E]) {
    
    inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
  }
}
