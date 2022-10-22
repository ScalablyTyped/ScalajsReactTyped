package typingsJapgolly.three

import typingsJapgolly.three.srcThreeMod.Box3
import typingsJapgolly.three.srcThreeMod.Matrix3
import typingsJapgolly.three.srcThreeMod.Matrix4
import typingsJapgolly.three.srcThreeMod.Plane
import typingsJapgolly.three.srcThreeMod.Ray
import typingsJapgolly.three.srcThreeMod.Sphere
import typingsJapgolly.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmMathObbMod {
  
  @JSImport("three/examples/jsm/math/OBB", "OBB")
  @js.native
  open class OBB () extends StObject {
    def this(center: Vector3) = this()
    def this(center: Unit, halfSize: Vector3) = this()
    def this(center: Vector3, halfSize: Vector3) = this()
    def this(center: Unit, halfSize: Unit, rotation: Matrix3) = this()
    def this(center: Unit, halfSize: Vector3, rotation: Matrix3) = this()
    def this(center: Vector3, halfSize: Unit, rotation: Matrix3) = this()
    def this(center: Vector3, halfSize: Vector3, rotation: Matrix3) = this()
    
    def applyMatrix4(matrix: Matrix4): this.type = js.native
    
    var center: Vector3 = js.native
    
    def clampPoint(point: Vector3, result: Vector3): Vector3 = js.native
    
    def containsPoint(point: Vector3): Boolean = js.native
    
    def copy(obb: OBB): this.type = js.native
    
    def equals(obb: OBB): Boolean = js.native
    
    def fromBox3(box3: Box3): this.type = js.native
    
    def getSize(result: Vector3): Vector3 = js.native
    
    var halfSize: Vector3 = js.native
    
    def intersectRay(ray: Ray, result: Vector3): Vector3 | Null = js.native
    
    def intersectsBox3(box3: Box3): Boolean = js.native
    
    def intersectsOBB(obb: OBB): Boolean = js.native
    def intersectsOBB(obb: OBB, epsilon: Double): Boolean = js.native
    
    def intersectsPlane(plane: Plane): Boolean = js.native
    
    def intersectsRay(ray: Ray): Boolean = js.native
    
    def intersectsSphere(sphere: Sphere): Boolean = js.native
    
    var rotation: Matrix3 = js.native
    
    def set(center: Vector3, halfSize: Vector3, rotation: Matrix3): this.type = js.native
  }
}
