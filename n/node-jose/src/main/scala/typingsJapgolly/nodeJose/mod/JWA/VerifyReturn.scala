package typingsJapgolly.nodeJose.mod.JWA

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyReturn extends js.Object {
  var data: Buffer
   // the data passed into the verify function
  var mac: Buffer
   // the signature for `data`
  var valid: Boolean
}

object VerifyReturn {
  @scala.inline
  def apply(data: Buffer, mac: Buffer, valid: Boolean): VerifyReturn = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VerifyReturn]
  }
}

