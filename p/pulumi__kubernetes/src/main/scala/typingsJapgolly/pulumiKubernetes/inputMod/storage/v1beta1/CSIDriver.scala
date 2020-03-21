package typingsJapgolly.pulumiKubernetes.inputMod.storage.v1beta1

import typingsJapgolly.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1beta1
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CSIDriver captures information about a Container Storage Interface (CSI) volume driver
  * deployed on the cluster. CSI drivers do not need to create the CSIDriver object directly.
  * Instead they may use the cluster-driver-registrar sidecar container. When deployed with a CSI
  * driver it automatically creates a CSIDriver object representing the driver. Kubernetes attach
  * detach controller uses this object to determine whether attach is required. Kubelet uses this
  * object to determine whether pod information needs to be passed on mount. CSIDriver objects
  * are non-namespaced.
  */
trait CSIDriver extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[storageDotk8sDotioSlashv1beta1]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.CSIDriver]] = js.undefined
  /**
    * Standard object metadata. metadata.Name indicates the name of the CSI driver that this
    * object refers to; it MUST be the same name returned by the CSI GetPluginName() call for
    * that driver. The driver name must be 63 characters or less, beginning and ending with an
    * alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and alphanumerics between.
    * More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * Specification of the CSI Driver.
    */
  var spec: Input[CSIDriverSpec]
}

object CSIDriver {
  @scala.inline
  def apply(
    spec: Input[CSIDriverSpec],
    apiVersion: Input[storageDotk8sDotioSlashv1beta1] = null,
    kind: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.CSIDriver] = null,
    metadata: Input[ObjectMeta] = null
  ): CSIDriver = {
    val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSIDriver]
  }
}

