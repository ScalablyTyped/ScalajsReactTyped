package typingsJapgolly.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTagOptionOutput extends js.Object {
  /**
    * Information about the TagOption.
    */
  var TagOptionDetail: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.TagOptionDetail] = js.native
}

object UpdateTagOptionOutput {
  @scala.inline
  def apply(TagOptionDetail: TagOptionDetail = null): UpdateTagOptionOutput = {
    val __obj = js.Dynamic.literal()
    if (TagOptionDetail != null) __obj.updateDynamic("TagOptionDetail")(TagOptionDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTagOptionOutput]
  }
}

