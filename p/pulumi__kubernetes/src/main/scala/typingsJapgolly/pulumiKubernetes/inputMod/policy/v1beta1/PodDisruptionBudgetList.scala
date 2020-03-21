package typingsJapgolly.pulumiKubernetes.inputMod.policy.v1beta1

import typingsJapgolly.pulumiKubernetes.inputMod.meta.v1.ListMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.policySlashv1beta1
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodDisruptionBudgetList is a collection of PodDisruptionBudgets.
  */
trait PodDisruptionBudgetList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[policySlashv1beta1]] = js.undefined
  var items: Input[js.Array[Input[PodDisruptionBudget]]]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[
    Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PodDisruptionBudgetList]
  ] = js.undefined
  var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
}

object PodDisruptionBudgetList {
  @scala.inline
  def apply(
    items: Input[js.Array[Input[PodDisruptionBudget]]],
    apiVersion: Input[policySlashv1beta1] = null,
    kind: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.PodDisruptionBudgetList] = null,
    metadata: Input[ListMeta] = null
  ): PodDisruptionBudgetList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodDisruptionBudgetList]
  }
}

