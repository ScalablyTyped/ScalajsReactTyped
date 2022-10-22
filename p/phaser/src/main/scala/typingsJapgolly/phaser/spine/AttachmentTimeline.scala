package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentTimeline
  extends StObject
     with Timeline {
  
  var attachmentNames: js.Array[String]
  
  var frames: ArrayLike[Double]
  
  def getFrameCount(): Double
  
  def setFrame(frameIndex: Double, time: Double, attachmentName: String): Unit
  
  var slotIndex: Double
}
object AttachmentTimeline {
  
  inline def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Callback,
    attachmentNames: js.Array[String],
    frames: ArrayLike[Double],
    getFrameCount: CallbackTo[Double],
    getPropertyId: CallbackTo[Double],
    setFrame: (Double, Double, String) => Callback,
    slotIndex: Double
  ): AttachmentTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7((t0: Skeleton, t1: Double, t2: Double, t3: js.Array[Event], t4: Double, t5: MixBlend, t6: MixDirection) => (apply(t0, t1, t2, t3, t4, t5, t6)).runNow()), attachmentNames = attachmentNames.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getFrameCount = getFrameCount.toJsFn, getPropertyId = getPropertyId.toJsFn, setFrame = js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (setFrame(t0, t1, t2)).runNow()), slotIndex = slotIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentTimeline]
  }
  
  extension [Self <: AttachmentTimeline](x: Self) {
    
    inline def setAttachmentNames(value: js.Array[String]): Self = StObject.set(x, "attachmentNames", value.asInstanceOf[js.Any])
    
    inline def setAttachmentNamesVarargs(value: String*): Self = StObject.set(x, "attachmentNames", js.Array(value*))
    
    inline def setFrames(value: ArrayLike[Double]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setGetFrameCount(value: CallbackTo[Double]): Self = StObject.set(x, "getFrameCount", value.toJsFn)
    
    inline def setSetFrame(value: (Double, Double, String) => Callback): Self = StObject.set(x, "setFrame", js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setSlotIndex(value: Double): Self = StObject.set(x, "slotIndex", value.asInstanceOf[js.Any])
  }
}
