package typingsJapgolly.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLinkResponse extends js.Object {
  /**
    * Information about the link.
    */
  var Link: js.UndefOr[typingsJapgolly.awsSdk.networkmanagerMod.Link] = js.native
}

object DeleteLinkResponse {
  @scala.inline
  def apply(Link: Link = null): DeleteLinkResponse = {
    val __obj = js.Dynamic.literal()
    if (Link != null) __obj.updateDynamic("Link")(Link.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLinkResponse]
  }
}

