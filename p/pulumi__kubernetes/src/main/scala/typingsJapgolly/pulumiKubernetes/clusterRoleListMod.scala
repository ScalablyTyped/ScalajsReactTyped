package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typingsJapgolly.pulumiKubernetes.outputMod.rbac.v1alpha1.ClusterRole
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1alpha1
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/rbac/v1alpha1/ClusterRoleList", JSImport.Namespace)
@js.native
object clusterRoleListMod extends js.Object {
  @js.native
  class ClusterRoleList protected () extends CustomResource {
    /**
      * Create a rbac.v1alpha1.ClusterRoleList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsJapgolly.pulumiKubernetes.inputMod.rbac.v1alpha1.ClusterRoleList) = this()
    def this(
      name: String,
      args: typingsJapgolly.pulumiKubernetes.inputMod.rbac.v1alpha1.ClusterRoleList,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[rbacDotauthorizationDotk8sDotioSlashv1alpha1] = js.native
    /**
      * Items is a list of ClusterRoles
      */
    val items: Output_[js.Array[ClusterRole]] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleList] = js.native
    /**
      * Standard object's metadata.
      */
    val metadata: Output_[ListMeta] = js.native
  }
  
  /* static members */
  @js.native
  object ClusterRoleList extends js.Object {
    /**
      * Get the state of an existing `ClusterRoleList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): ClusterRoleList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): ClusterRoleList = js.native
    /**
      * Returns true if the given object is an instance of ClusterRoleList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/ClusterRoleList.ClusterRoleList */ Boolean = js.native
  }
  
}

