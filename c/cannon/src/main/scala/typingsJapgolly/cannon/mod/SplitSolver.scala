package typingsJapgolly.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "SplitSolver")
@js.native
open class SplitSolver protected ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.SplitSolver {
  def this(subsolver: typingsJapgolly.cannon.CANNON.Solver) = this()
  
  /* CompleteClass */
  override def addEquation(eq: typingsJapgolly.cannon.CANNON.Equation): Unit = js.native
  
  /* CompleteClass */
  var equations: js.Array[typingsJapgolly.cannon.CANNON.Equation] = js.native
  
  /* CompleteClass */
  var iterations: Double = js.native
  
  /* CompleteClass */
  override def removeAllEquations(): Unit = js.native
  
  /* CompleteClass */
  override def removeEquation(eq: typingsJapgolly.cannon.CANNON.Equation): Unit = js.native
  
  /* CompleteClass */
  override def solve(dy: Double, world: typingsJapgolly.cannon.CANNON.World): Double = js.native
  
  /* CompleteClass */
  var subsolver: typingsJapgolly.cannon.CANNON.Solver = js.native
}
