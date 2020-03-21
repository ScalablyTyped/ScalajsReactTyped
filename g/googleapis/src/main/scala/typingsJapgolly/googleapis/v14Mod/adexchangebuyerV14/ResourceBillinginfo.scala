package typingsJapgolly.googleapis.v14Mod.adexchangebuyerV14

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Billinginfo")
@js.native
class ResourceBillinginfo protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer.billingInfo.get
    * @desc Returns the billing information for one account specified by
    * account ID.
    * @alias adexchangebuyer.billingInfo.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.accountId The account id.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaBillingInfo] = js.native
  def get(callback: BodyResponseCallback[SchemaBillingInfo]): Unit = js.native
  def get(params: ParamsResourceBillinginfoGet): GaxiosPromise[SchemaBillingInfo] = js.native
  def get(params: ParamsResourceBillinginfoGet, callback: BodyResponseCallback[SchemaBillingInfo]): Unit = js.native
  def get(
    params: ParamsResourceBillinginfoGet,
    options: BodyResponseCallback[SchemaBillingInfo],
    callback: BodyResponseCallback[SchemaBillingInfo]
  ): Unit = js.native
  def get(params: ParamsResourceBillinginfoGet, options: MethodOptions): GaxiosPromise[SchemaBillingInfo] = js.native
  def get(
    params: ParamsResourceBillinginfoGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBillingInfo]
  ): Unit = js.native
  /**
    * adexchangebuyer.billingInfo.list
    * @desc Retrieves a list of billing information for all accounts of the
    * authenticated user.
    * @alias adexchangebuyer.billingInfo.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaBillingInfoList] = js.native
  def list(callback: BodyResponseCallback[SchemaBillingInfoList]): Unit = js.native
  def list(params: ParamsResourceBillinginfoList): GaxiosPromise[SchemaBillingInfoList] = js.native
  def list(params: ParamsResourceBillinginfoList, callback: BodyResponseCallback[SchemaBillingInfoList]): Unit = js.native
  def list(
    params: ParamsResourceBillinginfoList,
    options: BodyResponseCallback[SchemaBillingInfoList],
    callback: BodyResponseCallback[SchemaBillingInfoList]
  ): Unit = js.native
  def list(params: ParamsResourceBillinginfoList, options: MethodOptions): GaxiosPromise[SchemaBillingInfoList] = js.native
  def list(
    params: ParamsResourceBillinginfoList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBillingInfoList]
  ): Unit = js.native
}

