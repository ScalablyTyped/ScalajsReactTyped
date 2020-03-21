package typingsJapgolly.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generalization function that buckets values based on ranges. The ranges and
  * replacement values are dynamically provided by the user for custom
  * behavior, such as 1-30 -&gt; LOW 31-65 -&gt; MEDIUM 66-100 -&gt; HIGH This
  * can be used on data of type: number, long, string, timestamp. If the bound
  * `Value` type differs from the type of data being transformed, we will first
  * attempt converting the type of the data to be transformed to match the type
  * of the bound before comparing. See
  * https://cloud.google.com/dlp/docs/concepts-bucketing to learn more.
  */
@js.native
trait SchemaGooglePrivacyDlpV2BucketingConfig extends js.Object {
  /**
    * Set of buckets. Ranges must be non-overlapping.
    */
  var buckets: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Bucket]] = js.native
}

object SchemaGooglePrivacyDlpV2BucketingConfig {
  @scala.inline
  def apply(buckets: js.Array[SchemaGooglePrivacyDlpV2Bucket] = null): SchemaGooglePrivacyDlpV2BucketingConfig = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2BucketingConfig]
  }
}

