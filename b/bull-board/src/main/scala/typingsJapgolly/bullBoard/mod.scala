package typingsJapgolly.bullBoard

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bull.mod.Queue
import typingsJapgolly.bull.mod.QueueOptions
import typingsJapgolly.express.mod.Express
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("bull-board", JSImport.Namespace)
  @js.native
  val ^ : Options = js.native
  
  trait CreateQueue extends StObject {
    
    def add(name: String, opts: QueueOptions): Queue[Any]
  }
  object CreateQueue {
    
    inline def apply(add: (String, QueueOptions) => Queue[Any]): CreateQueue = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add))
      __obj.asInstanceOf[CreateQueue]
    }
    
    extension [Self <: CreateQueue](x: Self) {
      
      inline def setAdd(value: (String, QueueOptions) => Queue[Any]): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    def UI(): Express = js.native
    
    def createQueues(redisURL: String): CreateQueue = js.native
    
    def setQueues(bullQueues: js.Array[Queue[Any]]): Queue[Any] = js.native
    def setQueues(bullQueues: Queue[Any]): Queue[Any] = js.native
  }
  
  type _To = Options
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Options = ^
}
