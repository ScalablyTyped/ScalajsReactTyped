package typingsJapgolly.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginTransactionRequest extends js.Object {
  var options: js.UndefOr[TransactionOptions] = js.undefined
}

object BeginTransactionRequest {
  @scala.inline
  def apply(options: TransactionOptions = null): BeginTransactionRequest = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginTransactionRequest]
  }
}

