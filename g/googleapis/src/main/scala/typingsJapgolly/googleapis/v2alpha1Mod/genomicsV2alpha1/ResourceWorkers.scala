package typingsJapgolly.googleapis.v2alpha1Mod.genomicsV2alpha1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/genomics/v2alpha1", "genomics_v2alpha1.Resource$Workers")
@js.native
class ResourceWorkers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * genomics.workers.checkIn
    * @desc The worker uses this method to retrieve the assigned operation and
    * provide periodic status updates.
    * @alias genomics.workers.checkIn
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The worker id, assigned when it was created.
    * @param {().CheckInRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def checkIn(): GaxiosPromise[SchemaCheckInResponse] = js.native
  def checkIn(callback: BodyResponseCallback[SchemaCheckInResponse]): Unit = js.native
  def checkIn(params: ParamsResourceWorkersCheckin): GaxiosPromise[SchemaCheckInResponse] = js.native
  def checkIn(params: ParamsResourceWorkersCheckin, callback: BodyResponseCallback[SchemaCheckInResponse]): Unit = js.native
  def checkIn(
    params: ParamsResourceWorkersCheckin,
    options: BodyResponseCallback[SchemaCheckInResponse],
    callback: BodyResponseCallback[SchemaCheckInResponse]
  ): Unit = js.native
  def checkIn(params: ParamsResourceWorkersCheckin, options: MethodOptions): GaxiosPromise[SchemaCheckInResponse] = js.native
  def checkIn(
    params: ParamsResourceWorkersCheckin,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCheckInResponse]
  ): Unit = js.native
}

