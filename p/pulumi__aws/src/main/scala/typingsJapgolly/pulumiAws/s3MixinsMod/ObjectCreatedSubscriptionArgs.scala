package typingsJapgolly.pulumiAws.s3MixinsMod

import typingsJapgolly.pulumiAws.pulumiAwsStrings.Asterisk
import typingsJapgolly.pulumiAws.pulumiAwsStrings.CompleteMultipartUpload
import typingsJapgolly.pulumiAws.pulumiAwsStrings.Copy
import typingsJapgolly.pulumiAws.pulumiAwsStrings.Post
import typingsJapgolly.pulumiAws.pulumiAwsStrings.Put
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectCreatedSubscriptionArgs extends CommonBucketSubscriptionArgs {
  var event: js.UndefOr[Asterisk | Put | Post | Copy | CompleteMultipartUpload] = js.native
}

object ObjectCreatedSubscriptionArgs {
  @scala.inline
  def apply(
    event: Asterisk | Put | Post | Copy | CompleteMultipartUpload = null,
    filterPrefix: String = null,
    filterSuffix: String = null
  ): ObjectCreatedSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix.asInstanceOf[js.Any])
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectCreatedSubscriptionArgs]
  }
}

