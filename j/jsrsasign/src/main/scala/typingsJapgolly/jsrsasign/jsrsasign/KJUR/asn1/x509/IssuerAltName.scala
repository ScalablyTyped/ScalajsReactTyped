package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IssuerAltName ASN.1 structure class
  * @param params associative array of parameters
  * @see KJUR.asn1.x509.GeneralNames
  * @see KJUR.asn1.x509.GeneralName
  * @description
  * This class provides X.509v3 IssuerAltName extension.
  * ```
  * id-ce-subjectAltName OBJECT IDENTIFIER ::=  { id-ce 18 }
  * IssuerAltName ::= GeneralNames
  * GeneralNames ::= SEQUENCE SIZE (1..MAX) OF GeneralName
  * GeneralName ::= CHOICE {
  *   otherName                  [0] OtherName,
  *   rfc822Name                 [1] IA5String,
  *   dNSName                    [2] IA5String,
  *   x400Address                [3] ORAddress,
  *   directoryName              [4] Name,
  *   ediPartyName               [5] EDIPartyName,
  *   uniformResourceIdentifier  [6] IA5String,
  *   iPAddress                  [7] OCTET STRING,
  *   registeredID               [8] OBJECT IDENTIFIER }
  * ```
  * @example
  * e1 = new KJUR.asn1.x509.IssuerAltName({
  *   critical: true,
  *   array: [{uri: 'http://aaa.com/'}, {uri: 'http://bbb.com/'}]
  * });
  */
trait IssuerAltName
  extends StObject
     with Extension {
  
  def getExtnValueHex(): String
  
  def setNameArray(paramsArray: js.Array[UriParam]): Unit
}
object IssuerAltName {
  
  inline def apply(
    getEncodedHex: CallbackTo[String],
    getExtnValueHex: CallbackTo[String],
    getFreshValueHex: CallbackTo[String],
    getLengthHexFromValue: CallbackTo[String],
    getValueHex: CallbackTo[String],
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    setNameArray: js.Array[UriParam] => Callback
  ): IssuerAltName = {
    val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, getExtnValueHex = getExtnValueHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setNameArray = js.Any.fromFunction1((t0: js.Array[UriParam]) => setNameArray(t0).runNow()), params = null)
    __obj.asInstanceOf[IssuerAltName]
  }
  
  extension [Self <: IssuerAltName](x: Self) {
    
    inline def setGetExtnValueHex(value: CallbackTo[String]): Self = StObject.set(x, "getExtnValueHex", value.toJsFn)
    
    inline def setSetNameArray(value: js.Array[UriParam] => Callback): Self = StObject.set(x, "setNameArray", js.Any.fromFunction1((t0: js.Array[UriParam]) => value(t0).runNow()))
  }
}
