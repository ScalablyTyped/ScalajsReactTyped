package typingsJapgolly.googleapis.runV1alpha1Mod.runV1alpha1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/run/v1alpha1", "run_v1alpha1.Resource$Projects$Locations$Authorizeddomains")
@js.native
class ResourceProjectsLocationsAuthorizeddomains protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * run.projects.locations.authorizeddomains.list
    * @desc RPC to list authorized domains.
    * @alias run.projects.locations.authorizeddomains.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Maximum results to return per page.
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent Name of the parent Application resource. Example: `apps/myapp`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListAuthorizedDomainsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAuthorizedDomainsResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsAuthorizeddomainsList): GaxiosPromise[SchemaListAuthorizedDomainsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAuthorizeddomainsList,
    callback: BodyResponseCallback[SchemaListAuthorizedDomainsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAuthorizeddomainsList,
    options: BodyResponseCallback[SchemaListAuthorizedDomainsResponse],
    callback: BodyResponseCallback[SchemaListAuthorizedDomainsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsAuthorizeddomainsList, options: MethodOptions): GaxiosPromise[SchemaListAuthorizedDomainsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAuthorizeddomainsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAuthorizedDomainsResponse]
  ): Unit = js.native
}

