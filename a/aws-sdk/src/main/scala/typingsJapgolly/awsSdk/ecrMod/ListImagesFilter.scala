package typingsJapgolly.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListImagesFilter extends js.Object {
  /**
    * The tag status with which to filter your ListImages results. You can filter results based on whether they are TAGGED or UNTAGGED.
    */
  var tagStatus: js.UndefOr[TagStatus] = js.native
}

object ListImagesFilter {
  @scala.inline
  def apply(tagStatus: TagStatus = null): ListImagesFilter = {
    val __obj = js.Dynamic.literal()
    if (tagStatus != null) __obj.updateDynamic("tagStatus")(tagStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListImagesFilter]
  }
}

