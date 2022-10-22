package typingsJapgolly.puppeteerCore.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonEventEmitterMod.CommonEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emitter extends StObject {
  
  var emitter: CommonEventEmitter
  
  var eventName: String | js.Symbol
  
  def handler(args: Any*): Unit
}
object Emitter {
  
  inline def apply(
    emitter: CommonEventEmitter,
    eventName: String | js.Symbol,
    handler: /* repeated */ Any => Callback
  ): Emitter = {
    val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], handler = js.Any.fromFunction1((t0: /* repeated */ Any) => handler(t0).runNow()))
    __obj.asInstanceOf[Emitter]
  }
  
  extension [Self <: Emitter](x: Self) {
    
    inline def setEmitter(value: CommonEventEmitter): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
    
    inline def setEventName(value: String | js.Symbol): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setHandler(value: /* repeated */ Any => Callback): Self = StObject.set(x, "handler", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
  }
}
