package typingsJapgolly.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.VertexAttachment")
@js.native
abstract class VertexAttachment protected () extends Attachment {
  def this(name: String) = this()
  var bones: js.Array[Double] = js.native
  var deformAttachment: VertexAttachment = js.native
  var id: Double = js.native
  var vertices: ArrayLike[Double] = js.native
  var worldVerticesLength: Double = js.native
  def computeWorldVertices(
    slot: Slot,
    start: Double,
    count: Double,
    worldVertices: ArrayLike[Double],
    offset: Double,
    stride: Double
  ): Unit = js.native
  def copyTo(attachment: VertexAttachment): Unit = js.native
}

/* static members */
@JSGlobal("spine.VertexAttachment")
@js.native
object VertexAttachment extends js.Object {
  var nextID: js.Any = js.native
}

