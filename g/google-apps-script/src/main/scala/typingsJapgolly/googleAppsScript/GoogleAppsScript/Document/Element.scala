package typingsJapgolly.googleAppsScript.GoogleAppsScript.Document

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Element extends StObject {
  
  def asBody(): Body
  
  def asDate(): Date
  
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
  
  def asPerson(): Person
  
  def asRichLink(): RichLink
  
  def asTable(): Table
  
  def asTableCell(): TableCell
  
  def asTableOfContents(): TableOfContents
  
  def asTableRow(): TableRow
  
  def asText(): Text
  
  def copy(): Element
  
  def getAttributes(): Any
  
  def getNextSibling(): Element
  
  def getParent(): ContainerElement
  
  def getPreviousSibling(): Element
  
  def getType(): ElementType
  
  def isAtDocumentEnd(): Boolean
  
  def merge(): Element
  
  def removeFromParent(): Element
  
  def setAttributes(attributes: Any): Element
}
object Element {
  
  inline def apply(
    asBody: CallbackTo[Body],
    asDate: CallbackTo[Date],
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
    asPerson: CallbackTo[Person],
    asRichLink: CallbackTo[RichLink],
    asTable: CallbackTo[Table],
    asTableCell: CallbackTo[TableCell],
    asTableOfContents: CallbackTo[TableOfContents],
    asTableRow: CallbackTo[TableRow],
    asText: CallbackTo[Text],
    copy: CallbackTo[Element],
    getAttributes: CallbackTo[Any],
    getNextSibling: CallbackTo[Element],
    getParent: CallbackTo[ContainerElement],
    getPreviousSibling: CallbackTo[Element],
    getType: CallbackTo[ElementType],
    isAtDocumentEnd: CallbackTo[Boolean],
    merge: CallbackTo[Element],
    removeFromParent: CallbackTo[Element],
    setAttributes: Any => Element
  ): Element = {
    val __obj = js.Dynamic.literal(asBody = asBody.toJsFn, asDate = asDate.toJsFn, asEquation = asEquation.toJsFn, asEquationFunction = asEquationFunction.toJsFn, asEquationFunctionArgumentSeparator = asEquationFunctionArgumentSeparator.toJsFn, asEquationSymbol = asEquationSymbol.toJsFn, asFooterSection = asFooterSection.toJsFn, asFootnote = asFootnote.toJsFn, asFootnoteSection = asFootnoteSection.toJsFn, asHeaderSection = asHeaderSection.toJsFn, asHorizontalRule = asHorizontalRule.toJsFn, asInlineDrawing = asInlineDrawing.toJsFn, asInlineImage = asInlineImage.toJsFn, asListItem = asListItem.toJsFn, asPageBreak = asPageBreak.toJsFn, asParagraph = asParagraph.toJsFn, asPerson = asPerson.toJsFn, asRichLink = asRichLink.toJsFn, asTable = asTable.toJsFn, asTableCell = asTableCell.toJsFn, asTableOfContents = asTableOfContents.toJsFn, asTableRow = asTableRow.toJsFn, asText = asText.toJsFn, copy = copy.toJsFn, getAttributes = getAttributes.toJsFn, getNextSibling = getNextSibling.toJsFn, getParent = getParent.toJsFn, getPreviousSibling = getPreviousSibling.toJsFn, getType = getType.toJsFn, isAtDocumentEnd = isAtDocumentEnd.toJsFn, merge = merge.toJsFn, removeFromParent = removeFromParent.toJsFn, setAttributes = js.Any.fromFunction1(setAttributes))
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setAsBody(value: CallbackTo[Body]): Self = StObject.set(x, "asBody", value.toJsFn)
    
    inline def setAsDate(value: CallbackTo[Date]): Self = StObject.set(x, "asDate", value.toJsFn)
    
    inline def setAsEquation(value: CallbackTo[Equation]): Self = StObject.set(x, "asEquation", value.toJsFn)
    
    inline def setAsEquationFunction(value: CallbackTo[EquationFunction]): Self = StObject.set(x, "asEquationFunction", value.toJsFn)
    
    inline def setAsEquationFunctionArgumentSeparator(value: CallbackTo[EquationFunctionArgumentSeparator]): Self = StObject.set(x, "asEquationFunctionArgumentSeparator", value.toJsFn)
    
    inline def setAsEquationSymbol(value: CallbackTo[EquationSymbol]): Self = StObject.set(x, "asEquationSymbol", value.toJsFn)
    
    inline def setAsFooterSection(value: CallbackTo[FooterSection]): Self = StObject.set(x, "asFooterSection", value.toJsFn)
    
    inline def setAsFootnote(value: CallbackTo[Footnote]): Self = StObject.set(x, "asFootnote", value.toJsFn)
    
    inline def setAsFootnoteSection(value: CallbackTo[FootnoteSection]): Self = StObject.set(x, "asFootnoteSection", value.toJsFn)
    
    inline def setAsHeaderSection(value: CallbackTo[HeaderSection]): Self = StObject.set(x, "asHeaderSection", value.toJsFn)
    
    inline def setAsHorizontalRule(value: CallbackTo[HorizontalRule]): Self = StObject.set(x, "asHorizontalRule", value.toJsFn)
    
    inline def setAsInlineDrawing(value: CallbackTo[InlineDrawing]): Self = StObject.set(x, "asInlineDrawing", value.toJsFn)
    
    inline def setAsInlineImage(value: CallbackTo[InlineImage]): Self = StObject.set(x, "asInlineImage", value.toJsFn)
    
    inline def setAsListItem(value: CallbackTo[ListItem]): Self = StObject.set(x, "asListItem", value.toJsFn)
    
    inline def setAsPageBreak(value: CallbackTo[PageBreak]): Self = StObject.set(x, "asPageBreak", value.toJsFn)
    
    inline def setAsParagraph(value: CallbackTo[Paragraph]): Self = StObject.set(x, "asParagraph", value.toJsFn)
    
    inline def setAsPerson(value: CallbackTo[Person]): Self = StObject.set(x, "asPerson", value.toJsFn)
    
    inline def setAsRichLink(value: CallbackTo[RichLink]): Self = StObject.set(x, "asRichLink", value.toJsFn)
    
    inline def setAsTable(value: CallbackTo[Table]): Self = StObject.set(x, "asTable", value.toJsFn)
    
    inline def setAsTableCell(value: CallbackTo[TableCell]): Self = StObject.set(x, "asTableCell", value.toJsFn)
    
    inline def setAsTableOfContents(value: CallbackTo[TableOfContents]): Self = StObject.set(x, "asTableOfContents", value.toJsFn)
    
    inline def setAsTableRow(value: CallbackTo[TableRow]): Self = StObject.set(x, "asTableRow", value.toJsFn)
    
    inline def setAsText(value: CallbackTo[Text]): Self = StObject.set(x, "asText", value.toJsFn)
    
    inline def setCopy(value: CallbackTo[Element]): Self = StObject.set(x, "copy", value.toJsFn)
    
    inline def setGetAttributes(value: CallbackTo[Any]): Self = StObject.set(x, "getAttributes", value.toJsFn)
    
    inline def setGetNextSibling(value: CallbackTo[Element]): Self = StObject.set(x, "getNextSibling", value.toJsFn)
    
    inline def setGetParent(value: CallbackTo[ContainerElement]): Self = StObject.set(x, "getParent", value.toJsFn)
    
    inline def setGetPreviousSibling(value: CallbackTo[Element]): Self = StObject.set(x, "getPreviousSibling", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[ElementType]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setIsAtDocumentEnd(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAtDocumentEnd", value.toJsFn)
    
    inline def setMerge(value: CallbackTo[Element]): Self = StObject.set(x, "merge", value.toJsFn)
    
    inline def setRemoveFromParent(value: CallbackTo[Element]): Self = StObject.set(x, "removeFromParent", value.toJsFn)
    
    inline def setSetAttributes(value: Any => Element): Self = StObject.set(x, "setAttributes", js.Any.fromFunction1(value))
  }
}
