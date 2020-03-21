package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.nodeStrings.der
import typingsJapgolly.node.nodeStrings.dsa
import typingsJapgolly.node.nodeStrings.ec
import typingsJapgolly.node.nodeStrings.pem
import typingsJapgolly.node.nodeStrings.rsa
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "generateKeyPairSync")
@js.native
object generateKeyPairSync extends js.Object {
  def apply(`type`: dsa, options: DSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  def apply(`type`: ec, options: ECKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  def apply(`type`: rsa, options: RSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
}

