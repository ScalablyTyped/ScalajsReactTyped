package typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an XML EntityReference node.
  */
trait EntityRef extends Content {
  def getName(): String
  def getPublicId(): String
  def getSystemId(): String
  def setName(name: String): EntityRef
  def setPublicId(id: String): EntityRef
  def setSystemId(id: String): EntityRef
}

object EntityRef {
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
    getName: CallbackTo[String],
    getParentElement: CallbackTo[Element],
    getPublicId: CallbackTo[String],
    getSystemId: CallbackTo[String],
    getType: CallbackTo[ContentType],
    getValue: CallbackTo[String],
    setName: String => CallbackTo[EntityRef],
    setPublicId: String => CallbackTo[EntityRef],
    setSystemId: String => CallbackTo[EntityRef]
  ): EntityRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asCdata")(asCdata.toJsFn)
    __obj.updateDynamic("asComment")(asComment.toJsFn)
    __obj.updateDynamic("asDocType")(asDocType.toJsFn)
    __obj.updateDynamic("asElement")(asElement.toJsFn)
    __obj.updateDynamic("asEntityRef")(asEntityRef.toJsFn)
    __obj.updateDynamic("asProcessingInstruction")(asProcessingInstruction.toJsFn)
    __obj.updateDynamic("asText")(asText.toJsFn)
    __obj.updateDynamic("detach")(detach.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getParentElement")(getParentElement.toJsFn)
    __obj.updateDynamic("getPublicId")(getPublicId.toJsFn)
    __obj.updateDynamic("getSystemId")(getSystemId.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    __obj.updateDynamic("setPublicId")(js.Any.fromFunction1((t0: java.lang.String) => setPublicId(t0).runNow()))
    __obj.updateDynamic("setSystemId")(js.Any.fromFunction1((t0: java.lang.String) => setSystemId(t0).runNow()))
    __obj.asInstanceOf[EntityRef]
  }
}

