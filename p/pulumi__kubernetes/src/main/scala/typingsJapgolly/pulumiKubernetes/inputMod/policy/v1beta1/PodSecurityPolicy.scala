package typingsJapgolly.pulumiKubernetes.inputMod.policy.v1beta1

import typingsJapgolly.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.policySlashv1beta1
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodSecurityPolicy governs the ability to make requests that affect the Security Context that
  * will be applied to a pod and container.
  */
trait PodSecurityPolicy extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[policySlashv1beta1]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[
    Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PodSecurityPolicy]
  ] = js.undefined
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * spec defines the policy enforced.
    */
  var spec: js.UndefOr[Input[PodSecurityPolicySpec]] = js.undefined
}

object PodSecurityPolicy {
  @scala.inline
  def apply(
    apiVersion: Input[policySlashv1beta1] = null,
    kind: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PodSecurityPolicy] = null,
    metadata: Input[ObjectMeta] = null,
    spec: Input[PodSecurityPolicySpec] = null
  ): PodSecurityPolicy = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodSecurityPolicy]
  }
}

