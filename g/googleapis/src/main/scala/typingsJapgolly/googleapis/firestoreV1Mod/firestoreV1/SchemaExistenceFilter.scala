package typingsJapgolly.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A digest of all the documents that match a given target.
  */
@js.native
trait SchemaExistenceFilter extends js.Object {
  /**
    * The total count of documents that match target_id.  If different from the
    * count of documents in the client that match, the client must manually
    * determine which documents no longer match the target.
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * The target ID to which this filter applies.
    */
  var targetId: js.UndefOr[Double] = js.native
}

object SchemaExistenceFilter {
  @scala.inline
  def apply(count: Int | Double = null, targetId: Int | Double = null): SchemaExistenceFilter = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExistenceFilter]
  }
}

