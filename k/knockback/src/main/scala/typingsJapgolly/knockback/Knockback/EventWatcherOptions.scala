package typingsJapgolly.knockback.Knockback

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventWatcherOptions extends StObject {
  
  def emitter(newEmitter: Any): Unit
  
  var event_selector: String
  
  var key: js.UndefOr[String] = js.undefined
  
  def update(newValue: Any): Unit
}
object EventWatcherOptions {
  
  inline def apply(emitter: Any => Callback, event_selector: String, update: Any => Callback): EventWatcherOptions = {
    val __obj = js.Dynamic.literal(emitter = js.Any.fromFunction1((t0: Any) => emitter(t0).runNow()), event_selector = event_selector.asInstanceOf[js.Any], update = js.Any.fromFunction1((t0: Any) => update(t0).runNow()))
    __obj.asInstanceOf[EventWatcherOptions]
  }
  
  extension [Self <: EventWatcherOptions](x: Self) {
    
    inline def setEmitter(value: Any => Callback): Self = StObject.set(x, "emitter", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setEvent_selector(value: String): Self = StObject.set(x, "event_selector", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setUpdate(value: Any => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
