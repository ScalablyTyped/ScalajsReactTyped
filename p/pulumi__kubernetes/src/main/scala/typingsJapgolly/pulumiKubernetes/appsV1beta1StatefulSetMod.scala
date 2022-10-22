package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.appsSlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.apps.v1beta1.StatefulSetSpec
import typingsJapgolly.pulumiKubernetes.typesOutputMod.apps.v1beta1.StatefulSetStatus
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appsV1beta1StatefulSetMod {
  
  @JSImport("@pulumi/kubernetes/apps/v1beta1/statefulSet", "StatefulSet")
  @js.native
  open class StatefulSet protected () extends CustomResource {
    /**
      * Create a StatefulSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated apps/v1beta1/StatefulSet is deprecated by apps/v1/StatefulSet and not supported by Kubernetes v1.16+ clusters. */
    def this(name: String) = this()
    def this(name: String, args: StatefulSetArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: StatefulSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[appsSlashv1beta1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.StatefulSet] = js.native
    
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * Spec defines the desired identities of pods in this set.
      */
    val spec: Output_[StatefulSetSpec] = js.native
    
    /**
      * Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time.
      */
    val status: Output_[StatefulSetStatus] = js.native
  }
  /* static members */
  object StatefulSet {
    
    @JSImport("@pulumi/kubernetes/apps/v1beta1/statefulSet", "StatefulSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing StatefulSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): StatefulSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[StatefulSet]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): StatefulSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[StatefulSet]
    
    /**
      * Returns true if the given object is an instance of StatefulSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/statefulSet.StatefulSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/statefulSet.StatefulSet */ Boolean]
  }
  
  trait StatefulSetArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[appsSlashv1beta1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.StatefulSet]] = js.undefined
    
    var metadata: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMeta]] = js.undefined
    
    /**
      * Spec defines the desired identities of pods in this set.
      */
    var spec: js.UndefOr[
        Input[typingsJapgolly.pulumiKubernetes.typesInputMod.apps.v1beta1.StatefulSetSpec]
      ] = js.undefined
  }
  object StatefulSetArgs {
    
    inline def apply(): StatefulSetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulSetArgs]
    }
    
    extension [Self <: StatefulSetArgs](x: Self) {
      
      inline def setApiVersion(value: Input[appsSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.StatefulSet]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setSpec(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.apps.v1beta1.StatefulSetSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    }
  }
}
