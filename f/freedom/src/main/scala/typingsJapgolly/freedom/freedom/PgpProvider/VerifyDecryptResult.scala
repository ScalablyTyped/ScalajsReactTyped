package typingsJapgolly.freedom.freedom.PgpProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyDecryptResult extends js.Object {
  var data: scala.scalajs.js.typedarray.ArrayBuffer
  var signedBy: js.Array[String]
}

object VerifyDecryptResult {
  @scala.inline
  def apply(data: scala.scalajs.js.typedarray.ArrayBuffer, signedBy: js.Array[String]): VerifyDecryptResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], signedBy = signedBy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VerifyDecryptResult]
  }
}

