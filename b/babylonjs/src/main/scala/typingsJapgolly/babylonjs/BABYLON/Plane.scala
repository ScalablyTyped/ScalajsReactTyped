package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plane extends StObject {
  
  /**
    * @returns the plane coordinates as a new array of 4 elements [a, b, c, d].
    */
  def asArray(): js.Array[Double]
  
  /**
    * Updates the current Plane from the plane defined by the three given points.
    * @param point1 one of the points used to construct the plane
    * @param point2 one of the points used to construct the plane
    * @param point3 one of the points used to construct the plane
    * @returns the updated Plane.
    */
  def copyFromPoints(point1: DeepImmutable[Vector3], point2: DeepImmutable[Vector3], point3: DeepImmutable[Vector3]): Plane
  
  /**
    * d component of the plane
    */
  var d: Double
  
  /**
    * Compute the dot product between the point and the plane normal
    * @param point point to calculate the dot product with
    * @returns the dot product (float) of the point coordinates and the plane normal.
    */
  def dotCoordinate(point: DeepImmutable[Vector3]): Double
  
  /**
    * @returns the string "Plane".
    */
  def getClassName(): String
  
  /**
    * @returns the Plane hash code.
    */
  def getHashCode(): Double
  
  /**
    * Checks if the plane is facing a given direction (meaning if the plane's normal is pointing in the opposite direction of the given vector).
    * Note that for this function to work as expected you should make sure that:
    *   - direction and the plane normal are normalized
    *   - epsilon is a number just bigger than -1, something like -0.99 for eg
    * @param direction the direction to check if the plane is facing
    * @param epsilon value the dot product is compared against (returns true if dot <= epsilon)
    * @returns True if the plane is facing the given direction
    */
  def isFrontFacingTo(direction: DeepImmutable[Vector3], epsilon: Double): Boolean
  
  /**
    * Normal of the plane (a,b,c)
    */
  var normal: Vector3
  
  /**
    * Normalize the current Plane in place.
    * @returns the updated Plane.
    */
  def normalize(): Plane
  
  /**
    * Calculates the distance to a point
    * @param point point to calculate distance to
    * @returns the signed distance (float) from the given point to the Plane.
    */
  def signedDistanceTo(point: DeepImmutable[Vector3]): Double
  
  /**
    * Applies a transformation the plane and returns the result
    * @param transformation the transformation matrix to be applied to the plane
    * @returns a new Plane as the result of the transformation of the current Plane by the given matrix.
    */
  def transform(transformation: DeepImmutable[Matrix]): Plane
}
object Plane {
  
  inline def apply(
    asArray: CallbackTo[js.Array[Double]],
    copyFromPoints: (DeepImmutable[Vector3], DeepImmutable[Vector3], DeepImmutable[Vector3]) => Plane,
    d: Double,
    dotCoordinate: DeepImmutable[Vector3] => Double,
    getClassName: CallbackTo[String],
    getHashCode: CallbackTo[Double],
    isFrontFacingTo: (DeepImmutable[Vector3], Double) => Boolean,
    normal: Vector3,
    normalize: CallbackTo[Plane],
    signedDistanceTo: DeepImmutable[Vector3] => Double,
    transform: DeepImmutable[Matrix] => Plane
  ): Plane = {
    val __obj = js.Dynamic.literal(asArray = asArray.toJsFn, copyFromPoints = js.Any.fromFunction3(copyFromPoints), d = d.asInstanceOf[js.Any], dotCoordinate = js.Any.fromFunction1(dotCoordinate), getClassName = getClassName.toJsFn, getHashCode = getHashCode.toJsFn, isFrontFacingTo = js.Any.fromFunction2(isFrontFacingTo), normal = normal.asInstanceOf[js.Any], normalize = normalize.toJsFn, signedDistanceTo = js.Any.fromFunction1(signedDistanceTo), transform = js.Any.fromFunction1(transform))
    __obj.asInstanceOf[Plane]
  }
  
  extension [Self <: Plane](x: Self) {
    
    inline def setAsArray(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "asArray", value.toJsFn)
    
    inline def setCopyFromPoints(value: (DeepImmutable[Vector3], DeepImmutable[Vector3], DeepImmutable[Vector3]) => Plane): Self = StObject.set(x, "copyFromPoints", js.Any.fromFunction3(value))
    
    inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDotCoordinate(value: DeepImmutable[Vector3] => Double): Self = StObject.set(x, "dotCoordinate", js.Any.fromFunction1(value))
    
    inline def setGetClassName(value: CallbackTo[String]): Self = StObject.set(x, "getClassName", value.toJsFn)
    
    inline def setGetHashCode(value: CallbackTo[Double]): Self = StObject.set(x, "getHashCode", value.toJsFn)
    
    inline def setIsFrontFacingTo(value: (DeepImmutable[Vector3], Double) => Boolean): Self = StObject.set(x, "isFrontFacingTo", js.Any.fromFunction2(value))
    
    inline def setNormal(value: Vector3): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setNormalize(value: CallbackTo[Plane]): Self = StObject.set(x, "normalize", value.toJsFn)
    
    inline def setSignedDistanceTo(value: DeepImmutable[Vector3] => Double): Self = StObject.set(x, "signedDistanceTo", js.Any.fromFunction1(value))
    
    inline def setTransform(value: DeepImmutable[Matrix] => Plane): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
  }
}
