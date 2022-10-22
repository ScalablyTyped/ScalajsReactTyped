package typingsJapgolly.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.AtlasAttachmentLoader")
@js.native
open class AtlasAttachmentLoader protected ()
  extends StObject
     with typingsJapgolly.phaser.spine.AtlasAttachmentLoader {
  def this(atlas: typingsJapgolly.phaser.spine.TextureAtlas) = this()
  
  /* CompleteClass */
  var atlas: typingsJapgolly.phaser.spine.TextureAtlas = js.native
  
  /* CompleteClass */
  override def newBoundingBoxAttachment(skin: typingsJapgolly.phaser.spine.Skin, name: String): typingsJapgolly.phaser.spine.BoundingBoxAttachment = js.native
  
  /* CompleteClass */
  override def newClippingAttachment(skin: typingsJapgolly.phaser.spine.Skin, name: String): typingsJapgolly.phaser.spine.ClippingAttachment = js.native
  
  /* CompleteClass */
  override def newMeshAttachment(skin: typingsJapgolly.phaser.spine.Skin, name: String, path: String): typingsJapgolly.phaser.spine.MeshAttachment = js.native
  
  /* CompleteClass */
  override def newPathAttachment(skin: typingsJapgolly.phaser.spine.Skin, name: String): typingsJapgolly.phaser.spine.PathAttachment = js.native
  
  /* CompleteClass */
  override def newPointAttachment(skin: typingsJapgolly.phaser.spine.Skin, name: String): typingsJapgolly.phaser.spine.PointAttachment = js.native
  
  /* CompleteClass */
  override def newRegionAttachment(skin: typingsJapgolly.phaser.spine.Skin, name: String, path: String): typingsJapgolly.phaser.spine.RegionAttachment = js.native
}
