package typingsJapgolly.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", "LocalSimpleStringBlock")
@js.native
class LocalSimpleStringBlock () extends BaseBlock[LocalSimpleLocalSimpleStringValueBlock] {
  def this(params: LocalSimpleStringBlockParams) = this()
  /**
    * Function converting ArrayBuffer into ASN.1 internal string
    * 
    * @param {ArrayBuffer} inputBuffer ASN.1 BER encoded array
    * 
    * @memberOf LocalSimpleStringBlock
    */
  def fromBuffer(inputBuffer: scala.scalajs.js.typedarray.ArrayBuffer): Unit = js.native
  /**
    * Function converting JavaScript string into ASN.1 internal class
    * 
    * @param {string} inputString ASN.1 BER encoded array
    * 
    * @memberOf LocalSimpleStringBlock
    */
  def fromString(inputString: String): Unit = js.native
}

