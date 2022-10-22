package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1

import typingsJapgolly.jsrsasign.jsrsasign.BigInteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ASN1 utilities class */
trait ASN1Util extends StObject {
  
  def bigIntToMinTwosComplementsHex(bigIntegerValue: BigInteger): String
  
  def integerToByteHex(i: Double): String
  
  /**
    * get encoded hexadecimal string of ASN1Object specifed by JSON parameters
    *
    * @param param JSON parameter to generate ASN1Object
    * @return hexadecimal string of ASN1Object
    * @description
    * As for ASN.1 object representation of JSON object,
    * please see `newObject`.
    * @example
    * jsonToASN1HEX({'prnstr': 'aaa'});
    */
  def jsonToASN1HEX(param: ASNObject): String
  
  /**
    * generate ASN1Object specifed by JSON parameters
    * @param param JSON parameter to generate ASN1Object
    * @description
    * generate any ASN1Object specified by JSON param
    * including ASN.1 primitive or structured.
    * Generally 'param' can be described as follows:
    * ```
    * {TYPE-OF-ASNOBJ: ASN1OBJ-PARAMETER}
    * ```
    * 'TYPE-OF-ASN1OBJ' can be one of following symbols:
    *
    * - 'bool' - DERBoolean
    * - 'int' - DERInteger
    * - 'bitstr' - DERBitString
    * - 'octstr' - DEROctetString
    * - 'null' - DERNull
    * - 'oid' - DERObjectIdentifier
    * - 'enum' - DEREnumerated
    * - 'utf8str' - DERUTF8String
    * - 'numstr' - DERNumericString
    * - 'prnstr' - DERPrintableString
    * - 'telstr' - DERTeletexString
    * - 'ia5str' - DERIA5String
    * - 'utctime' - DERUTCTime
    * - 'gentime' - DERGeneralizedTime
    * - 'seq' - DERSequence
    * - 'set' - DERSet
    * - 'tag' - DERTaggedObject
    *
    * @example
    * newObject({'prnstr': 'aaa'});
    * newObject({'seq': [{'int': 3}, {'prnstr': 'aaa'}]})
    * // ASN.1 Tagged Object
    * newObject({'tag': {'tag': 'a1',
    *                    'explicit': true,
    *                    'obj': {'seq': [{'int': 3}, {'prnstr': 'aaa'}]}}});
    * // more simple representation of ASN.1 Tagged Object
    * newObject({'tag': ['a1',
    *                    true,
    *                    {'seq': [
    *                      {'int': 3},
    *                      {'prnstr': 'aaa'}]}
    *                   ]});
    */
  def newObject(param: ASNObject): ASN1Object
}
object ASN1Util {
  
  inline def apply(
    bigIntToMinTwosComplementsHex: BigInteger => String,
    integerToByteHex: Double => String,
    jsonToASN1HEX: ASNObject => String,
    newObject: ASNObject => ASN1Object
  ): ASN1Util = {
    val __obj = js.Dynamic.literal(bigIntToMinTwosComplementsHex = js.Any.fromFunction1(bigIntToMinTwosComplementsHex), integerToByteHex = js.Any.fromFunction1(integerToByteHex), jsonToASN1HEX = js.Any.fromFunction1(jsonToASN1HEX), newObject = js.Any.fromFunction1(newObject))
    __obj.asInstanceOf[ASN1Util]
  }
  
  extension [Self <: ASN1Util](x: Self) {
    
    inline def setBigIntToMinTwosComplementsHex(value: BigInteger => String): Self = StObject.set(x, "bigIntToMinTwosComplementsHex", js.Any.fromFunction1(value))
    
    inline def setIntegerToByteHex(value: Double => String): Self = StObject.set(x, "integerToByteHex", js.Any.fromFunction1(value))
    
    inline def setJsonToASN1HEX(value: ASNObject => String): Self = StObject.set(x, "jsonToASN1HEX", js.Any.fromFunction1(value))
    
    inline def setNewObject(value: ASNObject => ASN1Object): Self = StObject.set(x, "newObject", js.Any.fromFunction1(value))
  }
}
