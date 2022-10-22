package typingsJapgolly.googleAppsScript.GoogleAppsScript.Document

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Blob
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An element representing an embedded image. An InlineImage can be contained within a
  * ListItem or Paragraph, unless the ListItem or Paragraph is within
  * a FootnoteSection. An InlineImage cannot itself contain any other element. For
  * more information on document structure, see the guide to extending Google Docs.
  */
trait InlineImage
  extends StObject
     with Element {
  
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
    getAs: String => Blob,
    getAttributes: CallbackTo[Any],
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
    setAltDescription: String => InlineImage,
    setAltTitle: String => InlineImage,
    setAttributes: Any => Element,
    setHeight: Integer => InlineImage,
    setLinkUrl: String => InlineImage,
    setWidth: Integer => InlineImage
  ): InlineImage = {
    val __obj = js.Dynamic.literal(asBody = asBody.toJsFn, asDate = asDate.toJsFn, asEquation = asEquation.toJsFn, asEquationFunction = asEquationFunction.toJsFn, asEquationFunctionArgumentSeparator = asEquationFunctionArgumentSeparator.toJsFn, asEquationSymbol = asEquationSymbol.toJsFn, asFooterSection = asFooterSection.toJsFn, asFootnote = asFootnote.toJsFn, asFootnoteSection = asFootnoteSection.toJsFn, asHeaderSection = asHeaderSection.toJsFn, asHorizontalRule = asHorizontalRule.toJsFn, asInlineDrawing = asInlineDrawing.toJsFn, asInlineImage = asInlineImage.toJsFn, asListItem = asListItem.toJsFn, asPageBreak = asPageBreak.toJsFn, asParagraph = asParagraph.toJsFn, asPerson = asPerson.toJsFn, asRichLink = asRichLink.toJsFn, asTable = asTable.toJsFn, asTableCell = asTableCell.toJsFn, asTableOfContents = asTableOfContents.toJsFn, asTableRow = asTableRow.toJsFn, asText = asText.toJsFn, copy = copy.toJsFn, getAltDescription = getAltDescription.toJsFn, getAltTitle = getAltTitle.toJsFn, getAs = js.Any.fromFunction1(getAs), getAttributes = getAttributes.toJsFn, getBlob = getBlob.toJsFn, getHeight = getHeight.toJsFn, getLinkUrl = getLinkUrl.toJsFn, getNextSibling = getNextSibling.toJsFn, getParent = getParent.toJsFn, getPreviousSibling = getPreviousSibling.toJsFn, getType = getType.toJsFn, getWidth = getWidth.toJsFn, isAtDocumentEnd = isAtDocumentEnd.toJsFn, merge = merge.toJsFn, removeFromParent = removeFromParent.toJsFn, setAltDescription = js.Any.fromFunction1(setAltDescription), setAltTitle = js.Any.fromFunction1(setAltTitle), setAttributes = js.Any.fromFunction1(setAttributes), setHeight = js.Any.fromFunction1(setHeight), setLinkUrl = js.Any.fromFunction1(setLinkUrl), setWidth = js.Any.fromFunction1(setWidth))
    __obj.asInstanceOf[InlineImage]
  }
  
  extension [Self <: InlineImage](x: Self) {
    
    inline def setGetAltDescription(value: CallbackTo[String]): Self = StObject.set(x, "getAltDescription", value.toJsFn)
    
    inline def setGetAltTitle(value: CallbackTo[String]): Self = StObject.set(x, "getAltTitle", value.toJsFn)
    
    inline def setGetAs(value: String => Blob): Self = StObject.set(x, "getAs", js.Any.fromFunction1(value))
    
    inline def setGetBlob(value: CallbackTo[Blob]): Self = StObject.set(x, "getBlob", value.toJsFn)
    
    inline def setGetHeight(value: CallbackTo[Integer]): Self = StObject.set(x, "getHeight", value.toJsFn)
    
    inline def setGetLinkUrl(value: CallbackTo[String]): Self = StObject.set(x, "getLinkUrl", value.toJsFn)
    
    inline def setGetWidth(value: CallbackTo[Integer]): Self = StObject.set(x, "getWidth", value.toJsFn)
    
    inline def setSetAltDescription(value: String => InlineImage): Self = StObject.set(x, "setAltDescription", js.Any.fromFunction1(value))
    
    inline def setSetAltTitle(value: String => InlineImage): Self = StObject.set(x, "setAltTitle", js.Any.fromFunction1(value))
    
    inline def setSetHeight(value: Integer => InlineImage): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
    
    inline def setSetLinkUrl(value: String => InlineImage): Self = StObject.set(x, "setLinkUrl", js.Any.fromFunction1(value))
    
    inline def setSetWidth(value: Integer => InlineImage): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
  }
}
