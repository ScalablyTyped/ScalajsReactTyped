package typingsJapgolly.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "Equation")
@js.native
open class Equation protected ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.Equation {
  def this(bi: typingsJapgolly.cannon.CANNON.Body, bj: typingsJapgolly.cannon.CANNON.Body) = this()
  def this(bi: typingsJapgolly.cannon.CANNON.Body, bj: typingsJapgolly.cannon.CANNON.Body, minForce: Double) = this()
  def this(
    bi: typingsJapgolly.cannon.CANNON.Body,
    bj: typingsJapgolly.cannon.CANNON.Body,
    minForce: Double,
    maxForce: Double
  ) = this()
  def this(
    bi: typingsJapgolly.cannon.CANNON.Body,
    bj: typingsJapgolly.cannon.CANNON.Body,
    minForce: Unit,
    maxForce: Double
  ) = this()
  
  /* CompleteClass */
  var a: Double = js.native
  
  /* CompleteClass */
  override def addToWlamda(deltalambda: Double): Double = js.native
  
  /* CompleteClass */
  var b: Double = js.native
  
  /* CompleteClass */
  var bi: typingsJapgolly.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  var bj: typingsJapgolly.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  override def computeB(a: Double, b: Double, h: Double): Double = js.native
  
  /* CompleteClass */
  override def computeC(): Double = js.native
  
  /* CompleteClass */
  override def computeGW(): Double = js.native
  
  /* CompleteClass */
  override def computeGWlamda(): Double = js.native
  
  /* CompleteClass */
  override def computeGiMGt(): Double = js.native
  
  /* CompleteClass */
  override def computeGiMf(): Double = js.native
  
  /* CompleteClass */
  override def computeGq(): Double = js.native
  
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /* CompleteClass */
  var eps: Double = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var jacobianElementA: typingsJapgolly.cannon.CANNON.JacobianElement = js.native
  
  /* CompleteClass */
  var jacobianElementB: typingsJapgolly.cannon.CANNON.JacobianElement = js.native
  
  /* CompleteClass */
  var maxForce: Double = js.native
  
  /* CompleteClass */
  var minForce: Double = js.native
  
  /* CompleteClass */
  override def setSpookParams(stiffness: Double, relaxation: Double, timeStep: Double): Unit = js.native
}
