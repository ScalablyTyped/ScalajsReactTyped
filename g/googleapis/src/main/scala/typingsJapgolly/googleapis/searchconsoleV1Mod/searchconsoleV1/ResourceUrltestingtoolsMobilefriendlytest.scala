package typingsJapgolly.googleapis.searchconsoleV1Mod.searchconsoleV1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/searchconsole/v1", "searchconsole_v1.Resource$Urltestingtools$Mobilefriendlytest")
@js.native
class ResourceUrltestingtoolsMobilefriendlytest protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * searchconsole.urlTestingTools.mobileFriendlyTest.run
    * @desc Runs Mobile-Friendly Test for a given URL.
    * @alias searchconsole.urlTestingTools.mobileFriendlyTest.run
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().RunMobileFriendlyTestRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def run(): GaxiosPromise[SchemaRunMobileFriendlyTestResponse] = js.native
  def run(callback: BodyResponseCallback[SchemaRunMobileFriendlyTestResponse]): Unit = js.native
  def run(params: ParamsResourceUrltestingtoolsMobilefriendlytestRun): GaxiosPromise[SchemaRunMobileFriendlyTestResponse] = js.native
  def run(
    params: ParamsResourceUrltestingtoolsMobilefriendlytestRun,
    callback: BodyResponseCallback[SchemaRunMobileFriendlyTestResponse]
  ): Unit = js.native
  def run(
    params: ParamsResourceUrltestingtoolsMobilefriendlytestRun,
    options: BodyResponseCallback[SchemaRunMobileFriendlyTestResponse],
    callback: BodyResponseCallback[SchemaRunMobileFriendlyTestResponse]
  ): Unit = js.native
  def run(params: ParamsResourceUrltestingtoolsMobilefriendlytestRun, options: MethodOptions): GaxiosPromise[SchemaRunMobileFriendlyTestResponse] = js.native
  def run(
    params: ParamsResourceUrltestingtoolsMobilefriendlytestRun,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRunMobileFriendlyTestResponse]
  ): Unit = js.native
}

