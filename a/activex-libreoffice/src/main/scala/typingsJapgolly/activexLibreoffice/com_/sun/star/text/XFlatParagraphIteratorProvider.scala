package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functionality to ...
  * @since OOo 3.0
  */
trait XFlatParagraphIteratorProvider
  extends StObject
     with XInterface {
  
  /**
    * get {@link XFlatParagraphIterator}
    * @param nType Type of text markup see {@link TextMarkupType} .
    * @param bAutomatic Automatic or interactive checking.
    * @returns the iterator.
    * @throws IllegalArgumentException if any argument is wrong.
    */
  def getFlatParagraphIterator(nType: Double, bAutomatic: Boolean): XFlatParagraphIterator
}
object XFlatParagraphIteratorProvider {
  
  inline def apply(
    acquire: Callback,
    getFlatParagraphIterator: (Double, Boolean) => XFlatParagraphIterator,
    queryInterface: `type` => Any,
    release: Callback
  ): XFlatParagraphIteratorProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getFlatParagraphIterator = js.Any.fromFunction2(getFlatParagraphIterator), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFlatParagraphIteratorProvider]
  }
  
  extension [Self <: XFlatParagraphIteratorProvider](x: Self) {
    
    inline def setGetFlatParagraphIterator(value: (Double, Boolean) => XFlatParagraphIterator): Self = StObject.set(x, "getFlatParagraphIterator", js.Any.fromFunction2(value))
  }
}
