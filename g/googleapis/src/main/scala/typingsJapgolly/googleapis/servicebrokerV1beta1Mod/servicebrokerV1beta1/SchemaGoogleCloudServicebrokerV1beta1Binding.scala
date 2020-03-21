package typingsJapgolly.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the binding.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1beta1Binding extends js.Object {
  /**
    * A JSON object that contains data for platform resources associated with
    * the binding to be created.
    */
  var bind_resource: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The id of the binding. Must be unique within GCP project. Maximum length
    * is 64, GUID recommended. Required.
    */
  var binding_id: js.UndefOr[String] = js.native
  /**
    * Output only. Timestamp for when the binding was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. String containing the Deployment Manager deployment name
    * that was created for this binding,
    */
  var deploymentName: js.UndefOr[String] = js.native
  /**
    * Configuration options for the service binding.
    */
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The ID of the plan. See `Service` and `Plan` resources for details.
    * Maximum length is 64, GUID recommended. Required.
    */
  var plan_id: js.UndefOr[String] = js.native
  /**
    * Output only. The resource name of the binding, e.g.
    * projects/project_id/brokers/broker_id/service_instances/instance_id/bindings/binding_id.
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * The id of the service. Must be a valid identifier of a service contained
    * in the list from a `ListServices()` call. Maximum length is 64, GUID
    * recommended. Required.
    */
  var service_id: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudServicebrokerV1beta1Binding {
  @scala.inline
  def apply(
    bind_resource: StringDictionary[js.Any] = null,
    binding_id: String = null,
    createTime: String = null,
    deploymentName: String = null,
    parameters: StringDictionary[js.Any] = null,
    plan_id: String = null,
    resourceName: String = null,
    service_id: String = null
  ): SchemaGoogleCloudServicebrokerV1beta1Binding = {
    val __obj = js.Dynamic.literal()
    if (bind_resource != null) __obj.updateDynamic("bind_resource")(bind_resource.asInstanceOf[js.Any])
    if (binding_id != null) __obj.updateDynamic("binding_id")(binding_id.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (deploymentName != null) __obj.updateDynamic("deploymentName")(deploymentName.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (plan_id != null) __obj.updateDynamic("plan_id")(plan_id.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    if (service_id != null) __obj.updateDynamic("service_id")(service_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1beta1Binding]
  }
}

