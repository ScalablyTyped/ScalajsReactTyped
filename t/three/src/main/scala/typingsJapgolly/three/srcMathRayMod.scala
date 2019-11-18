package typingsJapgolly.three

import typingsJapgolly.three.srcMathBox3Mod.Box3
import typingsJapgolly.three.srcMathMatrix4Mod.Matrix4
import typingsJapgolly.three.srcMathPlaneMod.Plane
import typingsJapgolly.three.srcMathRayMod.Ray
import typingsJapgolly.three.srcMathSphereMod.Sphere
import typingsJapgolly.three.srcMathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Ray", JSImport.Namespace)
@js.native
object srcMathRayMod extends js.Object {
  @js.native
  class Ray () extends js.Object {
    def this(origin: Vector3) = this()
    def this(origin: Vector3, direction: Vector3) = this()
    var direction: Vector3 = js.native
    var origin: Vector3 = js.native
    def applyMatrix4(matrix4: Matrix4): Ray = js.native
    def at(t: Double, target: Vector3): Vector3 = js.native
    def closestPointToPoint(point: Vector3, target: Vector3): Vector3 = js.native
    def copy(ray: Ray): this.type = js.native
    def distanceSqToPoint(point: Vector3): Double = js.native
    def distanceSqToSegment(v0: Vector3, v1: Vector3): Double = js.native
    def distanceSqToSegment(v0: Vector3, v1: Vector3, optionalPointOnRay: Vector3): Double = js.native
    def distanceSqToSegment(v0: Vector3, v1: Vector3, optionalPointOnRay: Vector3, optionalPointOnSegment: Vector3): Double = js.native
    def distanceToPlane(plane: Plane): Double = js.native
    def distanceToPoint(point: Vector3): Double = js.native
    def equals(ray: Ray): Boolean = js.native
    def intersectBox(box: Box3, target: Vector3): Vector3 = js.native
    def intersectPlane(plane: Plane, target: Vector3): Vector3 = js.native
    def intersectSphere(sphere: Sphere, target: Vector3): Vector3 = js.native
    def intersectTriangle(a: Vector3, b: Vector3, c: Vector3, backfaceCulling: Boolean, target: Vector3): Vector3 = js.native
    def intersectsBox(box: Box3): Boolean = js.native
    def intersectsPlane(plane: Plane): Boolean = js.native
    def intersectsSphere(sphere: Sphere): Boolean = js.native
    /**
    	 * @deprecated Use {@link Ray#intersectsBox .intersectsBox()} instead.
    	 */
    def isIntersectionBox(b: js.Any): js.Any = js.native
    /**
    	 * @deprecated Use {@link Ray#intersectsPlane .intersectsPlane()} instead.
    	 */
    def isIntersectionPlane(p: js.Any): js.Any = js.native
    /**
    	 * @deprecated Use {@link Ray#intersectsSphere .intersectsSphere()} instead.
    	 */
    def isIntersectionSphere(s: js.Any): js.Any = js.native
    def lookAt(v: Vector3): Vector3 = js.native
    def recast(t: Double): Ray = js.native
    def set(origin: Vector3, direction: Vector3): Ray = js.native
  }
  
}

