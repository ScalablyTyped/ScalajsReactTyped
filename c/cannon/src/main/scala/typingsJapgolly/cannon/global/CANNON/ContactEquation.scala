package typingsJapgolly.cannon.global.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.ContactEquation")
@js.native
open class ContactEquation protected ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.ContactEquation {
  def this(bi: typingsJapgolly.cannon.CANNON.Body, bj: typingsJapgolly.cannon.CANNON.Body) = this()
  
  /* CompleteClass */
  var a: Double = js.native
  
  /* CompleteClass */
  override def addToWlamda(deltalambda: Double): Double = js.native
  
  /* CompleteClass */
  var b: Double = js.native
  
  /* CompleteClass */
  var bi: typingsJapgolly.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  var biInvInertiaTimesRixn: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var bj: typingsJapgolly.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  var bjInvInertiaTimesRjxn: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
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
  var invIi: typingsJapgolly.cannon.CANNON.Mat3 = js.native
  
  /* CompleteClass */
  var invIj: typingsJapgolly.cannon.CANNON.Mat3 = js.native
  
  /* CompleteClass */
  var jacobianElementA: typingsJapgolly.cannon.CANNON.JacobianElement = js.native
  
  /* CompleteClass */
  var jacobianElementB: typingsJapgolly.cannon.CANNON.JacobianElement = js.native
  
  /* CompleteClass */
  var maxForce: Double = js.native
  
  /* CompleteClass */
  var minForce: Double = js.native
  
  /* CompleteClass */
  var ni: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var penetrationVec: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var restitution: Double = js.native
  
  /* CompleteClass */
  var ri: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var rixn: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var rj: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var rjxn: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def setSpookParams(stiffness: Double, relaxation: Double, timeStep: Double): Unit = js.native
}
