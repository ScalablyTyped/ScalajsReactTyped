package typingsJapgolly.victoryCore.anon

import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react.react.SyntheticEvent<std.Element, std.Event>, 'target'> & std.Partial<std.Pick<react.react.SyntheticEvent<std.Element, std.Event>, 'nativeEvent'>> */
trait PickSyntheticEventElement extends StObject {
  
  var nativeEvent: js.UndefOr[Event] = js.undefined
  
  var target: EventTarget
}
object PickSyntheticEventElement {
  
  inline def apply(target: EventTarget): PickSyntheticEventElement = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickSyntheticEventElement]
  }
  
  extension [Self <: PickSyntheticEventElement](x: Self) {
    
    inline def setNativeEvent(value: Event): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    
    inline def setNativeEventUndefined: Self = StObject.set(x, "nativeEvent", js.undefined)
    
    inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
