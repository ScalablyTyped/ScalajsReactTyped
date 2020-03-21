package typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an XML Comment node.
  */
trait Comment extends Content {
  def getText(): String
  def setText(text: String): Comment
}

object Comment {
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
    getParentElement: CallbackTo[Element],
    getText: CallbackTo[String],
    getType: CallbackTo[ContentType],
    getValue: CallbackTo[String],
    setText: String => CallbackTo[Comment]
  ): Comment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asCdata")(asCdata.toJsFn)
    __obj.updateDynamic("asComment")(asComment.toJsFn)
    __obj.updateDynamic("asDocType")(asDocType.toJsFn)
    __obj.updateDynamic("asElement")(asElement.toJsFn)
    __obj.updateDynamic("asEntityRef")(asEntityRef.toJsFn)
    __obj.updateDynamic("asProcessingInstruction")(asProcessingInstruction.toJsFn)
    __obj.updateDynamic("asText")(asText.toJsFn)
    __obj.updateDynamic("detach")(detach.toJsFn)
    __obj.updateDynamic("getParentElement")(getParentElement.toJsFn)
    __obj.updateDynamic("getText")(getText.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.updateDynamic("setText")(js.Any.fromFunction1((t0: java.lang.String) => setText(t0).runNow()))
    __obj.asInstanceOf[Comment]
  }
}

