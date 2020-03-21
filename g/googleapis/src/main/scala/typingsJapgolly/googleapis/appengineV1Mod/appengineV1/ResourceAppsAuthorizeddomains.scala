package typingsJapgolly.googleapis.appengineV1Mod.appengineV1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/appengine/v1", "appengine_v1.Resource$Apps$Authorizeddomains")
@js.native
class ResourceAppsAuthorizeddomains protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * appengine.apps.authorizedDomains.list
    * @desc Lists all domains the user is authorized to administer.
    * @alias appengine.apps.authorizedDomains.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `parent`. Name of the parent Application resource. Example: apps/myapp.
    * @param {integer=} params.pageSize Maximum results to return per page.
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListAuthorizedDomainsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAuthorizedDomainsResponse]): Unit = js.native
  def list(params: ParamsResourceAppsAuthorizeddomainsList): GaxiosPromise[SchemaListAuthorizedDomainsResponse] = js.native
  def list(
    params: ParamsResourceAppsAuthorizeddomainsList,
    callback: BodyResponseCallback[SchemaListAuthorizedDomainsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAppsAuthorizeddomainsList,
    options: BodyResponseCallback[SchemaListAuthorizedDomainsResponse],
    callback: BodyResponseCallback[SchemaListAuthorizedDomainsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAppsAuthorizeddomainsList, options: MethodOptions): GaxiosPromise[SchemaListAuthorizedDomainsResponse] = js.native
  def list(
    params: ParamsResourceAppsAuthorizeddomainsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAuthorizedDomainsResponse]
  ): Unit = js.native
}

