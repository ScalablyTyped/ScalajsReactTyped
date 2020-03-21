package typingsJapgolly.googleapis.v1managementMod.gamesManagementV1management

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Resource$Applications")
@js.native
class ResourceApplications protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gamesManagement.applications.listHidden
    * @desc Get the list of players hidden from the given application. This
    * method is only available to user accounts for your developer console.
    * @alias gamesManagement.applications.listHidden
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.applicationId The application ID from the Google Play developer console.
    * @param {integer=} params.maxResults The maximum number of player resources to return in the response, used for paging. For any response, the actual number of player resources returned may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listHidden(): GaxiosPromise[SchemaHiddenPlayerList] = js.native
  def listHidden(callback: BodyResponseCallback[SchemaHiddenPlayerList]): Unit = js.native
  def listHidden(params: ParamsResourceApplicationsListhidden): GaxiosPromise[SchemaHiddenPlayerList] = js.native
  def listHidden(
    params: ParamsResourceApplicationsListhidden,
    callback: BodyResponseCallback[SchemaHiddenPlayerList]
  ): Unit = js.native
  def listHidden(
    params: ParamsResourceApplicationsListhidden,
    options: BodyResponseCallback[SchemaHiddenPlayerList],
    callback: BodyResponseCallback[SchemaHiddenPlayerList]
  ): Unit = js.native
  def listHidden(params: ParamsResourceApplicationsListhidden, options: MethodOptions): GaxiosPromise[SchemaHiddenPlayerList] = js.native
  def listHidden(
    params: ParamsResourceApplicationsListhidden,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHiddenPlayerList]
  ): Unit = js.native
}

