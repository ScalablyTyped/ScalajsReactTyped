package typingsJapgolly.gapiClientBigquery.gapi.client.bigquery

import typingsJapgolly.gapiClientBigquery.AnonInsertId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDataInsertAllRequest extends js.Object {
  /**
    * [Optional] Accept rows that contain values that do not match the schema. The unknown values are ignored. Default is false, which treats unknown values
    * as errors.
    */
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.undefined
  /** The resource type of the response. */
  var kind: js.UndefOr[String] = js.undefined
  /** The rows to insert. */
  var rows: js.UndefOr[js.Array[AnonInsertId]] = js.undefined
  /**
    * [Optional] Insert all valid rows of a request, even if invalid rows exist. The default value is false, which causes the entire request to fail if any
    * invalid rows exist.
    */
  var skipInvalidRows: js.UndefOr[Boolean] = js.undefined
  /**
    * [Experimental] If specified, treats the destination table as a base template, and inserts the rows into an instance table named
    * "{destination}{templateSuffix}". BigQuery will manage creation of the instance table, using the schema of the base template table. See
    * https://cloud.google.com/bigquery/streaming-data-into-bigquery#template-tables for considerations when working with templates tables.
    */
  var templateSuffix: js.UndefOr[String] = js.undefined
}

object TableDataInsertAllRequest {
  @scala.inline
  def apply(
    ignoreUnknownValues: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    rows: js.Array[AnonInsertId] = null,
    skipInvalidRows: js.UndefOr[Boolean] = js.undefined,
    templateSuffix: String = null
  ): TableDataInsertAllRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreUnknownValues)) __obj.updateDynamic("ignoreUnknownValues")(ignoreUnknownValues.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (!js.isUndefined(skipInvalidRows)) __obj.updateDynamic("skipInvalidRows")(skipInvalidRows.asInstanceOf[js.Any])
    if (templateSuffix != null) __obj.updateDynamic("templateSuffix")(templateSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDataInsertAllRequest]
  }
}

