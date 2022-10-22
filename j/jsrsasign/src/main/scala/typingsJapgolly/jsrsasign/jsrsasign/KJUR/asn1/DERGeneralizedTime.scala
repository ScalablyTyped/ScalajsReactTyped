package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsrsasign.jsrsasignStrings.gen
import typingsJapgolly.jsrsasign.jsrsasignStrings.utc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * class for ASN.1 DER GeneralizedTime
  * @param params associative array of parameters (ex. {'str': '20130430235959Z'})
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - str - specify initial ASN.1 value(V) by a string (ex.'20130430235959Z')
  * - hex - specify initial ASN.1 value(V) by a hexadecimal string
  * - date - specify Date object.
  * - millis - specify flag to show milliseconds (from 1.0.6)
  *
  * NOTE1: 'params' can be omitted.
  * NOTE2: 'withMillis' property is supported from asn1 1.0.6.
  */
trait DERGeneralizedTime
  extends StObject
     with DERAbstractTime {
  
  /**
    * set value by a Date object
    * @param dateObject Date object to set ASN.1 value(V)
    * @example
    * When you specify UTC time, use 'Date.UTC' method like this:
    * o1 = new DERUTCTime();
    * o1.setByDate(date);
    *
    * date = new Date(Date.UTC(2015, 0, 31, 23, 59, 59, 0)); #2015JAN31 23:59:59
    */
  def setByDate(dateObject: js.Date): Unit
  
  var withMillis: Boolean
}
object DERGeneralizedTime {
  
  inline def apply(
    formatDate: (js.Date, utc | gen, Boolean) => String,
    getEncodedHex: CallbackTo[String],
    getFreshValueHex: CallbackTo[String],
    getLengthHexFromValue: CallbackTo[String],
    getString: CallbackTo[String],
    getValueHex: CallbackTo[String],
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    setByDate: js.Date => Callback,
    setByDateValue: (Double, Double, Double, Double, Double, Double) => Callback,
    setString: String => Callback,
    withMillis: Boolean,
    zeroPadding: (String, Double) => String
  ): DERGeneralizedTime = {
    val __obj = js.Dynamic.literal(formatDate = js.Any.fromFunction3(formatDate), getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getString = getString.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByDate = js.Any.fromFunction1((t0: js.Date) => setByDate(t0).runNow()), setByDateValue = js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (setByDateValue(t0, t1, t2, t3, t4, t5)).runNow()), setString = js.Any.fromFunction1((t0: String) => setString(t0).runNow()), withMillis = withMillis.asInstanceOf[js.Any], zeroPadding = js.Any.fromFunction2(zeroPadding), params = null)
    __obj.asInstanceOf[DERGeneralizedTime]
  }
  
  extension [Self <: DERGeneralizedTime](x: Self) {
    
    inline def setSetByDate(value: js.Date => Callback): Self = StObject.set(x, "setByDate", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setWithMillis(value: Boolean): Self = StObject.set(x, "withMillis", value.asInstanceOf[js.Any])
  }
}
