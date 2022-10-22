package typingsJapgolly.cannon.global.CANNON

import typingsJapgolly.cannon.cannonInts.`0`
import typingsJapgolly.cannon.cannonInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.Trimesh")
@js.native
open class Trimesh protected ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.Trimesh {
  def this(vertices: js.Array[Double], indices: js.Array[Double]) = this()
  
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
  var collisionResponse: Boolean = js.native
  
  /* CompleteClass */
  override def computeLocalAABB(aabb: typingsJapgolly.cannon.CANNON.Vec3): Unit = js.native
  
  /* CompleteClass */
  override def createTorus(radius: Double, tube: Double, radialSegments: Double, tubularSegments: Double, arc: Double): typingsJapgolly.cannon.CANNON.Trimesh = js.native
  
  /* CompleteClass */
  override def getEdgeVector(edgeIndex: Double, vectorStore: typingsJapgolly.cannon.CANNON.Vec3): Unit = js.native
  
  /* CompleteClass */
  override def getEdgeVertex(edgeIndex: Double, firstOrSecond: `0` | `1`, vertexStore: typingsJapgolly.cannon.CANNON.Vec3): Unit = js.native
  
  /* CompleteClass */
  override def getNormal(i: Double, target: typingsJapgolly.cannon.CANNON.Vec3): typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def getTriangleVertices(
    i: Double,
    a: typingsJapgolly.cannon.CANNON.Vec3,
    b: typingsJapgolly.cannon.CANNON.Vec3,
    c: typingsJapgolly.cannon.CANNON.Vec3
  ): Unit = js.native
  
  /* CompleteClass */
  override def getTrianglesInAABB(aabb: typingsJapgolly.cannon.CANNON.AABB, result: js.Array[Double]): js.Array[Double] = js.native
  
  /* CompleteClass */
  override def getVertex(i: Double, out: typingsJapgolly.cannon.CANNON.Vec3): typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def getWorldVertex(
    i: Double,
    pos: typingsJapgolly.cannon.CANNON.Vec3,
    quat: typingsJapgolly.cannon.CANNON.Quaternion,
    out: typingsJapgolly.cannon.CANNON.Vec3
  ): typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var indices: js.Array[Double] = js.native
  
  /* CompleteClass */
  var scale: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def setScale(scale: typingsJapgolly.cannon.CANNON.Vec3): Unit = js.native
  
  /* CompleteClass */
  var `type`: Double = js.native
  
  /* CompleteClass */
  override def updateAABB(): Unit = js.native
  
  /* CompleteClass */
  override def updateBoundingSphereRadius(): Double = js.native
  
  /* CompleteClass */
  override def updateEdges(): Unit = js.native
  
  /* CompleteClass */
  override def updateNormals(): Unit = js.native
  
  /* CompleteClass */
  override def updateTree(): Unit = js.native
  
  /* CompleteClass */
  var vertices: js.Array[Double] = js.native
  
  /* CompleteClass */
  override def volume(): Double = js.native
}
/* static members */
object Trimesh {
  
  @JSGlobal("CANNON.Trimesh")
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeNormal(
    va: typingsJapgolly.cannon.CANNON.Vec3,
    vb: typingsJapgolly.cannon.CANNON.Vec3,
    vc: typingsJapgolly.cannon.CANNON.Vec3,
    target: typingsJapgolly.cannon.CANNON.Vec3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("computeNormal")(va.asInstanceOf[js.Any], vb.asInstanceOf[js.Any], vc.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
