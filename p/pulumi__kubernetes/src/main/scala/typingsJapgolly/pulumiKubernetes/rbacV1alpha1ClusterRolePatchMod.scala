package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ClusterRole
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1alpha1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMetaPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.rbac.v1alpha1.AggregationRulePatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.rbac.v1alpha1.PolicyRulePatch
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rbacV1alpha1ClusterRolePatchMod {
  
  @JSImport("@pulumi/kubernetes/rbac/v1alpha1/clusterRolePatch", "ClusterRolePatch")
  @js.native
  open class ClusterRolePatch protected () extends CustomResource {
    /**
      * Create a ClusterRolePatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRolePatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRolePatchArgs, opts: CustomResourceOptions) = this()
    
    /**
      * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
      */
    val aggregationRule: Output_[AggregationRulePatch] = js.native
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[rbacDotauthorizationDotk8sDotioSlashv1alpha1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[ClusterRole] = js.native
    
    /**
      * Standard object's metadata.
      */
    val metadata: Output_[ObjectMetaPatch] = js.native
    
    /**
      * Rules holds all the PolicyRules for this ClusterRole
      */
    val rules: Output_[js.Array[PolicyRulePatch]] = js.native
  }
  /* static members */
  object ClusterRolePatch {
    
    @JSImport("@pulumi/kubernetes/rbac/v1alpha1/clusterRolePatch", "ClusterRolePatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterRolePatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ClusterRolePatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ClusterRolePatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): ClusterRolePatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClusterRolePatch]
    
    /**
      * Returns true if the given object is an instance of ClusterRolePatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRolePatch.ClusterRolePatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRolePatch.ClusterRolePatch */ Boolean]
  }
  
  trait ClusterRolePatchArgs extends StObject {
    
    /**
      * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
      */
    var aggregationRule: js.UndefOr[
        Input[
          typingsJapgolly.pulumiKubernetes.typesInputMod.rbac.v1alpha1.AggregationRulePatch
        ]
      ] = js.undefined
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[rbacDotauthorizationDotk8sDotioSlashv1alpha1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[ClusterRole]] = js.undefined
    
    /**
      * Standard object's metadata.
      */
    var metadata: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]] = js.undefined
    
    /**
      * Rules holds all the PolicyRules for this ClusterRole
      */
    var rules: js.UndefOr[
        Input[
          js.Array[
            Input[typingsJapgolly.pulumiKubernetes.typesInputMod.rbac.v1alpha1.PolicyRulePatch]
          ]
        ]
      ] = js.undefined
  }
  object ClusterRolePatchArgs {
    
    inline def apply(): ClusterRolePatchArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterRolePatchArgs]
    }
    
    extension [Self <: ClusterRolePatchArgs](x: Self) {
      
      inline def setAggregationRule(
        value: Input[
              typingsJapgolly.pulumiKubernetes.typesInputMod.rbac.v1alpha1.AggregationRulePatch
            ]
      ): Self = StObject.set(x, "aggregationRule", value.asInstanceOf[js.Any])
      
      inline def setAggregationRuleUndefined: Self = StObject.set(x, "aggregationRule", js.undefined)
      
      inline def setApiVersion(value: Input[rbacDotauthorizationDotk8sDotioSlashv1alpha1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[ClusterRole]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setRules(
        value: Input[
              js.Array[
                Input[typingsJapgolly.pulumiKubernetes.typesInputMod.rbac.v1alpha1.PolicyRulePatch]
              ]
            ]
      ): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.rbac.v1alpha1.PolicyRulePatch]*): Self = StObject.set(x, "rules", js.Array(value*))
    }
  }
}
