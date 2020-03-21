package typingsJapgolly.three

import typingsJapgolly.three.vector2Mod.Vector2
import typingsJapgolly.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/curves/Curves", JSImport.Namespace)
@js.native
object curvesMod extends js.Object {
  @js.native
  class ArcCurve protected ()
    extends typingsJapgolly.three.arcCurveMod.ArcCurve {
    def this(
      aX: Double,
      aY: Double,
      aRadius: Double,
      aStartAngle: Double,
      aEndAngle: Double,
      aClockwise: Boolean
    ) = this()
  }
  
  @js.native
  class CatmullRomCurve3 ()
    extends typingsJapgolly.three.catmullRomCurve3Mod.CatmullRomCurve3 {
    def this(points: js.Array[Vector3]) = this()
    def this(points: js.Array[Vector3], closed: Boolean) = this()
    def this(points: js.Array[Vector3], closed: Boolean, curveType: String) = this()
    def this(points: js.Array[Vector3], closed: Boolean, curveType: String, tension: Double) = this()
  }
  
  @js.native
  class CubicBezierCurve protected ()
    extends typingsJapgolly.three.cubicBezierCurveMod.CubicBezierCurve {
    def this(v0: Vector2, v1: Vector2, v2: Vector2, v3: Vector2) = this()
  }
  
  @js.native
  class CubicBezierCurve3 protected ()
    extends typingsJapgolly.three.cubicBezierCurve3Mod.CubicBezierCurve3 {
    def this(v0: Vector3, v1: Vector3, v2: Vector3, v3: Vector3) = this()
  }
  
  @js.native
  class EllipseCurve protected ()
    extends typingsJapgolly.three.ellipseCurveMod.EllipseCurve {
    def this(
      aX: Double,
      aY: Double,
      xRadius: Double,
      yRadius: Double,
      aStartAngle: Double,
      aEndAngle: Double,
      aClockwise: Boolean,
      aRotation: Double
    ) = this()
  }
  
  @js.native
  class LineCurve protected ()
    extends typingsJapgolly.three.lineCurveMod.LineCurve {
    def this(v1: Vector2, v2: Vector2) = this()
  }
  
  @js.native
  class LineCurve3 protected ()
    extends typingsJapgolly.three.lineCurve3Mod.LineCurve3 {
    def this(v1: Vector3, v2: Vector3) = this()
  }
  
  @js.native
  class QuadraticBezierCurve protected ()
    extends typingsJapgolly.three.quadraticBezierCurveMod.QuadraticBezierCurve {
    def this(v0: Vector2, v1: Vector2, v2: Vector2) = this()
  }
  
  @js.native
  class QuadraticBezierCurve3 protected ()
    extends typingsJapgolly.three.quadraticBezierCurve3Mod.QuadraticBezierCurve3 {
    def this(v0: Vector3, v1: Vector3, v2: Vector3) = this()
  }
  
  @js.native
  class SplineCurve ()
    extends typingsJapgolly.three.splineCurveMod.SplineCurve {
    def this(points: js.Array[Vector2]) = this()
  }
  
  @js.native
  object CurveUtils extends js.Object {
    def interpolate(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double = js.native
    def tangentCubicBezier(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
    def tangentQuadraticBezier(t: Double, p0: Double, p1: Double, p2: Double): Double = js.native
    def tangentSpline(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
  }
  
}

