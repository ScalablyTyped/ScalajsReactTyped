package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Curve3")
@js.native
open class Curve3 protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.Curve3 {
  /**
    * A Curve3 object is a logical object, so not a mesh, to handle curves in the 3D geometric space.
    * A Curve3 is designed from a series of successive Vector3.
    * Tuto : https://doc.babylonjs.com/how_to/how_to_use_curve3#curve3-object
    * @param points points which make up the curve
    */
  def this(points: js.Array[typingsJapgolly.babylonjs.BABYLON.Vector3]) = this()
  
  /* private */ /* CompleteClass */
  var _computeLength: Any = js.native
  
  /* private */ /* CompleteClass */
  var _length: Any = js.native
  
  /* private */ /* CompleteClass */
  var _points: Any = js.native
  
  /**
    * Returns a new instance of Curve3 object : var curve = curveA.continue(curveB);
    * This new Curve3 is built by translating and sticking the curveB at the end of the curveA.
    * curveA and curveB keep unchanged.
    * @param curve the curve to continue from this curve
    * @returns the newly constructed curve
    */
  /* CompleteClass */
  override def continue(curve: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Curve3]): typingsJapgolly.babylonjs.BABYLON.Curve3 = js.native
  
  /**
    * @returns the Curve3 stored array of successive Vector3
    */
  /* CompleteClass */
  override def getPoints(): js.Array[typingsJapgolly.babylonjs.BABYLON.Vector3] = js.native
  
  /**
    * @returns the computed length (float) of the curve.
    */
  /* CompleteClass */
  override def length(): Double = js.native
}
/* static members */
object Curve3 {
  
