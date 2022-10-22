package typingsJapgolly.react.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusEvent[Target, RelatedTarget]
  extends StObject
     with BaseSyntheticEvent[org.scalajs.dom.FocusEvent, EventTarget & Target, EventTarget] {
  
  var relatedTarget: (EventTarget & RelatedTarget) | Null
  
  @JSName("target")
  var target_FocusEvent: EventTarget & Target
}
object FocusEvent {
  
  inline def apply[Target, RelatedTarget](
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: EventTarget & Target,
    defaultPrevented: Boolean,
    eventPhase: Double,
    isDefaultPrevented: CallbackTo[Boolean],
    isPropagationStopped: CallbackTo[Boolean],
    isTrusted: Boolean,
    nativeEvent: org.scalajs.dom.FocusEvent,
    persist: Callback,
    preventDefault: Callback,
    stopPropagation: Callback,
    target: EventTarget & Target,
    timeStamp: Double,
    `type`: String
  ): FocusEvent[Target, RelatedTarget] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = isDefaultPrevented.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = persist.toJsFn, preventDefault = preventDefault.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], relatedTarget = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusEvent[Target, RelatedTarget]]
  }
  
  extension [Self <: FocusEvent[?, ?], Target, RelatedTarget](x: Self & (FocusEvent[Target, RelatedTarget])) {
    
    inline def setRelatedTarget(value: EventTarget & RelatedTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
    
    inline def setRelatedTargetNull: Self = StObject.set(x, "relatedTarget", null)
    
    inline def setTarget(value: EventTarget & Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
