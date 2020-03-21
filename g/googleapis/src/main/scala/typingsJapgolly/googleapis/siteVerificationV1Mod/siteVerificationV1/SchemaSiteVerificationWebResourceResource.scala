package typingsJapgolly.googleapis.siteVerificationV1Mod.siteVerificationV1

import typingsJapgolly.googleapis.AnonIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSiteVerificationWebResourceResource extends js.Object {
  /**
    * The string used to identify this site. This value should be used in the
    * &quot;id&quot; portion of the REST URL for the Get, Update, and Delete
    * operations.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The email addresses of all verified owners.
    */
  var owners: js.UndefOr[js.Array[String]] = js.native
  /**
    * The address and type of a site that is verified or will be verified.
    */
  var site: js.UndefOr[AnonIdentifier] = js.native
}

object SchemaSiteVerificationWebResourceResource {
  @scala.inline
  def apply(id: String = null, owners: js.Array[String] = null, site: AnonIdentifier = null): SchemaSiteVerificationWebResourceResource = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (owners != null) __obj.updateDynamic("owners")(owners.asInstanceOf[js.Any])
    if (site != null) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSiteVerificationWebResourceResource]
  }
}

