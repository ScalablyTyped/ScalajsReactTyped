package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slot extends StObject {
  
  /* private */ var attachment: Any
  
  /* private */ var attachmentTime: Any
  
  var bone: Bone
  
  var color: Color
  
  var darkColor: Color
  
  var data: SlotData
  
  var deform: js.Array[Double]
  
  def getAttachment(): Attachment
  
  def getAttachmentTime(): Double
  
  def setAttachment(attachment: Attachment): Unit
  
  def setAttachmentTime(time: Double): Unit
  
  def setToSetupPose(): Unit
}
object Slot {
  
  inline def apply(
    attachment: Any,
    attachmentTime: Any,
    bone: Bone,
    color: Color,
    darkColor: Color,
    data: SlotData,
    deform: js.Array[Double],
    getAttachment: CallbackTo[Attachment],
    getAttachmentTime: CallbackTo[Double],
    setAttachment: Attachment => Callback,
    setAttachmentTime: Double => Callback,
    setToSetupPose: Callback
  ): Slot = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], attachmentTime = attachmentTime.asInstanceOf[js.Any], bone = bone.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], darkColor = darkColor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deform = deform.asInstanceOf[js.Any], getAttachment = getAttachment.toJsFn, getAttachmentTime = getAttachmentTime.toJsFn, setAttachment = js.Any.fromFunction1((t0: Attachment) => setAttachment(t0).runNow()), setAttachmentTime = js.Any.fromFunction1((t0: Double) => setAttachmentTime(t0).runNow()), setToSetupPose = setToSetupPose.toJsFn)
    __obj.asInstanceOf[Slot]
  }
  
  extension [Self <: Slot](x: Self) {
    
    inline def setAttachment(value: Any): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentTime(value: Any): Self = StObject.set(x, "attachmentTime", value.asInstanceOf[js.Any])
    
    inline def setBone(value: Bone): Self = StObject.set(x, "bone", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDarkColor(value: Color): Self = StObject.set(x, "darkColor", value.asInstanceOf[js.Any])
    
    inline def setData(value: SlotData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDeform(value: js.Array[Double]): Self = StObject.set(x, "deform", value.asInstanceOf[js.Any])
    
    inline def setDeformVarargs(value: Double*): Self = StObject.set(x, "deform", js.Array(value*))
    
    inline def setGetAttachment(value: CallbackTo[Attachment]): Self = StObject.set(x, "getAttachment", value.toJsFn)
    
    inline def setGetAttachmentTime(value: CallbackTo[Double]): Self = StObject.set(x, "getAttachmentTime", value.toJsFn)
    
    inline def setSetAttachment(value: Attachment => Callback): Self = StObject.set(x, "setAttachment", js.Any.fromFunction1((t0: Attachment) => value(t0).runNow()))
    
    inline def setSetAttachmentTime(value: Double => Callback): Self = StObject.set(x, "setAttachmentTime", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetToSetupPose(value: Callback): Self = StObject.set(x, "setToSetupPose", value.toJsFn)
  }
}
