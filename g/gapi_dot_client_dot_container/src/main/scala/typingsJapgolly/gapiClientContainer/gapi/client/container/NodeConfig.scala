package typingsJapgolly.gapiClientContainer.gapi.client.container

import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeConfig extends js.Object {
  /**
    * A list of hardware accelerators to be attached to each node.
    * See https://cloud.google.com/compute/docs/gpus for more information about
    * support for GPUs.
    */
  var accelerators: js.UndefOr[js.Array[AcceleratorConfig]] = js.undefined
  /**
    * Size of the disk attached to each node, specified in GB.
    * The smallest allowed disk size is 10GB.
    *
    * If unspecified, the default disk size is 100GB.
    */
  var diskSizeGb: js.UndefOr[Double] = js.undefined
  /**
    * The image type to use for this node. Note that for a given image type,
    * the latest version of it will be used.
    */
  var imageType: js.UndefOr[String] = js.undefined
  /**
    * The map of Kubernetes labels (key/value pairs) to be applied to each node.
    * These will added in addition to any default label(s) that
    * Kubernetes may apply to the node.
    * In case of conflict in label keys, the applied set may differ depending on
    * the Kubernetes version -- it's best to assume the behavior is undefined
    * and conflicts should be avoided.
    * For more information, including usage and the valid values, see:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
    */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * The number of local SSD disks to be attached to the node.
    *
    * The limit for this value is dependant upon the maximum number of
    * disks available on a machine per zone. See:
    * https://cloud.google.com/compute/docs/disks/local-ssd#local_ssd_limits
    * for more information.
    */
  var localSsdCount: js.UndefOr[Double] = js.undefined
  /**
    * The name of a Google Compute Engine [machine
    * type](/compute/docs/machine-types) (e.g.
    * `n1-standard-1`).
    *
    * If unspecified, the default machine type is
    * `n1-standard-1`.
    */
  var machineType: js.UndefOr[String] = js.undefined
  /**
    * The metadata key/value pairs assigned to instances in the cluster.
    *
    * Keys must conform to the regexp [a-zA-Z0-9-_]+ and be less than 128 bytes
    * in length. These are reflected as part of a URL in the metadata server.
    * Additionally, to avoid ambiguity, keys must not conflict with any other
    * metadata keys for the project or be one of the four reserved keys:
    * "instance-template", "kube-env", "startup-script", and "user-data"
    *
    * Values are free-form strings, and only have meaning as interpreted by
    * the image running in the instance. The only restriction placed on them is
    * that each value's size must be less than or equal to 32 KB.
    *
    * The total size of all keys and values must be less than 512 KB.
    */
  var metadata: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * Minimum CPU platform to be used by this instance. The instance may be
    * scheduled on the specified or newer CPU platform. Applicable values are the
    * friendly names of CPU platforms, such as
    * <code>minCpuPlatform: &quot;Intel Haswell&quot;</code> or
    * <code>minCpuPlatform: &quot;Intel Sandy Bridge&quot;</code>. For more
    * information, read [how to specify min CPU platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
    */
  var minCpuPlatform: js.UndefOr[String] = js.undefined
  /**
    * The set of Google API scopes to be made available on all of the
    * node VMs under the "default" service account.
    *
    * The following scopes are recommended, but not required, and by default are
    * not included:
    *
    * &#42; `https://www.googleapis.com/auth/compute` is required for mounting
    * persistent storage on your nodes.
    * &#42; `https://www.googleapis.com/auth/devstorage.read_only` is required for
    * communicating with &#42;&#42;gcr.io&#42;&#42;
    * (the [Google Container Registry](/container-registry/)).
    *
    * If unspecified, no scopes are added, unless Cloud Logging or Cloud
    * Monitoring are enabled, in which case their required scopes will be added.
    */
  var oauthScopes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Whether the nodes are created as preemptible VM instances. See:
    * https://cloud.google.com/compute/docs/instances/preemptible for more
    * information about preemptible VM instances.
    */
  var preemptible: js.UndefOr[Boolean] = js.undefined
  /**
    * The Google Cloud Platform Service Account to be used by the node VMs. If
    * no Service Account is specified, the "default" service account is used.
    */
  var serviceAccount: js.UndefOr[String] = js.undefined
  /**
    * The list of instance tags applied to all nodes. Tags are used to identify
    * valid sources or targets for network firewalls and are specified by
    * the client during cluster or node pool creation. Each tag within the list
    * must comply with RFC1035.
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object NodeConfig {
  @scala.inline
  def apply(
    accelerators: js.Array[AcceleratorConfig] = null,
    diskSizeGb: Int | Double = null,
    imageType: String = null,
    labels: Record[String, String] = null,
    localSsdCount: Int | Double = null,
    machineType: String = null,
    metadata: Record[String, String] = null,
    minCpuPlatform: String = null,
    oauthScopes: js.Array[String] = null,
    preemptible: js.UndefOr[Boolean] = js.undefined,
    serviceAccount: String = null,
    tags: js.Array[String] = null
  ): NodeConfig = {
    val __obj = js.Dynamic.literal()
    if (accelerators != null) __obj.updateDynamic("accelerators")(accelerators.asInstanceOf[js.Any])
    if (diskSizeGb != null) __obj.updateDynamic("diskSizeGb")(diskSizeGb.asInstanceOf[js.Any])
    if (imageType != null) __obj.updateDynamic("imageType")(imageType.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (localSsdCount != null) __obj.updateDynamic("localSsdCount")(localSsdCount.asInstanceOf[js.Any])
    if (machineType != null) __obj.updateDynamic("machineType")(machineType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (minCpuPlatform != null) __obj.updateDynamic("minCpuPlatform")(minCpuPlatform.asInstanceOf[js.Any])
    if (oauthScopes != null) __obj.updateDynamic("oauthScopes")(oauthScopes.asInstanceOf[js.Any])
    if (!js.isUndefined(preemptible)) __obj.updateDynamic("preemptible")(preemptible.asInstanceOf[js.Any])
    if (serviceAccount != null) __obj.updateDynamic("serviceAccount")(serviceAccount.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeConfig]
  }
}

