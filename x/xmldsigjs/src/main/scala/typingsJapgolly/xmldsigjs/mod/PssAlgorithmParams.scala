package typingsJapgolly.xmldsigjs.mod

import typingsJapgolly.xmldsigjs.rsaKeyMod.RsaPSSSignParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "PssAlgorithmParams")
@js.native
class PssAlgorithmParams ()
  extends typingsJapgolly.xmldsigjs.keyInfosMod.PssAlgorithmParams {
  def this(algorithm: RsaPSSSignParams) = this()
}

/* static members */
@JSImport("xmldsigjs", "PssAlgorithmParams")
@js.native
object PssAlgorithmParams extends js.Object {
  def FromAlgorithm(algorithm: RsaPSSSignParams): typingsJapgolly.xmldsigjs.rsaKeyMod.PssAlgorithmParams = js.native
}

