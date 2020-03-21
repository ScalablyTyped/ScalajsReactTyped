package typingsJapgolly.googleapis.tagmanagerV1Mod.tagmanagerV1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Reauthorize_environments")
@js.native
class ResourceAccountsContainersReauthorizeEnvironments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.containers.reauthorize_environments.update
    * @desc Re-generates the authorization code for a GTM Environment.
    * @alias tagmanager.accounts.containers.reauthorize_environments.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.environmentId The GTM Environment ID.
    * @param {().Environment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaEnvironment] = js.native
  def update(callback: BodyResponseCallback[SchemaEnvironment]): Unit = js.native
  def update(params: ParamsResourceAccountsContainersReauthorizeEnvironmentsUpdate): GaxiosPromise[SchemaEnvironment] = js.native
  def update(
    params: ParamsResourceAccountsContainersReauthorizeEnvironmentsUpdate,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersReauthorizeEnvironmentsUpdate,
    options: BodyResponseCallback[SchemaEnvironment],
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersReauthorizeEnvironmentsUpdate, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def update(
    params: ParamsResourceAccountsContainersReauthorizeEnvironmentsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
}

