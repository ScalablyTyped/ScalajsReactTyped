package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPairSyncResult[T1 /* <: String | Buffer */, T2 /* <: String | Buffer */] extends js.Object {
  var privateKey: T2
  var publicKey: T1
}

object KeyPairSyncResult {
  @scala.inline
  def apply[T1 /* <: String | Buffer */, T2 /* <: String | Buffer */](privateKey: T2, publicKey: T1): KeyPairSyncResult[T1, T2] = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyPairSyncResult[T1, T2]]
  }
}

