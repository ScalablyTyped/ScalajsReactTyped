package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * interface to translate XML strings to integer tokens.
  *
  * An instance of this interface can be registered at a {@link XFastParser} . It should be able to translate all XML names (element local names,
  * attribute local names and constant attribute values) to integer tokens.
  *
  * A token value must be greater or equal to zero and less than {@link FastToken.NAMESPACE} . If a string identifier is not known to this instance,
  * {@link FastToken.DONTKNOW} is returned.
  */
trait XFastTokenHandler
  extends StObject
     with XInterface {
  
  /**
    * returns a integer token for the given string
    * @param Identifier the string given as a byte sequence encoded in UTF-8
    * @returns a unique integer token for the given String or {@link FastToken.DONTKNOW} if the identifier is not known to this instance.
    */
  def getTokenFromUTF8(Identifier: SeqEquiv[Double]): Double
  
  /** returns a identifier for the given integer token as a byte sequence encoded in UTF-8. */
  def getUTF8Identifier(Token: Double): SafeArray[Double]
}
object XFastTokenHandler {
  
  inline def apply(
    acquire: Callback,
    getTokenFromUTF8: SeqEquiv[Double] => Double,
    getUTF8Identifier: Double => SafeArray[Double],
    queryInterface: `type` => Any,
    release: Callback
  ): XFastTokenHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getTokenFromUTF8 = js.Any.fromFunction1(getTokenFromUTF8), getUTF8Identifier = js.Any.fromFunction1(getUTF8Identifier), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFastTokenHandler]
  }
  
  extension [Self <: XFastTokenHandler](x: Self) {
    
    inline def setGetTokenFromUTF8(value: SeqEquiv[Double] => Double): Self = StObject.set(x, "getTokenFromUTF8", js.Any.fromFunction1(value))
    
    inline def setGetUTF8Identifier(value: Double => SafeArray[Double]): Self = StObject.set(x, "getUTF8Identifier", js.Any.fromFunction1(value))
  }
}
