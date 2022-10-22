package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to remove text contents before or after existing text contents.
  * @deprecated Deprecated
  */
trait XRelativeTextContentRemove
  extends StObject
     with XInterface {
  
  /**
    * removes the text content that follows the argument.
    *
    * This is helpful to remove empty paragraphs following text tables especially in headers, footers or text frames.
    */
  def removeTextContentAfter(xPredecessor: XTextContent): Unit
  
  /**
    * removes the text content that precedes the argument.
    *
    * This is helpful to remove empty paragraphs before text tables.
    */
  def removeTextContentBefore(xSuccessor: XTextContent): Unit
}
object XRelativeTextContentRemove {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeTextContentAfter: XTextContent => Callback,
    removeTextContentBefore: XTextContent => Callback
  ): XRelativeTextContentRemove = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeTextContentAfter = js.Any.fromFunction1((t0: XTextContent) => removeTextContentAfter(t0).runNow()), removeTextContentBefore = js.Any.fromFunction1((t0: XTextContent) => removeTextContentBefore(t0).runNow()))
    __obj.asInstanceOf[XRelativeTextContentRemove]
  }
  
  extension [Self <: XRelativeTextContentRemove](x: Self) {
    
    inline def setRemoveTextContentAfter(value: XTextContent => Callback): Self = StObject.set(x, "removeTextContentAfter", js.Any.fromFunction1((t0: XTextContent) => value(t0).runNow()))
    
    inline def setRemoveTextContentBefore(value: XTextContent => Callback): Self = StObject.set(x, "removeTextContentBefore", js.Any.fromFunction1((t0: XTextContent) => value(t0).runNow()))
  }
}
