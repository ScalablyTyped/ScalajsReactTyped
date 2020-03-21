package typingsJapgolly.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryTarget extends js.Object {
  var parent: js.UndefOr[String] = js.undefined
  var structuredQuery: js.UndefOr[StructuredQuery] = js.undefined
}

object QueryTarget {
  @scala.inline
  def apply(parent: String = null, structuredQuery: StructuredQuery = null): QueryTarget = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (structuredQuery != null) __obj.updateDynamic("structuredQuery")(structuredQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryTarget]
  }
}

