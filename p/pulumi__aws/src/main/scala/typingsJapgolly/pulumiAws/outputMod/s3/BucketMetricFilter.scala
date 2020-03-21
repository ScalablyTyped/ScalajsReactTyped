package typingsJapgolly.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketMetricFilter extends js.Object {
  /**
    * Object prefix for filtering (singular).
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Object tags for filtering (up to 10).
    */
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object BucketMetricFilter {
  @scala.inline
  def apply(prefix: String = null, tags: StringDictionary[js.Any] = null): BucketMetricFilter = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketMetricFilter]
  }
}

