package typingsJapgolly.googleapis.v1Dot4Mod.adsenseV14

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Payments")
@js.native
class ResourcePayments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsense.payments.list
    * @desc List the payments for this AdSense account.
    * @alias adsense.payments.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPayments] = js.native
  def list(callback: BodyResponseCallback[SchemaPayments]): Unit = js.native
  def list(params: ParamsResourcePaymentsList): GaxiosPromise[SchemaPayments] = js.native
  def list(params: ParamsResourcePaymentsList, callback: BodyResponseCallback[SchemaPayments]): Unit = js.native
  def list(
    params: ParamsResourcePaymentsList,
    options: BodyResponseCallback[SchemaPayments],
    callback: BodyResponseCallback[SchemaPayments]
  ): Unit = js.native
  def list(params: ParamsResourcePaymentsList, options: MethodOptions): GaxiosPromise[SchemaPayments] = js.native
  def list(
    params: ParamsResourcePaymentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPayments]
  ): Unit = js.native
}

