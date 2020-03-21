package typingsJapgolly.googleAppsScript.GoogleAppsScript.Document

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Blob
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An element representing an embedded image. An InlineImage can be contained within a
  * ListItem or Paragraph, unless the ListItem or Paragraph is within
  * a FootnoteSection. An InlineImage cannot itself contain any other element. For
  * more information on document structure, see the guide to extending Google Docs.
  */
trait InlineImage extends Element {
  def getAltDescription(): String
  def getAltTitle(): String
  def getAs(contentType: String): Blob
  def getBlob(): Blob
  def getHeight(): Integer
  def getLinkUrl(): String
  def getWidth(): Integer
  def setAltDescription(description: String): InlineImage
  def setAltTitle(title: String): InlineImage
  def setHeight(height: Integer): InlineImage
  def setLinkUrl(url: String): InlineImage
  def setWidth(width: Integer): InlineImage
}

object InlineImage {
  @scala.inline
  def apply(
    asBody: CallbackTo[Body],
    asEquation: CallbackTo[Equation],
    asEquationFunction: CallbackTo[EquationFunction],
    asEquationFunctionArgumentSeparator: CallbackTo[EquationFunctionArgumentSeparator],
    asEquationSymbol: CallbackTo[EquationSymbol],
    asFooterSection: CallbackTo[FooterSection],
    asFootnote: CallbackTo[Footnote],
    asFootnoteSection: CallbackTo[FootnoteSection],
    asHeaderSection: CallbackTo[HeaderSection],
    asHorizontalRule: CallbackTo[HorizontalRule],
    asInlineDrawing: CallbackTo[InlineDrawing],
    asInlineImage: CallbackTo[InlineImage],
    asListItem: CallbackTo[ListItem],
    asPageBreak: CallbackTo[PageBreak],
    asParagraph: CallbackTo[Paragraph],
    asTable: CallbackTo[Table],
    asTableCell: CallbackTo[TableCell],
    asTableOfContents: CallbackTo[TableOfContents],
    asTableRow: CallbackTo[TableRow],
    asText: CallbackTo[Text],
    copy: CallbackTo[Element],
    getAltDescription: CallbackTo[String],
    getAltTitle: CallbackTo[String],
    getAs: String => CallbackTo[Blob],
    getAttributes: CallbackTo[js.Any],
    getBlob: CallbackTo[Blob],
    getHeight: CallbackTo[Integer],
    getLinkUrl: CallbackTo[String],
    getNextSibling: CallbackTo[Element],
    getParent: CallbackTo[ContainerElement],
    getPreviousSibling: CallbackTo[Element],
    getType: CallbackTo[ElementType],
    getWidth: CallbackTo[Integer],
    isAtDocumentEnd: CallbackTo[Boolean],
    merge: CallbackTo[Element],
    removeFromParent: CallbackTo[Element],
    setAltDescription: String => CallbackTo[InlineImage],
    setAltTitle: String => CallbackTo[InlineImage],
    setAttributes: js.Any => CallbackTo[Element],
    setHeight: Integer => CallbackTo[InlineImage],
    setLinkUrl: String => CallbackTo[InlineImage],
    setWidth: Integer => CallbackTo[InlineImage]
  ): InlineImage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asBody")(asBody.toJsFn)
    __obj.updateDynamic("asEquation")(asEquation.toJsFn)
    __obj.updateDynamic("asEquationFunction")(asEquationFunction.toJsFn)
    __obj.updateDynamic("asEquationFunctionArgumentSeparator")(asEquationFunctionArgumentSeparator.toJsFn)
    __obj.updateDynamic("asEquationSymbol")(asEquationSymbol.toJsFn)
    __obj.updateDynamic("asFooterSection")(asFooterSection.toJsFn)
    __obj.updateDynamic("asFootnote")(asFootnote.toJsFn)
    __obj.updateDynamic("asFootnoteSection")(asFootnoteSection.toJsFn)
    __obj.updateDynamic("asHeaderSection")(asHeaderSection.toJsFn)
    __obj.updateDynamic("asHorizontalRule")(asHorizontalRule.toJsFn)
    __obj.updateDynamic("asInlineDrawing")(asInlineDrawing.toJsFn)
    __obj.updateDynamic("asInlineImage")(asInlineImage.toJsFn)
    __obj.updateDynamic("asListItem")(asListItem.toJsFn)
    __obj.updateDynamic("asPageBreak")(asPageBreak.toJsFn)
    __obj.updateDynamic("asParagraph")(asParagraph.toJsFn)
    __obj.updateDynamic("asTable")(asTable.toJsFn)
    __obj.updateDynamic("asTableCell")(asTableCell.toJsFn)
    __obj.updateDynamic("asTableOfContents")(asTableOfContents.toJsFn)
    __obj.updateDynamic("asTableRow")(asTableRow.toJsFn)
    __obj.updateDynamic("asText")(asText.toJsFn)
    __obj.updateDynamic("copy")(copy.toJsFn)
    __obj.updateDynamic("getAltDescription")(getAltDescription.toJsFn)
    __obj.updateDynamic("getAltTitle")(getAltTitle.toJsFn)
    __obj.updateDynamic("getAs")(js.Any.fromFunction1((t0: java.lang.String) => getAs(t0).runNow()))
    __obj.updateDynamic("getAttributes")(getAttributes.toJsFn)
    __obj.updateDynamic("getBlob")(getBlob.toJsFn)
    __obj.updateDynamic("getHeight")(getHeight.toJsFn)
    __obj.updateDynamic("getLinkUrl")(getLinkUrl.toJsFn)
    __obj.updateDynamic("getNextSibling")(getNextSibling.toJsFn)
    __obj.updateDynamic("getParent")(getParent.toJsFn)
    __obj.updateDynamic("getPreviousSibling")(getPreviousSibling.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("getWidth")(getWidth.toJsFn)
    __obj.updateDynamic("isAtDocumentEnd")(isAtDocumentEnd.toJsFn)
    __obj.updateDynamic("merge")(merge.toJsFn)
    __obj.updateDynamic("removeFromParent")(removeFromParent.toJsFn)
    __obj.updateDynamic("setAltDescription")(js.Any.fromFunction1((t0: java.lang.String) => setAltDescription(t0).runNow()))
    __obj.updateDynamic("setAltTitle")(js.Any.fromFunction1((t0: java.lang.String) => setAltTitle(t0).runNow()))
    __obj.updateDynamic("setAttributes")(js.Any.fromFunction1((t0: js.Any) => setAttributes(t0).runNow()))
    __obj.updateDynamic("setHeight")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setHeight(t0).runNow()))
    __obj.updateDynamic("setLinkUrl")(js.Any.fromFunction1((t0: java.lang.String) => setLinkUrl(t0).runNow()))
    __obj.updateDynamic("setWidth")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setWidth(t0).runNow()))
    __obj.asInstanceOf[InlineImage]
  }
}

