package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.DeepImmutable
import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Plane")
@js.native
open class Plane protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.Plane {
  /**
    * Creates a Plane object according to the given floats a, b, c, d and the plane equation : ax + by + cz + d = 0
    * @param a a component of the plane
    * @param b b component of the plane
    * @param c c component of the plane
    * @param d d component of the plane
    */
  def this(a: Double, b: Double, c: Double, d: Double) = this()
  
  /**
    * @returns the plane coordinates as a new array of 4 elements [a, b, c, d].
    */
  /* CompleteClass */
  override def asArray(): js.Array[Double] = js.native
  
  /**
    * Updates the current Plane from the plane defined by the three given points.
    * @param point1 one of the points used to construct the plane
    * @param point2 one of the points used to construct the plane
    * @param point3 one of the points used to construct the plane
    * @returns the updated Plane.
    */
  /* CompleteClass */
  override def copyFromPoints(
    point1: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    point2: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    point3: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3]
  ): typingsJapgolly.babylonjs.BABYLON.Plane = js.native
  
  /**
    * d component of the plane
    */
  /* CompleteClass */
  var d: Double = js.native
  
  /**
    * Compute the dot product between the point and the plane normal
    * @param point point to calculate the dot product with
    * @returns the dot product (float) of the point coordinates and the plane normal.
    */
  /* CompleteClass */
  override def dotCoordinate(point: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3]): Double = js.native
  
  /**
    * @returns the string "Plane".
    */
  /* CompleteClass */
  override def getClassName(): String = js.native
  
  /**
    * @returns the Plane hash code.
    */
  /* CompleteClass */
  override def getHashCode(): Double = js.native
  
  /**
    * Checks if the plane is facing a given direction (meaning if the plane's normal is pointing in the opposite direction of the given vector).
    * Note that for this function to work as expected you should make sure that:
    *   - direction and the plane normal are normalized
    *   - epsilon is a number just bigger than -1, something like -0.99 for eg
    * @param direction the direction to check if the plane is facing
    * @param epsilon value the dot product is compared against (returns true if dot <= epsilon)
    * @returns True if the plane is facing the given direction
    */
  /* CompleteClass */
  override def isFrontFacingTo(direction: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3], epsilon: Double): Boolean = js.native
  
  /**
    * Normal of the plane (a,b,c)
    */
  /* CompleteClass */
  var normal: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * Normalize the current Plane in place.
    * @returns the updated Plane.
    */
  /* CompleteClass */
  override def normalize(): typingsJapgolly.babylonjs.BABYLON.Plane = js.native
  
  /**
    * Calculates the distance to a point
    * @param point point to calculate distance to
    * @returns the signed distance (float) from the given point to the Plane.
    */
  /* CompleteClass */
  override def signedDistanceTo(point: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3]): Double = js.native
  
  /**
    * Applies a transformation the plane and returns the result
    * @param transformation the transformation matrix to be applied to the plane
    * @returns a new Plane as the result of the transformation of the current Plane by the given matrix.
    */
  /* CompleteClass */
  override def transform(transformation: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Matrix]): typingsJapgolly.babylonjs.BABYLON.Plane = js.native
}
/* static members */
object Plane {
  
  @JSGlobal("BABYLON.Plane")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a plane from an  array
    * @param array the array to create a plane from
    * @returns a new Plane from the given array.
    */
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]]): typingsJapgolly.babylonjs.BABYLON.Plane = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Plane]
  
  /**
    * Creates a plane from three points
    * @param point1 point used to create the plane
    * @param point2 point used to create the plane
    * @param point3 point used to create the plane
    * @returns a new Plane defined by the three given points.
    */
  inline def FromPoints(
    point1: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    point2: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    point3: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3]
  ): typingsJapgolly.babylonjs.BABYLON.Plane = (^.asInstanceOf[js.Dynamic].applyDynamic("FromPoints")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any], point3.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Plane]
  
  /**
    * Creates a plane from an origin point and a normal
    * @param origin origin of the plane to be constructed
    * @param normal normal of the plane to be constructed
    * @returns a new Plane the normal vector to this plane at the given origin point.
    * Note : the vector "normal" is updated because normalized.
    */
  inline def FromPositionAndNormal(
    origin: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    normal: typingsJapgolly.babylonjs.BABYLON.Vector3
  ): typingsJapgolly.babylonjs.BABYLON.Plane = (^.asInstanceOf[js.Dynamic].applyDynamic("FromPositionAndNormal")(origin.asInstanceOf[js.Any], normal.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Plane]
  
  /**
    * Calculates the distance from a plane and a point
    * @param origin origin of the plane to be constructed
    * @param normal normal of the plane to be constructed
    * @param point point to calculate distance to
    * @returns the signed distance between the plane defined by the normal vector at the "origin"" point and the given other point.
    */
  inline def SignedDistanceToPlaneFromPositionAndNormal(
    origin: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    normal: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    point: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("SignedDistanceToPlaneFromPositionAndNormal")(origin.asInstanceOf[js.Any], normal.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSGlobal("BABYLON.Plane._TmpMatrix")
  @js.native
  def _TmpMatrix: Any = js.native
  inline def _TmpMatrix_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpMatrix")(x.asInstanceOf[js.Any])
}
