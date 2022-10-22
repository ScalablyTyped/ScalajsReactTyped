package typingsJapgolly.papaparse.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseLocalConfigStep[T, TInput]
  extends StObject
     with ParseLocalConfigBase[T, TInput]
     with ParseLocalConfig[T, TInput] {
  
  /** @inheritdoc */
  @JSName("step")
  def step_MParseLocalConfigStep(results: ParseStepResult[T], parser: Parser): Unit
}
object ParseLocalConfigStep {
  
  inline def apply[T, TInput](step: (ParseStepResult[T], Parser) => Callback): ParseLocalConfigStep[T, TInput] = {
    val __obj = js.Dynamic.literal(step = js.Any.fromFunction2((t0: ParseStepResult[T], t1: Parser) => (step(t0, t1)).runNow()))
    __obj.asInstanceOf[ParseLocalConfigStep[T, TInput]]
  }
  
  extension [Self <: ParseLocalConfigStep[?, ?], T, TInput](x: Self & (ParseLocalConfigStep[T, TInput])) {
    
    inline def setStep(value: (ParseStepResult[T], Parser) => Callback): Self = StObject.set(x, "step", js.Any.fromFunction2((t0: ParseStepResult[T], t1: Parser) => (value(t0, t1)).runNow()))
  }
}
