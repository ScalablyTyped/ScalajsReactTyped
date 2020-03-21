package typingsJapgolly.bip174.interfacesMod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bip32Derivation extends js.Object {
  var masterFingerprint: Buffer
  var path: String
  var pubkey: Buffer
}

object Bip32Derivation {
  @scala.inline
  def apply(masterFingerprint: Buffer, path: String, pubkey: Buffer): Bip32Derivation = {
    val __obj = js.Dynamic.literal(masterFingerprint = masterFingerprint.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pubkey = pubkey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Bip32Derivation]
  }
}

