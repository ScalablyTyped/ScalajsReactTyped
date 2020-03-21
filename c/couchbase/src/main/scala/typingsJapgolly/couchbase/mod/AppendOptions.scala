package typingsJapgolly.couchbase.mod

import typingsJapgolly.couchbase.mod.Bucket.CAS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendOptions extends js.Object {
  /**
    * The CAS value to check. If the item on the server contains a different CAS value, the operation will fail. Note that if this option is undefined, no comparison will be performed.
    */
  var cas: js.UndefOr[CAS] = js.undefined
  /**
    * Ensures this operation is persisted to this many nodes.
    */
  var persist_to: js.UndefOr[Double] = js.undefined
  /**
    * 	Ensures this operation is replicated to this many nodes.
    */
  var replicate_to: js.UndefOr[Double] = js.undefined
}

object AppendOptions {
  @scala.inline
  def apply(cas: CAS = null, persist_to: Int | Double = null, replicate_to: Int | Double = null): AppendOptions = {
    val __obj = js.Dynamic.literal()
    if (cas != null) __obj.updateDynamic("cas")(cas.asInstanceOf[js.Any])
    if (persist_to != null) __obj.updateDynamic("persist_to")(persist_to.asInstanceOf[js.Any])
    if (replicate_to != null) __obj.updateDynamic("replicate_to")(replicate_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendOptions]
  }
}

