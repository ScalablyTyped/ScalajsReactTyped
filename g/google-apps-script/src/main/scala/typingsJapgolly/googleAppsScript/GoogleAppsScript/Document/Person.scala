package typingsJapgolly.googleAppsScript.GoogleAppsScript.Document

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An element representing a link to a person. A person link refers to an email address and might
  * optionally have a name associated with the address. If the name is set, the name is what is
  * displayed in the document body.
  */
trait Person
  extends StObject
     with Element {
  
  def getEmail(): String
  
  def getName(): String
}
object Person {
  
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
    getEmail: CallbackTo[String],
    getName: CallbackTo[String],
    getNextSibling: CallbackTo[Element],
    getParent: CallbackTo[ContainerElement],
    getPreviousSibling: CallbackTo[Element],
    getType: CallbackTo[ElementType],
    isAtDocumentEnd: CallbackTo[Boolean],
    merge: CallbackTo[Element],
    removeFromParent: CallbackTo[Element],
    setAttributes: Any => Element
  ): Person = {
    val __obj = js.Dynamic.literal(asBody = asBody.toJsFn, asDate = asDate.toJsFn, asEquation = asEquation.toJsFn, asEquationFunction = asEquationFunction.toJsFn, asEquationFunctionArgumentSeparator = asEquationFunctionArgumentSeparator.toJsFn, asEquationSymbol = asEquationSymbol.toJsFn, asFooterSection = asFooterSection.toJsFn, asFootnote = asFootnote.toJsFn, asFootnoteSection = asFootnoteSection.toJsFn, asHeaderSection = asHeaderSection.toJsFn, asHorizontalRule = asHorizontalRule.toJsFn, asInlineDrawing = asInlineDrawing.toJsFn, asInlineImage = asInlineImage.toJsFn, asListItem = asListItem.toJsFn, asPageBreak = asPageBreak.toJsFn, asParagraph = asParagraph.toJsFn, asPerson = asPerson.toJsFn, asRichLink = asRichLink.toJsFn, asTable = asTable.toJsFn, asTableCell = asTableCell.toJsFn, asTableOfContents = asTableOfContents.toJsFn, asTableRow = asTableRow.toJsFn, asText = asText.toJsFn, copy = copy.toJsFn, getAttributes = getAttributes.toJsFn, getEmail = getEmail.toJsFn, getName = getName.toJsFn, getNextSibling = getNextSibling.toJsFn, getParent = getParent.toJsFn, getPreviousSibling = getPreviousSibling.toJsFn, getType = getType.toJsFn, isAtDocumentEnd = isAtDocumentEnd.toJsFn, merge = merge.toJsFn, removeFromParent = removeFromParent.toJsFn, setAttributes = js.Any.fromFunction1(setAttributes))
    __obj.asInstanceOf[Person]
  }
  
  extension [Self <: Person](x: Self) {
    
    inline def setGetEmail(value: CallbackTo[String]): Self = StObject.set(x, "getEmail", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
  }
}
