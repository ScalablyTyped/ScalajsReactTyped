package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.distEs2015ComponentTransformTransformMod.Transform
import typingsJapgolly.wonderJs.distEs2015MathMatrix3Mod.Matrix3
import typingsJapgolly.wonderJs.distEs2015MathMatrix4Mod.Matrix4
import typingsJapgolly.wonderJs.distEs2015MathQuaternionMod.Quaternion
import typingsJapgolly.wonderJs.distEs2015MathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ComponentTransformThreeDTransformMod {
  
  @JSImport("wonder.js/dist/es2015/component/transform/ThreeDTransform", "ThreeDTransform")
  @js.native
  open class ThreeDTransform () extends Transform {
    
    var dirtyWorld: Boolean = js.native
    
    var eulerAngles: Vector3 = js.native
    
    val forward: Any = js.native
    
    var localEulerAngles: Vector3 = js.native
    
    var localPosition: Vector3 = js.native
    
    var localRotation: Quaternion = js.native
    
    var localScale: Vector3 = js.native
    
    var localToWorldMatrix: Matrix4 = js.native
    
    def lookAt(targetX: Double, targetY: Double, targetZ: Double): Any = js.native
    def lookAt(targetX: Double, targetY: Double, targetZ: Double, upX: Double, upY: Double, upZ: Double): Any = js.native
    def lookAt(target: Vector3): Any = js.native
    def lookAt(target: Vector3, up: Vector3): Any = js.native
    
    val normalMatrix: Matrix3 = js.native
    
    /* protected */ @JSName("p_parent")
    var p_parent_ThreeDTransform: ThreeDTransform = js.native
    
    var position: Vector3 = js.native
    
    val right: Vector3 = js.native
    
    def rotate(eulerAngles: Vector3): Any = js.native
    def rotate(x: Double, y: Double, z: Double): Any = js.native
    
    def rotateAround(
      angle: Double,
      centerX: Double,
      centerY: Double,
      centerZ: Double,
      axisX: Double,
      axisY: Double,
      axisZ: Double
    ): Any = js.native
    def rotateAround(angle: Double, center: Vector3, axis: Vector3): Any = js.native
    
    def rotateLocal(eulerAngles: Vector3): Any = js.native
    def rotateLocal(x: Double, y: Double, z: Double): Any = js.native
    
    var rotation: Quaternion = js.native
    
    var scale: Vector3 = js.native
    
    def sync(): Unit = js.native
    
    def translate(translation: Vector3): Any = js.native
    def translate(x: Double, y: Double, z: Double): Any = js.native
    
    def translateLocal(translation: Vector3): Any = js.native
    def translateLocal(x: Double, y: Double, z: Double): Any = js.native
    
    val up: Vector3 = js.native
  }
  /* static members */
  object ThreeDTransform {
    
    @JSImport("wonder.js/dist/es2015/component/transform/ThreeDTransform", "ThreeDTransform")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): ThreeDTransform = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ThreeDTransform]
  }
}
