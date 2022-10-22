package typingsJapgolly.phaser.global.spine

import typingsJapgolly.phaser.spine.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.AttachmentTimeline")
@js.native
open class AttachmentTimeline protected ()
  extends StObject
     with typingsJapgolly.phaser.spine.AttachmentTimeline {
  def this(frameCount: Double) = this()
  
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: typingsJapgolly.phaser.spine.Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[typingsJapgolly.phaser.spine.Event],
    alpha: Double,
    blend: typingsJapgolly.phaser.spine.MixBlend,
    direction: typingsJapgolly.phaser.spine.MixDirection
  ): Unit = js.native
  
  /* CompleteClass */
  var attachmentNames: js.Array[String] = js.native
  
  /* CompleteClass */
  var frames: ArrayLike[Double] = js.native
  
  /* CompleteClass */
  override def getFrameCount(): Double = js.native
  
  /* CompleteClass */
  override def getPropertyId(): Double = js.native
  
  /* CompleteClass */
  override def setFrame(frameIndex: Double, time: Double, attachmentName: String): Unit = js.native
  
  /* CompleteClass */
  var slotIndex: Double = js.native
}
