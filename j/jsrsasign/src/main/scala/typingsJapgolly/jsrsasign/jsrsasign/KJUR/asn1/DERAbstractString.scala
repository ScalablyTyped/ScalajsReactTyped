package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * base class for ASN.1 DER string classes
  * @param params associative array of parameters (ex. {'str': 'aaa'})
  * @description
  *
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - str - specify initial ASN.1 value(V) by a string
  * - hex - specify initial ASN.1 value(V) by a hexadecimal string
  *
  * NOTE: 'params' can be omitted.
  */
trait DERAbstractString extends StObject {
  
  def getFreshValueHex(): String
  
  /**
    * get string value of this string object
    * @return string value of this string object
    */
  def getString(): String
  
  var s: String
  
  /**
    * set value by a string
    * @param newS value by a string to set
    */
  def setString(newS: String): Unit
  
  /**
    * set value by a hexadecimal string
    * @param newHexString value by a hexadecimal string to set
    */
  def setStringHex(newHexString: String): Unit
}
object DERAbstractString {
  
  inline def apply(
    getFreshValueHex: CallbackTo[String],
    getString: CallbackTo[String],
    s: String,
    setString: String => Callback,
    setStringHex: String => Callback
  ): DERAbstractString = {
    val __obj = js.Dynamic.literal(getFreshValueHex = getFreshValueHex.toJsFn, getString = getString.toJsFn, s = s.asInstanceOf[js.Any], setString = js.Any.fromFunction1((t0: String) => setString(t0).runNow()), setStringHex = js.Any.fromFunction1((t0: String) => setStringHex(t0).runNow()))
    __obj.asInstanceOf[DERAbstractString]
  }
  
  extension [Self <: DERAbstractString](x: Self) {
    
    inline def setGetFreshValueHex(value: CallbackTo[String]): Self = StObject.set(x, "getFreshValueHex", value.toJsFn)
    
    inline def setGetString(value: CallbackTo[String]): Self = StObject.set(x, "getString", value.toJsFn)
    
    inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSetString(value: String => Callback): Self = StObject.set(x, "setString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetStringHex(value: String => Callback): Self = StObject.set(x, "setStringHex", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
