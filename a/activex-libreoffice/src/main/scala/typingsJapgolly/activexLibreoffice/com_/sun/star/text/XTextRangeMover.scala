package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to move a text range (e.g. a paragraph by itself) within this text.
  *
  * The movement is specified by the number of paragraphs within the order of paragraphs.
  * @see Text
  */
trait XTextRangeMover
  extends StObject
     with XInterface {
  
  /** moves the contents to which **xRange** refers forward or backward. */
  def moveTextRange(xRange: XTextRange, nParagraphs: Double): Unit
}
object XTextRangeMover {
  
  inline def apply(
    acquire: Callback,
    moveTextRange: (XTextRange, Double) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XTextRangeMover = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, moveTextRange = js.Any.fromFunction2((t0: XTextRange, t1: Double) => (moveTextRange(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTextRangeMover]
  }
  
  extension [Self <: XTextRangeMover](x: Self) {
    
    inline def setMoveTextRange(value: (XTextRange, Double) => Callback): Self = StObject.set(x, "moveTextRange", js.Any.fromFunction2((t0: XTextRange, t1: Double) => (value(t0, t1)).runNow()))
  }
}
