package typingsJapgolly.atom

import typingsJapgolly.atom.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTaskMod {
  
  @JSImport("atom/src/task", "Task")
  @js.native
  open class Task protected () extends StObject {
    /** Creates a task. You should probably use .once */
    def this(taskPath: String) = this()
    
    /** Cancel the running task and emit an event if it was canceled. */
    def cancel(): Boolean = js.native
    
    /** Call a function when an event is emitted by the child process. */
    // tslint:disable-next-line:no-any
    def on(eventName: String, callback: js.Function1[/* param */ Any, Unit]): Disposable = js.native
    
    /**
      *  Send message to the task.
      *  Throws an error if this task has already been terminated or if sending a
      *  message to the child process fails.
      */
    // tslint:disable-next-line:no-any
    def send(): Unit = js.native
    def send(message: String): Unit = js.native
    def send(message: js.Array[Any]): Unit = js.native
    def send(message: js.Object): Unit = js.native
    def send(message: Boolean): Unit = js.native
    def send(message: Double): Unit = js.native
    
    // NOTE: this is actually the best we can do here with the REST parameter
    // for this appearing in the beginning of the parameter list, which isn't
    // aligned with the ES6 spec.
    /**
      *  Starts the task.
      *  Throws an error if this task has already been terminated or if sending a
      *  message to the child process fails.
      */
    // tslint:disable-next-line:no-any
    def start(args: Any*): Unit = js.native
    
    /**
      *  Forcefully stop the running task.
      *  No more events are emitted once this method is called.
      */
    def terminate(): Unit = js.native
  }
  /* static members */
  object Task {
    
    @JSImport("atom/src/task", "Task")
    @js.native
    val ^ : js.Any = js.native
    
    // NOTE: this is actually the best we can do here with the REST parameter for
    // this appearing in the middle of the parameter list, which isn't aligned with
    // the ES6 spec. Maybe when they rewrite it in JavaScript this will change.
    /** A helper method to easily launch and run a task once. */
    // tslint:disable-next-line:no-any
    inline def once(taskPath: String, args: Any*): Task = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(scala.List(taskPath.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Task]
  }
}
