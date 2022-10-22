package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.nodeDotk8sDotioSlashv1alpha1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import typingsJapgolly.pulumiKubernetes.typesOutputMod.node.v1alpha1.RuntimeClass
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeV1alpha1RuntimeClassListMod {
  
  @JSImport("@pulumi/kubernetes/node/v1alpha1/runtimeClassList", "RuntimeClassList")
  @js.native
  open class RuntimeClassList protected () extends CustomResource {
    /**
      * Create a RuntimeClassList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RuntimeClassListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: RuntimeClassListArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[nodeDotk8sDotioSlashv1alpha1] = js.native
    
    /**
      * Items is a list of schema objects.
      */
    val items: Output_[js.Array[RuntimeClass]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClassList] = js.native
    
    /**
      * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ListMeta] = js.native
  }
  /* static members */
  object RuntimeClassList {
    
    @JSImport("@pulumi/kubernetes/node/v1alpha1/runtimeClassList", "RuntimeClassList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RuntimeClassList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): RuntimeClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RuntimeClassList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): RuntimeClassList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RuntimeClassList]
    
    /**
      * Returns true if the given object is an instance of RuntimeClassList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1alpha1/runtimeClassList.RuntimeClassList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1alpha1/runtimeClassList.RuntimeClassList */ Boolean]
  }
  
  trait RuntimeClassListArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[nodeDotk8sDotioSlashv1alpha1]] = js.undefined
    
    /**
      * Items is a list of schema objects.
      */
    var items: Input[
        js.Array[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.node.v1alpha1.RuntimeClass]]
      ]
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClassList]] = js.undefined
    
    /**
      * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ListMeta]] = js.undefined
  }
  object RuntimeClassListArgs {
    
    inline def apply(
      items: Input[
          js.Array[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.node.v1alpha1.RuntimeClass]]
        ]
    ): RuntimeClassListArgs = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeClassListArgs]
    }
    
    extension [Self <: RuntimeClassListArgs](x: Self) {
      
      inline def setApiVersion(value: Input[nodeDotk8sDotioSlashv1alpha1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setItems(
        value: Input[
              js.Array[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.node.v1alpha1.RuntimeClass]]
            ]
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.node.v1alpha1.RuntimeClass]*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setKind(value: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClassList]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ListMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
}
