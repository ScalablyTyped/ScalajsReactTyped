package typingsJapgolly.papaparse.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.papaparse.mod.ParseLocalConfigStep[T, TInput]
  - typingsJapgolly.papaparse.mod.ParseLocalConfigNoStep[T, TInput]
*/
trait ParseLocalConfig[T, TInput] extends StObject
object ParseLocalConfig {
  
  inline def ParseLocalConfigNoStep[T, TInput](complete: (ParseResult[T], TInput) => Callback): typingsJapgolly.papaparse.mod.ParseLocalConfigNoStep[T, TInput] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction2((t0: ParseResult[T], t1: TInput) => (complete(t0, t1)).runNow()))
    __obj.asInstanceOf[typingsJapgolly.papaparse.mod.ParseLocalConfigNoStep[T, TInput]]
  }
  
  inline def ParseLocalConfigStep[T, TInput](step: (ParseStepResult[T], Parser) => Callback): typingsJapgolly.papaparse.mod.ParseLocalConfigStep[T, TInput] = {
    val __obj = js.Dynamic.literal(step = js.Any.fromFunction2((t0: ParseStepResult[T], t1: Parser) => (step(t0, t1)).runNow()))
    __obj.asInstanceOf[typingsJapgolly.papaparse.mod.ParseLocalConfigStep[T, TInput]]
  }
}
