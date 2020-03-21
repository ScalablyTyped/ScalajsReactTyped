package typingsJapgolly.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/websecurityscanner/v1alpha", "websecurityscanner_v1alpha.Resource$Projects$Scanconfigs$Scanruns$Crawledurls")
@js.native
class ResourceProjectsScanconfigsScanrunsCrawledurls protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * websecurityscanner.projects.scanConfigs.scanRuns.crawledUrls.list
    * @desc List CrawledUrls under a given ScanRun.
    * @alias websecurityscanner.projects.scanConfigs.scanRuns.crawledUrls.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of CrawledUrls to return, can be limited by server. If not specified or not positive, the implementation will select a reasonable value.
    * @param {string=} params.pageToken A token identifying a page of results to be returned. This should be a `next_page_token` value returned from a previous List request. If unspecified, the first page of results is returned.
    * @param {string} params.parent Required. The parent resource name, which should be a scan run resource name in the format 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListCrawledUrlsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCrawledUrlsResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsScanconfigsScanrunsCrawledurlsList): GaxiosPromise[SchemaListCrawledUrlsResponse] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsCrawledurlsList,
    callback: BodyResponseCallback[SchemaListCrawledUrlsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsCrawledurlsList,
    options: BodyResponseCallback[SchemaListCrawledUrlsResponse],
    callback: BodyResponseCallback[SchemaListCrawledUrlsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsScanconfigsScanrunsCrawledurlsList, options: MethodOptions): GaxiosPromise[SchemaListCrawledUrlsResponse] = js.native
  def list(
    params: ParamsResourceProjectsScanconfigsScanrunsCrawledurlsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCrawledUrlsResponse]
  ): Unit = js.native
}

