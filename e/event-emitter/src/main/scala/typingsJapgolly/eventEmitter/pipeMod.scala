package typingsJapgolly.eventEmitter

import japgolly.scalajs.react.Callback
import typingsJapgolly.eventEmitter.mod.Emitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pipeMod {
  
  inline def apply(source: Emitter, target: Emitter): EmitterPipe = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[EmitterPipe]
  inline def apply(source: Emitter, target: Emitter, emitMethodName: String): EmitterPipe = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], emitMethodName.asInstanceOf[js.Any])).asInstanceOf[EmitterPipe]
  inline def apply(source: Emitter, target: Emitter, emitMethodName: js.Symbol): EmitterPipe = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], emitMethodName.asInstanceOf[js.Any])).asInstanceOf[EmitterPipe]
  
  @JSImport("event-emitter/pipe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait EmitterPipe extends StObject {
    
    def close(): Unit
  }
  object EmitterPipe {
    
    inline def apply(close: Callback): EmitterPipe = {
      val __obj = js.Dynamic.literal(close = close.toJsFn)
      __obj.asInstanceOf[EmitterPipe]
    }
    
    extension [Self <: EmitterPipe](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    }
  }
}
