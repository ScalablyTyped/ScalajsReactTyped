package typingsJapgolly.victor.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Victor extends js.Object {
  var x: Double
  var y: Double
  /**
    * Same as distanceX but always returns an absolute value.
    * @param vector
    */
  def absDistanceX(vector: Victor): Double
  /**
    * Same as distanceY but always returns an absolute value.
    * @param vector
    */
  def absDistanceY(vector: Victor): Double
  /**
    * Adds another vector to itself.
    * @param vector
    */
  def add(vector: Victor): Victor
  /**
    * Adds the given scalar to both vector axis.
    *
    * @param scalar
    */
  def addScalar(scalar: Double): Victor
  /**
    * Adds the given scalar to the X axis.
    *
    * @param scalar
    */
  def addScalarX(scalar: Double): Victor
  /**
    * Adds the given scalar to the Y axis.
    *
    * @param scalar
    */
  def addScalarY(scalar: Double): Victor
  /**
    * Adds another vector's X component to itself.
    * @param vector
    */
  def addX(vector: Victor): Victor
  /**
    * Adds another vector's Y component to itself.
    * @param vector
    */
  def addY(vector: Victor): Victor
  /**
    * Alias for horizontalAngle.
    */
  def angle(): Double
  /**
    * Alias for horizontalAngleDeg.
    */
  def angleDeg(): Double
  /**
    * Copies the X and Y components of another vector in to itself.
    * @param vector
    */
  def copy(vector: Victor): Victor
  /**
    * Copies the X component of another vector in to itself.
    * @param vector
    */
  def copyX(vector: Victor): Victor
  /**
    * Copies the Y component of another vector in to itself.
    * @param vector
    */
  def copyY(vector: Victor): Victor
  /**
    * Returns the cross product of two vectors.
    * @param vector
    */
  def cross(vector: Victor): Double
  /**
    * Alias for horizontalAngle.
    */
  def direction(): Double
  /**
    * Returns the euclidean distance between two vectors.
    * @param vector
    */
  def distance(vector: Victor): Double
  /**
    * Returns the squared euclidean distance between two vectors. If the distance is only needed for comparison, this function is faster than distance.
    * @param vector
    */
  def distanceSq(vector: Victor): Double
  /**
    * Returns the distance of the X component from another vector.
    * @param vector
    */
  def distanceX(vector: Victor): Double
  /**
    * Returns the distance of the Y component from another vector.
    * @param vector
    */
  def distanceY(vector: Victor): Double
  /**
    * Divides both components by another vector.
    * @param scalar
    */
  def divide(scalar: Victor): Victor
  /**
    * Divides both vector axis by the given scalar value.
    *
    * @param scalar
    */
  def divideScalar(scalar: Double): Victor
  /**
    * Divides the X axis by the given scalar value.
    *
    * @param scalar
    */
  def divideScalarX(scalar: Double): Victor
  /**
    * Divides the Y axis by the given scalar value.
    *
    * @param scalar
    */
  def divideScalarY(scalar: Double): Victor
  /**
    * Divides the X component by the X component of another vector.
    * @param vector
    */
  def divideX(vector: Victor): Victor
  /**
    * Divides the Y component by the Y component of another vector.
    * @param vector
    */
  def divideY(vector: Victor): Victor
  /**
    * Returns the dot product of two vectors.
    * @param vector
    */
  def dot(vector: Victor): Double
  /**
    * Returns the angle towards X in radians.
    */
  def horizontalAngle(): Double
  /**
    * Same as horizontalAngle but returns degrees.
    */
  def horizontalAngleDeg(): Double
  /**
    * Inverts both components.
    */
  def invert(): Victor
  /**
    * Inverts the X component.
    */
  def invertX(): Victor
  /**
    * Inverts the Y component.
    */
  def invertY(): Victor
  /**
    * Returns a true if this vector is the same as another.
    * @param vector
    */
  def isEqualTo(vector: Victor): Boolean
  /**
    * Returns a true if vector is (0, 0).
    */
  def isZero(): Boolean
  /**
    * Returns the length / magnitude.
    */
  def length(): Double
  /**
    * Returns the squared length / magnitude. If the length is only needed for comparison, this function is faster than length.
    */
  def lengthSq(): Double
  /**
    * If either component is greater than max, multiplies the component by multiplier.
    * @param max
    * @param multiplier
    */
  def limit(max: Double, multiplier: Double): Victor
  /**
    * Alias for length.
    */
  def magnitude(): Double
  /**
    * Performs a linear blend / interpolation towards another vector.
    * @param vector
    * @param amount
    */
  def mix(vector: Victor, amount: Double): Victor
  /**
    * Performs a linear blend / interpolation of the X component towards another vector.
    * @param vector Number amount Value between 0 and 1. Default: 0.5
    * @param amount
    */
  def mixX(vector: Victor, amount: Double): Victor
  /**
    * Performs a linear blend / interpolation of the Y component towards another vector.
    * @param vector
    * @param amount
    */
  def mixY(vector: Victor, amount: Double): Victor
  /**
    * Multiplies both components with another vector.
    * @param vector
    */
  def multiply(vector: Victor): Victor
  /**
    * Multiplies both vector axis by the given scalar value
    *
    * @param scalar
    */
  def multiplyScalar(scalar: Double): Victor
  /**
    * Multiplies the X axis by the given scalar
    *
    * @param scalar
    */
  def multiplyScalarX(scalar: Double): Victor
  /**
    * Multiplies the Y axis by the given scalar
    *
    * @param scalar
    */
  def multiplyScalarY(scalar: Double): Victor
  /**
    * Multiplies the X component with the X component of another vector.
    * @param vector
    */
  def multiplyX(vector: Victor): Victor
  /**
    * Multiplies the Y component with the Y component of another vector.
    * @param vector
    */
  def multiplyY(vector: Victor): Victor
  /**
    * Alias of normalize.
    */
  def norm(): Victor
  /**
    * Normalizes the vector by scaling it down to a length of 1 while keeping its direction.
    */
  def normalize(): Victor
  /**
    * Projects a vector onto another vector, setting itself to the result.
    * @param vector
    */
  def projectOnto(vector: Victor): Victor
  /**
    * Randomizes the components with a value between topLeft and bottomRight.
    * @param topLeft
    * @param bottomRight
    */
  def randomize(topLeft: Victor, bottomRight: Victor): Victor
  /**
    * Randomly randomizes either the X component or the Y component with a value between topLeft and bottomRight.
    * @param topLeft
    * @param bottomRight
    */
  def randomizeAny(topLeft: Victor, bottomRight: Victor): Victor
  /**
    * Randomizes the X component with a value between topLeft and bottomRight.
    * @param topLeft
    * @param bottomRight
    */
  def randomizeX(topLeft: Victor, bottomRight: Victor): Victor
  /**
    * Randomizes the Y component with a value between topLeft and bottomRight.
    * @param topLeft
    * @param bottomRight
    */
  def randomizeY(topLeft: Victor, bottomRight: Victor): Victor
  /**
    * Rotates the vector to a certain angle, in radians CCW from +X axis.
    * @param angle
    */
  def rotate(angle: Double): Victor
  /**
    * Rotates the vector by a rotation angle, given in radians CCW from +X axis.
    * @param rotation
    */
  def rotateBy(rotation: Double): Victor
  /**
    * Same as rotateBy but uses degrees
    * @param rotation
    */
  def rotateByDeg(rotation: Double): Victor
  /**
    * Same as rotate but uses degrees
    * @param angle
    */
  def rotateDeg(angle: Double): Victor
  /**
    * Subtracts another vector from itself.
    * @param vector
    */
  def subtract(vector: Victor): Victor
  /**
    * Subtracts the given scalar from both axis.
    *
    * @param scalar
    */
  def subtractScalar(scalar: Double): Victor
  /**
    * Subtracts the given scalar from the X axis.
    *
    * @param scalar
    */
  def subtractScalarX(scalar: Double): Victor
  /**
    * Subtracts the given scalar from the Y axis.
    *
    * @param scalar
    */
  def subtractScalarY(scalar: Double): Victor
  /**
    * Subtracts another vector's X component from itself.
    * @param vector
    */
  def subtractX(vector: Victor): Victor
  /**
    * Subtracts another vector's Y component from itself.
    * @param vector
    */
  def subtractY(vector: Victor): Victor
  /**
    * Returns an array representation of the X and Y components.
    */
  def toArray(): js.Array[Double]
  /**
    * Rounds both axis to a certain precision.
    */
  def toFixed(): Victor
  /**
    * Returns an object representation of tha X and Y components.
    */
  def toObject(): VictorCoordinates
  /**
    * Rounds the components to integer numbers.
    */
  def unfloat(): Victor
  /**
    * Returns the angle towards Y in radians.
    */
  def verticalAngle(): Double
  /**
    * Same as verticalAngle but returns degrees.
    */
  def verticalAngleDeg(): Double
  /**
    * Sets the vector to zero (0,0).
    */
  def zero(): Victor
}

