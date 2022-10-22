package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Skin extends StObject {
  
  def addSkin(skin: Skin): Unit
  
  def attachAll(skeleton: Skeleton, oldSkin: Skin): Unit
  
  var attachments: js.Array[Map[Attachment]]
  
  var bones: js.Array[BoneData]
  
  def clear(): Unit
  
  var constraints: js.Array[ConstraintData]
  
  def copySkin(skin: Skin): Unit
  
  def getAttachment(slotIndex: Double, name: String): Attachment
  
  def getAttachments(): js.Array[SkinEntry]
  
  def getAttachmentsForSlot(slotIndex: Double, attachments: js.Array[SkinEntry]): Unit
  
  var name: String
  
  def removeAttachment(slotIndex: Double, name: String): Unit
  
  def setAttachment(slotIndex: Double, name: String, attachment: Attachment): Unit
}
object Skin {
  
  inline def apply(
    addSkin: Skin => Callback,
    attachAll: (Skeleton, Skin) => Callback,
    attachments: js.Array[Map[Attachment]],
    bones: js.Array[BoneData],
    clear: Callback,
    constraints: js.Array[ConstraintData],
    copySkin: Skin => Callback,
    getAttachment: (Double, String) => Attachment,
    getAttachments: CallbackTo[js.Array[SkinEntry]],
    getAttachmentsForSlot: (Double, js.Array[SkinEntry]) => Callback,
    name: String,
    removeAttachment: (Double, String) => Callback,
    setAttachment: (Double, String, Attachment) => Callback
  ): Skin = {
    val __obj = js.Dynamic.literal(addSkin = js.Any.fromFunction1((t0: Skin) => addSkin(t0).runNow()), attachAll = js.Any.fromFunction2((t0: Skeleton, t1: Skin) => (attachAll(t0, t1)).runNow()), attachments = attachments.asInstanceOf[js.Any], bones = bones.asInstanceOf[js.Any], clear = clear.toJsFn, constraints = constraints.asInstanceOf[js.Any], copySkin = js.Any.fromFunction1((t0: Skin) => copySkin(t0).runNow()), getAttachment = js.Any.fromFunction2(getAttachment), getAttachments = getAttachments.toJsFn, getAttachmentsForSlot = js.Any.fromFunction2((t0: Double, t1: js.Array[SkinEntry]) => (getAttachmentsForSlot(t0, t1)).runNow()), name = name.asInstanceOf[js.Any], removeAttachment = js.Any.fromFunction2((t0: Double, t1: String) => (removeAttachment(t0, t1)).runNow()), setAttachment = js.Any.fromFunction3((t0: Double, t1: String, t2: Attachment) => (setAttachment(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[Skin]
  }
  
  extension [Self <: Skin](x: Self) {
    
    inline def setAddSkin(value: Skin => Callback): Self = StObject.set(x, "addSkin", js.Any.fromFunction1((t0: Skin) => value(t0).runNow()))
    
    inline def setAttachAll(value: (Skeleton, Skin) => Callback): Self = StObject.set(x, "attachAll", js.Any.fromFunction2((t0: Skeleton, t1: Skin) => (value(t0, t1)).runNow()))
    
    inline def setAttachments(value: js.Array[Map[Attachment]]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsVarargs(value: Map[Attachment]*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setBones(value: js.Array[BoneData]): Self = StObject.set(x, "bones", value.asInstanceOf[js.Any])
    
    inline def setBonesVarargs(value: BoneData*): Self = StObject.set(x, "bones", js.Array(value*))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setConstraints(value: js.Array[ConstraintData]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsVarargs(value: ConstraintData*): Self = StObject.set(x, "constraints", js.Array(value*))
    
    inline def setCopySkin(value: Skin => Callback): Self = StObject.set(x, "copySkin", js.Any.fromFunction1((t0: Skin) => value(t0).runNow()))
    
    inline def setGetAttachment(value: (Double, String) => Attachment): Self = StObject.set(x, "getAttachment", js.Any.fromFunction2(value))
    
    inline def setGetAttachments(value: CallbackTo[js.Array[SkinEntry]]): Self = StObject.set(x, "getAttachments", value.toJsFn)
    
    inline def setGetAttachmentsForSlot(value: (Double, js.Array[SkinEntry]) => Callback): Self = StObject.set(x, "getAttachmentsForSlot", js.Any.fromFunction2((t0: Double, t1: js.Array[SkinEntry]) => (value(t0, t1)).runNow()))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRemoveAttachment(value: (Double, String) => Callback): Self = StObject.set(x, "removeAttachment", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetAttachment(value: (Double, String, Attachment) => Callback): Self = StObject.set(x, "setAttachment", js.Any.fromFunction3((t0: Double, t1: String, t2: Attachment) => (value(t0, t1, t2)).runNow()))
  }
}
