package typingsJapgolly.pkijs.mod

import org.scalajs.dom.crypto.Algorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/common", "getOIDByAlgorithm")
@js.native
object getOIDByAlgorithm extends js.Object {
  /**
    * Get OID for each specific WebCrypto algorithm
    * 
    * @param {Algorithm} algorithm
    * @returns {string}
    */
  def apply(algorithm: Algorithm): String = js.native
}

