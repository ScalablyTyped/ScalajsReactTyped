package typingsJapgolly.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchRevokePermissionsRequest extends js.Object {
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your AWS Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * A list of up to 20 entries for resource permissions to be revoked by batch operation to the principal.
    */
  var Entries: BatchPermissionsRequestEntryList = js.native
}

object BatchRevokePermissionsRequest {
  @scala.inline
  def apply(Entries: BatchPermissionsRequestEntryList, CatalogId: CatalogIdString = null): BatchRevokePermissionsRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchRevokePermissionsRequest]
  }
}

