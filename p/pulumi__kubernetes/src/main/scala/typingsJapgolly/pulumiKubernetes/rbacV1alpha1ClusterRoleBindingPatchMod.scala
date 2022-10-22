package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleBinding
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1alpha1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMetaPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.rbac.v1alpha1.RoleRefPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.rbac.v1alpha1.SubjectPatch
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rbacV1alpha1ClusterRoleBindingPatchMod {
  
  @JSImport("@pulumi/kubernetes/rbac/v1alpha1/clusterRoleBindingPatch", "ClusterRoleBindingPatch")
  @js.native
  open class ClusterRoleBindingPatch protected () extends CustomResource {
    /**
      * Create a ClusterRoleBindingPatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRoleBindingPatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRoleBindingPatchArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[rbacDotauthorizationDotk8sDotioSlashv1alpha1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[ClusterRoleBinding] = js.native
    
    /**
      * Standard object's metadata.
      */
    val metadata: Output_[ObjectMetaPatch] = js.native
    
    /**
      * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
      */
    val roleRef: Output_[RoleRefPatch] = js.native
    
    /**
      * Subjects holds references to the objects the role applies to.
      */
    val subjects: Output_[js.Array[SubjectPatch]] = js.native
  }
  /* static members */
  object ClusterRoleBindingPatch {
    
    @JSImport("@pulumi/kubernetes/rbac/v1alpha1/clusterRoleBindingPatch", "ClusterRoleBindingPatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterRoleBindingPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ClusterRoleBindingPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ClusterRoleBindingPatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): ClusterRoleBindingPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClusterRoleBindingPatch]
    
    /**
      * Returns true if the given object is an instance of ClusterRoleBindingPatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRoleBindingPatch.ClusterRoleBindingPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRoleBindingPatch.ClusterRoleBindingPatch */ Boolean]
  }
  
  trait ClusterRoleBindingPatchArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[rbacDotauthorizationDotk8sDotioSlashv1alpha1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[ClusterRoleBinding]] = js.undefined
    
    /**
      * Standard object's metadata.
      */
    var metadata: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]] = js.undefined
    
    /**
      * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
      */
    var roleRef: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.rbac.v1alpha1.RoleRefPatch]] = js.undefined
    
    /**
      * Subjects holds references to the objects the role applies to.
      */
    var subjects: js.UndefOr[
        Input[
          js.Array[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.rbac.v1alpha1.SubjectPatch]]
        ]
      ] = js.undefined
  }
  object ClusterRoleBindingPatchArgs {
    
    inline def apply(): ClusterRoleBindingPatchArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterRoleBindingPatchArgs]
    }
    
    extension [Self <: ClusterRoleBindingPatchArgs](x: Self) {
      
      inline def setApiVersion(value: Input[rbacDotauthorizationDotk8sDotioSlashv1alpha1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[ClusterRoleBinding]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setRoleRef(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.rbac.v1alpha1.RoleRefPatch]): Self = StObject.set(x, "roleRef", value.asInstanceOf[js.Any])
      
      inline def setRoleRefUndefined: Self = StObject.set(x, "roleRef", js.undefined)
      
      inline def setSubjects(
        value: Input[
              js.Array[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.rbac.v1alpha1.SubjectPatch]]
            ]
      ): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
      
      inline def setSubjectsUndefined: Self = StObject.set(x, "subjects", js.undefined)
      
      inline def setSubjectsVarargs(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.rbac.v1alpha1.SubjectPatch]*): Self = StObject.set(x, "subjects", js.Array(value*))
    }
  }
}
