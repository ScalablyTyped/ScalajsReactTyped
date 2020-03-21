package typingsJapgolly.pulumiKubernetes.customResourceMod

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/apiextensions/CustomResource", "CustomResource")
@js.native
class CustomResource protected ()
  extends typingsJapgolly.pulumiPulumi.mod.CustomResource {
  /**
    * Create a CustomResource resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: CustomResourceArgs) = this()
  def this(name: String, args: CustomResourceArgs, opts: CustomResourceOptions) = this()
  val __inputs: js.Any = js.native
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: Output_[String] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: Output_[String] = js.native
  /**
    * Standard object metadata; More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
    */
  val metadata: Output_[ObjectMeta] = js.native
  def getInputs(): CustomResourceArgs = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/apiextensions/CustomResource", "CustomResource")
@js.native
object CustomResource extends js.Object {
  /**
    * Get the state of an existing `CustomResource`, as identified by `id`.
    * Typically this ID  is of the form [namespace]/[name]; if [namespace] is omitted, then (per
    * Kubernetes convention) the ID becomes default/[name].
    *
    * Pulumi will keep track of this resource using `name` as the Pulumi ID.
    *
    * @param name _Unique_ name used to register this resource with Pulumi.
    * @param opts Uniquely specifies a CustomResource to select.
    */
  def get(name: String, opts: CustomResourceGetOptions): CustomResource = js.native
}

