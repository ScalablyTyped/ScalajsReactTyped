package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A quaternion, used to represent rotation. */
trait quat extends StObject {
  
  /** Returns the dot product of the two quats. */
  def dot(quat: quat): Double
  
  /** Returns whether this quat and b are equal. */
  def equal(b: quat): Boolean
  
  /** Returns the rotation angle of the quat. */
  def getAngle(): Double
  
  /** Returns the rotation axis of the quat. */
  def getAxis(): vec3
  
  /** Returns an inverted version of the quat. */
  def invert(): quat
  
  /** Returns the product of this quat and b. */
  def multiply(b: quat): quat
  
  /** Returns the result of rotating direction vector vec3 by this quat. */
  def multiplyVec3(vec3: vec3): vec3
  
  /** Normalizes the quat. */
  def normalize(): Unit
  
  /** Returns an euler angle representation of the quat, in radians. */
  def toEulerAngles(): vec3
  
  /** w component of the quat. */
  var w: Double
  
  /** x component of the quat. */
  var x: Double
  
  /** y component of the quat. */
  var y: Double
  
  /** z component of the quat. */
  var z: Double
}
object quat {
  
  inline def apply(
    dot: quat => Double,
    equal: quat => Boolean,
    getAngle: CallbackTo[Double],
    getAxis: CallbackTo[vec3],
    invert: CallbackTo[quat],
    multiply: quat => quat,
    multiplyVec3: vec3 => vec3,
    normalize: Callback,
    toEulerAngles: CallbackTo[vec3],
    w: Double,
    x: Double,
    y: Double,
    z: Double
  ): quat = {
    val __obj = js.Dynamic.literal(dot = js.Any.fromFunction1(dot), equal = js.Any.fromFunction1(equal), getAngle = getAngle.toJsFn, getAxis = getAxis.toJsFn, invert = invert.toJsFn, multiply = js.Any.fromFunction1(multiply), multiplyVec3 = js.Any.fromFunction1(multiplyVec3), normalize = normalize.toJsFn, toEulerAngles = toEulerAngles.toJsFn, w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[quat]
  }
  
  extension [Self <: quat](x: Self) {
    
    inline def setDot(value: quat => Double): Self = StObject.set(x, "dot", js.Any.fromFunction1(value))
    
    inline def setEqual(value: quat => Boolean): Self = StObject.set(x, "equal", js.Any.fromFunction1(value))
    
    inline def setGetAngle(value: CallbackTo[Double]): Self = StObject.set(x, "getAngle", value.toJsFn)
    
    inline def setGetAxis(value: CallbackTo[vec3]): Self = StObject.set(x, "getAxis", value.toJsFn)
    
    inline def setInvert(value: CallbackTo[quat]): Self = StObject.set(x, "invert", value.toJsFn)
    
    inline def setMultiply(value: quat => quat): Self = StObject.set(x, "multiply", js.Any.fromFunction1(value))
    
    inline def setMultiplyVec3(value: vec3 => vec3): Self = StObject.set(x, "multiplyVec3", js.Any.fromFunction1(value))
    
    inline def setNormalize(value: Callback): Self = StObject.set(x, "normalize", value.toJsFn)
    
    inline def setToEulerAngles(value: CallbackTo[vec3]): Self = StObject.set(x, "toEulerAngles", value.toJsFn)
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
