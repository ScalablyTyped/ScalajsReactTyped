package typingsJapgolly.abstractThings

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("abstract-things/events", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with EventEmitter {
    def this(options: EventEmitterOptions) = this()
  }
  
  @js.native
  trait EventEmitter extends StObject {
    
    def emit(
      event: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Unit = js.native
    
    def emitWithContext(
      ctx: EventEmitterContext,
      eventName: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Unit = js.native
    
    def hasListeners: Boolean = js.native
    
    def off(eventName: String, listener: Listener): Unit = js.native
    
    def offAny(listener: Listener): Unit = js.native
    
    def on(eventName: String, listener: Listener): Stoppable = js.native
    
    def onAny(listener: Listener): Stoppable = js.native
    
    def once(eventName: String, listener: Listener): Stoppable = js.native
    
    def triggerListenerChange(): Unit = js.native
    
    def when(eventName: String, limit: Limit, listener: Listener): Stoppable = js.native
  }
  
  type EventEmitterContext = Any | EventEmitter
  
  trait EventEmitterOptions extends StObject {
    
    var context: EventEmitterContext
  }
  object EventEmitterOptions {
    
    inline def apply(context: EventEmitterContext): EventEmitterOptions = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventEmitterOptions]
    }
    
    extension [Self <: EventEmitterOptions](x: Self) {
      
      inline def setContext(value: EventEmitterContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
  
  type Limit = js.Function1[/* data */ Any, Unit]
  
  type Listener = js.Function1[/* args */ Any, Unit]
  
  trait Stoppable extends StObject {
    
    def stop(): Unit
  }
  object Stoppable {
    
    inline def apply(stop: Callback): Stoppable = {
      val __obj = js.Dynamic.literal(stop = stop.toJsFn)
      __obj.asInstanceOf[Stoppable]
    }
    
    extension [Self <: Stoppable](x: Self) {
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
}
