package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GeneralNames ASN.1 structure class
  * @example
  * gns = new KJUR.asn1.x509.GeneralNames([{'uri': 'http://aaa.com/'}, {'uri': 'http://bbb.com/'}]);
  *
  * GeneralNames ::= SEQUENCE SIZE (1..MAX) OF GeneralName
  */
trait GeneralNames extends StObject {
  
  def getEncodedHex(): String
  
  /**
    * set a array of `KJUR.asn1.x509.GeneralName` parameters
    * @param paramsArray Array of `KJUR.asn1.x509.GeneralNames`
    * @example
    * gns = new KJUR.asn1.x509.GeneralNames();
    * gns.setByParamArray([{uri: 'http://aaa.com/'}, {uri: 'http://bbb.com/'}]);
    */
  def setByParamArray(paramsArray: js.Array[GeneralNameParam]): Unit
}
object GeneralNames {
  
  inline def apply(getEncodedHex: CallbackTo[String], setByParamArray: js.Array[GeneralNameParam] => Callback): GeneralNames = {
    val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, setByParamArray = js.Any.fromFunction1((t0: js.Array[GeneralNameParam]) => setByParamArray(t0).runNow()))
    __obj.asInstanceOf[GeneralNames]
  }
  
  extension [Self <: GeneralNames](x: Self) {
    
    inline def setGetEncodedHex(value: CallbackTo[String]): Self = StObject.set(x, "getEncodedHex", value.toJsFn)
    
    inline def setSetByParamArray(value: js.Array[GeneralNameParam] => Callback): Self = StObject.set(x, "setByParamArray", js.Any.fromFunction1((t0: js.Array[GeneralNameParam]) => value(t0).runNow()))
  }
}
