package typingsJapgolly.pulumiKubernetes.mod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "certificates")
@js.native
object certificates extends js.Object {
  @js.native
  object v1beta1 extends js.Object {
    @js.native
    class CertificateSigningRequest protected ()
      extends typingsJapgolly.pulumiKubernetes.certificatesMod.v1beta1.CertificateSigningRequest {
      /**
        * Create a certificates.v1beta1.CertificateSigningRequest resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.certificates.v1beta1.CertificateSigningRequest
      ) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.certificates.v1beta1.CertificateSigningRequest,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class CertificateSigningRequestList protected ()
      extends typingsJapgolly.pulumiKubernetes.certificatesMod.v1beta1.CertificateSigningRequestList {
      /**
        * Create a certificates.v1beta1.CertificateSigningRequestList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.certificates.v1beta1.CertificateSigningRequestList
      ) = this()
      def this(
        name: String,
        args: typingsJapgolly.pulumiKubernetes.inputMod.certificates.v1beta1.CertificateSigningRequestList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object CertificateSigningRequest extends js.Object {
      /**
        * Get the state of an existing `CertificateSigningRequest` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.certificateSigningRequestMod.CertificateSigningRequest = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.certificateSigningRequestMod.CertificateSigningRequest = js.native
      /**
        * Returns true if the given object is an instance of CertificateSigningRequest.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/CertificateSigningRequest.CertificateSigningRequest */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object CertificateSigningRequestList extends js.Object {
      /**
        * Get the state of an existing `CertificateSigningRequestList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.certificateSigningRequestListMod.CertificateSigningRequestList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.certificateSigningRequestListMod.CertificateSigningRequestList = js.native
      /**
        * Returns true if the given object is an instance of CertificateSigningRequestList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/CertificateSigningRequestList.CertificateSigningRequestList */ Boolean = js.native
    }
    
  }
  
}

