package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface that encapsulates the abstract notion of string width.
  * @see XStringAbbreviation
  */
trait XStringWidth
  extends StObject
     with XInterface {
  
  /**
    * compute the width of a given string.
    *
    * Depending on the implementation of this interface, the width of a string can be rather different things, like the number of characters in the string,
    * or the width in pixel when displayed with a specific font.
    * @param aString The string that is to be measured.
    * @returns the string's width.
    */
  def queryStringWidth(aString: String): Double
}
object XStringWidth {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    queryStringWidth: String => Double,
    release: Callback
  ): XStringWidth = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), queryStringWidth = js.Any.fromFunction1(queryStringWidth), release = release.toJsFn)
    __obj.asInstanceOf[XStringWidth]
  }
  
  extension [Self <: XStringWidth](x: Self) {
    
    inline def setQueryStringWidth(value: String => Double): Self = StObject.set(x, "queryStringWidth", js.Any.fromFunction1(value))
  }
}
