package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsrsasign.jsrsasignStrings.gen
import typingsJapgolly.jsrsasign.jsrsasignStrings.utc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * base class for ASN.1 DER Generalized/UTCTime class
  * @param params associative array of parameters (ex. {'str': '130430235959Z'})
  */
trait DERAbstractTime
  extends StObject
     with ASN1Object {
  
  /**
    * format date string by Data object
    * @param type 'utc' or 'gen'
    * @param withMillis flag for with millisections or not
    * @description
    * 'withMillis' flag is supported from asn1 1.0.6.
    */
  /* private */ def formatDate(dateObject: js.Date, `type`: utc | gen, withMillis: Boolean): String
  
  /**
    * get string value of this string object
    * @return string value of this time object
    */
  def getString(): String
  
  /**
    * set value by a Date object
    * @param year year of date (ex. 2013)
    * @param month month of date between 1 and 12 (ex. 12)
    * @param day day of month
    * @param hour hours of date
    * @param min minutes of date
    * @param sec seconds of date
    */
  def setByDateValue(year: Double, month: Double, day: Double, hour: Double, min: Double, sec: Double): Unit
  
  /**
    * set value by a string
    * @param newS value by a string to set such like "130430235959Z"
    */
  def setString(newS: String): Unit
  
  /* private */ def zeroPadding(s: String, len: Double): String
}
object DERAbstractTime {
  
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
    setByDateValue: (Double, Double, Double, Double, Double, Double) => Callback,
    setString: String => Callback,
    zeroPadding: (String, Double) => String
  ): DERAbstractTime = {
    val __obj = js.Dynamic.literal(formatDate = js.Any.fromFunction3(formatDate), getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getString = getString.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByDateValue = js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (setByDateValue(t0, t1, t2, t3, t4, t5)).runNow()), setString = js.Any.fromFunction1((t0: String) => setString(t0).runNow()), zeroPadding = js.Any.fromFunction2(zeroPadding), params = null)
    __obj.asInstanceOf[DERAbstractTime]
  }
  
  extension [Self <: DERAbstractTime](x: Self) {
    
    inline def setFormatDate(value: (js.Date, utc | gen, Boolean) => String): Self = StObject.set(x, "formatDate", js.Any.fromFunction3(value))
    
    inline def setGetString(value: CallbackTo[String]): Self = StObject.set(x, "getString", value.toJsFn)
    
    inline def setSetByDateValue(value: (Double, Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "setByDateValue", js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setSetString(value: String => Callback): Self = StObject.set(x, "setString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setZeroPadding(value: (String, Double) => String): Self = StObject.set(x, "zeroPadding", js.Any.fromFunction2(value))
  }
}
