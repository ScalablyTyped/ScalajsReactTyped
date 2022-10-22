package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * supports the formatting of numberings in various language environments.
  * @author Oliver Specht
  * @see com.sun.star.text.NumberingRules
  * @see com.sun.star.text.NumberingLevel
  * @version 1.0
  */
trait XNumberingFormatter
  extends StObject
     with XInterface {
  
  /** @returns the formatted numbering string according to the given {@link com.sun.star.text.NumberingLevel} and the given {@link com.sun.star.lang.Locale} . */
  def makeNumberingString(aProperties: SeqEquiv[PropertyValue], aLocale: Locale): String
}
object XNumberingFormatter {
  
  inline def apply(
    acquire: Callback,
    makeNumberingString: (SeqEquiv[PropertyValue], Locale) => String,
    queryInterface: `type` => Any,
    release: Callback
  ): XNumberingFormatter = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, makeNumberingString = js.Any.fromFunction2(makeNumberingString), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XNumberingFormatter]
  }
  
  extension [Self <: XNumberingFormatter](x: Self) {
    
    inline def setMakeNumberingString(value: (SeqEquiv[PropertyValue], Locale) => String): Self = StObject.set(x, "makeNumberingString", js.Any.fromFunction2(value))
  }
}
