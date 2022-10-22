package typingsJapgolly.papaparse.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseLocalConfigNoStep[T, TInput]
  extends StObject
     with ParseLocalConfigBase[T, TInput]
     with ParseLocalConfig[T, TInput] {
  
  /** @inheritdoc */
  @JSName("complete")
  def complete_MParseLocalConfigNoStep(results: ParseResult[T], file: TInput): Unit
}
object ParseLocalConfigNoStep {
  
  inline def apply[T, TInput](complete: (ParseResult[T], TInput) => Callback): ParseLocalConfigNoStep[T, TInput] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction2((t0: ParseResult[T], t1: TInput) => (complete(t0, t1)).runNow()))
    __obj.asInstanceOf[ParseLocalConfigNoStep[T, TInput]]
  }
  
  extension [Self <: ParseLocalConfigNoStep[?, ?], T, TInput](x: Self & (ParseLocalConfigNoStep[T, TInput])) {
    
    inline def setComplete(value: (ParseResult[T], TInput) => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction2((t0: ParseResult[T], t1: TInput) => (value(t0, t1)).runNow()))
  }
}
