package typingsJapgolly.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitRequest extends js.Object {
  var transaction: js.UndefOr[String] = js.undefined
  var writes: js.UndefOr[js.Array[Write]] = js.undefined
}

object CommitRequest {
  @scala.inline
  def apply(transaction: String = null, writes: js.Array[Write] = null): CommitRequest = {
    val __obj = js.Dynamic.literal()
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    if (writes != null) __obj.updateDynamic("writes")(writes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitRequest]
  }
}

