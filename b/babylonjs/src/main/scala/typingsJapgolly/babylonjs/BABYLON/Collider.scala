package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collider extends StObject {
  
  /* private */ var _basePoint: Any = js.native
  
  /** @internal */
  var _basePointWorld: Vector3 = js.native
  
  /* private */ var _baseToVertex: Any = js.native
  
  /**
    * @internal
    */
  def _canDoCollision(sphereCenter: Vector3, sphereRadius: Double, vecMin: Vector3, vecMax: Vector3): Boolean = js.native
  
  /**
    * @internal
    */
  def _checkPointInTriangle(point: Vector3, pa: Vector3, pb: Vector3, pc: Vector3, n: Vector3): Boolean = js.native
  
  /**
    * @internal
    */
  def _collide(
    trianglePlaneArray: js.Array[Plane],
    pts: js.Array[Vector3],
    indices: IndicesArray,
    indexStart: Double,
    indexEnd: Double,
    decal: Double,
    hasMaterial: Boolean,
    hostMesh: AbstractMesh
  ): Unit = js.native
  def _collide(
    trianglePlaneArray: js.Array[Plane],
    pts: js.Array[Vector3],
    indices: IndicesArray,
    indexStart: Double,
    indexEnd: Double,
    decal: Double,
    hasMaterial: Boolean,
    hostMesh: AbstractMesh,
    invertTriangles: Boolean
  ): Unit = js.native
  def _collide(
    trianglePlaneArray: js.Array[Plane],
    pts: js.Array[Vector3],
    indices: IndicesArray,
    indexStart: Double,
    indexEnd: Double,
    decal: Double,
    hasMaterial: Boolean,
    hostMesh: AbstractMesh,
    invertTriangles: Boolean,
    triangleStrip: Boolean
  ): Unit = js.native
  def _collide(
    trianglePlaneArray: js.Array[Plane],
    pts: js.Array[Vector3],
    indices: IndicesArray,
    indexStart: Double,
    indexEnd: Double,
    decal: Double,
    hasMaterial: Boolean,
    hostMesh: AbstractMesh,
    invertTriangles: Unit,
    triangleStrip: Boolean
  ): Unit = js.native
  
  /* private */ var _collisionMask: Any = js.native
  
  /* private */ var _collisionPoint: Any = js.native
  
  /* private */ var _destinationPoint: Any = js.native
  
  /* private */ var _displacementVector: Any = js.native
  
  /* private */ var _edge: Any = js.native
  
  /* private */ var _epsilon: Any = js.native
  
  /**
    * @internal
    */
  def _getResponse(pos: Vector3, vel: Vector3): Unit = js.native
  
  /** @internal */
  var _initialPosition: Vector3 = js.native
  
  /** @internal */
  var _initialVelocity: Vector3 = js.native
  
  /**
    * @internal
    */
  def _initialize(source: Vector3, dir: Vector3, e: Double): Unit = js.native
  
  /* private */ var _nearestDistance: Any = js.native
  
  /* private */ var _nearestDistanceSquared: Any = js.native
  
  /* private */ var _normalizedVelocity: Any = js.native
  
  /* private */ var _planeIntersectionPoint: Any = js.native
  
  /** @internal */
  var _radius: Vector3 = js.native
  
  /** @internal */
  var _retry: Double = js.native
  
  /* private */ var _slidePlaneNormal: Any = js.native
  
  /* private */ var _tempVector: Any = js.native
  
  /* private */ var _tempVector2: Any = js.native
  
  /* private */ var _tempVector3: Any = js.native
  
  /* private */ var _tempVector4: Any = js.native
  
  /**
    * @internal
    */
  def _testTriangle(
    faceIndex: Double,
    trianglePlaneArray: js.Array[Plane],
    p1: Vector3,
    p2: Vector3,
    p3: Vector3,
    hasMaterial: Boolean,
    hostMesh: AbstractMesh
  ): Unit = js.native
  
  /* private */ var _velocity: Any = js.native
  
  /* private */ var _velocitySquaredLength: Any = js.native
  
  /* private */ var _velocityWorld: Any = js.native
  
  /** @internal */
  var _velocityWorldLength: Double = js.native
  
  /**
    * Define last collided mesh
    */
  var collidedMesh: Nullable[AbstractMesh] = js.native
  
  /** Define if a collision was found */
  var collisionFound: Boolean = js.native
  
  def collisionMask: Double = js.native
  def collisionMask_=(mask: Double): Unit = js.native
  
  /**
    * Define last intersection point in local space
    */
  var intersectionPoint: Vector3 = js.native
  
  /**
    * Gets the plane normal used to compute the sliding response (in local space)
    */
  def slidePlaneNormal: Vector3 = js.native
}
