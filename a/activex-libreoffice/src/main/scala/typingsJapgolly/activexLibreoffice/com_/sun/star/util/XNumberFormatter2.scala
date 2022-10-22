package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a unified interface for the {@link NumberFormatter} service to implement.
  * @since LibreOffice 4.0
  */
trait XNumberFormatter2
  extends StObject
     with XNumberFormatter
     with XNumberFormatPreviewer
object XNumberFormatter2 {
  
  inline def apply(
    NumberFormatsSupplier: XNumberFormatsSupplier,
    acquire: Callback,
    attachNumberFormatsSupplier: XNumberFormatsSupplier => Callback,
    convertNumberToPreviewString: (String, Double, Locale, Boolean) => String,
    convertNumberToString: (Double, Double) => String,
    convertStringToNumber: (Double, String) => Double,
    detectNumberFormat: (Double, String) => Double,
    formatString: (Double, String) => String,
    getInputString: (Double, Double) => String,
    getNumberFormatsSupplier: CallbackTo[XNumberFormatsSupplier],
    queryColorForNumber: (Double, Double, Color) => Color,
    queryColorForString: (Double, String, Color) => Color,
    queryInterface: `type` => Any,
    queryPreviewColorForNumber: (String, Double, Locale, Boolean, Color) => Color,
    release: Callback
  ): XNumberFormatter2 = {
    val __obj = js.Dynamic.literal(NumberFormatsSupplier = NumberFormatsSupplier.asInstanceOf[js.Any], acquire = acquire.toJsFn, attachNumberFormatsSupplier = js.Any.fromFunction1((t0: XNumberFormatsSupplier) => attachNumberFormatsSupplier(t0).runNow()), convertNumberToPreviewString = js.Any.fromFunction4(convertNumberToPreviewString), convertNumberToString = js.Any.fromFunction2(convertNumberToString), convertStringToNumber = js.Any.fromFunction2(convertStringToNumber), detectNumberFormat = js.Any.fromFunction2(detectNumberFormat), formatString = js.Any.fromFunction2(formatString), getInputString = js.Any.fromFunction2(getInputString), getNumberFormatsSupplier = getNumberFormatsSupplier.toJsFn, queryColorForNumber = js.Any.fromFunction3(queryColorForNumber), queryColorForString = js.Any.fromFunction3(queryColorForString), queryInterface = js.Any.fromFunction1(queryInterface), queryPreviewColorForNumber = js.Any.fromFunction5(queryPreviewColorForNumber), release = release.toJsFn)
    __obj.asInstanceOf[XNumberFormatter2]
  }
}
