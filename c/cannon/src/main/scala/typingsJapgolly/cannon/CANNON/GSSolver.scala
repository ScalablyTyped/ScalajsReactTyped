package typingsJapgolly.cannon.CANNON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GSSolver
  extends StObject
     with Solver {
  
  var tolerance: Double
}
object GSSolver {
  
  inline def apply(
    addEquation: Equation => Callback,
    equations: js.Array[Equation],
    iterations: Double,
    removeAllEquations: Callback,
    removeEquation: Equation => Callback,
    solve: (Double, World) => Double,
    tolerance: Double
  ): GSSolver = {
    val __obj = js.Dynamic.literal(addEquation = js.Any.fromFunction1((t0: Equation) => addEquation(t0).runNow()), equations = equations.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], removeAllEquations = removeAllEquations.toJsFn, removeEquation = js.Any.fromFunction1((t0: Equation) => removeEquation(t0).runNow()), solve = js.Any.fromFunction2(solve), tolerance = tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[GSSolver]
  }
  
  extension [Self <: GSSolver](x: Self) {
    
    inline def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
  }
}
