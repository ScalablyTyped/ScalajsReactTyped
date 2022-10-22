package typingsJapgolly.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.Slot")
@js.native
open class Slot protected ()
  extends StObject
     with typingsJapgolly.phaser.spine.Slot {
  def this(data: typingsJapgolly.phaser.spine.SlotData, bone: typingsJapgolly.phaser.spine.Bone) = this()
  
  /* private */ /* CompleteClass */
  var attachment: Any = js.native
  
  /* private */ /* CompleteClass */
  var attachmentTime: Any = js.native
  
  /* CompleteClass */
  var bone: typingsJapgolly.phaser.spine.Bone = js.native
  
  /* CompleteClass */
  var color: typingsJapgolly.phaser.spine.Color = js.native
  
  /* CompleteClass */
  var darkColor: typingsJapgolly.phaser.spine.Color = js.native
  
  /* CompleteClass */
  var data: typingsJapgolly.phaser.spine.SlotData = js.native
  
  /* CompleteClass */
  var deform: js.Array[Double] = js.native
  
  /* CompleteClass */
  override def getAttachment(): typingsJapgolly.phaser.spine.Attachment = js.native
  
  /* CompleteClass */
  override def getAttachmentTime(): Double = js.native
  
  /* CompleteClass */
  override def setAttachment(attachment: typingsJapgolly.phaser.spine.Attachment): Unit = js.native
  
  /* CompleteClass */
  override def setAttachmentTime(time: Double): Unit = js.native
  
  /* CompleteClass */
  override def setToSetupPose(): Unit = js.native
}
