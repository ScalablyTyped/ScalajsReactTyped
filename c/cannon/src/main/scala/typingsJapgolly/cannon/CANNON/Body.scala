package typingsJapgolly.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Body")
@js.native
class Body () extends EventTarget {
  def this(options: IBodyOptions) = this()
  var aabb: AABB = js.native
  var aabbNeedsUpdate: Boolean = js.native
  var allowSleep: Boolean = js.native
  var angularDamping: Double = js.native
  var angularVelocity: Vec3 = js.native
  var collisionFilterGroup: Double = js.native
  var collisionFilterMask: Double = js.native
  var collisionResponse: Boolean = js.native
  var fixedRotation: Boolean = js.native
  var force: Vec3 = js.native
  var id: Double = js.native
  var inertia: Vec3 = js.native
  var initAngularVelocity: Vec3 = js.native
  var initPosition: Vec3 = js.native
  var initQuaternion: Quaternion = js.native
  var initVelocity: Vec3 = js.native
  var interpolatedPosition: Vec3 = js.native
  var interpolatedQuaternion: Quaternion = js.native
  var invInertia: Vec3 = js.native
  var invInertiaSolve: Vec3 = js.native
  var invInertiaWorld: Mat3 = js.native
  var invInteriaWorldSolve: Mat3 = js.native
  var invMass: Double = js.native
  var invMassSolve: Double = js.native
  var linearDamping: Double = js.native
  var mass: Double = js.native
  var material: Material = js.native
  var position: Vec3 = js.native
  var postStep: js.Function = js.native
  var preStep: js.Function = js.native
  var previousPosition: Vec3 = js.native
  var quaternion: Quaternion = js.native
  var shapeOffsets: js.Array[_] = js.native
  var shapeOrientations: js.Array[_] = js.native
  var shapes: js.Array[Shape] = js.native
  var sleepSpeedLimit: Double = js.native
  var sleepState: Double = js.native
  var sleepTimeLimit: Double = js.native
  var timeLastSleepy: Double = js.native
  var torque: Vec3 = js.native
  var `type`: Double = js.native
  var velocity: Vec3 = js.native
  var vlambda: Vec3 = js.native
  var wlambda: Vec3 = js.native
  var world: World = js.native
  def addShape(shape: Shape): Unit = js.native
  def addShape(shape: Shape, offset: Vec3): Unit = js.native
  def addShape(shape: Shape, offset: Vec3, orientation: Quaternion): Unit = js.native
  def applyForce(force: Vec3, worldPoint: Vec3): Unit = js.native
  def applyImpulse(impulse: Vec3, worldPoint: Vec3): Unit = js.native
  def applyLocalForce(force: Vec3, localPoint: Vec3): Unit = js.native
  def applyLocalImpulse(impulse: Vec3, localPoint: Vec3): Unit = js.native
  def computeAABB(): Unit = js.native
  def getVelocityAtWorldPoint(worldPoint: Vec3, result: Vec3): Vec3 = js.native
  def pointToLocalFrame(worldPoint: Vec3): Vec3 = js.native
  def pointToLocalFrame(worldPoint: Vec3, result: Vec3): Vec3 = js.native
  def pointToWorldFrame(localPoint: Vec3): Vec3 = js.native
  def pointToWorldFrame(localPoint: Vec3, result: Vec3): Vec3 = js.native
  def sleep(): Unit = js.native
  def sleepTick(time: Double): Unit = js.native
  def updateBoundingRadius(): Unit = js.native
  def updateInertiaWorld(force: Vec3): Unit = js.native
  def updateMassProperties(): Unit = js.native
  def updateSolveMassProperties(): Unit = js.native
  def vectorToWorldFrame(localVector: Vec3): Vec3 = js.native
  def vectorToWorldFrame(localVector: Vec3, result: Vec3): Vec3 = js.native
  def wakeUp(): Unit = js.native
}

/* static members */
@JSGlobal("CANNON.Body")
@js.native
object Body extends js.Object {
  var AWAKE: Double = js.native
  var DYNAMIC: Double = js.native
  var KINEMATIC: Double = js.native
  var SLEEPING: Double = js.native
  var SLEEPY: Double = js.native
  var STATIC: Double = js.native
  var sleepEvent: IEvent = js.native
  var sleepyEvent: IEvent = js.native
}

