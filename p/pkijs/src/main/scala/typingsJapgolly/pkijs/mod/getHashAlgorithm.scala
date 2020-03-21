package typingsJapgolly.pkijs.mod

import typingsJapgolly.pkijs.algorithmIdentifierMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/common", "getHashAlgorithm")
@js.native
object getHashAlgorithm extends js.Object {
  /**
    * Getting hash algorithm by signature algorithm
    * 
    * @param {AlgorithmIdentifier} signatureAlgorithm Signature algorithm
    * @returns {string}
    */
  def apply(signatureAlgorithm: default): String = js.native
}

