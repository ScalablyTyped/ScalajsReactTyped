package typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an XML DocumentType node.
  */
trait DocType extends Content {
  def getElementName(): String
  def getInternalSubset(): String
  def getPublicId(): String
  def getSystemId(): String
  def setElementName(name: String): DocType
  def setInternalSubset(data: String): DocType
  def setPublicId(id: String): DocType
  def setSystemId(id: String): DocType
}

object DocType {
  @scala.inline
  def apply(
    asCdata: CallbackTo[Cdata],
    asComment: CallbackTo[Comment],
    asDocType: CallbackTo[DocType],
    asElement: CallbackTo[Element],
    asEntityRef: CallbackTo[EntityRef],
    asProcessingInstruction: CallbackTo[ProcessingInstruction],
    asText: CallbackTo[Text],
    detach: CallbackTo[Content],
    getElementName: CallbackTo[String],
    getInternalSubset: CallbackTo[String],
    getParentElement: CallbackTo[Element],
    getPublicId: CallbackTo[String],
    getSystemId: CallbackTo[String],
    getType: CallbackTo[ContentType],
    getValue: CallbackTo[String],
    setElementName: String => CallbackTo[DocType],
    setInternalSubset: String => CallbackTo[DocType],
    setPublicId: String => CallbackTo[DocType],
    setSystemId: String => CallbackTo[DocType]
  ): DocType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asCdata")(asCdata.toJsFn)
    __obj.updateDynamic("asComment")(asComment.toJsFn)
    __obj.updateDynamic("asDocType")(asDocType.toJsFn)
    __obj.updateDynamic("asElement")(asElement.toJsFn)
    __obj.updateDynamic("asEntityRef")(asEntityRef.toJsFn)
    __obj.updateDynamic("asProcessingInstruction")(asProcessingInstruction.toJsFn)
    __obj.updateDynamic("asText")(asText.toJsFn)
    __obj.updateDynamic("detach")(detach.toJsFn)
    __obj.updateDynamic("getElementName")(getElementName.toJsFn)
    __obj.updateDynamic("getInternalSubset")(getInternalSubset.toJsFn)
    __obj.updateDynamic("getParentElement")(getParentElement.toJsFn)
    __obj.updateDynamic("getPublicId")(getPublicId.toJsFn)
    __obj.updateDynamic("getSystemId")(getSystemId.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.updateDynamic("setElementName")(js.Any.fromFunction1((t0: java.lang.String) => setElementName(t0).runNow()))
    __obj.updateDynamic("setInternalSubset")(js.Any.fromFunction1((t0: java.lang.String) => setInternalSubset(t0).runNow()))
    __obj.updateDynamic("setPublicId")(js.Any.fromFunction1((t0: java.lang.String) => setPublicId(t0).runNow()))
    __obj.updateDynamic("setSystemId")(js.Any.fromFunction1((t0: java.lang.String) => setSystemId(t0).runNow()))
    __obj.asInstanceOf[DocType]
  }
}

