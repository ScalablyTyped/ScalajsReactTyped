package typingsJapgolly.iitc.coreHooksMod.global

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventMapDataEntityInject extends StObject {
  
  def callback(ents: Any): Unit
}
object EventMapDataEntityInject {
  
  inline def apply(callback: Any => Callback): EventMapDataEntityInject = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1((t0: Any) => callback(t0).runNow()))
    __obj.asInstanceOf[EventMapDataEntityInject]
  }
  
  extension [Self <: EventMapDataEntityInject](x: Self) {
    
    inline def setCallback(value: Any => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
