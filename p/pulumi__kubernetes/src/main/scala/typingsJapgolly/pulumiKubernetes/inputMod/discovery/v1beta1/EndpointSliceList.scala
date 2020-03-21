package typingsJapgolly.pulumiKubernetes.inputMod.discovery.v1beta1

import typingsJapgolly.pulumiKubernetes.inputMod.meta.v1.ListMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.discoveryDotk8sDotioSlashv1beta1
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EndpointSliceList represents a list of endpoint slices
  */
trait EndpointSliceList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[discoveryDotk8sDotioSlashv1beta1]] = js.undefined
  /**
    * List of endpoint slices
    */
  var items: Input[js.Array[Input[EndpointSlice]]]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[
    Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.EndpointSliceList]
  ] = js.undefined
  /**
    * Standard list metadata.
    */
  var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
}

object EndpointSliceList {
  @scala.inline
  def apply(
    items: Input[js.Array[Input[EndpointSlice]]],
    apiVersion: Input[discoveryDotk8sDotioSlashv1beta1] = null,
    kind: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.EndpointSliceList] = null,
    metadata: Input[ListMeta] = null
  ): EndpointSliceList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointSliceList]
  }
}

