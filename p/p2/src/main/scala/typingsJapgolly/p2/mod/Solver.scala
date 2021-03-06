package typingsJapgolly.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Solver")
@js.native
class Solver () extends EventEmitter {
  def this(options: js.Object) = this()
  def this(options: js.Object, `type`: Double) = this()
  var equationSortFunction: Equation | Boolean = js.native
  var equations: js.Array[Equation] = js.native
  var `type`: Double = js.native
  def addEquation(eq: Equation): Unit = js.native
  def addEquations(eqs: js.Array[Equation]): Unit = js.native
  def removeAllEquations(): Unit = js.native
  def removeEquation(eq: Equation): Unit = js.native
  def solve(dt: Double, world: World): Unit = js.native
  def solveIsland(dt: Double, island: Island): Unit = js.native
  def sortEquations(): Unit = js.native
}

/* static members */
@JSImport("p2", "Solver")
@js.native
object Solver extends js.Object {
  var GS: Double = js.native
  var ISLAND: Double = js.native
}

