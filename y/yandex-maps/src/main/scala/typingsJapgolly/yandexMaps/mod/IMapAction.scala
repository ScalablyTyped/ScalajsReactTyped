package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.yandexMaps.mod.map.action.Manager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMapAction
  extends StObject
     with IEventEmitter {
  
  def begin(mapActionManager: Manager): Unit
  
  def end(): Unit
}
object IMapAction {
  
  inline def apply(begin: Manager => Callback, end: Callback, events: IEventManager[js.Object]): IMapAction = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction1((t0: Manager) => begin(t0).runNow()), end = end.toJsFn, events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapAction]
  }
  
  extension [Self <: IMapAction](x: Self) {
    
    inline def setBegin(value: Manager => Callback): Self = StObject.set(x, "begin", js.Any.fromFunction1((t0: Manager) => value(t0).runNow()))
    
    inline def setEnd(value: Callback): Self = StObject.set(x, "end", value.toJsFn)
  }
}
