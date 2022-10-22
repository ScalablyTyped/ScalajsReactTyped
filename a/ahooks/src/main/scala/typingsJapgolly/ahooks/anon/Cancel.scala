package typingsJapgolly.ahooks.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ahooks.libUseDebounceFnMod.noop
import typingsJapgolly.lodash.mod.DebouncedFunc
import typingsJapgolly.std.Parameters
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancel[T /* <: noop */] extends StObject {
  
  def cancel(): Unit
  
  def flush(): js.UndefOr[ReturnType[T]]
  
  var run: DebouncedFunc[js.Function1[/* args */ Parameters[T], ReturnType[T]]]
}
object Cancel {
  
  inline def apply[T /* <: noop */](
    cancel: Callback,
    flush: CallbackTo[js.UndefOr[ReturnType[T]]],
    run: DebouncedFunc[js.Function1[/* args */ Parameters[T], ReturnType[T]]]
  ): Cancel[T] = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, flush = flush.toJsFn, run = run.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel[T]]
  }
  
  extension [Self <: Cancel[?], T /* <: noop */](x: Self & Cancel[T]) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setFlush(value: CallbackTo[js.UndefOr[ReturnType[T]]]): Self = StObject.set(x, "flush", value.toJsFn)
    
    inline def setRun(value: DebouncedFunc[js.Function1[/* args */ Parameters[T], ReturnType[T]]]): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
  }
}
