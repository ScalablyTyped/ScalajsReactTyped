package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * class for ASN.1 DER ObjectIdentifier
  * @param params associative array of parameters (ex. {'oid': '2.5.4.5'})
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - oid - specify initial ASN.1 value(V) by a oid string (ex. 2.5.4.13)
  * - hex - specify initial ASN.1 value(V) by a hexadecimal string
  *
  * NOTE: 'params' can be omitted.
  */
trait DERObjectIdentifier
  extends StObject
     with ASN1Object {
  
  /**
    * set value by a hexadecimal string
    * @param newHexString hexadecimal value of OID bytes
    */
  def setValueHex(newHexString: String): Unit
  
  /**
    * set value by a OID name
    * @param oidName OID name (ex. 'serverAuth')
    * @description
    * OID name shall be defined in 'KJUR.asn1.x509.OID.name2oidList'.
    * Otherwise raise error.
    * @example
    * o = new KJUR.asn1.DERObjectIdentifier();
    * o.setValueName("serverAuth");
    */
  def setValueName(oidName: String): Unit
  
  /**
    * set value by a OID string
    * @param oidString OID string (ex. 2.5.4.13)
    * @example
    * o = new KJUR.asn1.DERObjectIdentifier();
    * o.setValueOidString("2.5.4.13");
    */
  def setValueOidString(oidString: String): Unit
}
object DERObjectIdentifier {
  
  inline def apply(
    getEncodedHex: CallbackTo[String],
    getFreshValueHex: CallbackTo[String],
    getLengthHexFromValue: CallbackTo[String],
    getValueHex: CallbackTo[String],
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    setValueHex: String => Callback,
    setValueName: String => Callback,
    setValueOidString: String => Callback
  ): DERObjectIdentifier = {
    val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setValueHex = js.Any.fromFunction1((t0: String) => setValueHex(t0).runNow()), setValueName = js.Any.fromFunction1((t0: String) => setValueName(t0).runNow()), setValueOidString = js.Any.fromFunction1((t0: String) => setValueOidString(t0).runNow()), params = null)
    __obj.asInstanceOf[DERObjectIdentifier]
  }
  
  extension [Self <: DERObjectIdentifier](x: Self) {
    
    inline def setSetValueHex(value: String => Callback): Self = StObject.set(x, "setValueHex", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetValueName(value: String => Callback): Self = StObject.set(x, "setValueName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetValueOidString(value: String => Callback): Self = StObject.set(x, "setValueOidString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
