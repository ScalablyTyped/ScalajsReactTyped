package typingsJapgolly.pulumiKubernetes.outputMod.core.v1

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EndpointsList is a list of endpoints.
  */
trait EndpointsList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.v1
  /**
    * List of endpoints.
    */
  val items: js.Array[Endpoints]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.EndpointsList
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val metadata: ListMeta
}

object EndpointsList {
  @scala.inline
  def apply(
    apiVersion: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.v1,
    items: js.Array[Endpoints],
    kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.EndpointsList,
    metadata: ListMeta
  ): EndpointsList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EndpointsList]
  }
}

