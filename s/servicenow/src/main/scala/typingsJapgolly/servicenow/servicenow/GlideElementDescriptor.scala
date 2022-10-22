package typingsJapgolly.servicenow.servicenow

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideElementDescriptor extends StObject {
  
  def getAttachmentEncryptionType(): String
  
  def getEncryptionType(): String
  
  def getInternalType(): String
  
  def getLabel(): String
  
  def getLength(): Double
  
  def getName(): String
  
  def getPlural(): Boolean
  
  def hasAttachmentsEncrypted(): Boolean
  
  def isAutoOrSysID(): Boolean
  
  def isChoiceTable(): Boolean
  
  def isEdgeEncrypted(): Boolean
  
  def isVirtual(): Boolean
}
object GlideElementDescriptor {
  
  inline def apply(
    getAttachmentEncryptionType: CallbackTo[String],
    getEncryptionType: CallbackTo[String],
    getInternalType: CallbackTo[String],
    getLabel: CallbackTo[String],
    getLength: CallbackTo[Double],
    getName: CallbackTo[String],
    getPlural: CallbackTo[Boolean],
    hasAttachmentsEncrypted: CallbackTo[Boolean],
    isAutoOrSysID: CallbackTo[Boolean],
    isChoiceTable: CallbackTo[Boolean],
    isEdgeEncrypted: CallbackTo[Boolean],
    isVirtual: CallbackTo[Boolean]
  ): GlideElementDescriptor = {
    val __obj = js.Dynamic.literal(getAttachmentEncryptionType = getAttachmentEncryptionType.toJsFn, getEncryptionType = getEncryptionType.toJsFn, getInternalType = getInternalType.toJsFn, getLabel = getLabel.toJsFn, getLength = getLength.toJsFn, getName = getName.toJsFn, getPlural = getPlural.toJsFn, hasAttachmentsEncrypted = hasAttachmentsEncrypted.toJsFn, isAutoOrSysID = isAutoOrSysID.toJsFn, isChoiceTable = isChoiceTable.toJsFn, isEdgeEncrypted = isEdgeEncrypted.toJsFn, isVirtual = isVirtual.toJsFn)
    __obj.asInstanceOf[GlideElementDescriptor]
  }
  
  extension [Self <: GlideElementDescriptor](x: Self) {
    
    inline def setGetAttachmentEncryptionType(value: CallbackTo[String]): Self = StObject.set(x, "getAttachmentEncryptionType", value.toJsFn)
    
    inline def setGetEncryptionType(value: CallbackTo[String]): Self = StObject.set(x, "getEncryptionType", value.toJsFn)
    
    inline def setGetInternalType(value: CallbackTo[String]): Self = StObject.set(x, "getInternalType", value.toJsFn)
    
    inline def setGetLabel(value: CallbackTo[String]): Self = StObject.set(x, "getLabel", value.toJsFn)
    
    inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetPlural(value: CallbackTo[Boolean]): Self = StObject.set(x, "getPlural", value.toJsFn)
    
    inline def setHasAttachmentsEncrypted(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasAttachmentsEncrypted", value.toJsFn)
    
    inline def setIsAutoOrSysID(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAutoOrSysID", value.toJsFn)
    
    inline def setIsChoiceTable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isChoiceTable", value.toJsFn)
    
    inline def setIsEdgeEncrypted(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEdgeEncrypted", value.toJsFn)
    
    inline def setIsVirtual(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVirtual", value.toJsFn)
  }
}
