package typingsJapgolly.reactMdTransition.typesTypesMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FixedPositioningTransitionOptions[E /* <: HTMLElement */]
  extends StObject
     with FixedPositioningTransitionCallbacks {
  
  /** {@inheritDoc TransitionOptions.nodeRef} */
  var nodeRef: js.UndefOr[Ref[E]] = js.undefined
}
object FixedPositioningTransitionOptions {
  
  inline def apply[E /* <: HTMLElement */](): FixedPositioningTransitionOptions[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedPositioningTransitionOptions[E]]
  }
  
  extension [Self <: FixedPositioningTransitionOptions[?], E /* <: HTMLElement */](x: Self & FixedPositioningTransitionOptions[E]) {
    
    inline def setNodeRef(value: Ref[E]): Self = StObject.set(x, "nodeRef", value.asInstanceOf[js.Any])
    
    inline def setNodeRefFunction1(value: E | Null => Callback): Self = StObject.set(x, "nodeRef", js.Any.fromFunction1((t0: E | Null) => value(t0).runNow()))
    
    inline def setNodeRefNull: Self = StObject.set(x, "nodeRef", null)
    
    inline def setNodeRefUndefined: Self = StObject.set(x, "nodeRef", js.undefined)
  }
}
