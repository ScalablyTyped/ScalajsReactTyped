package typingsJapgolly.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketWebsiteConfig extends js.Object {
   // default page, e.g.: index.html
  var error: js.UndefOr[String] = js.undefined
  var index: String
}

object PutBucketWebsiteConfig {
  @scala.inline
  def apply(index: String, error: String = null): PutBucketWebsiteConfig = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketWebsiteConfig]
  }
}

