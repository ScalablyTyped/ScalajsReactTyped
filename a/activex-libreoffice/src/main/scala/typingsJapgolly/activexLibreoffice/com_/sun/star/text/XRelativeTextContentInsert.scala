package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to insert new text contents before or after existing text contents.
  * @deprecated Deprecated
  */
trait XRelativeTextContentInsert
  extends StObject
     with XInterface {
  
  /**
    * inserts text the new text content after the predecessor argument.
    *
    * This is helpful to insert paragraphs after text tables especially in headers, footers or text frames.
    */
  def insertTextContentAfter(xNewContent: XTextContent, xPredecessor: XTextContent): Unit
  
  /**
    * inserts text the new text content before of the successor argument.
    *
    * This is helpful to insert paragraphs before of text tables.
    */
  def insertTextContentBefore(xNewContent: XTextContent, xSuccessor: XTextContent): Unit
}
object XRelativeTextContentInsert {
  
  inline def apply(
    acquire: Callback,
    insertTextContentAfter: (XTextContent, XTextContent) => Callback,
    insertTextContentBefore: (XTextContent, XTextContent) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XRelativeTextContentInsert = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, insertTextContentAfter = js.Any.fromFunction2((t0: XTextContent, t1: XTextContent) => (insertTextContentAfter(t0, t1)).runNow()), insertTextContentBefore = js.Any.fromFunction2((t0: XTextContent, t1: XTextContent) => (insertTextContentBefore(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XRelativeTextContentInsert]
  }
  
  extension [Self <: XRelativeTextContentInsert](x: Self) {
    
    inline def setInsertTextContentAfter(value: (XTextContent, XTextContent) => Callback): Self = StObject.set(x, "insertTextContentAfter", js.Any.fromFunction2((t0: XTextContent, t1: XTextContent) => (value(t0, t1)).runNow()))
    
    inline def setInsertTextContentBefore(value: (XTextContent, XTextContent) => Callback): Self = StObject.set(x, "insertTextContentBefore", js.Any.fromFunction2((t0: XTextContent, t1: XTextContent) => (value(t0, t1)).runNow()))
  }
}
