package typingsJapgolly.xmlCrypto.mod

import org.scalajs.dom.raw.Node
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-crypto", "SignatureAlgorithm")
@js.native
class SignatureAlgorithm () extends js.Object {
  def getAlgorithmName(): String = js.native
  def getSignature(signedInfo: Node, signingKey: Buffer): String = js.native
}

