package typingsJapgolly.nodeJose.mod.JWS

import typingsJapgolly.node.Buffer
import typingsJapgolly.nodeJose.mod.JWK.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseResult extends js.Object {
  /**
    * the combined 'protected' and 'unprotected' header members
    */
  var header: js.Object
  /**
    * The key used to verify the signature
    */
  var key: Key
  /**
    * the signed content
    */
  var payload: Buffer
  var `protected`: js.Array[String]
}

object BaseResult {
  @scala.inline
  def apply(header: js.Object, key: Key, payload: Buffer, `protected`: js.Array[String]): BaseResult = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseResult]
  }
}

