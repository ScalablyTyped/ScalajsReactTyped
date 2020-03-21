package typingsJapgolly.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentDelete extends js.Object {
  var document: js.UndefOr[String] = js.undefined
  var readTime: js.UndefOr[String] = js.undefined
  var removedTargetIds: js.UndefOr[js.Array[Double]] = js.undefined
}

object DocumentDelete {
  @scala.inline
  def apply(document: String = null, readTime: String = null, removedTargetIds: js.Array[Double] = null): DocumentDelete = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (removedTargetIds != null) __obj.updateDynamic("removedTargetIds")(removedTargetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentDelete]
  }
}

