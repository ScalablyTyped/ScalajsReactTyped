package typingsJapgolly.phaser.matterMod

import typingsJapgolly.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
open class Vector ()
  extends StObject
     with typingsJapgolly.phaser.MatterJS.Vector {
  
  /* CompleteClass */
  var x: Double = js.native
  
  /* CompleteClass */
  var y: Double = js.native
}
object Vector {
  
  @JSImport("matter", "Vector")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds the two vectors.
    * @method add
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} [output]
    * @return {vector} A new vector of vectorA and vectorB added
    */
  /* static member */
  inline def add(vectorA: typingsJapgolly.phaser.MatterJS.Vector, vectorB: typingsJapgolly.phaser.MatterJS.Vector): typingsJapgolly.phaser.MatterJS.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.MatterJS.Vector]
  inline def add(
    vectorA: typingsJapgolly.phaser.MatterJS.Vector,
    vectorB: typingsJapgolly.phaser.MatterJS.Vector,
    output: typingsJapgolly.phaser.MatterJS.Vector
  ): typingsJapgolly.phaser.MatterJS.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.MatterJS.Vector]
  
  /**
    * Returns the angle in radians between the two vectors relative to the x-axis.
    * @method angle
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The angle in radians
    */
  /* static member */
  inline def angle(vectorA: typingsJapgolly.phaser.MatterJS.Vector, vectorB: typingsJapgolly.phaser.MatterJS.Vector): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns a new vector with `x` and `y` copied from the given `vector`.
    * @method clone
    * @param {vector} vector
    * @return {vector} A new cloned vector
    */
  /* static member */
  inline def clone_(vector: typingsJapgolly.phaser.MatterJS.Vector): typingsJapgolly.phaser.MatterJS.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(vector.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.MatterJS.Vector]
  
  /**
    * Creates a new vector.
    * @method create
    * @param {number} x
    * @param {number} y
    * @return {vector} A new vector
    */
  /* static member */
  inline def create(): typingsJapgolly.phaser.MatterJS.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.phaser.MatterJS.Vector]
  inline def create(x: Double): typingsJapgolly.phaser.MatterJS.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.MatterJS.Vector]
  inline def create(x: Double, y: Double): typingsJapgolly.phaser.MatterJS.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.MatterJS.Vector]
  inline def create(x: Unit, y: Double): typingsJapgolly.phaser.MatterJS.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.MatterJS.Vector]
  
  /**
    * Returns the cross-product of two vectors.
    * @method cross
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The cross product of the two vectors
    */
  /* static member */
  inline def cross(vectorA: typingsJapgolly.phaser.MatterJS.Vector, vectorB: typingsJapgolly.phaser.MatterJS.Vector): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns the cross-product of three vectors.
    * @method cross3
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} vectorC
    * @return {number} The cross product of the three vectors
    */
  /* static member */
  inline def cross3(
    vectorA: typingsJapgolly.phaser.MatterJS.Vector,
    vectorB: typingsJapgolly.phaser.MatterJS.Vector,
    vectorC: typingsJapgolly.phaser.MatterJS.Vector
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cross3")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any], vectorC.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Divides a vector and a scalar.
    * @method div
    * @param {vector} vector
    * @param {number} scalar
    * @return {vector} A new vector divided by scalar
    */
  /* static member */
  inline def div(vector: typingsJapgolly.phaser.MatterJS.Vector, scalar: Double): typingsJapgolly.phaser.MatterJS.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(vector.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.MatterJS.Vector]
  
  /**
    * Returns the dot-product of two vectors.
    * @method dot
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The dot product of the two vectors
    */
  /* static member */
  inline def dot(vectorA: typingsJapgolly.phaser.MatterJS.Vector, vectorB: typingsJapgolly.phaser.MatterJS.Vector): Number = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any])).asInstanceOf[Number]
  
  /**
    * Returns the magnitude (length) of a vector.
    * @method magnitude
    * @param {vector} vector
    * @return {number} The magnitude of the vector
    */
  /* static member */
  inline def magnitude(vector: typingsJapgolly.phaser.MatterJS.Vector): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitude")(vector.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Returns the magnitude (length) of a vector (therefore saving a `sqrt` operation).
    * @method magnitudeSquared
    * @param {vector} vector
    * @return {number} The squared magnitude of the vector
    */
  /* static member */
  inline def magnitudeSquared(vector: typingsJapgolly.phaser.MatterJS.Vector): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitudeSquared")(vector.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Multiplies a vector and a scalar.
    * @method mult
    * @param {vector} vector
    * @param {number} scalar
    * @return {vector} A new vector multiplied by scalar
    */
  /* static member */
  inline def mult(vector: typingsJapgolly.phaser.MatterJS.Vector, scalar: Double): typingsJapgolly.phaser.MatterJS.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("mult")(vector.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.MatterJS.Vector]
  
  /**
    * Negates both components of a vector such that it points in the opposite direction.
    * @method neg
    * @param {vector} vector
    * @return {vector} The negated vector
    */
  /* static member */
  inline def neg(vector: typingsJapgolly.phaser.MatterJS.Vector): typingsJapgolly.phaser.MatterJS.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("neg")(vector.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.MatterJS.Vector]
  
  /**
    * Normalises a vector (such that its magnitude is `1`).
    * @method normalise
    * @param {vector} vector
    * @return {vector} A new vector normalised
    */
  /* static member */
  inline def normalise(vector: typingsJapgolly.phaser.MatterJS.Vector): typingsJapgolly.phaser.MatterJS.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("normalise")(vector.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.MatterJS.Vector]
  
  /**
    * Returns the perpendicular vector. Set `negate` to true for the perpendicular in the opposite direction.
    * @method perp
    * @param {vector} vector
    * @param {bool} [negate=false]
    * @return {vector} The perpendicular vector
    */
  /* static member */
  inline def perp(vector: typingsJapgolly.phaser.MatterJS.Vector): typingsJapgolly.phaser.MatterJS.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("perp")(vector.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.MatterJS.Vector]
  inline def perp(vector: typingsJapgolly.phaser.MatterJS.Vector, negate: Boolean): typingsJapgolly.phaser.MatterJS.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("perp")(vector.asInstanceOf[js.Any], negate.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.MatterJS.Vector]
  
  /**
    * Rotates the vector about (0, 0) by specified angle.
    * @method rotate
    * @param {vector} vector
    * @param {number} angle
    * @return {vector} A new vector rotated about (0, 0)
    */
  /* static member */
  inline def rotate(vector: typingsJapgolly.phaser.MatterJS.Vector, angle: Double): typingsJapgolly.phaser.MatterJS.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(vector.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.MatterJS.Vector]
  
  /**
    * Rotates the vector about a specified point by specified angle.
    * @method rotateAbout
    * @param {vector} vector
    * @param {number} angle
    * @param {vector} point
    * @param {vector} [output]
    * @return {vector} A new vector rotated about the point
    */
  /* static member */
  inline def rotateAbout(
    vector: typingsJapgolly.phaser.MatterJS.Vector,
    angle: Double,
    point: typingsJapgolly.phaser.MatterJS.Vector
  ): typingsJapgolly.phaser.MatterJS.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateAbout")(vector.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.MatterJS.Vector]
  inline def rotateAbout(
    vector: typingsJapgolly.phaser.MatterJS.Vector,
    angle: Double,
    point: typingsJapgolly.phaser.MatterJS.Vector,
    output: typingsJapgolly.phaser.MatterJS.Vector
  ): typingsJapgolly.phaser.MatterJS.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateAbout")(vector.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], point.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.MatterJS.Vector]
  
  /**
    * Subtracts the two vectors.
    * @method sub
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} [output]
    * @return {vector} A new vector of vectorA and vectorB subtracted
    */
  /* static member */
  inline def sub(vectorA: typingsJapgolly.phaser.MatterJS.Vector, vectorB: typingsJapgolly.phaser.MatterJS.Vector): typingsJapgolly.phaser.MatterJS.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.MatterJS.Vector]
  inline def sub(
    vectorA: typingsJapgolly.phaser.MatterJS.Vector,
    vectorB: typingsJapgolly.phaser.MatterJS.Vector,
    optional: typingsJapgolly.phaser.MatterJS.Vector
  ): typingsJapgolly.phaser.MatterJS.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.MatterJS.Vector]
}
