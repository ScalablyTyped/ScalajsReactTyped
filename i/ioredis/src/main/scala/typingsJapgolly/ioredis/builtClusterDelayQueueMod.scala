package typingsJapgolly.ioredis

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtClusterDelayQueueMod {
  
  @JSImport("ioredis/built/cluster/DelayQueue", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with DelayQueue {
    
    /* private */ /* CompleteClass */
    var execute: Any = js.native
    
    /**
      * Add a new item to the queue
      *
      * @param bucket bucket name
      * @param item function that will run later
      * @param options
      */
    /* CompleteClass */
    override def push(bucket: String, item: js.Function, options: DelayQueueOptions): Unit = js.native
    
    /* private */ /* CompleteClass */
    var queues: Any = js.native
    
    /* private */ /* CompleteClass */
    var timeouts: Any = js.native
  }
  
  trait DelayQueue extends StObject {
    
    /* private */ var execute: Any
    
    /**
      * Add a new item to the queue
      *
      * @param bucket bucket name
      * @param item function that will run later
      * @param options
      */
    def push(bucket: String, item: js.Function, options: DelayQueueOptions): Unit
    
    /* private */ var queues: Any
    
    /* private */ var timeouts: Any
  }
  object DelayQueue {
    
    inline def apply(
      execute: Any,
      push: (String, js.Function, DelayQueueOptions) => Callback,
      queues: Any,
      timeouts: Any
    ): DelayQueue = {
      val __obj = js.Dynamic.literal(execute = execute.asInstanceOf[js.Any], push = js.Any.fromFunction3((t0: String, t1: js.Function, t2: DelayQueueOptions) => (push(t0, t1, t2)).runNow()), queues = queues.asInstanceOf[js.Any], timeouts = timeouts.asInstanceOf[js.Any])
      __obj.asInstanceOf[DelayQueue]
    }
    
    extension [Self <: DelayQueue](x: Self) {
      
      inline def setExecute(value: Any): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
      
      inline def setPush(value: (String, js.Function, DelayQueueOptions) => Callback): Self = StObject.set(x, "push", js.Any.fromFunction3((t0: String, t1: js.Function, t2: DelayQueueOptions) => (value(t0, t1, t2)).runNow()))
      
      inline def setQueues(value: Any): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
      
      inline def setTimeouts(value: Any): Self = StObject.set(x, "timeouts", value.asInstanceOf[js.Any])
    }
  }
  
  trait DelayQueueOptions extends StObject {
    
    var callback: js.UndefOr[js.Function] = js.undefined
    
    var timeout: Double
  }
  object DelayQueueOptions {
    
    inline def apply(timeout: Double): DelayQueueOptions = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[DelayQueueOptions]
    }
    
    extension [Self <: DelayQueueOptions](x: Self) {
      
      inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
