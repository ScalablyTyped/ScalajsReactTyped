package typingsJapgolly.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "Transform")
@js.native
open class Transform ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.Transform
/* static members */
object Transform {
  
  @JSImport("cannon", "Transform")
  @js.native
  val ^ : js.Any = js.native
  
  inline def pointToLocalFrame(
    position: typingsJapgolly.cannon.CANNON.Vec3,
    quaternion: typingsJapgolly.cannon.CANNON.Quaternion,
    worldPoint: typingsJapgolly.cannon.CANNON.Vec3
  ): typingsJapgolly.cannon.CANNON.Vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("pointToLocalFrame")(position.asInstanceOf[js.Any], quaternion.asInstanceOf[js.Any], worldPoint.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cannon.CANNON.Vec3]
  inline def pointToLocalFrame(
    position: typingsJapgolly.cannon.CANNON.Vec3,
    quaternion: typingsJapgolly.cannon.CANNON.Quaternion,
    worldPoint: typingsJapgolly.cannon.CANNON.Vec3,
    result: typingsJapgolly.cannon.CANNON.Vec3
  ): typingsJapgolly.cannon.CANNON.Vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("pointToLocalFrame")(position.asInstanceOf[js.Any], quaternion.asInstanceOf[js.Any], worldPoint.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cannon.CANNON.Vec3]
  
  inline def pointToWorldFrame(
    position: typingsJapgolly.cannon.CANNON.Vec3,
    quaternion: typingsJapgolly.cannon.CANNON.Quaternion,
    localPoint: typingsJapgolly.cannon.CANNON.Vec3
  ): typingsJapgolly.cannon.CANNON.Vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("pointToWorldFrame")(position.asInstanceOf[js.Any], quaternion.asInstanceOf[js.Any], localPoint.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cannon.CANNON.Vec3]
  inline def pointToWorldFrame(
    position: typingsJapgolly.cannon.CANNON.Vec3,
    quaternion: typingsJapgolly.cannon.CANNON.Quaternion,
    localPoint: typingsJapgolly.cannon.CANNON.Vec3,
    result: typingsJapgolly.cannon.CANNON.Vec3
  ): typingsJapgolly.cannon.CANNON.Vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("pointToWorldFrame")(position.asInstanceOf[js.Any], quaternion.asInstanceOf[js.Any], localPoint.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cannon.CANNON.Vec3]
}
