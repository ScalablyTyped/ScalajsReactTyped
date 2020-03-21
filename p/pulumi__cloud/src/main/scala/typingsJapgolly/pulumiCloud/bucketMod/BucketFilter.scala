package typingsJapgolly.pulumiCloud.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketFilter extends js.Object {
  var keyPrefix: js.UndefOr[String] = js.undefined
  var keySuffix: js.UndefOr[String] = js.undefined
}

object BucketFilter {
  @scala.inline
  def apply(keyPrefix: String = null, keySuffix: String = null): BucketFilter = {
    val __obj = js.Dynamic.literal()
    if (keyPrefix != null) __obj.updateDynamic("keyPrefix")(keyPrefix.asInstanceOf[js.Any])
    if (keySuffix != null) __obj.updateDynamic("keySuffix")(keySuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketFilter]
  }
}

