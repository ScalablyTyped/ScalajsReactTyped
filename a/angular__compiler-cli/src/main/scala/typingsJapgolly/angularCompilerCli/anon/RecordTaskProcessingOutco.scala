package typingsJapgolly.angularCompilerCli.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.angularCompilerCli.ngccSrcExecutionTasksApiMod.Task
import typingsJapgolly.angularCompilerCli.ngccSrcExecutionTasksCompletionMod.TaskCompletedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<@angular/compiler-cli.@angular/compiler-cli/ngcc/src/execution/tasks/api.TaskProcessingOutcome, @angular/compiler-cli.@angular/compiler-cli/ngcc/src/execution/tasks/completion.TaskCompletedHandler> */
trait RecordTaskProcessingOutco extends StObject {
  
  def `0`(task: Task): Unit
  def `0`(task: Task, message: String): Unit
  @JSName("0")
  var `0_Original`: TaskCompletedHandler
  
  def `1`(task: Task): Unit
  def `1`(task: Task, message: String): Unit
  @JSName("1")
  var `1_Original`: TaskCompletedHandler
}
object RecordTaskProcessingOutco {
  
  inline def apply(
    `0`: (/* task */ Task, /* message */ String | Null) => Callback,
    `1`: (/* task */ Task, /* message */ String | Null) => Callback
  ): RecordTaskProcessingOutco = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(js.Any.fromFunction2((t0: /* task */ Task, t1: /* message */ String | Null) => (`0`(t0, t1)).runNow()))
    __obj.updateDynamic("1")(js.Any.fromFunction2((t0: /* task */ Task, t1: /* message */ String | Null) => (`1`(t0, t1)).runNow()))
    __obj.asInstanceOf[RecordTaskProcessingOutco]
  }
  
  extension [Self <: RecordTaskProcessingOutco](x: Self) {
    
    inline def set0(value: (/* task */ Task, /* message */ String | Null) => Callback): Self = StObject.set(x, "0", js.Any.fromFunction2((t0: /* task */ Task, t1: /* message */ String | Null) => (value(t0, t1)).runNow()))
    
    inline def set1(value: (/* task */ Task, /* message */ String | Null) => Callback): Self = StObject.set(x, "1", js.Any.fromFunction2((t0: /* task */ Task, t1: /* message */ String | Null) => (value(t0, t1)).runNow()))
  }
}
