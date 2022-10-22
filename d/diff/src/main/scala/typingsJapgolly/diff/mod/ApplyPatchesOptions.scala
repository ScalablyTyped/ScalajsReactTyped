package typingsJapgolly.diff.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyPatchesOptions
  extends StObject
     with ApplyPatchOptions {
  
  def complete(err: Any): Unit
  
  def loadFile(index: ParsedDiff, callback: js.Function2[/* err */ Any, /* data */ String, Unit]): Unit
  
  def patched(index: ParsedDiff, content: String, callback: js.Function1[/* err */ Any, Unit]): Unit
}
object ApplyPatchesOptions {
  
  inline def apply(
    complete: Any => japgolly.scalajs.react.Callback,
    loadFile: (ParsedDiff, js.Function2[/* err */ Any, /* data */ String, Unit]) => japgolly.scalajs.react.Callback,
    patched: (ParsedDiff, String, js.Function1[/* err */ Any, Unit]) => japgolly.scalajs.react.Callback
  ): ApplyPatchesOptions = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1((t0: Any) => complete(t0).runNow()), loadFile = js.Any.fromFunction2((t0: ParsedDiff, t1: js.Function2[/* err */ Any, /* data */ String, Unit]) => (loadFile(t0, t1)).runNow()), patched = js.Any.fromFunction3((t0: ParsedDiff, t1: String, t2: js.Function1[/* err */ Any, Unit]) => (patched(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[ApplyPatchesOptions]
  }
  
  extension [Self <: ApplyPatchesOptions](x: Self) {
    
    inline def setComplete(value: Any => japgolly.scalajs.react.Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setLoadFile(
      value: (ParsedDiff, js.Function2[/* err */ Any, /* data */ String, Unit]) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "loadFile", js.Any.fromFunction2((t0: ParsedDiff, t1: js.Function2[/* err */ Any, /* data */ String, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setPatched(value: (ParsedDiff, String, js.Function1[/* err */ Any, Unit]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "patched", js.Any.fromFunction3((t0: ParsedDiff, t1: String, t2: js.Function1[/* err */ Any, Unit]) => (value(t0, t1, t2)).runNow()))
  }
}
