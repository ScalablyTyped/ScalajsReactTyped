package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1alpha1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import typingsJapgolly.pulumiKubernetes.typesOutputMod.rbac.v1alpha1.ClusterRoleBinding
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rbacV1alpha1ClusterRoleBindingListMod {
  
  @JSImport("@pulumi/kubernetes/rbac/v1alpha1/clusterRoleBindingList", "ClusterRoleBindingList")
  @js.native
  open class ClusterRoleBindingList protected () extends CustomResource {
    /**
      * Create a ClusterRoleBindingList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRoleBindingListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRoleBindingListArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[rbacDotauthorizationDotk8sDotioSlashv1alpha1] = js.native
    
    /**
      * Items is a list of ClusterRoleBindings
      */
    val items: Output_[js.Array[ClusterRoleBinding]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleBindingList] = js.native
    
    /**
      * Standard object's metadata.
      */
    val metadata: Output_[ListMeta] = js.native
  }
  /* static members */
  object ClusterRoleBindingList {
    
    @JSImport("@pulumi/kubernetes/rbac/v1alpha1/clusterRoleBindingList", "ClusterRoleBindingList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterRoleBindingList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ClusterRoleBindingList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ClusterRoleBindingList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): ClusterRoleBindingList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClusterRoleBindingList]
    
    /**
      * Returns true if the given object is an instance of ClusterRoleBindingList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRoleBindingList.ClusterRoleBindingList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRoleBindingList.ClusterRoleBindingList */ Boolean]
  }
  
  trait ClusterRoleBindingListArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[rbacDotauthorizationDotk8sDotioSlashv1alpha1]] = js.undefined
    
    /**
      * Items is a list of ClusterRoleBindings
      */
    var items: Input[
        js.Array[
          Input[typingsJapgolly.pulumiKubernetes.typesInputMod.rbac.v1alpha1.ClusterRoleBinding]
        ]
      ]
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[
        Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleBindingList]
      ] = js.undefined
    
    /**
      * Standard object's metadata.
      */
    var metadata: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ListMeta]] = js.undefined
  }
  object ClusterRoleBindingListArgs {
    
    inline def apply(
      items: Input[
          js.Array[
            Input[typingsJapgolly.pulumiKubernetes.typesInputMod.rbac.v1alpha1.ClusterRoleBinding]
          ]
        ]
    ): ClusterRoleBindingListArgs = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterRoleBindingListArgs]
    }
    
    extension [Self <: ClusterRoleBindingListArgs](x: Self) {
      
      inline def setApiVersion(value: Input[rbacDotauthorizationDotk8sDotioSlashv1alpha1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setItems(
        value: Input[
              js.Array[
                Input[typingsJapgolly.pulumiKubernetes.typesInputMod.rbac.v1alpha1.ClusterRoleBinding]
              ]
            ]
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.rbac.v1alpha1.ClusterRoleBinding]*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setKind(value: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleBindingList]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ListMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
}
