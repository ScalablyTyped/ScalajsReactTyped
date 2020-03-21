package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.math
  * @namespace
  * @description Math API.
  */
@JSImport("playcanvas", "math")
@js.native
object math extends js.Object {
  /**
    * @constant
    * @type {number}
    * @name pc.math.DEG_TO_RAD
    * @description Conversion factor between degrees and radians.
    * @example
    * // Convert 180 degrees to pi radians
    * var rad = 180 * pc.math.DEG_TO_RAD;
    */
  val DEG_TO_RAD: Double = js.native
  /**
    * @constant
    * @type {number}
    * @name pc.math.RAD_TO_DEG
    * @description Conversion factor between degrees and radians.
    * @example
    * // Convert pi radians to 180 degrees
    * var deg = Math.PI * pc.math.RAD_TO_DEG;
    */
  val RAD_TO_DEG: Double = js.native
  /**
    * @function
    * @name pc.math.bytesToInt24
    * @description Convert 3 8 bit Numbers into a single unsigned 24 bit Number.
    * @example
    * // Set result1 to 0x112233 from an array of 3 values
    * var result1 = pc.math.bytesToInt24([0x11, 0x22, 0x33]);
    *
    * // Set result2 to 0x112233 from 3 discrete values
    * var result2 = pc.math.bytesToInt24(0x11, 0x22, 0x33);
    * @param {number} r - A single byte (0-255).
    * @param {number} g - A single byte (0-255).
    * @param {number} b - A single byte (0-255).
    * @returns {number} A single unsigned 24 bit Number.
    */
  def bytesToInt24(r: Double, g: Double, b: Double): Double = js.native
  /**
    * @function
    * @name pc.math.bytesToInt32
    * @description Convert 4 1-byte Numbers into a single unsigned 32bit Number.
    * @returns {number} A single unsigned 32bit Number.
    * @example
    * // Set result1 to 0x11223344 from an array of 4 values
    * var result1 = pc.math.bytesToInt32([0x11, 0x22, 0x33, 0x44]);
    *
    * // Set result2 to 0x11223344 from 4 discrete values
    * var result2 = pc.math.bytesToInt32(0x11, 0x22, 0x33, 0x44);
    * @param {number} r - A single byte (0-255).
    * @param {number} g - A single byte (0-255).
    * @param {number} b - A single byte (0-255).
    * @param {number} a - A single byte (0-255).
    */
  def bytesToInt32(r: Double, g: Double, b: Double, a: Double): Double = js.native
  /**
    * @function
    * @name pc.math.clamp
    * @description Clamp a number between min and max inclusive.
    * @param {number} value - Number to clamp.
    * @param {number} min - Min value.
    * @param {number} max - Max value.
    * @returns {number} The clamped value.
    */
  def clamp(value: Double, min: Double, max: Double): Double = js.native
  /**
    * @function
    * @name pc.math.intToBytes24
    * @description Convert an 24 bit integer into an array of 3 bytes.
    * @param {number} i - Number holding an integer value.
    * @returns {number[]} An array of 3 bytes.
    * @example
    * // Set bytes to [0x11, 0x22, 0x33]
    * var bytes = pc.math.intToBytes24(0x112233);
    */
  def intToBytes24(i: Double): js.Array[Double] = js.native
  /**
    * @function
    * @name pc.math.intToBytes32
    * @description Convert an 32 bit integer into an array of 4 bytes.
    * @returns {number[]} An array of 4 bytes.
    * @param {number} i - Number holding an integer value.
    * @example
    * // Set bytes to [0x11, 0x22, 0x33, 0x44]
    * var bytes = pc.math.intToBytes32(0x11223344);
    */
  def intToBytes32(i: Double): js.Array[Double] = js.native
  /**
    * @function
    * @name pc.math.lerp
    * @returns {number} The linear interpolation of two numbers.
    * @description Calculates the linear interpolation of two numbers.
    * @param {number} a - Number to linearly interpolate from.
    * @param {number} b - Number to linearly interpolate to.
    * @param {number} alpha - The value controlling the result of interpolation. When alpha is 0,
    * a is returned. When alpha is 1, b is returned. Between 0 and 1, a linear interpolation between
    * a and b is returned. alpha is clamped between 0 and 1.
    */
  def lerp(a: Double, b: Double, alpha: Double): Double = js.native
  /**
    * @function
    * @name pc.math.lerpAngle
    * @description Calculates the linear interpolation of two angles ensuring that interpolation
    * is correctly performed across the 360 to 0 degree boundary. Angles are supplied in degrees.
    * @returns {number} The linear interpolation of two angles.
    * @param {number} a - Angle (in degrees) to linearly interpolate from.
    * @param {number} b - Angle (in degrees) to linearly interpolate to.
    * @param {number} alpha - The value controlling the result of interpolation. When alpha is 0,
    * a is returned. When alpha is 1, b is returned. Between 0 and 1, a linear interpolation between
    * a and b is returned. alpha is clamped between 0 and 1.
    */
  def lerpAngle(a: Double, b: Double, alpha: Double): Double = js.native
  /**
    * @function
    * @name pc.math.nextPowerOfTwo
    * @description Returns the next power of 2 for the specified value.
    * @param {number} val - The value for which to calculate the next power of 2.
    * @returns {number} The next power of 2.
    */
  def nextPowerOfTwo(`val`: Double): Double = js.native
  /**
    * @function
    * @name pc.math.powerOfTwo
    * @description Returns true if argument is a power-of-two and false otherwise.
    * @param {number} x - Number to check for power-of-two property.
    * @returns {boolean} True if power-of-two and false otherwise.
    */
  def powerOfTwo(x: Double): Boolean = js.native
  /**
    * @function
    * @name pc.math.random
    * @description Return a pseudo-random number between min and max.
    * The number generated is in the range [min, max), that is inclusive of the minimum but exclusive of the maximum.
    * @param {number} min - Lower bound for range.
    * @param {number} max - Upper bound for range.
    * @returns {number} Pseudo-random number between the supplied range.
    */
  def random(min: Double, max: Double): Double = js.native
  /**
    * @function
    * @name pc.math.smootherstep
    * @description An improved version of the pc.math.smoothstep function which has zero
    * 1st and 2nd order derivatives at t=0 and t=1.
    * <br/>See http://en.wikipedia.org/wiki/Smoothstep for more details.
    * @param {number} min - The lower bound of the interpolation range.
    * @param {number} max - The upper bound of the interpolation range.
    * @param {number} x - The value to interpolate.
    * @returns {number} The smoothly interpolated value clamped between zero and one.
    */
  def smootherstep(min: Double, max: Double, x: Double): Double = js.native
  /**
    * @function
    * @name pc.math.smoothstep
    * @description The function interpolates smoothly between two input values based on
    * a third one that should be between the first two. The returned value is clamped
    * between 0 and 1.
    * <br/>The slope (i.e. derivative) of the smoothstep function starts at 0 and ends at 0.
    * This makes it easy to create a sequence of transitions using smoothstep to interpolate
    * each segment rather than using a more sophisticated or expensive interpolation technique.
    * <br/>See http://en.wikipedia.org/wiki/Smoothstep for more details.
    * @param {number} min - The lower bound of the interpolation range.
    * @param {number} max - The upper bound of the interpolation range.
    * @param {number} x - The value to interpolate.
    * @returns {number} The smoothly interpolated value clamped between zero and one.
    */
  def smoothstep(min: Double, max: Double, x: Double): Double = js.native
}

