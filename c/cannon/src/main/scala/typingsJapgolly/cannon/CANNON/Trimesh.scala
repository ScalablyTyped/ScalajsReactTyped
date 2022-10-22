package typingsJapgolly.cannon.CANNON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cannon.cannonInts.`0`
import typingsJapgolly.cannon.cannonInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trimesh
  extends StObject
     with Shape {
  
  def calculateWorldAABB(pos: Vec3, quat: Quaternion, min: Vec3, max: Vec3): Unit
  
  def computeLocalAABB(aabb: Vec3): Unit
  
  def createTorus(radius: Double, tube: Double, radialSegments: Double, tubularSegments: Double, arc: Double): Trimesh
  
  def getEdgeVector(edgeIndex: Double, vectorStore: Vec3): Unit
  
  def getEdgeVertex(edgeIndex: Double, firstOrSecond: `0` | `1`, vertexStore: Vec3): Unit
  
  def getNormal(i: Double, target: Vec3): Vec3
  
  def getTriangleVertices(i: Double, a: Vec3, b: Vec3, c: Vec3): Unit
  
  def getTrianglesInAABB(aabb: AABB, result: js.Array[Double]): js.Array[Double]
  
  def getVertex(i: Double, out: Vec3): Vec3
  
  def getWorldVertex(i: Double, pos: Vec3, quat: Quaternion, out: Vec3): Vec3
  
  var indices: js.Array[Double]
  
  var scale: Vec3
  
  def setScale(scale: Vec3): Unit
  
  def updateAABB(): Unit
  
  def updateEdges(): Unit
  
  def updateNormals(): Unit
  
  def updateTree(): Unit
  
  var vertices: js.Array[Double]
}
object Trimesh {
  
