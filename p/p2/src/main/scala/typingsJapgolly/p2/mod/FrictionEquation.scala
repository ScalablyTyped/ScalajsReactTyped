package typingsJapgolly.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "FrictionEquation")
@js.native
open class FrictionEquation protected () extends Equation {
  def this(bodyA: Body, bodyB: Body, slipForce: Double) = this()
  
  var contactEquations: js.Array[ContactEquation] = js.native
  
  var contactPointA: js.Tuple2[Double, Double] = js.native
  
  var contactPointB: js.Tuple2[Double, Double] = js.native
  
  var frictionCoefficient: Double = js.native
  
  def getSlipForce(): Double = js.native
  
  def setSlipForce(slipForce: Double): Unit = js.native
  
  var shapeA: Shape = js.native
  
  var shapeB: Shape = js.native
  
  var t: js.Tuple2[Double, Double] = js.native
}
