package typingsJapgolly.servicenow.servicenow

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideElementDescriptor extends js.Object {
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
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAttachmentEncryptionType")(getAttachmentEncryptionType.toJsFn)
    __obj.updateDynamic("getEncryptionType")(getEncryptionType.toJsFn)
    __obj.updateDynamic("getInternalType")(getInternalType.toJsFn)
    __obj.updateDynamic("getLabel")(getLabel.toJsFn)
    __obj.updateDynamic("getLength")(getLength.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getPlural")(getPlural.toJsFn)
    __obj.updateDynamic("hasAttachmentsEncrypted")(hasAttachmentsEncrypted.toJsFn)
    __obj.updateDynamic("isAutoOrSysID")(isAutoOrSysID.toJsFn)
    __obj.updateDynamic("isChoiceTable")(isChoiceTable.toJsFn)
    __obj.updateDynamic("isEdgeEncrypted")(isEdgeEncrypted.toJsFn)
    __obj.updateDynamic("isVirtual")(isVirtual.toJsFn)
    __obj.asInstanceOf[GlideElementDescriptor]
  }
}