  inline def apply(
    boundingSphereRadius: Double,
    calculateLocalInertia: (Double, Vec3) => Vec3,
    calculateWorldAABB: (Vec3, Quaternion, Vec3, Vec3) => Callback,
    collisionResponse: Boolean,
    computeLocalAABB: Vec3 => Callback,
    createTorus: (Double, Double, Double, Double, Double) => Trimesh,
    getEdgeVector: (Double, Vec3) => Callback,
    getEdgeVertex: (Double, `0` | `1`, Vec3) => Callback,
    getNormal: (Double, Vec3) => Vec3,
    getTriangleVertices: (Double, Vec3, Vec3, Vec3) => Callback,
    getTrianglesInAABB: (AABB, js.Array[Double]) => js.Array[Double],
    getVertex: (Double, Vec3) => Vec3,
    getWorldVertex: (Double, Vec3, Quaternion, Vec3) => Vec3,
    id: Double,
    indices: js.Array[Double],
    scale: Vec3,
    setScale: Vec3 => Callback,
    `type`: Double,
    updateAABB: Callback,
    updateBoundingSphereRadius: CallbackTo[Double],
    updateEdges: Callback,
    updateNormals: Callback,
    updateTree: Callback,
    vertices: js.Array[Double],
    volume: CallbackTo[Double]
  ): Trimesh = {
    val __obj = js.Dynamic.literal(boundingSphereRadius = boundingSphereRadius.asInstanceOf[js.Any], calculateLocalInertia = js.Any.fromFunction2(calculateLocalInertia), calculateWorldAABB = js.Any.fromFunction4((t0: Vec3, t1: Quaternion, t2: Vec3, t3: Vec3) => (calculateWorldAABB(t0, t1, t2, t3)).runNow()), collisionResponse = collisionResponse.asInstanceOf[js.Any], computeLocalAABB = js.Any.fromFunction1((t0: Vec3) => computeLocalAABB(t0).runNow()), createTorus = js.Any.fromFunction5(createTorus), getEdgeVector = js.Any.fromFunction2((t0: Double, t1: Vec3) => (getEdgeVector(t0, t1)).runNow()), getEdgeVertex = js.Any.fromFunction3((t0: Double, t1: `0` | `1`, t2: Vec3) => (getEdgeVertex(t0, t1, t2)).runNow()), getNormal = js.Any.fromFunction2(getNormal), getTriangleVertices = js.Any.fromFunction4((t0: Double, t1: Vec3, t2: Vec3, t3: Vec3) => (getTriangleVertices(t0, t1, t2, t3)).runNow()), getTrianglesInAABB = js.Any.fromFunction2(getTrianglesInAABB), getVertex = js.Any.fromFunction2(getVertex), getWorldVertex = js.Any.fromFunction4(getWorldVertex), id = id.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], setScale = js.Any.fromFunction1((t0: Vec3) => setScale(t0).runNow()), updateAABB = updateAABB.toJsFn, updateBoundingSphereRadius = updateBoundingSphereRadius.toJsFn, updateEdges = updateEdges.toJsFn, updateNormals = updateNormals.toJsFn, updateTree = updateTree.toJsFn, vertices = vertices.asInstanceOf[js.Any], volume = volume.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trimesh]
  }
  
  extension [Self <: Trimesh](x: Self) {
    
    inline def setCalculateWorldAABB(value: (Vec3, Quaternion, Vec3, Vec3) => Callback): Self = StObject.set(x, "calculateWorldAABB", js.Any.fromFunction4((t0: Vec3, t1: Quaternion, t2: Vec3, t3: Vec3) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setComputeLocalAABB(value: Vec3 => Callback): Self = StObject.set(x, "computeLocalAABB", js.Any.fromFunction1((t0: Vec3) => value(t0).runNow()))
    
    inline def setCreateTorus(value: (Double, Double, Double, Double, Double) => Trimesh): Self = StObject.set(x, "createTorus", js.Any.fromFunction5(value))
    
    inline def setGetEdgeVector(value: (Double, Vec3) => Callback): Self = StObject.set(x, "getEdgeVector", js.Any.fromFunction2((t0: Double, t1: Vec3) => (value(t0, t1)).runNow()))
    
    inline def setGetEdgeVertex(value: (Double, `0` | `1`, Vec3) => Callback): Self = StObject.set(x, "getEdgeVertex", js.Any.fromFunction3((t0: Double, t1: `0` | `1`, t2: Vec3) => (value(t0, t1, t2)).runNow()))
    
    inline def setGetNormal(value: (Double, Vec3) => Vec3): Self = StObject.set(x, "getNormal", js.Any.fromFunction2(value))
    
    inline def setGetTriangleVertices(value: (Double, Vec3, Vec3, Vec3) => Callback): Self = StObject.set(x, "getTriangleVertices", js.Any.fromFunction4((t0: Double, t1: Vec3, t2: Vec3, t3: Vec3) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setGetTrianglesInAABB(value: (AABB, js.Array[Double]) => js.Array[Double]): Self = StObject.set(x, "getTrianglesInAABB", js.Any.fromFunction2(value))
    
    inline def setGetVertex(value: (Double, Vec3) => Vec3): Self = StObject.set(x, "getVertex", js.Any.fromFunction2(value))
    
    inline def setGetWorldVertex(value: (Double, Vec3, Quaternion, Vec3) => Vec3): Self = StObject.set(x, "getWorldVertex", js.Any.fromFunction4(value))
    
    inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setScale(value: Vec3): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setSetScale(value: Vec3 => Callback): Self = StObject.set(x, "setScale", js.Any.fromFunction1((t0: Vec3) => value(t0).runNow()))
    
    inline def setUpdateAABB(value: Callback): Self = StObject.set(x, "updateAABB", value.toJsFn)
    
    inline def setUpdateEdges(value: Callback): Self = StObject.set(x, "updateEdges", value.toJsFn)
    
    inline def setUpdateNormals(value: Callback): Self = StObject.set(x, "updateNormals", value.toJsFn)
    
    inline def setUpdateTree(value: Callback): Self = StObject.set(x, "updateTree", value.toJsFn)
    
    inline def setVertices(value: js.Array[Double]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesVarargs(value: Double*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
