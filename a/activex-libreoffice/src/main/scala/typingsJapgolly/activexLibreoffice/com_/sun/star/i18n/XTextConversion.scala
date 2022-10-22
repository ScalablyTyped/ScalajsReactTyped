package typingsJapgolly.activexLibreoffice.com_.sun.star.i18n

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Method to convert text from one type to another
  * @since OOo 1.1.2
  */
trait XTextConversion
  extends StObject
     with XInterface {
  
  /**
    * Method to search dictionaries for the conversion candidate, if there are multiple candidates, it will return first one. This is for the conversion in
    * non-interactive mode.
    * @param aText Text string to be converted.
    * @param nStartPos The start position in aText for the conversion
    * @param nLength The length of the portion in aText for the conversion
    * @param Locale Locale the conversion is referring to.
    * @param nTextConversionType One of {@link TextConversionType} values.
    * @param nTextConversionOptions Combination of {@link TextConversionOption} values.
    * @returns Converted text
    * @throws NoSupportException when **nConversionDictionaryType** is not known by the implementation, or when the locale is not supported.
    */
  def getConversion(
    aText: String,
    nStartPos: Double,
    nLength: Double,
    Locale: Locale,
    nTextConversionType: Double,
    nTextConversionOptions: Double
  ): String
  
  /**
    * Method to search dictionaries for the conversion candidates.
    * @param aText Text string to be converted.
    * @param nStartPos The start position in aText for the conversion
    * @param nLength The length of the portion in aText for the conversion
    * @param Locale Locale the conversion is referring to.
    * @param nTextConversionType One of {@link TextConversionType} values.
    * @param nTextConversionOptions Combination of {@link TextConversionOption} values.
    * @returns
    * @throws NoSupportException when **nConversionDictionaryType** is not known by the implementation, or when the locale is not supported.
    */
  def getConversions(
    aText: String,
    nStartPos: Double,
    nLength: Double,
    Locale: Locale,
    nTextConversionType: Double,
    nTextConversionOptions: Double
  ): TextConversionResult
  
  /**
    * Method to query if the conversion type should be interactive or non-interactive mode.
    * @param Locale Locale the conversion is referring to.
    * @param nTextConversionType One of {@link TextConversionType} values.
    * @param nTextConversionOptions Combination of {@link TextConversionOption} values.
    * @returns `TRUE` if the entry is a valid entry for the dictionary `FALSE` otherwise.
    * @throws NoSupportException when **nConversionDictionaryType** is not known by the implementation, or when the locale is not supported.
    */
  def interactiveConversion(Locale: Locale, nTextConversionType: Double, nTextConversionOptions: Double): Boolean
}
object XTextConversion {
  
  inline def apply(
    acquire: Callback,
    getConversion: (String, Double, Double, Locale, Double, Double) => String,
    getConversions: (String, Double, Double, Locale, Double, Double) => TextConversionResult,
    interactiveConversion: (Locale, Double, Double) => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XTextConversion = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getConversion = js.Any.fromFunction6(getConversion), getConversions = js.Any.fromFunction6(getConversions), interactiveConversion = js.Any.fromFunction3(interactiveConversion), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTextConversion]
  }
  
  extension [Self <: XTextConversion](x: Self) {
    
    inline def setGetConversion(value: (String, Double, Double, Locale, Double, Double) => String): Self = StObject.set(x, "getConversion", js.Any.fromFunction6(value))
    
    inline def setGetConversions(value: (String, Double, Double, Locale, Double, Double) => TextConversionResult): Self = StObject.set(x, "getConversions", js.Any.fromFunction6(value))
    
    inline def setInteractiveConversion(value: (Locale, Double, Double) => Boolean): Self = StObject.set(x, "interactiveConversion", js.Any.fromFunction3(value))
  }
}
