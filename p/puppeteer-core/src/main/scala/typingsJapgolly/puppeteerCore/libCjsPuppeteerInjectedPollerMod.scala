package typingsJapgolly.puppeteerCore

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerInjectedPollerMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/injected/Poller", "IntervalPoller")
  @js.native
  open class IntervalPoller[T] protected ()
    extends StObject
       with Poller[T] {
    def this(fn: js.Function0[js.Promise[T]], ms: Double) = this()
    
    /* private */ var `private`: Any = js.native
    
    /* CompleteClass */
    override def result(): js.Promise[T] = js.native
    
    /* CompleteClass */
    override def start(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def stop(): js.Promise[Unit] = js.native
  }
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/injected/Poller", "MutationPoller")
  @js.native
  open class MutationPoller[T] protected ()
    extends StObject
       with Poller[T] {
    def this(fn: js.Function0[js.Promise[T]], root: Node) = this()
    
    /* private */ var `private`: Any = js.native
    
    /* CompleteClass */
    override def result(): js.Promise[T] = js.native
    
    /* CompleteClass */
    override def start(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def stop(): js.Promise[Unit] = js.native
  }
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/injected/Poller", "RAFPoller")
  @js.native
  open class RAFPoller[T] protected ()
    extends StObject
       with Poller[T] {
    def this(fn: js.Function0[js.Promise[T]]) = this()
    
    /* private */ var `private`: Any = js.native
    
    /* CompleteClass */
    override def result(): js.Promise[T] = js.native
    
    /* CompleteClass */
    override def start(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def stop(): js.Promise[Unit] = js.native
  }
  
  trait Poller[T] extends StObject {
    
    def result(): js.Promise[T]
    
    def start(): js.Promise[Unit]
    
    def stop(): js.Promise[Unit]
  }
  object Poller {
    
    inline def apply[T](
      result: CallbackTo[js.Promise[T]],
      start: CallbackTo[js.Promise[Unit]],
      stop: CallbackTo[js.Promise[Unit]]
    ): Poller[T] = {
      val __obj = js.Dynamic.literal(result = result.toJsFn, start = start.toJsFn, stop = stop.toJsFn)
      __obj.asInstanceOf[Poller[T]]
    }
    
    extension [Self <: Poller[?], T](x: Self & Poller[T]) {
      
      inline def setResult(value: CallbackTo[js.Promise[T]]): Self = StObject.set(x, "result", value.toJsFn)
      
      inline def setStart(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStop(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
}
