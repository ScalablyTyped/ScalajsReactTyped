package typingsJapgolly.angularCompilerCli.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstCompileResult extends StObject {
  
  def close(): Unit
  
  var firstCompileResult: js.Array[Diagnostic]
  
  def ready(cb: js.Function0[Unit]): Unit
}
object FirstCompileResult {
  
  inline def apply(close: Callback, firstCompileResult: js.Array[Diagnostic], ready: js.Function0[Unit] => Callback): FirstCompileResult = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, firstCompileResult = firstCompileResult.asInstanceOf[js.Any], ready = js.Any.fromFunction1((t0: js.Function0[Unit]) => ready(t0).runNow()))
    __obj.asInstanceOf[FirstCompileResult]
  }
  
  extension [Self <: FirstCompileResult](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setFirstCompileResult(value: js.Array[Diagnostic]): Self = StObject.set(x, "firstCompileResult", value.asInstanceOf[js.Any])
    
    inline def setFirstCompileResultVarargs(value: Diagnostic*): Self = StObject.set(x, "firstCompileResult", js.Array(value*))
    
    inline def setReady(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "ready", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
  }
}
