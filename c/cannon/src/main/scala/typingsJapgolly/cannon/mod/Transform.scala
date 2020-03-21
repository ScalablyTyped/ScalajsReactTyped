package typingsJapgolly.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Transform")
@js.native
class Transform ()
  extends typingsJapgolly.cannon.CANNON.Transform

/* static members */
@JSImport("cannon", "Transform")
@js.native
object Transform extends js.Object {
  def pointToLocalFrame(
    position: typingsJapgolly.cannon.CANNON.Vec3,
    quaternion: typingsJapgolly.cannon.CANNON.Quaternion,
    worldPoint: typingsJapgolly.cannon.CANNON.Vec3
  ): typingsJapgolly.cannon.CANNON.Vec3 = js.native
  def pointToLocalFrame(
    position: typingsJapgolly.cannon.CANNON.Vec3,
    quaternion: typingsJapgolly.cannon.CANNON.Quaternion,
    worldPoint: typingsJapgolly.cannon.CANNON.Vec3,
    result: typingsJapgolly.cannon.CANNON.Vec3
  ): typingsJapgolly.cannon.CANNON.Vec3 = js.native
  def pointToWorldFrame(
    position: typingsJapgolly.cannon.CANNON.Vec3,
    quaternion: typingsJapgolly.cannon.CANNON.Quaternion,
    localPoint: typingsJapgolly.cannon.CANNON.Vec3
  ): typingsJapgolly.cannon.CANNON.Vec3 = js.native
  def pointToWorldFrame(
    position: typingsJapgolly.cannon.CANNON.Vec3,
    quaternion: typingsJapgolly.cannon.CANNON.Quaternion,
    localPoint: typingsJapgolly.cannon.CANNON.Vec3,
    result: typingsJapgolly.cannon.CANNON.Vec3
  ): typingsJapgolly.cannon.CANNON.Vec3 = js.native
}

