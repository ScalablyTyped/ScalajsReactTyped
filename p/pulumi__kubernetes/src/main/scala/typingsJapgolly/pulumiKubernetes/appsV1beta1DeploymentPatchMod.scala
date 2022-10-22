package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.Deployment
import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.appsSlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.apps.v1beta1.DeploymentSpecPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.apps.v1beta1.DeploymentStatusPatch
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMetaPatch
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appsV1beta1DeploymentPatchMod {
  
  @JSImport("@pulumi/kubernetes/apps/v1beta1/deploymentPatch", "DeploymentPatch")
  @js.native
  open class DeploymentPatch protected () extends CustomResource {
    /**
      * Create a DeploymentPatch resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated apps/v1beta1/Deployment is deprecated by apps/v1/Deployment and not supported by Kubernetes v1.16+ clusters. */
    def this(name: String) = this()
    def this(name: String, args: DeploymentPatchArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: DeploymentPatchArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[appsSlashv1beta1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[Deployment] = js.native
    
    /**
      * Standard object metadata.
      */
    val metadata: Output_[ObjectMetaPatch] = js.native
    
    /**
      * Specification of the desired behavior of the Deployment.
      */
    val spec: Output_[DeploymentSpecPatch] = js.native
    
    /**
      * Most recently observed status of the Deployment.
      */
    val status: Output_[DeploymentStatusPatch] = js.native
  }
  /* static members */
  object DeploymentPatch {
    
    @JSImport("@pulumi/kubernetes/apps/v1beta1/deploymentPatch", "DeploymentPatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DeploymentPatch resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): DeploymentPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[DeploymentPatch]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): DeploymentPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DeploymentPatch]
    
    /**
      * Returns true if the given object is an instance of DeploymentPatch.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/deploymentPatch.DeploymentPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/deploymentPatch.DeploymentPatch */ Boolean]
  }
  
  trait DeploymentPatchArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[appsSlashv1beta1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[Deployment]] = js.undefined
    
    /**
      * Standard object metadata.
      */
    var metadata: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]] = js.undefined
    
    /**
      * Specification of the desired behavior of the Deployment.
      */
    var spec: js.UndefOr[
        Input[typingsJapgolly.pulumiKubernetes.typesInputMod.apps.v1beta1.DeploymentSpecPatch]
      ] = js.undefined
  }
  object DeploymentPatchArgs {
    
    inline def apply(): DeploymentPatchArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentPatchArgs]
    }
    
    extension [Self <: DeploymentPatchArgs](x: Self) {
      
      inline def setApiVersion(value: Input[appsSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[Deployment]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMetaPatch]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setSpec(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.apps.v1beta1.DeploymentSpecPatch]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    }
  }
}
