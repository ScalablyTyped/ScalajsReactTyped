package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentLoader extends js.Object {
  def newBoundingBoxAttachment(skin: Skin, name: String): BoundingBoxAttachment
  def newClippingAttachment(skin: Skin, name: String): ClippingAttachment
  def newMeshAttachment(skin: Skin, name: String, path: String): MeshAttachment
  def newPathAttachment(skin: Skin, name: String): PathAttachment
  def newPointAttachment(skin: Skin, name: String): PointAttachment
  def newRegionAttachment(skin: Skin, name: String, path: String): RegionAttachment
}

object AttachmentLoader {
  @scala.inline
  def apply(
    newBoundingBoxAttachment: (Skin, String) => CallbackTo[BoundingBoxAttachment],
    newClippingAttachment: (Skin, String) => CallbackTo[ClippingAttachment],
    newMeshAttachment: (Skin, String, String) => CallbackTo[MeshAttachment],
    newPathAttachment: (Skin, String) => CallbackTo[PathAttachment],
    newPointAttachment: (Skin, String) => CallbackTo[PointAttachment],
    newRegionAttachment: (Skin, String, String) => CallbackTo[RegionAttachment]
  ): AttachmentLoader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newBoundingBoxAttachment")(js.Any.fromFunction2((t0: typingsJapgolly.phaser.spine.Skin, t1: java.lang.String) => newBoundingBoxAttachment(t0, t1).runNow()))
    __obj.updateDynamic("newClippingAttachment")(js.Any.fromFunction2((t0: typingsJapgolly.phaser.spine.Skin, t1: java.lang.String) => newClippingAttachment(t0, t1).runNow()))
    __obj.updateDynamic("newMeshAttachment")(js.Any.fromFunction3((t0: typingsJapgolly.phaser.spine.Skin, t1: java.lang.String, t2: java.lang.String) => newMeshAttachment(t0, t1, t2).runNow()))
    __obj.updateDynamic("newPathAttachment")(js.Any.fromFunction2((t0: typingsJapgolly.phaser.spine.Skin, t1: java.lang.String) => newPathAttachment(t0, t1).runNow()))
    __obj.updateDynamic("newPointAttachment")(js.Any.fromFunction2((t0: typingsJapgolly.phaser.spine.Skin, t1: java.lang.String) => newPointAttachment(t0, t1).runNow()))
    __obj.updateDynamic("newRegionAttachment")(js.Any.fromFunction3((t0: typingsJapgolly.phaser.spine.Skin, t1: java.lang.String, t2: java.lang.String) => newRegionAttachment(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AttachmentLoader]
  }
}

