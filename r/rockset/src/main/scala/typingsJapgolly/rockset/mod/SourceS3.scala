package typingsJapgolly.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceS3 extends js.Object {
  // address of S3 bucket containing data
  var bucket: String
  // Pattern that selects keys to ingest.
  var pattern: js.UndefOr[String] = js.undefined
  // Prefix that selects keys to ingest.
  var prefix: js.UndefOr[String] = js.undefined
}

object SourceS3 {
  @scala.inline
  def apply(bucket: String, pattern: String = null, prefix: String = null): SourceS3 = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceS3]
  }
}