object Victor {
  @scala.inline
  def apply(
    absDistanceX: Victor => CallbackTo[Double],
    absDistanceY: Victor => CallbackTo[Double],
    add: Victor => CallbackTo[Victor],
    addScalar: Double => CallbackTo[Victor],
    addScalarX: Double => CallbackTo[Victor],
    addScalarY: Double => CallbackTo[Victor],
    addX: Victor => CallbackTo[Victor],
    addY: Victor => CallbackTo[Victor],
    angle: CallbackTo[Double],
    angleDeg: CallbackTo[Double],
    copy: Victor => CallbackTo[Victor],
    copyX: Victor => CallbackTo[Victor],
    copyY: Victor => CallbackTo[Victor],
    cross: Victor => CallbackTo[Double],
    direction: CallbackTo[Double],
    distance: Victor => CallbackTo[Double],
    distanceSq: Victor => CallbackTo[Double],
    distanceX: Victor => CallbackTo[Double],
    distanceY: Victor => CallbackTo[Double],
    divide: Victor => CallbackTo[Victor],
    divideScalar: Double => CallbackTo[Victor],
    divideScalarX: Double => CallbackTo[Victor],
    divideScalarY: Double => CallbackTo[Victor],
    divideX: Victor => CallbackTo[Victor],
    divideY: Victor => CallbackTo[Victor],
    dot: Victor => CallbackTo[Double],
    horizontalAngle: CallbackTo[Double],
    horizontalAngleDeg: CallbackTo[Double],
    invert: CallbackTo[Victor],
    invertX: CallbackTo[Victor],
    invertY: CallbackTo[Victor],
    isEqualTo: Victor => CallbackTo[Boolean],
    isZero: CallbackTo[Boolean],
    length: CallbackTo[Double],
    lengthSq: CallbackTo[Double],
    limit: (Double, Double) => CallbackTo[Victor],
    magnitude: CallbackTo[Double],
    mix: (Victor, Double) => CallbackTo[Victor],
    mixX: (Victor, Double) => CallbackTo[Victor],
    mixY: (Victor, Double) => CallbackTo[Victor],
    multiply: Victor => CallbackTo[Victor],
    multiplyScalar: Double => CallbackTo[Victor],
    multiplyScalarX: Double => CallbackTo[Victor],
    multiplyScalarY: Double => CallbackTo[Victor],
    multiplyX: Victor => CallbackTo[Victor],
    multiplyY: Victor => CallbackTo[Victor],
    norm: CallbackTo[Victor],
    normalize: CallbackTo[Victor],
    projectOnto: Victor => CallbackTo[Victor],
    randomize: (Victor, Victor) => CallbackTo[Victor],
    randomizeAny: (Victor, Victor) => CallbackTo[Victor],
    randomizeX: (Victor, Victor) => CallbackTo[Victor],
    randomizeY: (Victor, Victor) => CallbackTo[Victor],
    rotate: Double => CallbackTo[Victor],
    rotateBy: Double => CallbackTo[Victor],
    rotateByDeg: Double => CallbackTo[Victor],
    rotateDeg: Double => CallbackTo[Victor],
    subtract: Victor => CallbackTo[Victor],
    subtractScalar: Double => CallbackTo[Victor],
    subtractScalarX: Double => CallbackTo[Victor],
    subtractScalarY: Double => CallbackTo[Victor],
    subtractX: Victor => CallbackTo[Victor],
    subtractY: Victor => CallbackTo[Victor],
    toArray: CallbackTo[js.Array[Double]],
    toFixed: CallbackTo[Victor],
    toObject: CallbackTo[VictorCoordinates],
    unfloat: CallbackTo[Victor],
    verticalAngle: CallbackTo[Double],
    verticalAngleDeg: CallbackTo[Double],
    x: Double,
    y: Double,
    zero: CallbackTo[Victor]
  ): Victor = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("absDistanceX")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => absDistanceX(t0).runNow()))
    __obj.updateDynamic("absDistanceY")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => absDistanceY(t0).runNow()))
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => add(t0).runNow()))
    __obj.updateDynamic("addScalar")(js.Any.fromFunction1((t0: scala.Double) => addScalar(t0).runNow()))
    __obj.updateDynamic("addScalarX")(js.Any.fromFunction1((t0: scala.Double) => addScalarX(t0).runNow()))
    __obj.updateDynamic("addScalarY")(js.Any.fromFunction1((t0: scala.Double) => addScalarY(t0).runNow()))
    __obj.updateDynamic("addX")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => addX(t0).runNow()))
    __obj.updateDynamic("addY")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => addY(t0).runNow()))
    __obj.updateDynamic("angle")(angle.toJsFn)
    __obj.updateDynamic("angleDeg")(angleDeg.toJsFn)
    __obj.updateDynamic("copy")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => copy(t0).runNow()))
    __obj.updateDynamic("copyX")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => copyX(t0).runNow()))
    __obj.updateDynamic("copyY")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => copyY(t0).runNow()))
    __obj.updateDynamic("cross")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => cross(t0).runNow()))
    __obj.updateDynamic("direction")(direction.toJsFn)
    __obj.updateDynamic("distance")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => distance(t0).runNow()))
    __obj.updateDynamic("distanceSq")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => distanceSq(t0).runNow()))
    __obj.updateDynamic("distanceX")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => distanceX(t0).runNow()))
    __obj.updateDynamic("distanceY")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => distanceY(t0).runNow()))
    __obj.updateDynamic("divide")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => divide(t0).runNow()))
    __obj.updateDynamic("divideScalar")(js.Any.fromFunction1((t0: scala.Double) => divideScalar(t0).runNow()))
    __obj.updateDynamic("divideScalarX")(js.Any.fromFunction1((t0: scala.Double) => divideScalarX(t0).runNow()))
    __obj.updateDynamic("divideScalarY")(js.Any.fromFunction1((t0: scala.Double) => divideScalarY(t0).runNow()))
    __obj.updateDynamic("divideX")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => divideX(t0).runNow()))
    __obj.updateDynamic("divideY")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => divideY(t0).runNow()))
    __obj.updateDynamic("dot")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => dot(t0).runNow()))
    __obj.updateDynamic("horizontalAngle")(horizontalAngle.toJsFn)
    __obj.updateDynamic("horizontalAngleDeg")(horizontalAngleDeg.toJsFn)
    __obj.updateDynamic("invert")(invert.toJsFn)
    __obj.updateDynamic("invertX")(invertX.toJsFn)
    __obj.updateDynamic("invertY")(invertY.toJsFn)
    __obj.updateDynamic("isEqualTo")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => isEqualTo(t0).runNow()))
    __obj.updateDynamic("isZero")(isZero.toJsFn)
    __obj.updateDynamic("length")(length.toJsFn)
    __obj.updateDynamic("lengthSq")(lengthSq.toJsFn)
    __obj.updateDynamic("limit")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => limit(t0, t1).runNow()))
    __obj.updateDynamic("magnitude")(magnitude.toJsFn)
    __obj.updateDynamic("mix")(js.Any.fromFunction2((t0: typingsJapgolly.victor.mod.Victor, t1: scala.Double) => mix(t0, t1).runNow()))
    __obj.updateDynamic("mixX")(js.Any.fromFunction2((t0: typingsJapgolly.victor.mod.Victor, t1: scala.Double) => mixX(t0, t1).runNow()))
    __obj.updateDynamic("mixY")(js.Any.fromFunction2((t0: typingsJapgolly.victor.mod.Victor, t1: scala.Double) => mixY(t0, t1).runNow()))
    __obj.updateDynamic("multiply")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => multiply(t0).runNow()))
    __obj.updateDynamic("multiplyScalar")(js.Any.fromFunction1((t0: scala.Double) => multiplyScalar(t0).runNow()))
    __obj.updateDynamic("multiplyScalarX")(js.Any.fromFunction1((t0: scala.Double) => multiplyScalarX(t0).runNow()))
    __obj.updateDynamic("multiplyScalarY")(js.Any.fromFunction1((t0: scala.Double) => multiplyScalarY(t0).runNow()))
    __obj.updateDynamic("multiplyX")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => multiplyX(t0).runNow()))
    __obj.updateDynamic("multiplyY")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => multiplyY(t0).runNow()))
    __obj.updateDynamic("norm")(norm.toJsFn)
    __obj.updateDynamic("normalize")(normalize.toJsFn)
    __obj.updateDynamic("projectOnto")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => projectOnto(t0).runNow()))
    __obj.updateDynamic("randomize")(js.Any.fromFunction2((t0: typingsJapgolly.victor.mod.Victor, t1: typingsJapgolly.victor.mod.Victor) => randomize(t0, t1).runNow()))
    __obj.updateDynamic("randomizeAny")(js.Any.fromFunction2((t0: typingsJapgolly.victor.mod.Victor, t1: typingsJapgolly.victor.mod.Victor) => randomizeAny(t0, t1).runNow()))
    __obj.updateDynamic("randomizeX")(js.Any.fromFunction2((t0: typingsJapgolly.victor.mod.Victor, t1: typingsJapgolly.victor.mod.Victor) => randomizeX(t0, t1).runNow()))
    __obj.updateDynamic("randomizeY")(js.Any.fromFunction2((t0: typingsJapgolly.victor.mod.Victor, t1: typingsJapgolly.victor.mod.Victor) => randomizeY(t0, t1).runNow()))
    __obj.updateDynamic("rotate")(js.Any.fromFunction1((t0: scala.Double) => rotate(t0).runNow()))
    __obj.updateDynamic("rotateBy")(js.Any.fromFunction1((t0: scala.Double) => rotateBy(t0).runNow()))
    __obj.updateDynamic("rotateByDeg")(js.Any.fromFunction1((t0: scala.Double) => rotateByDeg(t0).runNow()))
    __obj.updateDynamic("rotateDeg")(js.Any.fromFunction1((t0: scala.Double) => rotateDeg(t0).runNow()))
    __obj.updateDynamic("subtract")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => subtract(t0).runNow()))
    __obj.updateDynamic("subtractScalar")(js.Any.fromFunction1((t0: scala.Double) => subtractScalar(t0).runNow()))
    __obj.updateDynamic("subtractScalarX")(js.Any.fromFunction1((t0: scala.Double) => subtractScalarX(t0).runNow()))
    __obj.updateDynamic("subtractScalarY")(js.Any.fromFunction1((t0: scala.Double) => subtractScalarY(t0).runNow()))
    __obj.updateDynamic("subtractX")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => subtractX(t0).runNow()))
    __obj.updateDynamic("subtractY")(js.Any.fromFunction1((t0: typingsJapgolly.victor.mod.Victor) => subtractY(t0).runNow()))
    __obj.updateDynamic("toArray")(toArray.toJsFn)
    __obj.updateDynamic("toFixed")(toFixed.toJsFn)
    __obj.updateDynamic("toObject")(toObject.toJsFn)
    __obj.updateDynamic("unfloat")(unfloat.toJsFn)
    __obj.updateDynamic("verticalAngle")(verticalAngle.toJsFn)
    __obj.updateDynamic("verticalAngleDeg")(verticalAngleDeg.toJsFn)
    __obj.updateDynamic("zero")(zero.toJsFn)
    __obj.asInstanceOf[Victor]
  }
}

