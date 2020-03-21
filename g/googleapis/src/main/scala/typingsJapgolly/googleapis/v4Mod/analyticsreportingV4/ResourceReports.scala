package typingsJapgolly.googleapis.v4Mod.analyticsreportingV4

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analyticsreporting/v4", "analyticsreporting_v4.Resource$Reports")
@js.native
class ResourceReports protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analyticsreporting.reports.batchGet
    * @desc Returns the Analytics data.
    * @alias analyticsreporting.reports.batchGet
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().GetReportsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchGet(): GaxiosPromise[SchemaGetReportsResponse] = js.native
  def batchGet(callback: BodyResponseCallback[SchemaGetReportsResponse]): Unit = js.native
  def batchGet(params: ParamsResourceReportsBatchget): GaxiosPromise[SchemaGetReportsResponse] = js.native
  def batchGet(params: ParamsResourceReportsBatchget, callback: BodyResponseCallback[SchemaGetReportsResponse]): Unit = js.native
  def batchGet(
    params: ParamsResourceReportsBatchget,
    options: BodyResponseCallback[SchemaGetReportsResponse],
    callback: BodyResponseCallback[SchemaGetReportsResponse]
  ): Unit = js.native
  def batchGet(params: ParamsResourceReportsBatchget, options: MethodOptions): GaxiosPromise[SchemaGetReportsResponse] = js.native
  def batchGet(
    params: ParamsResourceReportsBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetReportsResponse]
  ): Unit = js.native
}

