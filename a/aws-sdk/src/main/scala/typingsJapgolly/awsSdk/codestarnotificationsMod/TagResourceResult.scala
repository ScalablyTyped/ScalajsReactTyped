package typingsJapgolly.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceResult extends js.Object {
  /**
    * The list of tags associated with the resource.
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.codestarnotificationsMod.Tags] = js.native
}

object TagResourceResult {
  @scala.inline
  def apply(Tags: Tags = null): TagResourceResult = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceResult]
  }
}

