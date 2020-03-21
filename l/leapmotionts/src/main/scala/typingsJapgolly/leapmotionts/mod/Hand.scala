package typingsJapgolly.leapmotionts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leapmotionts", "Hand")
@js.native
class Hand () extends js.Object {
  var direction: Vector3 = js.native
  var fingers: js.Array[Finger] = js.native
  var frame: Frame = js.native
  var id: Double = js.native
  var palmNormal: Vector3 = js.native
  var palmPosition: Vector3 = js.native
  var palmVelocity: Vector3 = js.native
  var pointables: js.Array[Pointable] = js.native
  var rotation: Matrix = js.native
  var scaleFactorNumber: Double = js.native
  var sphereCenter: Vector3 = js.native
  var sphereRadius: Double = js.native
  var tools: js.Array[Tool] = js.native
  var translationVector: Vector3 = js.native
  def finger(id: Double): Finger = js.native
  def isEqualTo(other: Hand): Boolean = js.native
  def isValid(): Boolean = js.native
  def pointable(id: Double): Pointable = js.native
  def rotationAngle(sinceFrame: Frame): Double = js.native
  def rotationAngle(sinceFrame: Frame, axis: Vector3): Double = js.native
  def rotationAxis(sinceFrame: Frame): Vector3 = js.native
  def rotationMatrix(sinceFrame: Frame): Matrix = js.native
  def scaleFactor(sinceFrame: Frame): Double = js.native
  def tool(id: Double): Tool = js.native
  def translation(sinceFrame: Frame): Vector3 = js.native
}

/* static members */
@JSImport("leapmotionts", "Hand")
@js.native
object Hand extends js.Object {
  def invalid(): Hand = js.native
}

