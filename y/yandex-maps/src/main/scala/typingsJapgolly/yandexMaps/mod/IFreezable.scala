package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFreezable extends StObject {
  
  var events: IEventManager[js.Object]
  
  def freeze(): IFreezable
  
  def isFrozen(): Boolean
  
  def unfreeze(): IFreezable
}
object IFreezable {
  
  inline def apply(
    events: IEventManager[js.Object],
    freeze: CallbackTo[IFreezable],
    isFrozen: CallbackTo[Boolean],
    unfreeze: CallbackTo[IFreezable]
  ): IFreezable = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], freeze = freeze.toJsFn, isFrozen = isFrozen.toJsFn, unfreeze = unfreeze.toJsFn)
    __obj.asInstanceOf[IFreezable]
  }
  
  extension [Self <: IFreezable](x: Self) {
    
    inline def setEvents(value: IEventManager[js.Object]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setFreeze(value: CallbackTo[IFreezable]): Self = StObject.set(x, "freeze", value.toJsFn)
    
    inline def setIsFrozen(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFrozen", value.toJsFn)
    
    inline def setUnfreeze(value: CallbackTo[IFreezable]): Self = StObject.set(x, "unfreeze", value.toJsFn)
  }
}
