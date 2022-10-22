package typingsJapgolly.pulumiKubernetes.mod

import typingsJapgolly.pulumiKubernetes.certificatesV1beta1CertificateSigningRequestListMod.CertificateSigningRequestList
import typingsJapgolly.pulumiKubernetes.certificatesV1beta1CertificateSigningRequestListMod.CertificateSigningRequestListArgs
import typingsJapgolly.pulumiKubernetes.certificatesV1beta1CertificateSigningRequestMod.CertificateSigningRequest
import typingsJapgolly.pulumiKubernetes.certificatesV1beta1CertificateSigningRequestMod.CertificateSigningRequestArgs
import typingsJapgolly.pulumiKubernetes.certificatesV1beta1CertificateSigningRequestPatchMod.CertificateSigningRequestPatch
import typingsJapgolly.pulumiKubernetes.certificatesV1beta1CertificateSigningRequestPatchMod.CertificateSigningRequestPatchArgs
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certificates {
  
  object v1beta1 {
    
    object CertificateSigningRequest {
      
      @JSImport("@pulumi/kubernetes", "certificates.v1beta1.CertificateSigningRequest")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CertificateSigningRequest resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.certificatesV1beta1CertificateSigningRequestMod.CertificateSigningRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.certificatesV1beta1CertificateSigningRequestMod.CertificateSigningRequest]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.certificatesV1beta1CertificateSigningRequestMod.CertificateSigningRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.certificatesV1beta1CertificateSigningRequestMod.CertificateSigningRequest]
      
      /**
        * Returns true if the given object is an instance of CertificateSigningRequest.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequest.CertificateSigningRequest */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequest.CertificateSigningRequest */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes", "certificates.v1beta1.CertificateSigningRequest")
    @js.native
    open class CertificateSigningRequestCls protected () extends CertificateSigningRequest {
      /**
        * Create a CertificateSigningRequest resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CertificateSigningRequestArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: CertificateSigningRequestArgs, opts: CustomResourceOptions) = this()
    }
    
    object CertificateSigningRequestList {
      
      @JSImport("@pulumi/kubernetes", "certificates.v1beta1.CertificateSigningRequestList")
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
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.certificatesV1beta1CertificateSigningRequestListMod.CertificateSigningRequestList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.certificatesV1beta1CertificateSigningRequestListMod.CertificateSigningRequestList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.certificatesV1beta1CertificateSigningRequestListMod.CertificateSigningRequestList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.certificatesV1beta1CertificateSigningRequestListMod.CertificateSigningRequestList]
      
      /**
        * Returns true if the given object is an instance of CertificateSigningRequestList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequestList.CertificateSigningRequestList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequestList.CertificateSigningRequestList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes", "certificates.v1beta1.CertificateSigningRequestList")
    @js.native
    open class CertificateSigningRequestListCls protected () extends CertificateSigningRequestList {
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
    }
    
    object CertificateSigningRequestPatch {
      
      @JSImport("@pulumi/kubernetes", "certificates.v1beta1.CertificateSigningRequestPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CertificateSigningRequestPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.certificatesV1beta1CertificateSigningRequestPatchMod.CertificateSigningRequestPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.certificatesV1beta1CertificateSigningRequestPatchMod.CertificateSigningRequestPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.certificatesV1beta1CertificateSigningRequestPatchMod.CertificateSigningRequestPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.certificatesV1beta1CertificateSigningRequestPatchMod.CertificateSigningRequestPatch]
      
      /**
        * Returns true if the given object is an instance of CertificateSigningRequestPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequestPatch.CertificateSigningRequestPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequestPatch.CertificateSigningRequestPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes", "certificates.v1beta1.CertificateSigningRequestPatch")
    @js.native
    open class CertificateSigningRequestPatchCls protected () extends CertificateSigningRequestPatch {
      /**
        * Create a CertificateSigningRequestPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CertificateSigningRequestPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: CertificateSigningRequestPatchArgs, opts: CustomResourceOptions) = this()
    }
  }
}
