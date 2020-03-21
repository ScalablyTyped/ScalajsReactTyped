package typingsJapgolly.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudprivatecatalog/v1beta1", "cloudprivatecatalog_v1beta1.Resource$Folders$Versions")
@js.native
class ResourceFoldersVersions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudprivatecatalog.folders.versions.search
    * @desc Search Version resources that consumers have access to, within the
    * scope of the consumer cloud resource hierarchy context.
    * @alias cloudprivatecatalog.folders.versions.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of entries that are requested.
    * @param {string=} params.pageToken A pagination token returned from a previous call to SearchVersions that indicates where this listing should continue from. This field is optional.
    * @param {string=} params.query The query to filter the versions. Required.  The supported queries are: * List versions under a product: `parent=catalogs/{catalog_id}/products/{product_id}` * Get a version by name: `name=catalogs/{catalog_id}/products/{product_id}/versions/{version_id}`
    * @param {string} params.resource_ Required. The name of the resource context. See SearchCatalogsRequest.resource for details.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse]): Unit = js.native
  def search(params: ParamsResourceFoldersVersionsSearch): GaxiosPromise[SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse] = js.native
  def search(
    params: ParamsResourceFoldersVersionsSearch,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceFoldersVersionsSearch,
    options: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse]
  ): Unit = js.native
  def search(params: ParamsResourceFoldersVersionsSearch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse] = js.native
  def search(
    params: ParamsResourceFoldersVersionsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse]
  ): Unit = js.native
}

