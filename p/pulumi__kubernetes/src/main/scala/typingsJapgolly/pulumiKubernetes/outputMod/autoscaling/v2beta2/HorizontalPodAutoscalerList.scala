package typingsJapgolly.pulumiKubernetes.outputMod.autoscaling.v2beta2

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.autoscalingSlashv2beta2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HorizontalPodAutoscalerList is a list of horizontal pod autoscaler objects.
  */
trait HorizontalPodAutoscalerList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: autoscalingSlashv2beta2
  /**
    * items is the list of horizontal pod autoscaler objects.
    */
  val items: js.Array[HorizontalPodAutoscaler]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.HorizontalPodAutoscalerList
  /**
    * metadata is the standard list metadata.
    */
  val metadata: ListMeta
}

object HorizontalPodAutoscalerList {
  @scala.inline
  def apply(
    apiVersion: autoscalingSlashv2beta2,
    items: js.Array[HorizontalPodAutoscaler],
    kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.HorizontalPodAutoscalerList,
    metadata: ListMeta
  ): HorizontalPodAutoscalerList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HorizontalPodAutoscalerList]
  }
}

