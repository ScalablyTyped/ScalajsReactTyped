package typingsJapgolly.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/doubleclickbidmanager/v1", "doubleclickbidmanager_v1.Resource$Reports")
@js.native
class ResourceReports protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * doubleclickbidmanager.reports.listreports
    * @desc Retrieves stored reports.
    * @alias doubleclickbidmanager.reports.listreports
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.queryId Query ID with which the reports are associated.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listreports(): GaxiosPromise[SchemaListReportsResponse] = js.native
  def listreports(callback: BodyResponseCallback[SchemaListReportsResponse]): Unit = js.native
  def listreports(params: ParamsResourceReportsListreports): GaxiosPromise[SchemaListReportsResponse] = js.native
  def listreports(
    params: ParamsResourceReportsListreports,
    callback: BodyResponseCallback[SchemaListReportsResponse]
  ): Unit = js.native
  def listreports(
    params: ParamsResourceReportsListreports,
    options: BodyResponseCallback[SchemaListReportsResponse],
    callback: BodyResponseCallback[SchemaListReportsResponse]
  ): Unit = js.native
  def listreports(params: ParamsResourceReportsListreports, options: MethodOptions): GaxiosPromise[SchemaListReportsResponse] = js.native
  def listreports(
    params: ParamsResourceReportsListreports,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListReportsResponse]
  ): Unit = js.native
}

