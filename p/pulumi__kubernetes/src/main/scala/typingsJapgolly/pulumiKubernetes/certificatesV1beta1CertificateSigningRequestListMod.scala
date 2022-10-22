package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.certificatesDotk8sDotioSlashv1beta1
import typingsJapgolly.pulumiKubernetes.typesOutputMod.certificates.v1beta1.CertificateSigningRequest
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certificatesV1beta1CertificateSigningRequestListMod {
  
  @JSImport("@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequestList", "CertificateSigningRequestList")
  @js.native
  open class CertificateSigningRequestList protected () extends CustomResource {
    /**
      * Create a CertificateSigningRequestList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CertificateSigningRequestListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: CertificateSigningRequestListArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[certificatesDotk8sDotioSlashv1beta1] = js.native
    
    val items: Output_[js.Array[CertificateSigningRequest]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[
        typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequestList
      ] = js.native
    
    val metadata: Output_[ListMeta] = js.native
  }
  /* static members */
  object CertificateSigningRequestList {
    
    @JSImport("@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequestList", "CertificateSigningRequestList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing CertificateSigningRequestList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): CertificateSigningRequestList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[CertificateSigningRequestList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): CertificateSigningRequestList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[CertificateSigningRequestList]
    
    /**
      * Returns true if the given object is an instance of CertificateSigningRequestList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequestList.CertificateSigningRequestList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequestList.CertificateSigningRequestList */ Boolean]
  }
  
  trait CertificateSigningRequestListArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[certificatesDotk8sDotioSlashv1beta1]] = js.undefined
    
    var items: Input[
        js.Array[
          Input[
            typingsJapgolly.pulumiKubernetes.typesInputMod.certificates.v1beta1.CertificateSigningRequest
          ]
        ]
      ]
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[
        Input[
          typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequestList
        ]
      ] = js.undefined
    
    var metadata: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ListMeta]] = js.undefined
  }
  object CertificateSigningRequestListArgs {
    
    inline def apply(
      items: Input[
          js.Array[
            Input[
              typingsJapgolly.pulumiKubernetes.typesInputMod.certificates.v1beta1.CertificateSigningRequest
            ]
          ]
        ]
    ): CertificateSigningRequestListArgs = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateSigningRequestListArgs]
    }
    
    extension [Self <: CertificateSigningRequestListArgs](x: Self) {
      
      inline def setApiVersion(value: Input[certificatesDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setItems(
        value: Input[
              js.Array[
                Input[
                  typingsJapgolly.pulumiKubernetes.typesInputMod.certificates.v1beta1.CertificateSigningRequest
                ]
              ]
            ]
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(
        value: (Input[
              typingsJapgolly.pulumiKubernetes.typesInputMod.certificates.v1beta1.CertificateSigningRequest
            ])*
      ): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setKind(
        value: Input[
              typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequestList
            ]
      ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ListMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
}
