package typingsJapgolly.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/servicebroker/v1alpha1", "servicebroker_v1alpha1.Resource$Projects$Brokers$Instances")
@js.native
class ResourceProjectsBrokersInstances protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var service_bindings: ResourceProjectsBrokersInstancesServiceBindings = js.native
  /**
    * servicebroker.projects.brokers.instances.get
    * @desc Gets the given service instance from the system. This API is an
    * extension and not part of the OSB spec. Hence the path is a standard
    * Google API URL.
    * @alias servicebroker.projects.brokers.instances.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the instance to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance]): Unit = js.native
  def get(params: ParamsResourceProjectsBrokersInstancesGet): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance] = js.native
  def get(
    params: ParamsResourceProjectsBrokersInstancesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsBrokersInstancesGet,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsBrokersInstancesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance] = js.native
  def get(
    params: ParamsResourceProjectsBrokersInstancesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance]
  ): Unit = js.native
}

