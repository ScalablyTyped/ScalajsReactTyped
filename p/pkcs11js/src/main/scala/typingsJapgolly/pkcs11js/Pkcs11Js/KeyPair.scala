package typingsJapgolly.pkcs11js.Pkcs11Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPair extends js.Object {
  var privateKey: Handle
  var publicKey: Handle
}

object KeyPair {
  @scala.inline
  def apply(privateKey: Handle, publicKey: Handle): KeyPair = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyPair]
  }
}

