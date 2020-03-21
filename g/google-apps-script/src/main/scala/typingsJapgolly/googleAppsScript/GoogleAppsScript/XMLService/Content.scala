package typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a generic XML node.
  * Implementing classes
  *
  * NameBrief description
  *
  * CdataA representation of an XML CDATASection node.
  *
  * CommentA representation of an XML Comment node.
  *
  * DocTypeA representation of an XML DocumentType node.
  *
  * ElementA representation of an XML Element node.
  *
  * EntityRefA representation of an XML EntityReference node.
  *
  * ProcessingInstructionA representation of an XML ProcessingInstruction node.
  *
  * TextA representation of an XML Text node.
  */
trait Content extends js.Object {
  def asCdata(): Cdata
  def asComment(): Comment
  def asDocType(): DocType
  def asElement(): Element
  def asEntityRef(): EntityRef
  def asProcessingInstruction(): ProcessingInstruction
  def asText(): Text
  def detach(): Content
  def getParentElement(): Element
  def getType(): ContentType
  def getValue(): String
}

object Content {
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
    getType: CallbackTo[ContentType],
    getValue: CallbackTo[String]
  ): Content = {
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
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.asInstanceOf[Content]
  }
}

