package typingsJapgolly.cannon.CANNON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitSolver
  extends StObject
     with Solver {
  
  var subsolver: Solver
}
object SplitSolver {
  
  inline def apply(
    addEquation: Equation => Callback,
    equations: js.Array[Equation],
    iterations: Double,
    removeAllEquations: Callback,
    removeEquation: Equation => Callback,
    solve: (Double, World) => Double,
    subsolver: Solver
  ): SplitSolver = {
    val __obj = js.Dynamic.literal(addEquation = js.Any.fromFunction1((t0: Equation) => addEquation(t0).runNow()), equations = equations.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], removeAllEquations = removeAllEquations.toJsFn, removeEquation = js.Any.fromFunction1((t0: Equation) => removeEquation(t0).runNow()), solve = js.Any.fromFunction2(solve), subsolver = subsolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitSolver]
  }
  
  extension [Self <: SplitSolver](x: Self) {
    
    inline def setSubsolver(value: Solver): Self = StObject.set(x, "subsolver", value.asInstanceOf[js.Any])
  }
}
