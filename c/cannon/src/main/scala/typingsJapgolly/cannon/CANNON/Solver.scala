package typingsJapgolly.cannon.CANNON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Solver extends StObject {
  
  def addEquation(eq: Equation): Unit
  
  var equations: js.Array[Equation]
  
  var iterations: Double
  
  def removeAllEquations(): Unit
  
  def removeEquation(eq: Equation): Unit
  
  def solve(dy: Double, world: World): Double
}
object Solver {
  
  inline def apply(
    addEquation: Equation => Callback,
    equations: js.Array[Equation],
    iterations: Double,
    removeAllEquations: Callback,
    removeEquation: Equation => Callback,
    solve: (Double, World) => Double
  ): Solver = {
    val __obj = js.Dynamic.literal(addEquation = js.Any.fromFunction1((t0: Equation) => addEquation(t0).runNow()), equations = equations.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], removeAllEquations = removeAllEquations.toJsFn, removeEquation = js.Any.fromFunction1((t0: Equation) => removeEquation(t0).runNow()), solve = js.Any.fromFunction2(solve))
    __obj.asInstanceOf[Solver]
  }
  
  extension [Self <: Solver](x: Self) {
    
    inline def setAddEquation(value: Equation => Callback): Self = StObject.set(x, "addEquation", js.Any.fromFunction1((t0: Equation) => value(t0).runNow()))
    
    inline def setEquations(value: js.Array[Equation]): Self = StObject.set(x, "equations", value.asInstanceOf[js.Any])
    
    inline def setEquationsVarargs(value: Equation*): Self = StObject.set(x, "equations", js.Array(value*))
    
    inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllEquations(value: Callback): Self = StObject.set(x, "removeAllEquations", value.toJsFn)
    
    inline def setRemoveEquation(value: Equation => Callback): Self = StObject.set(x, "removeEquation", js.Any.fromFunction1((t0: Equation) => value(t0).runNow()))
    
    inline def setSolve(value: (Double, World) => Double): Self = StObject.set(x, "solve", js.Any.fromFunction2(value))
  }
}
