package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a number formatter. */
trait XNumberFormatter
  extends StObject
     with XInterface {
  
  /** @returns the attached {@link XNumberFormatsSupplier} . */
  val NumberFormatsSupplier: XNumberFormatsSupplier
  
  /**
    * attaches an {@link XNumberFormatsSupplier} to this {@link NumberFormatter} .
    *
    * This {@link NumberFormatter} will only use the {@link NumberFormats} specified in the attached {@link XNumberFormatsSupplier} . Without an attached
    * {@link XNumberFormatsSupplier} , no formatting is possible.
    */
  def attachNumberFormatsSupplier(xSupplier: XNumberFormatsSupplier): Unit
  
  /** converts a number into a string. */
  def convertNumberToString(nKey: Double, fValue: Double): String
  
  /**
    * converts a string which contains a formatted number into a number.
    *
    * If this is a text format, the string will not be converted.
    */
  def convertStringToNumber(nKey: Double, aString: String): Double
  
  /** detects the number format in a string which contains a formatted number. */
  def detectNumberFormat(nKey: Double, aString: String): Double
  
  /** converts a string into another string. */
  def formatString(nKey: Double, aString: String): String
  
  /**
    * converts a number into a string with the specified format.
    *
    * This string can always be converted back to a number using the same format.
    */
  def getInputString(nKey: Double, fValue: Double): String
  
  /** @returns the attached {@link XNumberFormatsSupplier} . */
  def getNumberFormatsSupplier(): XNumberFormatsSupplier
  
  /** @returns the color which is specified for the given value in the number format, which is otherwise the value of **aDefaultColor** . */
  def queryColorForNumber(nKey: Double, fValue: Double, aDefaultColor: Color): Color
  
  /** @returns the color which is specified for the given string in the number format, which is otherwise the value of **aDefaultColor** . */
  def queryColorForString(nKey: Double, aString: String, aDefaultColor: Color): Color
}
object XNumberFormatter {
  
  inline def apply(
    NumberFormatsSupplier: XNumberFormatsSupplier,
    acquire: Callback,
    attachNumberFormatsSupplier: XNumberFormatsSupplier => Callback,
    convertNumberToString: (Double, Double) => String,
    convertStringToNumber: (Double, String) => Double,
    detectNumberFormat: (Double, String) => Double,
    formatString: (Double, String) => String,
    getInputString: (Double, Double) => String,
    getNumberFormatsSupplier: CallbackTo[XNumberFormatsSupplier],
    queryColorForNumber: (Double, Double, Color) => Color,
    queryColorForString: (Double, String, Color) => Color,
    queryInterface: `type` => Any,
    release: Callback
  ): XNumberFormatter = {
    val __obj = js.Dynamic.literal(NumberFormatsSupplier = NumberFormatsSupplier.asInstanceOf[js.Any], acquire = acquire.toJsFn, attachNumberFormatsSupplier = js.Any.fromFunction1((t0: XNumberFormatsSupplier) => attachNumberFormatsSupplier(t0).runNow()), convertNumberToString = js.Any.fromFunction2(convertNumberToString), convertStringToNumber = js.Any.fromFunction2(convertStringToNumber), detectNumberFormat = js.Any.fromFunction2(detectNumberFormat), formatString = js.Any.fromFunction2(formatString), getInputString = js.Any.fromFunction2(getInputString), getNumberFormatsSupplier = getNumberFormatsSupplier.toJsFn, queryColorForNumber = js.Any.fromFunction3(queryColorForNumber), queryColorForString = js.Any.fromFunction3(queryColorForString), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XNumberFormatter]
  }
  
  extension [Self <: XNumberFormatter](x: Self) {
    
    inline def setAttachNumberFormatsSupplier(value: XNumberFormatsSupplier => Callback): Self = StObject.set(x, "attachNumberFormatsSupplier", js.Any.fromFunction1((t0: XNumberFormatsSupplier) => value(t0).runNow()))
    
    inline def setConvertNumberToString(value: (Double, Double) => String): Self = StObject.set(x, "convertNumberToString", js.Any.fromFunction2(value))
    
    inline def setConvertStringToNumber(value: (Double, String) => Double): Self = StObject.set(x, "convertStringToNumber", js.Any.fromFunction2(value))
    
    inline def setDetectNumberFormat(value: (Double, String) => Double): Self = StObject.set(x, "detectNumberFormat", js.Any.fromFunction2(value))
    
    inline def setFormatString(value: (Double, String) => String): Self = StObject.set(x, "formatString", js.Any.fromFunction2(value))
    
    inline def setGetInputString(value: (Double, Double) => String): Self = StObject.set(x, "getInputString", js.Any.fromFunction2(value))
    
    inline def setGetNumberFormatsSupplier(value: CallbackTo[XNumberFormatsSupplier]): Self = StObject.set(x, "getNumberFormatsSupplier", value.toJsFn)
    
    inline def setNumberFormatsSupplier(value: XNumberFormatsSupplier): Self = StObject.set(x, "NumberFormatsSupplier", value.asInstanceOf[js.Any])
    
    inline def setQueryColorForNumber(value: (Double, Double, Color) => Color): Self = StObject.set(x, "queryColorForNumber", js.Any.fromFunction3(value))
    
    inline def setQueryColorForString(value: (Double, String, Color) => Color): Self = StObject.set(x, "queryColorForString", js.Any.fromFunction3(value))
  }
}
