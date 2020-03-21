package typingsJapgolly.googleapis.v3Mod.analyticsV3

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Metadata$Columns")
@js.native
class ResourceMetadataColumns protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.metadata.columns.list
    * @desc Lists all columns for a report type
    * @alias analytics.metadata.columns.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.reportType Report type. Allowed Values: 'ga'. Where 'ga' corresponds to the Core Reporting API
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaColumns] = js.native
  def list(callback: BodyResponseCallback[SchemaColumns]): Unit = js.native
  def list(params: ParamsResourceMetadataColumnsList): GaxiosPromise[SchemaColumns] = js.native
  def list(params: ParamsResourceMetadataColumnsList, callback: BodyResponseCallback[SchemaColumns]): Unit = js.native
  def list(
    params: ParamsResourceMetadataColumnsList,
    options: BodyResponseCallback[SchemaColumns],
    callback: BodyResponseCallback[SchemaColumns]
  ): Unit = js.native
  def list(params: ParamsResourceMetadataColumnsList, options: MethodOptions): GaxiosPromise[SchemaColumns] = js.native
  def list(
    params: ParamsResourceMetadataColumnsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaColumns]
  ): Unit = js.native
}

