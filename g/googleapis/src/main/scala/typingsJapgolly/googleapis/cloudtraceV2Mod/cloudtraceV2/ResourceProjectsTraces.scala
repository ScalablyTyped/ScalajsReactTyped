package typingsJapgolly.googleapis.cloudtraceV2Mod.cloudtraceV2

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudtrace/v2", "cloudtrace_v2.Resource$Projects$Traces")
@js.native
class ResourceProjectsTraces protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var spans: ResourceProjectsTracesSpans = js.native
  /**
    * cloudtrace.projects.traces.batchWrite
    * @desc Sends new spans to new or existing traces. You cannot update
    * existing spans.
    * @alias cloudtrace.projects.traces.batchWrite
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the project where the spans belong. The format is `projects/[PROJECT_ID]`.
    * @param {().BatchWriteSpansRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchWrite(): GaxiosPromise[SchemaEmpty] = js.native
  def batchWrite(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def batchWrite(params: ParamsResourceProjectsTracesBatchwrite): GaxiosPromise[SchemaEmpty] = js.native
  def batchWrite(params: ParamsResourceProjectsTracesBatchwrite, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def batchWrite(
    params: ParamsResourceProjectsTracesBatchwrite,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def batchWrite(params: ParamsResourceProjectsTracesBatchwrite, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def batchWrite(
    params: ParamsResourceProjectsTracesBatchwrite,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
}

