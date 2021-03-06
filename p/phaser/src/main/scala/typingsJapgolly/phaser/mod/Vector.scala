package typingsJapgolly.phaser.mod

import typingsJapgolly.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Matter.Vector` module contains methods for creating and manipulating vectors.
  * Vectors are the basis of all the geometry related operations in the engine.
  * A `Matter.Vector` object is of the form `{ x: 0, y: 0 }`.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class Vector
  */
@JSImport("matter", "Vector")
@js.native
class Vector ()
  extends typingsJapgolly.phaser.MatterJS.Vector

/* static members */
@JSImport("matter", "Vector")
@js.native
object Vector extends js.Object {
  /**
    * Adds the two vectors.
    * @method add
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} [output]
    * @return {vector} A new vector of vectorA and vectorB added
    */
  def add(vectorA: typingsJapgolly.phaser.MatterJS.Vector, vectorB: typingsJapgolly.phaser.MatterJS.Vector): typingsJapgolly.phaser.MatterJS.Vector = js.native
  def add(
    vectorA: typingsJapgolly.phaser.MatterJS.Vector,
    vectorB: typingsJapgolly.phaser.MatterJS.Vector,
    output: typingsJapgolly.phaser.MatterJS.Vector
  ): typingsJapgolly.phaser.MatterJS.Vector = js.native
  /**
    * Returns the angle in radians between the two vectors relative to the x-axis.
    * @method angle
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The angle in radians
    */
  def angle(vectorA: typingsJapgolly.phaser.MatterJS.Vector, vectorB: typingsJapgolly.phaser.MatterJS.Vector): Double = js.native
  /**
    * Returns a new vector with `x` and `y` copied from the given `vector`.
    * @method clone
    * @param {vector} vector
    * @return {vector} A new cloned vector
    */
  def clone(vector: typingsJapgolly.phaser.MatterJS.Vector): typingsJapgolly.phaser.MatterJS.Vector = js.native
  /**
    * Creates a new vector.
    * @method create
    * @param {number} x
    * @param {number} y
    * @return {vector} A new vector
    */
  def create(): typingsJapgolly.phaser.MatterJS.Vector = js.native
  def create(x: Double): typingsJapgolly.phaser.MatterJS.Vector = js.native
  def create(x: Double, y: Double): typingsJapgolly.phaser.MatterJS.Vector = js.native
  /**
    * Returns the cross-product of two vectors.
    * @method cross
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The cross product of the two vectors
    */
  def cross(vectorA: typingsJapgolly.phaser.MatterJS.Vector, vectorB: typingsJapgolly.phaser.MatterJS.Vector): Double = js.native
  /**
    * Returns the cross-product of three vectors.
    * @method cross3
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} vectorC
    * @return {number} The cross product of the three vectors
    */
  def cross3(
    vectorA: typingsJapgolly.phaser.MatterJS.Vector,
    vectorB: typingsJapgolly.phaser.MatterJS.Vector,
    vectorC: typingsJapgolly.phaser.MatterJS.Vector
  ): Double = js.native
  /**
    * Divides a vector and a scalar.
    * @method div
    * @param {vector} vector
    * @param {number} scalar
    * @return {vector} A new vector divided by scalar
    */
  def div(vector: typingsJapgolly.phaser.MatterJS.Vector, scalar: Double): typingsJapgolly.phaser.MatterJS.Vector = js.native
  /**
    * Returns the dot-product of two vectors.
    * @method dot
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The dot product of the two vectors
    */
  def dot(vectorA: typingsJapgolly.phaser.MatterJS.Vector, vectorB: typingsJapgolly.phaser.MatterJS.Vector): Number = js.native
  /**
    * Returns the magnitude (length) of a vector.
    * @method magnitude
    * @param {vector} vector
    * @return {number} The magnitude of the vector
    */
  def magnitude(vector: typingsJapgolly.phaser.MatterJS.Vector): Double = js.native
  /**
    * Returns the magnitude (length) of a vector (therefore saving a `sqrt` operation).
    * @method magnitudeSquared
    * @param {vector} vector
    * @return {number} The squared magnitude of the vector
    */
  def magnitudeSquared(vector: typingsJapgolly.phaser.MatterJS.Vector): Double = js.native
  /**
    * Multiplies a vector and a scalar.
    * @method mult
    * @param {vector} vector
    * @param {number} scalar
    * @return {vector} A new vector multiplied by scalar
    */
  def mult(vector: typingsJapgolly.phaser.MatterJS.Vector, scalar: Double): typingsJapgolly.phaser.MatterJS.Vector = js.native
  /**
    * Negates both components of a vector such that it points in the opposite direction.
    * @method neg
    * @param {vector} vector
    * @return {vector} The negated vector
    */
  def neg(vector: typingsJapgolly.phaser.MatterJS.Vector): typingsJapgolly.phaser.MatterJS.Vector = js.native
  /**
    * Normalises a vector (such that its magnitude is `1`).
    * @method normalise
    * @param {vector} vector
    * @return {vector} A new vector normalised
    */
  def normalise(vector: typingsJapgolly.phaser.MatterJS.Vector): typingsJapgolly.phaser.MatterJS.Vector = js.native
  /**
    * Returns the perpendicular vector. Set `negate` to true for the perpendicular in the opposite direction.
    * @method perp
    * @param {vector} vector
    * @param {bool} [negate=false]
    * @return {vector} The perpendicular vector
    */
  def perp(vector: typingsJapgolly.phaser.MatterJS.Vector): typingsJapgolly.phaser.MatterJS.Vector = js.native
  def perp(vector: typingsJapgolly.phaser.MatterJS.Vector, negate: Boolean): typingsJapgolly.phaser.MatterJS.Vector = js.native
  /**
    * Rotates the vector about (0, 0) by specified angle.
    * @method rotate
    * @param {vector} vector
    * @param {number} angle
    * @return {vector} A new vector rotated about (0, 0)
    */
  def rotate(vector: typingsJapgolly.phaser.MatterJS.Vector, angle: Double): typingsJapgolly.phaser.MatterJS.Vector = js.native
  /**
    * Rotates the vector about a specified point by specified angle.
    * @method rotateAbout
    * @param {vector} vector
    * @param {number} angle
    * @param {vector} point
    * @param {vector} [output]
    * @return {vector} A new vector rotated about the point
    */
  def rotateAbout(
    vector: typingsJapgolly.phaser.MatterJS.Vector,
    angle: Double,
    point: typingsJapgolly.phaser.MatterJS.Vector
  ): typingsJapgolly.phaser.MatterJS.Vector = js.native
  def rotateAbout(
    vector: typingsJapgolly.phaser.MatterJS.Vector,
    angle: Double,
    point: typingsJapgolly.phaser.MatterJS.Vector,
    output: typingsJapgolly.phaser.MatterJS.Vector
  ): typingsJapgolly.phaser.MatterJS.Vector = js.native
  /**
    * Subtracts the two vectors.
    * @method sub
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} [output]
    * @return {vector} A new vector of vectorA and vectorB subtracted
    */
  def sub(vectorA: typingsJapgolly.phaser.MatterJS.Vector, vectorB: typingsJapgolly.phaser.MatterJS.Vector): typingsJapgolly.phaser.MatterJS.Vector = js.native
  def sub(
    vectorA: typingsJapgolly.phaser.MatterJS.Vector,
    vectorB: typingsJapgolly.phaser.MatterJS.Vector,
    optional: typingsJapgolly.phaser.MatterJS.Vector
  ): typingsJapgolly.phaser.MatterJS.Vector = js.native
}

