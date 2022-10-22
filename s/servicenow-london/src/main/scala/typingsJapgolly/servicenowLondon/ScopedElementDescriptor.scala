package typingsJapgolly.servicenowLondon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopedElementDescriptor extends StObject {
  
  /**
    * Returns the encryption type used for attachments on the element's table.
    *
    * @returns The encryption type used on attachments. Returns null if attachments on the element's
    * table are not being encrypted.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    *
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * var isEdge = ed.getAttachmentEncryptionType();
    * gs.info(isEdge);
    * // null
    */
  def getAttachmentEncryptionType(): String
  
  /**
    * Returns the element's encryption type.
    *
    * @returns The element's encryption type. Returns null if the element is not
    * encrypted.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    *
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * sEdge = ed.getEncryptionType();
    * gs.info(isEdge);
    * // null
    */
  def getEncryptionType(): String
  
  /**
    * Returns the element's internal data type.
    *
    * @returns The element's internal data type.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    *
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * var isEdge = ed.getInternalType();
    * gs.info(isEdge);
    */
  def getInternalType(): String
  
  /**
    * Returns the element's label.
    *
    * @returns The element's label.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    *
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * var isEdge = ed.getLabel();
    * gs.info(isEdge);
    * // Priority
    */
  def getLabel(): String
  
  /**
    * Returns the element's length.
    *
    * @returns The element's size.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    *
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * var isEdge = ed.getLength();
    * gs.info(isEdge);
    * // 40
    */
  def getLength(): Double
  
  /**
    * Returns the element's name.
    *
    * @returns The element's name.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    *
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * var isEdge = ed.getName();
    * gs.info(isEdge);
    * // priority
    */
  def getName(): String
  
  /**
    * Returns the element's plural label.
    *
    * @returns The element's plural label.
    * @example
    *
    * var gr = new GlideRecord('incident');
    * gr.query();
    * var ed = gr.getED();
    * gs.info(ed.getPlural());
    * // Incidents
    */
  def getPlural(): String
  
  /**
    * Returns true if an encrypted attachment has been added to the table.
    *
    * @returns Returns true if an encrypted attachment has been added to the table.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    *
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * var isEdge = ed.hasAttachmentsEncrypted();
    * gs.info(isEdge);
    * // false
    */
  def hasAttachmentsEncrypted(): Boolean
  
  /**
    * Returns true if the element is an automatically generated or system field.
    *
    * @returns True if the element is automatically generated or a system field.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * isEdge = ed.isAutoOrSysID();
    * gs.info(isEdge);
    * // false
    */
  def isAutoOrSysID(): Boolean
  
  /**
    * Returns true if the element is defined as a dropdown choice in its dictionary
    * definition.
    *
    * @returns Returns true if the element is defined as a dropdown choice. Returns true even
    * if there are no entries defined in the choice table. The last choice type,
    * suggestion, does not return true.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    *
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * var isChoiceTable = ed.isChoiceTable();
    * gs.info(isChoiceTable);
    * // true
    */
  def isChoiceTable(): Boolean
  
  /**
    * Returns true if an element is encrypted.
    *
    * @returns Returns true if the element is encrypted, false otherwise.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    *
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * var isEdge = ed.isEdgeEncrypted();
    * gs.info(isEdge)
    * // false
    */
  def isEdgeEncrypted(): Boolean
  
  /**
    * Returns true if the element is a virtual element.
    *
    * A virtual element is a calculated field as set by the dictionary definition of the field.
    * Virtual fields cannot be encrypted.
    *
    * @returns Returns true if the element is a virtual element.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    *
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    *
    * var isVirtual = ed.isVirtual();
    * gs.info(isVirtual);
    * // false
    */
  def isVirtual(): Boolean
}
object ScopedElementDescriptor {
  
  inline def apply(
    getAttachmentEncryptionType: CallbackTo[String],
    getEncryptionType: CallbackTo[String],
    getInternalType: CallbackTo[String],
    getLabel: CallbackTo[String],
    getLength: CallbackTo[Double],
    getName: CallbackTo[String],
    getPlural: CallbackTo[String],
    hasAttachmentsEncrypted: CallbackTo[Boolean],
    isAutoOrSysID: CallbackTo[Boolean],
    isChoiceTable: CallbackTo[Boolean],
    isEdgeEncrypted: CallbackTo[Boolean],
    isVirtual: CallbackTo[Boolean]
  ): ScopedElementDescriptor = {
    val __obj = js.Dynamic.literal(getAttachmentEncryptionType = getAttachmentEncryptionType.toJsFn, getEncryptionType = getEncryptionType.toJsFn, getInternalType = getInternalType.toJsFn, getLabel = getLabel.toJsFn, getLength = getLength.toJsFn, getName = getName.toJsFn, getPlural = getPlural.toJsFn, hasAttachmentsEncrypted = hasAttachmentsEncrypted.toJsFn, isAutoOrSysID = isAutoOrSysID.toJsFn, isChoiceTable = isChoiceTable.toJsFn, isEdgeEncrypted = isEdgeEncrypted.toJsFn, isVirtual = isVirtual.toJsFn)
    __obj.asInstanceOf[ScopedElementDescriptor]
  }
  
  extension [Self <: ScopedElementDescriptor](x: Self) {
    
    inline def setGetAttachmentEncryptionType(value: CallbackTo[String]): Self = StObject.set(x, "getAttachmentEncryptionType", value.toJsFn)
    
    inline def setGetEncryptionType(value: CallbackTo[String]): Self = StObject.set(x, "getEncryptionType", value.toJsFn)
    
    inline def setGetInternalType(value: CallbackTo[String]): Self = StObject.set(x, "getInternalType", value.toJsFn)
    
    inline def setGetLabel(value: CallbackTo[String]): Self = StObject.set(x, "getLabel", value.toJsFn)
    
    inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetPlural(value: CallbackTo[String]): Self = StObject.set(x, "getPlural", value.toJsFn)
    
    inline def setHasAttachmentsEncrypted(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasAttachmentsEncrypted", value.toJsFn)
    
    inline def setIsAutoOrSysID(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAutoOrSysID", value.toJsFn)
    
    inline def setIsChoiceTable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isChoiceTable", value.toJsFn)
    
    inline def setIsEdgeEncrypted(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEdgeEncrypted", value.toJsFn)
    
    inline def setIsVirtual(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVirtual", value.toJsFn)
  }
}
