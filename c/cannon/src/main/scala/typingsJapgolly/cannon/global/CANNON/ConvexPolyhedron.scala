package typingsJapgolly.cannon.global.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.ConvexPolyhedron")
@js.native
open class ConvexPolyhedron ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.ConvexPolyhedron {
  def this(points: js.Array[typingsJapgolly.cannon.CANNON.Vec3]) = this()
  def this(points: js.Array[typingsJapgolly.cannon.CANNON.Vec3], faces: js.Array[js.Array[Double]]) = this()
  def this(points: Unit, faces: js.Array[js.Array[Double]]) = this()
  
  /* CompleteClass */
  var boundingSphereRadius: Double = js.native
  
  /* CompleteClass */
  override def calculateLocalInertia(mass: Double, target: typingsJapgolly.cannon.CANNON.Vec3): typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def calculateWorldAABB(
    pos: typingsJapgolly.cannon.CANNON.Vec3,
    quat: typingsJapgolly.cannon.CANNON.Quaternion,
    min: typingsJapgolly.cannon.CANNON.Vec3,
    max: typingsJapgolly.cannon.CANNON.Vec3
  ): Unit = js.native
  
  /* CompleteClass */
  override def clipAgainstHull(
    posA: typingsJapgolly.cannon.CANNON.Vec3,
    quatA: typingsJapgolly.cannon.CANNON.Quaternion,
    hullB: typingsJapgolly.cannon.CANNON.Vec3,
    quatB: typingsJapgolly.cannon.CANNON.Quaternion,
    separatingNormal: typingsJapgolly.cannon.CANNON.Vec3,
    minDist: Double,
    maxDist: Double,
    result: js.Array[Any]
  ): Unit = js.native
  
  /* CompleteClass */
  override def clipFaceAgainstHull(
    separatingNormal: typingsJapgolly.cannon.CANNON.Vec3,
    posA: typingsJapgolly.cannon.CANNON.Vec3,
    quatA: typingsJapgolly.cannon.CANNON.Quaternion,
    worldVertsB1: js.Array[typingsJapgolly.cannon.CANNON.Vec3],
    minDist: Double,
    maxDist: Double,
    result: js.Array[Any]
  ): Unit = js.native
  
  /* CompleteClass */
  override def clipFaceAgainstPlane(
    inVertices: js.Array[typingsJapgolly.cannon.CANNON.Vec3],
    outVertices: js.Array[typingsJapgolly.cannon.CANNON.Vec3],
    planeNormal: typingsJapgolly.cannon.CANNON.Vec3,
    planeConstant: Double
  ): typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var collisionResponse: Boolean = js.native
  
  /* CompleteClass */
  override def computeEdges(): Unit = js.native
  
  /* CompleteClass */
  override def computeLocalAABB(aabbmin: typingsJapgolly.cannon.CANNON.Vec3, aabbmax: typingsJapgolly.cannon.CANNON.Vec3): Unit = js.native
  
  /* CompleteClass */
  override def computeNormals(): Unit = js.native
  
  /* CompleteClass */
  override def computeWorldFaceNormals(quat: typingsJapgolly.cannon.CANNON.Quaternion): Unit = js.native
  
  /* CompleteClass */
  override def computeWorldVertices(position: typingsJapgolly.cannon.CANNON.Vec3, quat: typingsJapgolly.cannon.CANNON.Quaternion): Unit = js.native
  
  /* CompleteClass */
  var faceNormals: js.Array[typingsJapgolly.cannon.CANNON.Vec3] = js.native
  
  /* CompleteClass */
  var faces: js.Array[js.Array[Double]] = js.native
  
  /* CompleteClass */
  override def findSaparatingAxis(
    hullB: typingsJapgolly.cannon.CANNON.ConvexPolyhedron,
    posA: typingsJapgolly.cannon.CANNON.Vec3,
    quatA: typingsJapgolly.cannon.CANNON.Quaternion,
    posB: typingsJapgolly.cannon.CANNON.Vec3,
    quatB: typingsJapgolly.cannon.CANNON.Quaternion,
    target: typingsJapgolly.cannon.CANNON.Vec3,
    faceListA: js.Array[Any],
    faceListB: js.Array[Any]
  ): Boolean = js.native
  
  /* CompleteClass */
  override def getAveragePointLocal(target: typingsJapgolly.cannon.CANNON.Vec3): typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def getFaceNormal(i: Double, target: typingsJapgolly.cannon.CANNON.Vec3): typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def getPlaneConstantOfFace(face_i: Double): Double = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  override def pointIsInside(p: typingsJapgolly.cannon.CANNON.Vec3): Boolean = js.native
  
  /* CompleteClass */
  override def testSepAxis(
    axis: typingsJapgolly.cannon.CANNON.Vec3,
    hullB: typingsJapgolly.cannon.CANNON.ConvexPolyhedron,
    posA: typingsJapgolly.cannon.CANNON.Vec3,
    quatA: typingsJapgolly.cannon.CANNON.Quaternion,
    posB: typingsJapgolly.cannon.CANNON.Vec3,
    quatB: typingsJapgolly.cannon.CANNON.Quaternion
  ): Double = js.native
  
  /* CompleteClass */
  override def transformAllPoints(offset: typingsJapgolly.cannon.CANNON.Vec3, quat: typingsJapgolly.cannon.CANNON.Quaternion): Unit = js.native
  
  /* CompleteClass */
  var `type`: Double = js.native
  
  /* CompleteClass */
  var uniqueEdges: js.Array[typingsJapgolly.cannon.CANNON.Vec3] = js.native
  
  /* CompleteClass */
  override def updateBoundingSphereRadius(): Double = js.native
  
  /* CompleteClass */
  var vertices: js.Array[typingsJapgolly.cannon.CANNON.Vec3] = js.native
  
  /* CompleteClass */
  override def volume(): Double = js.native
  
  /* CompleteClass */
  var worldVertices: js.Array[typingsJapgolly.cannon.CANNON.Vec3] = js.native
  
  /* CompleteClass */
  var worldVerticesNeedsUpdate: Boolean = js.native
}
/* static members */
object ConvexPolyhedron {
  
  @JSGlobal("CANNON.ConvexPolyhedron")
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeNormal(
    va: typingsJapgolly.cannon.CANNON.Vec3,
    vb: typingsJapgolly.cannon.CANNON.Vec3,
    vc: typingsJapgolly.cannon.CANNON.Vec3,
    target: typingsJapgolly.cannon.CANNON.Vec3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("computeNormal")(va.asInstanceOf[js.Any], vb.asInstanceOf[js.Any], vc.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def project(
    hull: typingsJapgolly.cannon.CANNON.ConvexPolyhedron,
    axis: typingsJapgolly.cannon.CANNON.Vec3,
    pos: typingsJapgolly.cannon.CANNON.Vec3,
    quat: typingsJapgolly.cannon.CANNON.Quaternion,
    result: js.Array[Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("project")(hull.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], quat.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
