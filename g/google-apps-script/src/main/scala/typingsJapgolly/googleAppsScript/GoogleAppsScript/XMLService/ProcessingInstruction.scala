package typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an XML ProcessingInstruction node.
  */
trait ProcessingInstruction extends Content {
  def getData(): String
  def getTarget(): String
}

object ProcessingInstruction {
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
    getData: CallbackTo[String],
    getParentElement: CallbackTo[Element],
    getTarget: CallbackTo[String],
    getType: CallbackTo[ContentType],
    getValue: CallbackTo[String]
  ): ProcessingInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asCdata")(asCdata.toJsFn)
    __obj.updateDynamic("asComment")(asComment.toJsFn)
    __obj.updateDynamic("asDocType")(asDocType.toJsFn)
    __obj.updateDynamic("asElement")(asElement.toJsFn)
    __obj.updateDynamic("asEntityRef")(asEntityRef.toJsFn)
    __obj.updateDynamic("asProcessingInstruction")(asProcessingInstruction.toJsFn)
    __obj.updateDynamic("asText")(asText.toJsFn)
    __obj.updateDynamic("detach")(detach.toJsFn)
    __obj.updateDynamic("getData")(getData.toJsFn)
    __obj.updateDynamic("getParentElement")(getParentElement.toJsFn)
    __obj.updateDynamic("getTarget")(getTarget.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.asInstanceOf[ProcessingInstruction]
  }
}

