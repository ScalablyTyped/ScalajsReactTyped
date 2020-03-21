package typingsJapgolly.gapiClientWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitesListResponse extends js.Object {
  /** Contains permission level information about a Search Console site. For more information, see Permissions in Search Console. */
  var siteEntry: js.UndefOr[js.Array[WmxSite]] = js.undefined
}

object SitesListResponse {
  @scala.inline
  def apply(siteEntry: js.Array[WmxSite] = null): SitesListResponse = {
    val __obj = js.Dynamic.literal()
    if (siteEntry != null) __obj.updateDynamic("siteEntry")(siteEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[SitesListResponse]
  }
}

