package typingsJapgolly.phaser.global.spine

import typingsJapgolly.phaser.spine.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("spine.VertexAttachment")
@js.native
open class VertexAttachment protected ()
  extends StObject
     with typingsJapgolly.phaser.spine.VertexAttachment {
  def this(name: String) = this()
  
  /* CompleteClass */
  var bones: js.Array[Double] = js.native
  
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
  var vertices: ArrayLike[Double] = js.native
  
  /* CompleteClass */
  var worldVerticesLength: Double = js.native
}
object VertexAttachment {
  
  @JSGlobal("spine.VertexAttachment")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("spine.VertexAttachment.nextID")
  @js.native
  def nextID: Any = js.native
  inline def nextID_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextID")(x.asInstanceOf[js.Any])
}
