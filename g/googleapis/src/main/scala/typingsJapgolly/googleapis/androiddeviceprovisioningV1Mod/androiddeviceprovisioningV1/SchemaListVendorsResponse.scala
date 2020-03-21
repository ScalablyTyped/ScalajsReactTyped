package typingsJapgolly.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message to list vendors of the partner.
  */
@js.native
trait SchemaListVendorsResponse extends js.Object {
  /**
    * A token to retrieve the next page of results. Omitted if no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The total count of items in the list irrespective of pagination.
    */
  var totalSize: js.UndefOr[Double] = js.native
  /**
    * List of vendors of the reseller partner. Fields `name`, `companyId` and
    * `companyName` are populated to the Company object.
    */
  var vendors: js.UndefOr[js.Array[SchemaCompany]] = js.native
}

object SchemaListVendorsResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    totalSize: Int | Double = null,
    vendors: js.Array[SchemaCompany] = null
  ): SchemaListVendorsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    if (vendors != null) __obj.updateDynamic("vendors")(vendors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListVendorsResponse]
  }
}

