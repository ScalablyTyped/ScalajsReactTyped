package typingsJapgolly.reactMdTransition.typesTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefFn
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSTransitionElementProps[E /* <: HTMLElement */] extends StObject {
  
  /**
    * The current transition class name or `undefined`.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /** {@inheritDoc TransitionHookReturnValue.ref} */
  var ref: RefFn[E]
}
object CSSTransitionElementProps {
  
  inline def apply[E /* <: HTMLElement */](ref: E | Null => Callback): CSSTransitionElementProps[E] = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1((t0: E | Null) => ref(t0).runNow()))
    __obj.asInstanceOf[CSSTransitionElementProps[E]]
  }
  
  extension [Self <: CSSTransitionElementProps[?], E /* <: HTMLElement */](x: Self & CSSTransitionElementProps[E]) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setRef(value: E | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: E | Null) => value(t0).runNow()))
  }
}
