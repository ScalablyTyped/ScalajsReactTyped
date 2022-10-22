package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AlgorithmIdentifier ASN.1 structure class
  * @param params associative array of parameters (ex. {'name': 'SHA1withRSA'})
  * @description
  * The 'params' argument is an associative array and has following parameters:
  *
  * - name: algorithm name (MANDATORY, ex. sha1, SHA256withRSA)
  * - asn1params: explicitly specify ASN.1 object for algorithm. (OPTION)
  * - paramempty: set algorithm parameter to NULL by force.
  * If paramempty is false, algorithm parameter will be set automatically.
  * If paramempty is false and algorithm name is "*withDSA" or "withECDSA" parameter field of
  * AlgorithmIdentifier will be ommitted otherwise
  * it will be NULL by default.
  * (OPTION, DEFAULT = false)
  *
  * @example
  * algId = new KJUR.asn1.x509.AlgorithmIdentifier({name: "sha1"});
  * // set parameter to NULL authomatically if algorithm name is "*withRSA".
  * algId = new KJUR.asn1.x509.AlgorithmIdentifier({name: "SHA256withRSA"});
  * // set parameter to NULL authomatically if algorithm name is "rsaEncryption".
  * algId = new KJUR.asn1.x509.AlgorithmIdentifier({name: "rsaEncryption"});
  * // SHA256withRSA and set parameter empty by force
  * algId = new KJUR.asn1.x509.AlgorithmIdentifier({name: "SHA256withRSA", paramempty: true});
  */
trait AlgorithmIdentifier
  extends StObject
     with ASN1Object
object AlgorithmIdentifier {
  
  inline def apply(
    getEncodedHex: CallbackTo[String],
    getFreshValueHex: CallbackTo[String],
    getLengthHexFromValue: CallbackTo[String],
    getValueHex: CallbackTo[String],
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String
  ): AlgorithmIdentifier = {
    val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], params = null)
    __obj.asInstanceOf[AlgorithmIdentifier]
  }
}
