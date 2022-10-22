package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.apiregistrationDotk8sDotioSlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.apiregistration.v1beta1.APIServiceSpec
import typingsJapgolly.pulumiKubernetes.typesOutputMod.apiregistration.v1beta1.APIServiceStatus
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiregistrationV1beta1ApiserviceMod {
  
  @JSImport("@pulumi/kubernetes/apiregistration/v1beta1/apiservice", "APIService")
  @js.native
  open class APIService protected () extends CustomResource {
    /**
      * Create a APIService resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: APIServiceArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: APIServiceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[apiregistrationDotk8sDotioSlashv1beta1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.APIService] = js.native
    
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * Spec contains information for locating and communicating with a server
      */
    val spec: Output_[APIServiceSpec] = js.native
    
    /**
      * Status contains derived information about an API server
      */
    val status: Output_[APIServiceStatus] = js.native
  }
  /* static members */
  object APIService {
    
    @JSImport("@pulumi/kubernetes/apiregistration/v1beta1/apiservice", "APIService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing APIService resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): APIService = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[APIService]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): APIService = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[APIService]
    
    /**
      * Returns true if the given object is an instance of APIService.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1beta1/apiservice.APIService */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1beta1/apiservice.APIService */ Boolean]
  }
  
  trait APIServiceArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[apiregistrationDotk8sDotioSlashv1beta1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.APIService]] = js.undefined
    
    var metadata: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMeta]] = js.undefined
    
    /**
      * Spec contains information for locating and communicating with a server
      */
    var spec: js.UndefOr[
        Input[
          typingsJapgolly.pulumiKubernetes.typesInputMod.apiregistration.v1beta1.APIServiceSpec
        ]
      ] = js.undefined
  }
  object APIServiceArgs {
    
    inline def apply(): APIServiceArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[APIServiceArgs]
    }
    
    extension [Self <: APIServiceArgs](x: Self) {
      
      inline def setApiVersion(value: Input[apiregistrationDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.APIService]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setSpec(
        value: Input[
              typingsJapgolly.pulumiKubernetes.typesInputMod.apiregistration.v1beta1.APIServiceSpec
            ]
      ): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    }
  }
}
