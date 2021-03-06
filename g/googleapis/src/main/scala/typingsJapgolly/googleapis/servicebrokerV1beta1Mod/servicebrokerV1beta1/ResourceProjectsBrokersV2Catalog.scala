package typingsJapgolly.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/servicebroker/v1beta1", "servicebroker_v1beta1.Resource$Projects$Brokers$V2$Catalog")
@js.native
class ResourceProjectsBrokersV2Catalog protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * servicebroker.projects.brokers.v2.catalog.list
    * @desc Lists all the Services registered with this broker for consumption
    * for given service registry broker, which contains an set of services.
    * Note, that Service producer API is separate from Broker API.
    * @alias servicebroker.projects.brokers.v2.catalog.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Specifies the number of results to return per page. If there are fewer elements than the specified number, returns all elements. Optional. If unset or 0, all the results will be returned.
    * @param {string=} params.pageToken Specifies a page token to use. Set `pageToken` to a `nextPageToken` returned by a previous list request to get the next page of results.
    * @param {string} params.parent Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1ListCatalogResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ListCatalogResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsBrokersV2CatalogList): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1ListCatalogResponse] = js.native
  def list(
    params: ParamsResourceProjectsBrokersV2CatalogList,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ListCatalogResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsBrokersV2CatalogList,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ListCatalogResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ListCatalogResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsBrokersV2CatalogList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1beta1ListCatalogResponse] = js.native
  def list(
    params: ParamsResourceProjectsBrokersV2CatalogList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1beta1ListCatalogResponse]
  ): Unit = js.native
}

