package typingsJapgolly.three

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.three.srcCoreBufferAttributeMod.BufferAttribute
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcMathMatrix4Mod.Matrix4
import typingsJapgolly.three.srcMathPlaneMod.Plane
import typingsJapgolly.three.srcMathSphereMod.Sphere
import typingsJapgolly.three.srcMathTriangleMod.Triangle
import typingsJapgolly.three.srcMathVector3Mod.Vector3
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMathBox3Mod {
  
  @JSImport("three/src/math/Box3", "Box3")
  @js.native
  open class Box3 () extends StObject {
    def this(min: Vector3) = this()
    def this(min: Unit, max: Vector3) = this()
    def this(min: Vector3, max: Vector3) = this()
    
    def applyMatrix4(matrix: Matrix4): this.type = js.native
    
    def clampPoint(point: Vector3, target: Vector3): Vector3 = js.native
    
    def containsBox(box: Box3): Boolean = js.native
    
    def containsPoint(point: Vector3): Boolean = js.native
    
    def copy(box: Box3): this.type = js.native
    
    def distanceToPoint(point: Vector3): Double = js.native
    
    /**
      * @deprecated Use {@link Box3#isEmpty .isEmpty()} instead.
      */
    def empty(): Any = js.native
    
    def equals(box: Box3): Boolean = js.native
    
    def expandByObject(`object`: Object3D[Event]): this.type = js.native
    def expandByObject(`object`: Object3D[Event], precise: Boolean): this.type = js.native
    
    def expandByPoint(point: Vector3): this.type = js.native
    
    def expandByScalar(scalar: Double): this.type = js.native
    
    def expandByVector(vector: Vector3): this.type = js.native
    
    def getBoundingSphere(target: Sphere): Sphere = js.native
    
    def getCenter(target: Vector3): Vector3 = js.native
    
    def getParameter(point: Vector3, target: Vector3): Vector3 = js.native
    
    def getSize(target: Vector3): Vector3 = js.native
    
    def intersect(box: Box3): this.type = js.native
    
    def intersectsBox(box: Box3): Boolean = js.native
    
    def intersectsPlane(plane: Plane): Boolean = js.native
    
    def intersectsSphere(sphere: Sphere): Boolean = js.native
    
    def intersectsTriangle(triangle: Triangle): Boolean = js.native
    
    val isBox3: `true` = js.native
    
    def isEmpty(): Boolean = js.native
    
    /**
      * @deprecated Use {@link Box3#intersectsBox .intersectsBox()} instead.
      */
    def isIntersectionBox(b: Any): Any = js.native
    
    /**
      * @deprecated Use {@link Box3#intersectsSphere .intersectsSphere()} instead.
      */
    def isIntersectionSphere(s: Any): Any = js.native
    
    def makeEmpty(): this.type = js.native
    
    /**
      * @default new THREE.Vector3( - Infinity, - Infinity, - Infinity )
      */
    var max: Vector3 = js.native
    
    /**
      * @default new THREE.Vector3( + Infinity, + Infinity, + Infinity )
      */
    var min: Vector3 = js.native
    
    def set(min: Vector3, max: Vector3): this.type = js.native
    
    def setFromArray(array: ArrayLike[Double]): this.type = js.native
    
    def setFromBufferAttribute(bufferAttribute: BufferAttribute): this.type = js.native
    
    def setFromCenterAndSize(center: Vector3, size: Vector3): this.type = js.native
    
    def setFromObject(`object`: Object3D[Event]): this.type = js.native
    def setFromObject(`object`: Object3D[Event], precise: Boolean): this.type = js.native
    
    def setFromPoints(points: js.Array[Vector3]): this.type = js.native
    
    def translate(offset: Vector3): this.type = js.native
    
    def union(box: Box3): this.type = js.native
  }
}
