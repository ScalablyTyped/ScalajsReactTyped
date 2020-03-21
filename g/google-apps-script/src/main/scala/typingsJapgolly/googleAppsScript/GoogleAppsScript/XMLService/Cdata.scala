package typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an XML CDATASection node.
  *
  *     // Create and log an XML document that shows how special characters like '<', '>', and '&' are
  *     // stored in a CDATASection node as compared to in a Text node.
  *     var illegalCharacters = '<em>The Amazing Adventures of Kavalier & Clay</em>';
  *     var cdata = XmlService.createCdata(illegalCharacters);
  *     var text = XmlService.createText(illegalCharacters);
  *     var root = XmlService.createElement('root').addContent(cdata).addContent(text);
  *     var document = XmlService.createDocument(root);
  *     var xml = XmlService.getPrettyFormat().format(document);
  *     Logger.log(xml);
  */
trait Cdata extends Content {
  def append(text: String): Text
  def getText(): String
  def setText(text: String): Text
}

object Cdata {
  @scala.inline
  def apply(
    append: String => CallbackTo[Text],
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
    setText: String => CallbackTo[Text]
  ): Cdata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("append")(js.Any.fromFunction1((t0: java.lang.String) => append(t0).runNow()))
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
    __obj.asInstanceOf[Cdata]
  }
}

