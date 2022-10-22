package typingsJapgolly.phaser.global.spine

import typingsJapgolly.phaser.spine.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.Skin")
@js.native
open class Skin protected ()
  extends StObject
     with typingsJapgolly.phaser.spine.Skin {
  def this(name: String) = this()
  
  /* CompleteClass */
  override def addSkin(skin: typingsJapgolly.phaser.spine.Skin): Unit = js.native
  
  /* CompleteClass */
  override def attachAll(skeleton: typingsJapgolly.phaser.spine.Skeleton, oldSkin: typingsJapgolly.phaser.spine.Skin): Unit = js.native
  
  /* CompleteClass */
  var attachments: js.Array[Map[typingsJapgolly.phaser.spine.Attachment]] = js.native
  
  /* CompleteClass */
  var bones: js.Array[typingsJapgolly.phaser.spine.BoneData] = js.native
  
  /* CompleteClass */
  override def clear(): Unit = js.native
  
  /* CompleteClass */
  var constraints: js.Array[typingsJapgolly.phaser.spine.ConstraintData] = js.native
  
  /* CompleteClass */
  override def copySkin(skin: typingsJapgolly.phaser.spine.Skin): Unit = js.native
  
  /* CompleteClass */
  override def getAttachment(slotIndex: Double, name: String): typingsJapgolly.phaser.spine.Attachment = js.native
  
  /* CompleteClass */
  override def getAttachments(): js.Array[typingsJapgolly.phaser.spine.SkinEntry] = js.native
  
  /* CompleteClass */
  override def getAttachmentsForSlot(slotIndex: Double, attachments: js.Array[typingsJapgolly.phaser.spine.SkinEntry]): Unit = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  override def removeAttachment(slotIndex: Double, name: String): Unit = js.native
  
  /* CompleteClass */
  override def setAttachment(slotIndex: Double, name: String, attachment: typingsJapgolly.phaser.spine.Attachment): Unit = js.native
}
