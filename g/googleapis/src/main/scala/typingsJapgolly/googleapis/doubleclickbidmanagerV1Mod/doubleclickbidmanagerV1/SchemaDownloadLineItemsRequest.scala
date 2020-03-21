package typingsJapgolly.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to fetch stored line items.
  */
@js.native
trait SchemaDownloadLineItemsRequest extends js.Object {
  /**
    * File specification (column names, types, order) in which the line items
    * will be returned. Default to EWF.
    */
  var fileSpec: js.UndefOr[String] = js.native
  /**
    * Ids of the specified filter type used to filter line items to fetch. If
    * omitted, all the line items will be returned.
    */
  var filterIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Filter type used to filter line items to fetch.
    */
  var filterType: js.UndefOr[String] = js.native
  /**
    * Format in which the line items will be returned. Default to CSV.
    */
  var format: js.UndefOr[String] = js.native
}

object SchemaDownloadLineItemsRequest {
  @scala.inline
  def apply(
    fileSpec: String = null,
    filterIds: js.Array[String] = null,
    filterType: String = null,
    format: String = null
  ): SchemaDownloadLineItemsRequest = {
    val __obj = js.Dynamic.literal()
    if (fileSpec != null) __obj.updateDynamic("fileSpec")(fileSpec.asInstanceOf[js.Any])
    if (filterIds != null) __obj.updateDynamic("filterIds")(filterIds.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDownloadLineItemsRequest]
  }
}

