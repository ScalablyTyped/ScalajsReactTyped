package typingsJapgolly.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLinkResponse extends js.Object {
  /**
    * Information about the link.
    */
  var Link: js.UndefOr[typingsJapgolly.awsSdk.networkmanagerMod.Link] = js.native
}

object CreateLinkResponse {
  @scala.inline
  def apply(Link: Link = null): CreateLinkResponse = {
    val __obj = js.Dynamic.literal()
    if (Link != null) __obj.updateDynamic("Link")(Link.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLinkResponse]
  }
}

