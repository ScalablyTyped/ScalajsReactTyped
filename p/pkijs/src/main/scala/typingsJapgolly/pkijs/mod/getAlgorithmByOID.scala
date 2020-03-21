package typingsJapgolly.pkijs.mod

import org.scalajs.dom.crypto.Algorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/common", "getAlgorithmByOID")
@js.native
object getAlgorithmByOID extends js.Object {
  /**
    * Get WebCrypto algorithm by wel-known OID
    * 
    * @param {string} oid Wel-known OID to search for
    * @returns {Algorithm}
    */
  def apply(oid: String): Algorithm = js.native
}

