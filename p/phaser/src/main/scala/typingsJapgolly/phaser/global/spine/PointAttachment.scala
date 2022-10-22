package typingsJapgolly.phaser.global.spine

import typingsJapgolly.phaser.spine.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.PointAttachment")
@js.native
open class PointAttachment protected ()
  extends StObject
     with typingsJapgolly.phaser.spine.PointAttachment {
  def this(name: String) = this()
  
  /* CompleteClass */
  var bones: js.Array[Double] = js.native
  
  /* CompleteClass */
  var color: typingsJapgolly.phaser.spine.Color = js.native
  
  /* CompleteClass */
  override def computeWorldPosition(bone: typingsJapgolly.phaser.spine.Bone, point: typingsJapgolly.phaser.spine.Vector2): typingsJapgolly.phaser.spine.Vector2 = js.native
  
  /* CompleteClass */
  override def computeWorldRotation(bone: typingsJapgolly.phaser.spine.Bone): Double = js.native
  
  /* CompleteClass */
  override def computeWorldVertices(
    slot: typingsJapgolly.phaser.spine.Slot,
    start: Double,
    count: Double,
    worldVertices: ArrayLike[Double],
    offset: Double,
    stride: Double
  ): Unit = js.native
  
  /* CompleteClass */
  override def copy(): typingsJapgolly.phaser.spine.Attachment = js.native
  
  /* CompleteClass */
  override def copyTo(attachment: typingsJapgolly.phaser.spine.VertexAttachment): Unit = js.native
  
  /* CompleteClass */
  var deformAttachment: typingsJapgolly.phaser.spine.VertexAttachment = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var rotation: Double = js.native
  
  /* CompleteClass */
  var vertices: ArrayLike[Double] = js.native
  
  /* CompleteClass */
  var worldVerticesLength: Double = js.native
  
  /* CompleteClass */
  var x: Double = js.native
  
  /* CompleteClass */
  var y: Double = js.native
}
