package typingsJapgolly.googleapis.v3Mod.analyticsV3

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Accounts")
@js.native
class ResourceManagementAccounts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.accounts.list
    * @desc Lists all accounts to which the user has access.
    * @alias analytics.management.accounts.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.max-results The maximum number of accounts to include in this response.
    * @param {integer=} params.start-index An index of the first account to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAccounts] = js.native
  def list(callback: BodyResponseCallback[SchemaAccounts]): Unit = js.native
  def list(params: ParamsResourceManagementAccountsList): GaxiosPromise[SchemaAccounts] = js.native
  def list(params: ParamsResourceManagementAccountsList, callback: BodyResponseCallback[SchemaAccounts]): Unit = js.native
  def list(
    params: ParamsResourceManagementAccountsList,
    options: BodyResponseCallback[SchemaAccounts],
    callback: BodyResponseCallback[SchemaAccounts]
  ): Unit = js.native
  def list(params: ParamsResourceManagementAccountsList, options: MethodOptions): GaxiosPromise[SchemaAccounts] = js.native
  def list(
    params: ParamsResourceManagementAccountsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccounts]
  ): Unit = js.native
}

