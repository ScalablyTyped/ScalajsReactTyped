package typingsJapgolly.pulumiKubernetes.outputMod.extensions.v1beta1

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.extensionsSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED 1.9 - This group version of NetworkPolicy is deprecated by
  * networking/v1/NetworkPolicy. NetworkPolicy describes what network traffic is allowed for a
  * set of Pods
  */
trait NetworkPolicy extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: extensionsSlashv1beta1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.NetworkPolicy
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
  /**
    * Specification of the desired behavior for this NetworkPolicy.
    */
  val spec: NetworkPolicySpec
}

object NetworkPolicy {
  @scala.inline
  def apply(
    apiVersion: extensionsSlashv1beta1,
    kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.NetworkPolicy,
    metadata: ObjectMeta,
    spec: NetworkPolicySpec
  ): NetworkPolicy = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NetworkPolicy]
  }
}

