package typingsJapgolly.googleAppsScript.GoogleAppsScript.Document

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A generic element. Document contents are
  * represented as elements. For example, ListItem, Paragraph, and Table are
  * elements and inherit all of the methods defined by Element, such as getType().
  * Implementing classes
  *
  * NameBrief description
  *
  * BodyAn element representing a document body.
  *
  * ContainerElementA generic element that may contain other elements.
  *
  * EquationAn element representing a mathematical expression.
  *
  * EquationFunctionAn element representing a function in a mathematical Equation.
  *
  * EquationFunctionArgumentSeparatorAn element representing a function separator in a mathematical Equation.
  *
  * EquationSymbolAn element representing a symbol in a mathematical Equation.
  *
  * FooterSectionAn element representing a footer section.
  *
  * FootnoteAn element representing a footnote.
  *
  * FootnoteSectionAn element representing a footnote section.
  *
  * HeaderSectionAn element representing a header section.
  *
  * HorizontalRuleAn element representing an horizontal rule.
  *
  * InlineDrawingAn element representing an embedded drawing.
  *
  * InlineImageAn element representing an embedded image.
  *
  * ListItemAn element representing a list item.
  *
  * PageBreakAn element representing a page break.
  *
  * ParagraphAn element representing a paragraph.
  *
  * TableAn element representing a table.
  *
  * TableCellAn element representing a table cell.
  *
  * TableOfContentsAn element containing a table of contents.
  *
  * TableRowAn element representing a table row.
  *
  * TextAn element representing a rich text region.
  *
  * UnsupportedElementAn element representing a region that is unknown or cannot be affected by a script, such as a
  * page number.
  */
trait Element extends js.Object {
  def asBody(): Body
  def asEquation(): Equation
  def asEquationFunction(): EquationFunction
  def asEquationFunctionArgumentSeparator(): EquationFunctionArgumentSeparator
  def asEquationSymbol(): EquationSymbol
  def asFooterSection(): FooterSection
  def asFootnote(): Footnote
  def asFootnoteSection(): FootnoteSection
  def asHeaderSection(): HeaderSection
  def asHorizontalRule(): HorizontalRule
  def asInlineDrawing(): InlineDrawing
  def asInlineImage(): InlineImage
  def asListItem(): ListItem
  def asPageBreak(): PageBreak
  def asParagraph(): Paragraph
  def asTable(): Table
  def asTableCell(): TableCell
  def asTableOfContents(): TableOfContents
  def asTableRow(): TableRow
  def asText(): Text
  def copy(): Element
  def getAttributes(): js.Any
  def getNextSibling(): Element
  def getParent(): ContainerElement
  def getPreviousSibling(): Element
  def getType(): ElementType
  def isAtDocumentEnd(): Boolean
  def merge(): Element
  def removeFromParent(): Element
  def setAttributes(attributes: js.Any): Element
}

object Element {
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
  ): Element = {
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
    __obj.asInstanceOf[Element]
  }
}

