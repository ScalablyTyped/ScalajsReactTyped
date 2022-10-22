package typingsJapgolly.googleAppsScript.GoogleAppsScript.Document

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An element representing an embedded drawing. An InlineDrawing can be contained within a
  * ListItem or Paragraph, unless the ListItem or Paragraph is within
  * a FootnoteSection. An InlineDrawing cannot itself contain any other element. For
  * more information on document structure, see the guide to extending Google Docs.
  */
trait InlineDrawing
  extends StObject
     with Element {
  
  def getAltDescription(): String
  
  def getAltTitle(): String
  
  def setAltDescription(description: String): InlineDrawing
  
  def setAltTitle(title: String): InlineDrawing
}
object InlineDrawing {
  
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
    getAltDescription: CallbackTo[String],
    getAltTitle: CallbackTo[String],
    getAttributes: CallbackTo[Any],
    getNextSibling: CallbackTo[Element],
    getParent: CallbackTo[ContainerElement],
    getPreviousSibling: CallbackTo[Element],
    getType: CallbackTo[ElementType],
    isAtDocumentEnd: CallbackTo[Boolean],
    merge: CallbackTo[Element],
    removeFromParent: CallbackTo[Element],
    setAltDescription: String => InlineDrawing,
    setAltTitle: String => InlineDrawing,
    setAttributes: Any => Element
  ): InlineDrawing = {
    val __obj = js.Dynamic.literal(asBody = asBody.toJsFn, asDate = asDate.toJsFn, asEquation = asEquation.toJsFn, asEquationFunction = asEquationFunction.toJsFn, asEquationFunctionArgumentSeparator = asEquationFunctionArgumentSeparator.toJsFn, asEquationSymbol = asEquationSymbol.toJsFn, asFooterSection = asFooterSection.toJsFn, asFootnote = asFootnote.toJsFn, asFootnoteSection = asFootnoteSection.toJsFn, asHeaderSection = asHeaderSection.toJsFn, asHorizontalRule = asHorizontalRule.toJsFn, asInlineDrawing = asInlineDrawing.toJsFn, asInlineImage = asInlineImage.toJsFn, asListItem = asListItem.toJsFn, asPageBreak = asPageBreak.toJsFn, asParagraph = asParagraph.toJsFn, asPerson = asPerson.toJsFn, asRichLink = asRichLink.toJsFn, asTable = asTable.toJsFn, asTableCell = asTableCell.toJsFn, asTableOfContents = asTableOfContents.toJsFn, asTableRow = asTableRow.toJsFn, asText = asText.toJsFn, copy = copy.toJsFn, getAltDescription = getAltDescription.toJsFn, getAltTitle = getAltTitle.toJsFn, getAttributes = getAttributes.toJsFn, getNextSibling = getNextSibling.toJsFn, getParent = getParent.toJsFn, getPreviousSibling = getPreviousSibling.toJsFn, getType = getType.toJsFn, isAtDocumentEnd = isAtDocumentEnd.toJsFn, merge = merge.toJsFn, removeFromParent = removeFromParent.toJsFn, setAltDescription = js.Any.fromFunction1(setAltDescription), setAltTitle = js.Any.fromFunction1(setAltTitle), setAttributes = js.Any.fromFunction1(setAttributes))
    __obj.asInstanceOf[InlineDrawing]
  }
  
  extension [Self <: InlineDrawing](x: Self) {
    
    inline def setGetAltDescription(value: CallbackTo[String]): Self = StObject.set(x, "getAltDescription", value.toJsFn)
    
    inline def setGetAltTitle(value: CallbackTo[String]): Self = StObject.set(x, "getAltTitle", value.toJsFn)
    
    inline def setSetAltDescription(value: String => InlineDrawing): Self = StObject.set(x, "setAltDescription", js.Any.fromFunction1(value))
    
    inline def setSetAltTitle(value: String => InlineDrawing): Self = StObject.set(x, "setAltTitle", js.Any.fromFunction1(value))
  }
}