  @JSGlobal("BABYLON.Curve3")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a Curve3 object along an arc through three vector3 points:
    * The three points should not be colinear. When they are the Curve3 is empty.
    * @param first (Vector3) the first point the arc must pass through.
    * @param second (Vector3) the second point the arc must pass through.
    * @param third (Vector3) the third point the arc must pass through.
    * @param steps (number) the larger the number of steps the more detailed the arc.
    * @param closed (boolean) optional with default false, when true forms the chord from the first and third point
    * @param fullCircle Circle (boolean) optional with default false, when true forms the complete circle through the three points
    * @returns the created Curve3
    */
  inline def ArcThru3Points(
    first: typingsJapgolly.babylonjs.BABYLON.Vector3,
    second: typingsJapgolly.babylonjs.BABYLON.Vector3,
    third: typingsJapgolly.babylonjs.BABYLON.Vector3
  ): typingsJapgolly.babylonjs.BABYLON.Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("ArcThru3Points")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Curve3]
  inline def ArcThru3Points(
    first: typingsJapgolly.babylonjs.BABYLON.Vector3,
    second: typingsJapgolly.babylonjs.BABYLON.Vector3,
    third: typingsJapgolly.babylonjs.BABYLON.Vector3,
    steps: Double
  ): typingsJapgolly.babylonjs.BABYLON.Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("ArcThru3Points")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Curve3]
  inline def ArcThru3Points(
    first: typingsJapgolly.babylonjs.BABYLON.Vector3,
    second: typingsJapgolly.babylonjs.BABYLON.Vector3,
    third: typingsJapgolly.babylonjs.BABYLON.Vector3,
    steps: Double,
    closed: Boolean
  ): typingsJapgolly.babylonjs.BABYLON.Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("ArcThru3Points")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], closed.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Curve3]
  inline def ArcThru3Points(
    first: typingsJapgolly.babylonjs.BABYLON.Vector3,
    second: typingsJapgolly.babylonjs.BABYLON.Vector3,
    third: typingsJapgolly.babylonjs.BABYLON.Vector3,
    steps: Double,
    closed: Boolean,
    fullCircle: Boolean
  ): typingsJapgolly.babylonjs.BABYLON.Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("ArcThru3Points")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], closed.asInstanceOf[js.Any], fullCircle.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Curve3]
  inline def ArcThru3Points(
    first: typingsJapgolly.babylonjs.BABYLON.Vector3,
    second: typingsJapgolly.babylonjs.BABYLON.Vector3,
    third: typingsJapgolly.babylonjs.BABYLON.Vector3,
    steps: Double,
    closed: Unit,
    fullCircle: Boolean
  ): typingsJapgolly.babylonjs.BABYLON.Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("ArcThru3Points")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], closed.asInstanceOf[js.Any], fullCircle.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Curve3]
  inline def ArcThru3Points(
    first: typingsJapgolly.babylonjs.BABYLON.Vector3,
    second: typingsJapgolly.babylonjs.BABYLON.Vector3,
    third: typingsJapgolly.babylonjs.BABYLON.Vector3,
    steps: Unit,
    closed: Boolean
  ): typingsJapgolly.babylonjs.BABYLON.Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("ArcThru3Points")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], closed.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Curve3]
  inline def ArcThru3Points(
    first: typingsJapgolly.babylonjs.BABYLON.Vector3,
    second: typingsJapgolly.babylonjs.BABYLON.Vector3,
    third: typingsJapgolly.babylonjs.BABYLON.Vector3,
    steps: Unit,
    closed: Boolean,
    fullCircle: Boolean
  ): typingsJapgolly.babylonjs.BABYLON.Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("ArcThru3Points")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], closed.asInstanceOf[js.Any], fullCircle.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Curve3]
  inline def ArcThru3Points(
    first: typingsJapgolly.babylonjs.BABYLON.Vector3,
    second: typingsJapgolly.babylonjs.BABYLON.Vector3,
    third: typingsJapgolly.babylonjs.BABYLON.Vector3,
    steps: Unit,
    closed: Unit,
    fullCircle: Boolean
  ): typingsJapgolly.babylonjs.BABYLON.Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("ArcThru3Points")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], closed.asInstanceOf[js.Any], fullCircle.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Curve3]
  
  /**
    * Returns a Curve3 object along a CatmullRom Spline curve :
    * @param points (array of Vector3) the points the spline must pass through. At least, four points required
    * @param nbPoints (integer) the wanted number of points between each curve control points
    * @param closed (boolean) optional with default false, when true forms a closed loop from the points
    * @returns the created Curve3
    */
  inline def CreateCatmullRomSpline(points: DeepImmutable[js.Array[typingsJapgolly.babylonjs.BABYLON.Vector3]], nbPoints: Double): typingsJapgolly.babylonjs.BABYLON.Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCatmullRomSpline")(points.asInstanceOf[js.Any], nbPoints.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Curve3]
  inline def CreateCatmullRomSpline(
    points: DeepImmutable[js.Array[typingsJapgolly.babylonjs.BABYLON.Vector3]],
    nbPoints: Double,
    closed: Boolean
  ): typingsJapgolly.babylonjs.BABYLON.Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCatmullRomSpline")(points.asInstanceOf[js.Any], nbPoints.asInstanceOf[js.Any], closed.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Curve3]
  
  /**
    * Returns a Curve3 object along a Cubic Bezier curve : https://doc.babylonjs.com/how_to/how_to_use_curve3#cubic-bezier-curve
    * @param v0 (Vector3) the origin point of the Cubic Bezier
    * @param v1 (Vector3) the first control point
    * @param v2 (Vector3) the second control point
    * @param v3 (Vector3) the end point of the Cubic Bezier
    * @param nbPoints (integer) the wanted number of points in the curve
    * @returns the created Curve3
    */
  inline def CreateCubicBezier(
    v0: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    v1: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    v2: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    v3: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    nbPoints: Double
  ): typingsJapgolly.babylonjs.BABYLON.Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCubicBezier")(v0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], nbPoints.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Curve3]
  
  /**
    * Returns a Curve3 object along a Hermite Spline curve : https://doc.babylonjs.com/how_to/how_to_use_curve3#hermite-spline
    * @param p1 (Vector3) the origin point of the Hermite Spline
    * @param t1 (Vector3) the tangent vector at the origin point
    * @param p2 (Vector3) the end point of the Hermite Spline
    * @param t2 (Vector3) the tangent vector at the end point
    * @param nbPoints (integer) the wanted number of points in the curve
    * @returns the created Curve3
    */
  inline def CreateHermiteSpline(
    p1: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    t1: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    p2: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    t2: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    nbPoints: Double
  ): typingsJapgolly.babylonjs.BABYLON.Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHermiteSpline")(p1.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], nbPoints.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Curve3]
  
  /**
    * Returns a Curve3 object along a Quadratic Bezier curve : https://doc.babylonjs.com/how_to/how_to_use_curve3#quadratic-bezier-curve
    * @param v0 (Vector3) the origin point of the Quadratic Bezier
    * @param v1 (Vector3) the control point
    * @param v2 (Vector3) the end point of the Quadratic Bezier
    * @param nbPoints (integer) the wanted number of points in the curve
    * @returns the created Curve3
    */
  inline def CreateQuadraticBezier(
    v0: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    v1: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    v2: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    nbPoints: Double
  ): typingsJapgolly.babylonjs.BABYLON.Curve3 = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateQuadraticBezier")(v0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], nbPoints.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Curve3]
}
