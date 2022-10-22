package typingsJapgolly.activexLibreoffice.com_.sun.star.i18n

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface provides Text Conversion service.
  *
  * It is derived from {@link com.sun.star.i18n.XTextConversion} and provides a new conversion function containing position map (offset) between original
  * and converted string.
  * @since OOo 2.0
  */
trait XExtendedTextConversion
  extends StObject
     with XTextConversion {
  
  /**
    * The functionality of this method is same as {@link com.sun.star.i18n.XTextConversion.getConversion()} , except an additional output parameter rOffset.
    * @param aText See {@link com.sun.star.i18n.XTextConversion.getConversion()}
    * @param nStartPos See {@link com.sun.star.i18n.XTextConversion.getConversion()}
    * @param nLength See {@link com.sun.star.i18n.XTextConversion.getConversion()}
    * @param aLocale See {@link com.sun.star.i18n.XTextConversion.getConversion()}
    * @param nTextConversionType See {@link com.sun.star.i18n.XTextConversion.getConversion()}
    * @param nTextConversionOptions See {@link com.sun.star.i18n.XTextConversion.getConversion()}
    * @param rOffset To find the grapheme of input string corresponding to the grapheme of output string, rOffset provides the offset array whose index is the
    */
  def getConversionWithOffset(
    aText: String,
    nStartPos: Double,
    nLength: Double,
    aLocale: Locale,
    nTextConversionType: Double,
    nTextConversionOptions: Double,
    rOffset: js.Array[SeqEquiv[Double]]
  ): String
}
object XExtendedTextConversion {
  
  inline def apply(
    acquire: Callback,
    getConversion: (String, Double, Double, Locale, Double, Double) => String,
    getConversionWithOffset: (String, Double, Double, Locale, Double, Double, js.Array[SeqEquiv[Double]]) => String,
    getConversions: (String, Double, Double, Locale, Double, Double) => TextConversionResult,
    interactiveConversion: (Locale, Double, Double) => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XExtendedTextConversion = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getConversion = js.Any.fromFunction6(getConversion), getConversionWithOffset = js.Any.fromFunction7(getConversionWithOffset), getConversions = js.Any.fromFunction6(getConversions), interactiveConversion = js.Any.fromFunction3(interactiveConversion), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XExtendedTextConversion]
  }
  
  extension [Self <: XExtendedTextConversion](x: Self) {
    
    inline def setGetConversionWithOffset(value: (String, Double, Double, Locale, Double, Double, js.Array[SeqEquiv[Double]]) => String): Self = StObject.set(x, "getConversionWithOffset", js.Any.fromFunction7(value))
  }
}
