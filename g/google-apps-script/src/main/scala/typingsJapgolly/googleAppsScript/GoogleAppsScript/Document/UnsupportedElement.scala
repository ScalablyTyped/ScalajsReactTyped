package typingsJapgolly.googleAppsScript.GoogleAppsScript.Document

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An element representing a region that is unknown or cannot be affected by a script, such as a
  * page number.
  */
trait UnsupportedElement extends Element

object UnsupportedElement {
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
    getAttributes: CallbackTo[js.Any],
    getNextSibling: CallbackTo[Element],
    getParent: CallbackTo[ContainerElement],
    getPreviousSibling: CallbackTo[Element],
    getType: CallbackTo[ElementType],
    isAtDocumentEnd: CallbackTo[Boolean],
    merge: CallbackTo[Element],
    removeFromParent: CallbackTo[Element],
    setAttributes: js.Any => CallbackTo[Element]
  ): UnsupportedElement = {
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
    __obj.updateDynamic("getAttributes")(getAttributes.toJsFn)
    __obj.updateDynamic("getNextSibling")(getNextSibling.toJsFn)
    __obj.updateDynamic("getParent")(getParent.toJsFn)
    __obj.updateDynamic("getPreviousSibling")(getPreviousSibling.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("isAtDocumentEnd")(isAtDocumentEnd.toJsFn)
    __obj.updateDynamic("merge")(merge.toJsFn)
    __obj.updateDynamic("removeFromParent")(removeFromParent.toJsFn)
    __obj.updateDynamic("setAttributes")(js.Any.fromFunction1((t0: js.Any) => setAttributes(t0).runNow()))
    __obj.asInstanceOf[UnsupportedElement]
  }
}

