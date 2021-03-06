package typingsJapgolly.googleapis.alphaMod.computeAlpha

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Targethttpsproxies")
@js.native
class ResourceTargethttpsproxies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.targetHttpsProxies.aggregatedList
    * @desc Retrieves the list of all TargetHttpsProxy resources, regional and
    * global, available to the specified project.
    * @alias compute.targetHttpsProxies.aggregatedList
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Name of the project scoping this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def aggregatedList(): GaxiosPromise[SchemaTargetHttpsProxyAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[SchemaTargetHttpsProxyAggregatedList]): Unit = js.native
  def aggregatedList(params: ParamsResourceTargethttpsproxiesAggregatedlist): GaxiosPromise[SchemaTargetHttpsProxyAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceTargethttpsproxiesAggregatedlist,
    callback: BodyResponseCallback[SchemaTargetHttpsProxyAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsResourceTargethttpsproxiesAggregatedlist,
    options: BodyResponseCallback[SchemaTargetHttpsProxyAggregatedList],
    callback: BodyResponseCallback[SchemaTargetHttpsProxyAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsResourceTargethttpsproxiesAggregatedlist, options: MethodOptions): GaxiosPromise[SchemaTargetHttpsProxyAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceTargethttpsproxiesAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetHttpsProxyAggregatedList]
  ): Unit = js.native
  /**
    * compute.targetHttpsProxies.delete
    * @desc Deletes the specified TargetHttpsProxy resource.
    * @alias compute.targetHttpsProxies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetHttpsProxy Name of the TargetHttpsProxy resource to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: ParamsResourceTargethttpsproxiesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceTargethttpsproxiesDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceTargethttpsproxiesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceTargethttpsproxiesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceTargethttpsproxiesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.targetHttpsProxies.get
    * @desc Returns the specified TargetHttpsProxy resource. Gets a list of
    * available target HTTPS proxies by making a list() request.
    * @alias compute.targetHttpsProxies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.targetHttpsProxy Name of the TargetHttpsProxy resource to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTargetHttpsProxy] = js.native
  def get(callback: BodyResponseCallback[SchemaTargetHttpsProxy]): Unit = js.native
  def get(params: ParamsResourceTargethttpsproxiesGet): GaxiosPromise[SchemaTargetHttpsProxy] = js.native
  def get(
    params: ParamsResourceTargethttpsproxiesGet,
    callback: BodyResponseCallback[SchemaTargetHttpsProxy]
  ): Unit = js.native
  def get(
    params: ParamsResourceTargethttpsproxiesGet,
    options: BodyResponseCallback[SchemaTargetHttpsProxy],
    callback: BodyResponseCallback[SchemaTargetHttpsProxy]
  ): Unit = js.native
  def get(params: ParamsResourceTargethttpsproxiesGet, options: MethodOptions): GaxiosPromise[SchemaTargetHttpsProxy] = js.native
  def get(
    params: ParamsResourceTargethttpsproxiesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetHttpsProxy]
  ): Unit = js.native
  /**
    * compute.targetHttpsProxies.insert
    * @desc Creates a TargetHttpsProxy resource in the specified project using
    * the data included in the request.
    * @alias compute.targetHttpsProxies.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().TargetHttpsProxy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: ParamsResourceTargethttpsproxiesInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceTargethttpsproxiesInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceTargethttpsproxiesInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceTargethttpsproxiesInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceTargethttpsproxiesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.targetHttpsProxies.list
    * @desc Retrieves the list of TargetHttpsProxy resources available to the
    * specified project.
    * @alias compute.targetHttpsProxies.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaTargetHttpsProxyList] = js.native
  def list(callback: BodyResponseCallback[SchemaTargetHttpsProxyList]): Unit = js.native
  def list(params: ParamsResourceTargethttpsproxiesList): GaxiosPromise[SchemaTargetHttpsProxyList] = js.native
  def list(
    params: ParamsResourceTargethttpsproxiesList,
    callback: BodyResponseCallback[SchemaTargetHttpsProxyList]
  ): Unit = js.native
  def list(
    params: ParamsResourceTargethttpsproxiesList,
    options: BodyResponseCallback[SchemaTargetHttpsProxyList],
    callback: BodyResponseCallback[SchemaTargetHttpsProxyList]
  ): Unit = js.native
  def list(params: ParamsResourceTargethttpsproxiesList, options: MethodOptions): GaxiosPromise[SchemaTargetHttpsProxyList] = js.native
  def list(
    params: ParamsResourceTargethttpsproxiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetHttpsProxyList]
  ): Unit = js.native
  /**
    * compute.targetHttpsProxies.setQuicOverride
    * @desc Sets the QUIC override policy for TargetHttpsProxy.
    * @alias compute.targetHttpsProxies.setQuicOverride
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetHttpsProxy Name of the TargetHttpsProxy resource to set the QUIC override policy for. The name should conform to RFC1035.
    * @param {().TargetHttpsProxiesSetQuicOverrideRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setQuicOverride(): GaxiosPromise[SchemaOperation] = js.native
  def setQuicOverride(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setQuicOverride(params: ParamsResourceTargethttpsproxiesSetquicoverride): GaxiosPromise[SchemaOperation] = js.native
  def setQuicOverride(
    params: ParamsResourceTargethttpsproxiesSetquicoverride,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setQuicOverride(
    params: ParamsResourceTargethttpsproxiesSetquicoverride,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setQuicOverride(params: ParamsResourceTargethttpsproxiesSetquicoverride, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setQuicOverride(
    params: ParamsResourceTargethttpsproxiesSetquicoverride,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.targetHttpsProxies.setSslCertificates
    * @desc Replaces SslCertificates for TargetHttpsProxy.
    * @alias compute.targetHttpsProxies.setSslCertificates
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetHttpsProxy Name of the TargetHttpsProxy resource to set an SslCertificates resource for.
    * @param {().TargetHttpsProxiesSetSslCertificatesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setSslCertificates(): GaxiosPromise[SchemaOperation] = js.native
  def setSslCertificates(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setSslCertificates(params: ParamsResourceTargethttpsproxiesSetsslcertificates): GaxiosPromise[SchemaOperation] = js.native
  def setSslCertificates(
    params: ParamsResourceTargethttpsproxiesSetsslcertificates,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setSslCertificates(
    params: ParamsResourceTargethttpsproxiesSetsslcertificates,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setSslCertificates(params: ParamsResourceTargethttpsproxiesSetsslcertificates, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setSslCertificates(
    params: ParamsResourceTargethttpsproxiesSetsslcertificates,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.targetHttpsProxies.setSslPolicy
    * @desc Sets the SSL policy for TargetHttpsProxy. The SSL policy specifies
    * the server-side support for SSL features. This affects connections
    * between clients and the HTTPS proxy load balancer. They do not affect the
    * connection between the load balancer and the backends.
    * @alias compute.targetHttpsProxies.setSslPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetHttpsProxy Name of the TargetHttpsProxy resource whose SSL policy is to be set. The name must be 1-63 characters long, and comply with RFC1035.
    * @param {().SslPolicyReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setSslPolicy(): GaxiosPromise[SchemaOperation] = js.native
  def setSslPolicy(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setSslPolicy(params: ParamsResourceTargethttpsproxiesSetsslpolicy): GaxiosPromise[SchemaOperation] = js.native
  def setSslPolicy(
    params: ParamsResourceTargethttpsproxiesSetsslpolicy,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setSslPolicy(
    params: ParamsResourceTargethttpsproxiesSetsslpolicy,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setSslPolicy(params: ParamsResourceTargethttpsproxiesSetsslpolicy, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setSslPolicy(
    params: ParamsResourceTargethttpsproxiesSetsslpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.targetHttpsProxies.setUrlMap
    * @desc Changes the URL map for TargetHttpsProxy.
    * @alias compute.targetHttpsProxies.setUrlMap
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetHttpsProxy Name of the TargetHttpsProxy resource whose URL map is to be set.
    * @param {().UrlMapReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setUrlMap(): GaxiosPromise[SchemaOperation] = js.native
  def setUrlMap(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setUrlMap(params: ParamsResourceTargethttpsproxiesSeturlmap): GaxiosPromise[SchemaOperation] = js.native
  def setUrlMap(params: ParamsResourceTargethttpsproxiesSeturlmap, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setUrlMap(
    params: ParamsResourceTargethttpsproxiesSeturlmap,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setUrlMap(params: ParamsResourceTargethttpsproxiesSeturlmap, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setUrlMap(
    params: ParamsResourceTargethttpsproxiesSeturlmap,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.targetHttpsProxies.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.targetHttpsProxies.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().TestPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsResourceTargethttpsproxiesTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceTargethttpsproxiesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceTargethttpsproxiesTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceTargethttpsproxiesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceTargethttpsproxiesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
}

