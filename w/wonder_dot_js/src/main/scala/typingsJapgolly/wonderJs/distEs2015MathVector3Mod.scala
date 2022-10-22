package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.distEs2015MathMatrix3Mod.Matrix3
import typingsJapgolly.wonderJs.distEs2015MathMatrix4Mod.Matrix4
import typingsJapgolly.wonderJs.distEs2015MathVector4Mod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015MathVector3Mod {
  
  @JSImport("wonder.js/dist/es2015/math/Vector3", "Vector3")
  @js.native
  open class Vector3 () extends StObject {
    def this(x: Double, y: Double, z: Double) = this()
    
    def add(v: Vector3): this.type = js.native
    
    def add2(v1: Vector3, v2: Vector3): this.type = js.native
    
    def applyMatrix3(m: Matrix3): this.type = js.native
    
    def applyMatrix4(m: Matrix4): this.type = js.native
    
    def calAngleCos(v1: Vector3): Double = js.native
    
    def cross(lhs: Vector3, rhs: Vector3): this.type = js.native
    
    def distanceTo(v: Vector3): Any = js.native
    
    def distanceToSquared(v: Vector3): Double = js.native
    
    def dot(rhs: Any): Double = js.native
    
    def isEqual(v: Vector3): Boolean = js.native
    
    def isZero(): Boolean = js.native
    
    def length(): Any = js.native
    
    def lerp(lhs: Vector3, rhs: Vector3, alpha: Double): this.type = js.native
    
    def max(v: Vector3): this.type = js.native
    
    def min(v: Vector3): this.type = js.native
    
    def mul(v: Vector3): this.type = js.native
    
    def mul2(v1: Vector3, v2: Vector3): this.type = js.native
    
    def normalize(): Vector3 = js.native
    
    def reverse(): Vector3 = js.native
    
    def scale(scalar: Double): Any = js.native
    def scale(x: Double, y: Double, z: Double): Any = js.native
    
    def set(v: Vector3): Any = js.native
    def set(x: Double, y: Double, z: Double): Any = js.native
    
    def sub(v: Vector3): Vector3 = js.native
    
    def sub2(v1: Vector3, v2: Vector3): this.type = js.native
    
    def toArray(): js.Array[Double] = js.native
    
    def toVector4(): Vector4 = js.native
    
    var values: js.typedarray.Float32Array = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  /* static members */
  object Vector3 {
    
    @JSImport("wonder.js/dist/es2015/math/Vector3", "Vector3")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): Vector3 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Vector3]
    inline def create(x: Double, y: Double, z: Double): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Vector3]
    
    @JSImport("wonder.js/dist/es2015/math/Vector3", "Vector3.forward")
    @js.native
    def forward: Any = js.native
    inline def forward_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forward")(x.asInstanceOf[js.Any])
    
    @JSImport("wonder.js/dist/es2015/math/Vector3", "Vector3.right")
    @js.native
    def right: Any = js.native
    inline def right_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right")(x.asInstanceOf[js.Any])
    
    @JSImport("wonder.js/dist/es2015/math/Vector3", "Vector3.up")
    @js.native
    def up: Any = js.native
    inline def up_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("up")(x.asInstanceOf[js.Any])
  }
}
