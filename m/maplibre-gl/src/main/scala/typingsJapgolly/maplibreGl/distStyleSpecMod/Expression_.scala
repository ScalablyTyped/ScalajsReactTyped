package typingsJapgolly.maplibreGl.distStyleSpecMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expression_ extends StObject {
  
  def eachChild(fn: js.Function1[/* a */ this.type, Unit]): Unit
  
  def evaluate(ctx: EvaluationContext): Any
  
  /**
  	 * Statically analyze the expression, attempting to enumerate possible outputs. Returns
  	 * false if the complete set of outputs is statically undecidable, otherwise true.
  	 */
  def outputDefined(): Boolean
  
  val `type`: Type
}
object Expression_ {
  
  inline def apply(
    eachChild: js.Function1[Expression_, Unit] => Callback,
    evaluate: EvaluationContext => Any,
    outputDefined: CallbackTo[Boolean],
    `type`: Type
  ): Expression_ = {
    val __obj = js.Dynamic.literal(eachChild = js.Any.fromFunction1((t0: js.Function1[Expression_, Unit]) => eachChild(t0).runNow()), evaluate = js.Any.fromFunction1(evaluate), outputDefined = outputDefined.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression_]
  }
  
  extension [Self <: Expression_](x: Self) {
    
    inline def setEachChild(value: js.Function1[Expression_, Unit] => Callback): Self = StObject.set(x, "eachChild", js.Any.fromFunction1((t0: js.Function1[Expression_, Unit]) => value(t0).runNow()))
    
    inline def setEvaluate(value: EvaluationContext => Any): Self = StObject.set(x, "evaluate", js.Any.fromFunction1(value))
    
    inline def setOutputDefined(value: CallbackTo[Boolean]): Self = StObject.set(x, "outputDefined", value.toJsFn)
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
