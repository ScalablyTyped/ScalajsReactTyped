package typingsJapgolly.puppeteerCore

import org.scalajs.dom.Node
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonElementHandleMod.ElementHandle
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonIsolatedWorldMod.IsolatedWorld
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonTypesMod.HandleFor
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.mutation
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.raf
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerCommonWaitTaskMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/WaitTask", "TaskManager")
  @js.native
  open class TaskManager () extends StObject {
    
    def add(task: WaitTask[Any]): Unit = js.native
    
    def delete(task: WaitTask[Any]): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    def rerunAll(): js.Promise[Unit] = js.native
    
    def terminateAll(): Unit = js.native
    def terminateAll(error: js.Error): Unit = js.native
  }
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/WaitTask", "WaitTask")
  @js.native
  open class WaitTask[T] protected () extends StObject {
    def this(world: IsolatedWorld, options: WaitTaskOptions, fn: String, args: Any*) = this()
    def this(
      world: IsolatedWorld,
      options: WaitTaskOptions,
      fn: js.Function1[/* repeated */ Any, js.Promise[T]],
      args: Any*
    ) = this()
    
    /**
      * Not all errors lead to termination. They usually imply we need to rerun the task.
      */
    def getBadError(error: Any): Any = js.native
    
    /* private */ var `private`: Any = js.native
    
    def rerun(): js.Promise[Unit] = js.native
    
    def result: js.Promise[HandleFor[T]] = js.native
    
    def terminate(): js.Promise[Unit] = js.native
    def terminate(error: Any): js.Promise[Unit] = js.native
  }
  
  trait WaitTaskOptions extends StObject {
    
    var bindings: js.UndefOr[Map[String, js.Function1[/* repeated */ scala.Nothing, Any]]] = js.undefined
    
    var polling: raf | mutation | Double
    
    var root: js.UndefOr[ElementHandle[Node]] = js.undefined
    
    var timeout: Double
  }
  object WaitTaskOptions {
    
    inline def apply(polling: raf | mutation | Double, timeout: Double): WaitTaskOptions = {
      val __obj = js.Dynamic.literal(polling = polling.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaitTaskOptions]
    }
    
    extension [Self <: WaitTaskOptions](x: Self) {
      
      inline def setBindings(value: Map[String, js.Function1[/* repeated */ scala.Nothing, Any]]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
      
      inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
      
      inline def setPolling(value: raf | mutation | Double): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: ElementHandle[Node]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
