package typingsJapgolly.babylonjs.mathsMathMod

import typingsJapgolly.babylonjs.typesMod.DeepImmutable
import typingsJapgolly.babylonjs.typesMod.float
import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Maths/math", "Vector3")
@js.native
/**
  * Creates a new Vector3 object from the given x, y, z (floats) coordinates.
  * @param x defines the first coordinates (on X axis)
  * @param y defines the second coordinates (on Y axis)
  * @param z defines the third coordinates (on Z axis)
  */
open class Vector3 ()
  extends typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Unit, z: Double) = this()
  def this(x: Unit, y: Double, z: Double) = this()
  def this(x: Unit, y: Unit, z: Double) = this()
}
/* static members */
object Vector3 {
  
  @JSImport("babylonjs/Maths/math", "Vector3")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a new Vector3 set to (0.0, 0.0, -1.0)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#71
    * @param rightHandedSystem is the scene right-handed (negative-z)
    * @returns a new Backward Vector3
    */
  inline def Backward(): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Backward")().asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  inline def Backward(rightHandedSystem: Boolean): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Backward")(rightHandedSystem.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Returns a new Vector3 located for "amount" on the CatmullRom interpolation spline defined by the vectors "value1", "value2", "value3", "value4"
    * Example Playground https://playground.babylonjs.com/#R1F8YU#69
    * @param value1 defines the first control point
    * @param value2 defines the second control point
    * @param value3 defines the third control point
    * @param value4 defines the fourth control point
    * @param amount defines the amount on the spline to use
    * @returns the new Vector3
    */
  inline def CatmullRom(
    value1: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    value2: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    value3: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    value4: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    amount: Double
  ): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("CatmullRom")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], value3.asInstanceOf[js.Any], value4.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Returns a new Vector3 located at the center between "value1" and "value2"
    * Example Playground https://playground.babylonjs.com/#R1F8YU#72
    * @param value1 defines the first operand
    * @param value2 defines the second operand
    * @returns the new Vector3
    */
  inline def Center(
    value1: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    value2: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  ): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("Center")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Gets the center of the vectors "value1" and "value2" and stores the result in the vector "ref"
    * Example Playground https://playground.babylonjs.com/#R1F8YU#73
    * @param value1 defines first vector
    * @param value2 defines second vector
    * @param ref defines third vector
    * @returns ref
    */
  inline def CenterToRef(
    value1: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    value2: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    ref: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  ): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("CenterToRef")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Checks if a given vector is inside a specific range
    * Example Playground https://playground.babylonjs.com/#R1F8YU#75
    * @param v defines the vector to test
    * @param min defines the minimum range
    * @param max defines the maximum range
    */
  inline def CheckExtends(
    v: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    min: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    max: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CheckExtends")(v.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns a new Vector3 set with the coordinates of "value", if the vector "value" is in the cube defined by the vectors "min" and "max"
    * If a coordinate value of "value" is lower than one of the "min" coordinate, then this "value" coordinate is set with the "min" one
    * If a coordinate value of "value" is greater than one of the "max" coordinate, then this "value" coordinate is set with the "max" one
    * Example Playground https://playground.babylonjs.com/#R1F8YU#76
    * @param value defines the current value
    * @param min defines the lower range value
    * @param max defines the upper range value
    * @returns the new Vector3
    */
  inline def Clamp(
    value: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    min: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    max: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  ): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("Clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Sets the given vector "result" with the coordinates of "value", if the vector "value" is in the cube defined by the vectors "min" and "max"
    * If a coordinate value of "value" is lower than one of the "min" coordinate, then this "value" coordinate is set with the "min" one
    * If a coordinate value of "value" is greater than one of the "max" coordinate, then this "value" coordinate is set with the "max" one
    * Example Playground https://playground.babylonjs.com/#R1F8YU#77
    * @param value defines the current value
    * @param min defines the lower range value
    * @param max defines the upper range value
    * @param result defines the Vector3 where to store the result
    */
  inline def ClampToRef(
    value: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    min: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    max: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    result: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ClampToRef")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns a new Vector3 as the cross product of the vectors "left" and "right"
    * The cross product is then orthogonal to both "left" and "right"
    * Example Playground https://playground.babylonjs.com/#R1F8YU#15
    * @param left defines the left operand
    * @param right defines the right operand
    * @returns the cross product
    */
  inline def Cross(
    left: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    right: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  ): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("Cross")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Sets the given vector "result" with the cross product of "left" and "right"
    * The cross product is then orthogonal to both "left" and "right"
    * Example Playground https://playground.babylonjs.com/#R1F8YU#78
    * @param left defines the left operand
    * @param right defines the right operand
    * @param result defines the Vector3 where to store the result
    */
  inline def CrossToRef(
    left: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    right: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    result: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CrossToRef")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns the distance between the vectors "value1" and "value2"
    * Example Playground https://playground.babylonjs.com/#R1F8YU#81
    * @param value1 defines the first operand
    * @param value2 defines the second operand
    * @returns the distance
    */
  inline def Distance(
    value1: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    value2: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Distance")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns the squared distance between the vectors "value1" and "value2"
    * Example Playground https://playground.babylonjs.com/#R1F8YU#80
    * @param value1 defines the first operand
    * @param value2 defines the second operand
    * @returns the squared distance
    */
  inline def DistanceSquared(
    value1: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    value2: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("DistanceSquared")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns the dot product (float) between the vectors "left" and "right"
    * Example Playground https://playground.babylonjs.com/#R1F8YU#82
    * @param left defines the left operand
    * @param right defines the right operand
    * @returns the dot product
    */
  inline def Dot(
    left: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    right: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Dot")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns a new Vector3 set to (0.0, -1.0, 0.0)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#71
    * @returns a new down Vector3
    */
  inline def Down(): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Down")().asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Returns a new Vector3 set to (0.0, 0.0, 1.0)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#71
    * @param rightHandedSystem is the scene right-handed (negative z)
    * @returns a new forward Vector3
    */
  inline def Forward(): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Forward")().asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  inline def Forward(rightHandedSystem: Boolean): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Forward")(rightHandedSystem.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Returns a new Vector3 set from the index "offset" of the given array
    * Example Playground https://playground.babylonjs.com/#R1F8YU#83
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @returns the new Vector3
    */
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]]): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Sets the given vector "result" with the element values from the index "offset" of the given array
    * Example Playground https://playground.babylonjs.com/#R1F8YU#84
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @param result defines the Vector3 where to store the result
    */
  inline def FromArrayToRef(
    array: DeepImmutable[ArrayLike[Double]],
    offset: Double,
    result: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns a new Vector3 set from the index "offset" of the given Float32Array
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @returns the new Vector3
    * @deprecated Please use FromArray instead.
    */
  inline def FromFloatArray(array: DeepImmutable[js.typedarray.Float32Array]): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromFloatArray")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  inline def FromFloatArray(array: DeepImmutable[js.typedarray.Float32Array], offset: Double): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromFloatArray")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Sets the given vector "result" with the element values from the index "offset" of the given Float32Array
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @param result defines the Vector3 where to store the result
    * @deprecated Please use FromArrayToRef instead.
    */
  inline def FromFloatArrayToRef(
    array: DeepImmutable[js.typedarray.Float32Array],
    offset: Double,
    result: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromFloatArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the given vector "result" with the given floats.
    * Example Playground https://playground.babylonjs.com/#R1F8YU#85
    * @param x defines the x coordinate of the source
    * @param y defines the y coordinate of the source
    * @param z defines the z coordinate of the source
    * @param result defines the Vector3 where to store the result
    */
  inline def FromFloatsToRef(x: Double, y: Double, z: Double, result: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromFloatsToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Get angle between two vectors
    * Example Playground https://playground.babylonjs.com/#R1F8YU#86
    * @param vector0 the starting point
    * @param vector1 the ending point
    * @param normal direction of the normal
    * @returns the angle between vector0 and vector1
    */
  inline def GetAngleBetweenVectors(
    vector0: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    vector1: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    normal: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAngleBetweenVectors")(vector0.asInstanceOf[js.Any], vector1.asInstanceOf[js.Any], normal.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Get angle between two vectors projected on a plane
    * Example Playground https://playground.babylonjs.com/#R1F8YU#87
    * Expectation compute time: 0.01 ms (median) and 0.02 ms (percentile 95%)
    * @param vector0 angle between vector0 and vector1
    * @param vector1 angle between vector0 and vector1
    * @param normal Normal of the projection plane
    * @returns the angle in radians (float) between vector0 and vector1 projected on the plane with the specified normal
    */
  inline def GetAngleBetweenVectorsOnPlane(
    vector0: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    vector1: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    normal: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAngleBetweenVectorsOnPlane")(vector0.asInstanceOf[js.Any], vector1.asInstanceOf[js.Any], normal.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Get the clip factor between two vectors
    * Example Playground https://playground.babylonjs.com/#R1F8YU#126
    * @param vector0 defines the first operand
    * @param vector1 defines the second operand
    * @param axis defines the axis to use
    * @param size defines the size along the axis
    * @returns the clip factor
    */
  inline def GetClipFactor(
    vector0: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    vector1: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    axis: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    size: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetClipFactor")(vector0.asInstanceOf[js.Any], vector1.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns a new Vector3 located for "amount" (float) on the Hermite interpolation spline defined by the vectors "value1", "tangent1", "value2", "tangent2"
    * Example Playground https://playground.babylonjs.com/#R1F8YU#89
    * @param value1 defines the first control point
    * @param tangent1 defines the first tangent vector
    * @param value2 defines the second control point
    * @param tangent2 defines the second tangent vector
    * @param amount defines the amount on the interpolation spline (between 0 and 1)
    * @returns the new Vector3
    */
  inline def Hermite(
    value1: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    tangent1: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    value2: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    tangent2: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    amount: Double
  ): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Returns a new Vector3 which is the 1st derivative of the Hermite spline defined by the vectors "value1", "value2", "tangent1", "tangent2".
    * Example Playground https://playground.babylonjs.com/#R1F8YU#90
    * @param value1 defines the first control point
    * @param tangent1 defines the first tangent
    * @param value2 defines the second control point
    * @param tangent2 defines the second tangent
    * @param time define where the derivative must be done
    * @returns 1st derivative
    */
  inline def Hermite1stDerivative(
    value1: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    tangent1: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    value2: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    tangent2: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    time: Double
  ): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite1stDerivative")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Update a Vector3 with the 1st derivative of the Hermite spline defined by the vectors "value1", "value2", "tangent1", "tangent2".
    * Example Playground https://playground.babylonjs.com/#R1F8YU#91
    * @param value1 defines the first control point
    * @param tangent1 defines the first tangent
    * @param value2 defines the second control point
    * @param tangent2 defines the second tangent
    * @param time define where the derivative must be done
    * @param result define where to store the derivative
    */
  inline def Hermite1stDerivativeToRef(
    value1: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    tangent1: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    value2: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    tangent2: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    time: Double,
    result: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite1stDerivativeToRef")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], time.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns a new Vector3 set to (-1.0, 0.0, 0.0)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#71
    * @returns a new left Vector3
    */
  inline def Left(): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Left")().asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Returns a new Vector3 located for "amount" (float) on the linear interpolation between the vectors "start" and "end"
    * Example Playground https://playground.babylonjs.com/#R1F8YU#95
    * @param start defines the start value
    * @param end defines the end value
    * @param amount max defines amount between both (between 0 and 1)
    * @returns the new Vector3
    */
  inline def Lerp(
    start: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    end: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    amount: Double
  ): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("Lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Sets the given vector "result" with the result of the linear interpolation from the vector "start" for "amount" to the vector "end"
    * Example Playground https://playground.babylonjs.com/#R1F8YU#93
    * @param start defines the start value
    * @param end defines the end value
    * @param amount max defines amount between both (between 0 and 1)
    * @param result defines the Vector3 where to store the result
    */
  inline def LerpToRef(
    start: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    end: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    amount: Double,
    result: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LerpToRef")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], amount.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets the maximal coordinate values between two Vector3
    * Example Playground https://playground.babylonjs.com/#R1F8YU#96
    * @param left defines the first operand
    * @param right defines the second operand
    * @returns the new Vector3
    */
  inline def Maximize(
    left: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    right: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  ): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("Maximize")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Gets the minimal coordinate values between two Vector3
    * Example Playground https://playground.babylonjs.com/#R1F8YU#97
    * @param left defines the first operand
    * @param right defines the second operand
    * @returns the new Vector3
    */
  inline def Minimize(
    left: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    right: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  ): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("Minimize")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Returns a new Vector3 as the normalization of the given vector
    * Example Playground https://playground.babylonjs.com/#R1F8YU#98
    * @param vector defines the Vector3 to normalize
    * @returns the new Vector3
    */
  inline def Normalize(vector: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Normalize")(vector.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Sets the given vector "result" with the normalization of the given first vector
    * Example Playground https://playground.babylonjs.com/#R1F8YU#98
    * @param vector defines the Vector3 to normalize
    * @param result defines the Vector3 where to store the result
    */
  inline def NormalizeToRef(
    vector: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    result: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("NormalizeToRef")(vector.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns a new Vector3 set to (1.0, 1.0, 1.0)
    * @returns a new Vector3
    */
  inline def One(): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("One")().asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Gets the rotation that aligns the roll axis (Y) to the line joining the start point to the target point
    * Example PG https://playground.babylonjs.com/#R1F8YU#188
    * @param start the starting point
    * @param target the target point
    * @returns the rotation in the form (pitch, yaw, 0)
    */
  inline def PitchYawRollToMoveBetweenPoints(
    start: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    target: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("PitchYawRollToMoveBetweenPoints")(start.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Gets the rotation that aligns the roll axis (Y) to the line joining the start point to the target point and stores it in the ref Vector3
    * Example PG https://playground.babylonjs.com/#R1F8YU#189
    * @param start the starting point
    * @param target the target point
    * @param ref the vector3 to store the result
    * @returns ref in the form (pitch, yaw, 0)
    */
  inline def PitchYawRollToMoveBetweenPointsToRef(
    start: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    target: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    ref: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("PitchYawRollToMoveBetweenPointsToRef")(start.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Project a Vector3 onto screen space
    * Example Playground https://playground.babylonjs.com/#R1F8YU#101
    * @param vector defines the Vector3 to project
    * @param world defines the world matrix to use
    * @param transform defines the transform (view x projection) matrix to use
    * @param viewport defines the screen viewport to use
    * @returns the new Vector3
    */
  inline def Project(
    vector: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    world: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    transform: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    viewport: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotviewportMod.Viewport]
  ): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("Project")(vector.asInstanceOf[js.Any], world.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], viewport.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Projects "vector" on the triangle determined by its extremities "p0", "p1" and "p2", stores the result in "ref"
    * and returns the distance to the projected point.
    * Example Playground https://playground.babylonjs.com/#R1F8YU#104
    * From http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.104.4264&rep=rep1&type=pdf
    *
    * @param vector the vector to get distance from
    * @param p0 extremity of the triangle
    * @param p1 extremity of the triangle
    * @param p2 extremity of the triangle
    * @param ref variable to store the result to
    * @returns The distance between "ref" and "vector"
    */
  inline def ProjectOnTriangleToRef(
    vector: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    p0: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    p1: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    p2: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    ref: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ProjectOnTriangleToRef")(vector.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Project a Vector3 onto screen space to reference
    * Example Playground https://playground.babylonjs.com/#R1F8YU#102
    * @param vector defines the Vector3 to project
    * @param world defines the world matrix to use
    * @param transform defines the transform (view x projection) matrix to use
    * @param viewport defines the screen viewport to use
    * @param result the vector in which the screen space will be stored
    * @returns the new Vector3
    */
  inline def ProjectToRef(
    vector: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    world: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    transform: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    viewport: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotviewportMod.Viewport],
    result: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  ): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("ProjectToRef")(vector.asInstanceOf[js.Any], world.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], viewport.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Returns a new Vector3 set to (1.0, 0.0, 0.0)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#71
    * @returns a new right Vector3
    */
  inline def Right(): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Right")().asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Given three orthogonal normalized left-handed oriented Vector3 axis in space (target system),
    * RotationFromAxis() returns the rotation Euler angles (ex : rotation.x, rotation.y, rotation.z) to apply
    * to something in order to rotate it from its local system to the given target system
    * Note: axis1, axis2 and axis3 are normalized during this operation
    * Example Playground https://playground.babylonjs.com/#R1F8YU#106
    * @param axis1 defines the first axis
    * @param axis2 defines the second axis
    * @param axis3 defines the third axis
    * @returns a new Vector3
    * @see https://doc.babylonjs.com/divingDeeper/mesh/transforms/center_origin/target_align
    */
  inline def RotationFromAxis(
    axis1: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    axis2: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    axis3: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  ): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationFromAxis")(axis1.asInstanceOf[js.Any], axis2.asInstanceOf[js.Any], axis3.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * The same than RotationFromAxis but updates the given ref Vector3 parameter instead of returning a new Vector3
    * Example Playground https://playground.babylonjs.com/#R1F8YU#107
    * @param axis1 defines the first axis
    * @param axis2 defines the second axis
    * @param axis3 defines the third axis
    * @param ref defines the Vector3 where to store the result
    */
  inline def RotationFromAxisToRef(
    axis1: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    axis2: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    axis3: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    ref: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RotationFromAxisToRef")(axis1.asInstanceOf[js.Any], axis2.asInstanceOf[js.Any], axis3.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Slerp between two vectors. See also `SmoothToRef`
    * Slerp is a spherical linear interpolation
    * giving a slow in and out effect
    * Example Playground 1 https://playground.babylonjs.com/#R1F8YU#108
    * Example Playground 2 https://playground.babylonjs.com/#R1F8YU#109
    * @param vector0 Start vector
    * @param vector1 End vector
    * @param slerp amount (will be clamped between 0 and 1)
    * @param result The slerped vector
    */
  inline def SlerpToRef(
    vector0: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    vector1: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    slerp: Double,
    result: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SlerpToRef")(vector0.asInstanceOf[js.Any], vector1.asInstanceOf[js.Any], slerp.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Smooth interpolation between two vectors using Slerp
    * Example Playground https://playground.babylonjs.com/#R1F8YU#110
    * @param source source vector
    * @param goal goal vector
    * @param deltaTime current interpolation frame
    * @param lerpTime total interpolation time
    * @param result the smoothed vector
    */
  inline def SmoothToRef(
    source: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    goal: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    deltaTime: Double,
    lerpTime: Double,
    result: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SmoothToRef")(source.asInstanceOf[js.Any], goal.asInstanceOf[js.Any], deltaTime.asInstanceOf[js.Any], lerpTime.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns a new Vector3 set with the result of the transformation by the given matrix of the given vector.
    * This method computes transformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#111
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @returns the transformed Vector3
    */
  inline def TransformCoordinates(
    vector: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    transformation: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix]
  ): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformCoordinates")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given floats (x, y, z)
    * This method computes transformed coordinates only, not transformed direction vectors
    * Example Playground https://playground.babylonjs.com/#R1F8YU#115
    * @param x define the x coordinate of the source vector
    * @param y define the y coordinate of the source vector
    * @param z define the z coordinate of the source vector
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    */
  inline def TransformCoordinatesFromFloatsToRef(
    x: Double,
    y: Double,
    z: Double,
    transformation: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    result: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformCoordinatesFromFloatsToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the given vector "result" coordinates with the result of the transformation by the given matrix of the given vector
    * This method computes transformed coordinates only, not transformed direction vectors (ie. it takes translation in account)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#113
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    */
  inline def TransformCoordinatesToRef(
    vector: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    transformation: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    result: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformCoordinatesToRef")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns a new Vector3 set with the result of the normal transformation by the given matrix of the given vector
    * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#112
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @returns the new Vector3
    */
  inline def TransformNormal(
    vector: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    transformation: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix]
  ): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformNormal")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given floats (x, y, z)
    * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#116
    * @param x define the x coordinate of the source vector
    * @param y define the y coordinate of the source vector
    * @param z define the z coordinate of the source vector
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    */
  inline def TransformNormalFromFloatsToRef(
    x: Double,
    y: Double,
    z: Double,
    transformation: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    result: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformNormalFromFloatsToRef")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the given vector "result" with the result of the normal transformation by the given matrix of the given vector
    * This methods computes transformed normalized direction vectors only (ie. it does not apply translation)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#114
    * @param vector defines the Vector3 to transform
    * @param transformation defines the transformation matrix
    * @param result defines the Vector3 where to store the result
    */
  inline def TransformNormalToRef(
    vector: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    transformation: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    result: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformNormalToRef")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Unproject from screen space to object space
    * Example Playground https://playground.babylonjs.com/#R1F8YU#117
    * @param source defines the screen space Vector3 to use
    * @param viewportWidth defines the current width of the viewport
    * @param viewportHeight defines the current height of the viewport
    * @param world defines the world matrix to use (can be set to Identity to go to world space)
    * @param view defines the view matrix to use
    * @param projection defines the projection matrix to use
    * @returns the new Vector3
    */
  inline def Unproject(
    source: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    view: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    projection: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix]
  ): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("Unproject")(source.asInstanceOf[js.Any], viewportWidth.asInstanceOf[js.Any], viewportHeight.asInstanceOf[js.Any], world.asInstanceOf[js.Any], view.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Unproject from screen space to object space
    * Example Playground https://playground.babylonjs.com/#R1F8YU#120
    * @param sourceX defines the screen space x coordinate to use
    * @param sourceY defines the screen space y coordinate to use
    * @param sourceZ defines the screen space z coordinate to use
    * @param viewportWidth defines the current width of the viewport
    * @param viewportHeight defines the current height of the viewport
    * @param world defines the world matrix to use (can be set to Identity to go to world space)
    * @param view defines the view matrix to use
    * @param projection defines the projection matrix to use
    * @param result defines the Vector3 where to store the result
    */
  inline def UnprojectFloatsToRef(
    sourceX: float,
    sourceY: float,
    sourceZ: float,
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    view: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    projection: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    result: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UnprojectFloatsToRef")(sourceX.asInstanceOf[js.Any], sourceY.asInstanceOf[js.Any], sourceZ.asInstanceOf[js.Any], viewportWidth.asInstanceOf[js.Any], viewportHeight.asInstanceOf[js.Any], world.asInstanceOf[js.Any], view.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Unproject from screen space to object space
    * Example Playground https://playground.babylonjs.com/#R1F8YU#121
    * @param source defines the screen space Vector3 to use
    * @param viewportWidth defines the current width of the viewport
    * @param viewportHeight defines the current height of the viewport
    * @param world defines the world matrix to use (can be set to Identity to go to world space)
    * @param transform defines the transform (view x projection) matrix to use
    * @returns the new Vector3
    */
  inline def UnprojectFromTransform(
    source: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    transform: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix]
  ): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("UnprojectFromTransform")(source.asInstanceOf[js.Any], viewportWidth.asInstanceOf[js.Any], viewportHeight.asInstanceOf[js.Any], world.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Unproject from screen space to object space
    * Example Playground https://playground.babylonjs.com/#R1F8YU#119
    * @param source defines the screen space Vector3 to use
    * @param viewportWidth defines the current width of the viewport
    * @param viewportHeight defines the current height of the viewport
    * @param world defines the world matrix to use (can be set to Identity to go to world space)
    * @param view defines the view matrix to use
    * @param projection defines the projection matrix to use
    * @param result defines the Vector3 where to store the result
    */
  inline def UnprojectToRef(
    source: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    view: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    projection: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    result: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UnprojectToRef")(source.asInstanceOf[js.Any], viewportWidth.asInstanceOf[js.Any], viewportHeight.asInstanceOf[js.Any], world.asInstanceOf[js.Any], view.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns a new Vector3 set to (0.0, 1.0, 0.0)
    * Example Playground https://playground.babylonjs.com/#R1F8YU#71
    * @returns a new up Vector3
    */
  inline def Up(): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Up")().asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  /**
    * Returns a new Vector3 set to (0.0, 0.0, 0.0)
    * @returns a new empty Vector3
    */
  inline def Zero(): typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Zero")().asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  
  @JSImport("babylonjs/Maths/math", "Vector3._DownReadOnly")
  @js.native
  def _DownReadOnly: Any = js.native
  inline def _DownReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DownReadOnly")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Maths/math", "Vector3._LeftHandedForwardReadOnly")
  @js.native
  def _LeftHandedForwardReadOnly: Any = js.native
  inline def _LeftHandedForwardReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LeftHandedForwardReadOnly")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Maths/math", "Vector3._LeftReadOnly")
  @js.native
  def _LeftReadOnly: Any = js.native
  inline def _LeftReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LeftReadOnly")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Maths/math", "Vector3._RightHandedForwardReadOnly")
  @js.native
  def _RightHandedForwardReadOnly: Any = js.native
  inline def _RightHandedForwardReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RightHandedForwardReadOnly")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Maths/math", "Vector3._RightReadOnly")
  @js.native
  def _RightReadOnly: Any = js.native
  inline def _RightReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RightReadOnly")(x.asInstanceOf[js.Any])
  
  /**
    * @internal
    */
  inline def _UnprojectFromInvertedMatrixToRef(
    source: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    matrix: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix],
    result: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_UnprojectFromInvertedMatrixToRef")(source.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("babylonjs/Maths/math", "Vector3._UpReadOnly")
  @js.native
  def _UpReadOnly: Any = js.native
  inline def _UpReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_UpReadOnly")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Maths/math", "Vector3._ZeroReadOnly")
  @js.native
  def _ZeroReadOnly: Any = js.native
  inline def _ZeroReadOnly_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ZeroReadOnly")(x.asInstanceOf[js.Any])
}
