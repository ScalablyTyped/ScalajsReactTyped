package typingsJapgolly.pulumiKubernetes.inputMod.apps.v1beta2

import typingsJapgolly.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Scale represents a scaling request for a resource.
  */
trait Scale extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[String]] = js.undefined
  /**
    * Standard object metadata; More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * defines the behavior of the scale. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
    */
  var spec: js.UndefOr[Input[ScaleSpec]] = js.undefined
}

object Scale {
  @scala.inline
  def apply(
    apiVersion: Input[String] = null,
    kind: Input[String] = null,
    metadata: Input[ObjectMeta] = null,
    spec: Input[ScaleSpec] = null
  ): Scale = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
}

