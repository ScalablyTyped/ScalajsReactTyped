package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.certificateMod.CertificateArgs
import typingsJapgolly.pulumiAws.certificateMod.CertificateState
import typingsJapgolly.pulumiAws.certificateValidationMod.CertificateValidationArgs
import typingsJapgolly.pulumiAws.certificateValidationMod.CertificateValidationState
import typingsJapgolly.pulumiAws.getCertificateMod.GetCertificateArgs
import typingsJapgolly.pulumiAws.getCertificateMod.GetCertificateResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "acm")
@js.native
object acm extends js.Object {
  @js.native
  class Certificate protected ()
    extends typingsJapgolly.pulumiAws.acmMod.Certificate {
    /**
      * Create a Certificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CertificateArgs) = this()
    def this(name: String, args: CertificateArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class CertificateValidation protected ()
    extends typingsJapgolly.pulumiAws.acmMod.CertificateValidation {
    /**
      * Create a CertificateValidation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CertificateValidationArgs) = this()
    def this(name: String, args: CertificateValidationArgs, opts: CustomResourceOptions) = this()
  }
  
  def getCertificate(args: GetCertificateArgs): js.Promise[GetCertificateResult] with GetCertificateResult = js.native
  def getCertificate(args: GetCertificateArgs, opts: InvokeOptions): js.Promise[GetCertificateResult] with GetCertificateResult = js.native
  /* static members */
  @js.native
  object Certificate extends js.Object {
    /**
      * Get an existing Certificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.certificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: CertificateState): typingsJapgolly.pulumiAws.certificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: CertificateState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.certificateMod.Certificate = js.native
    /**
      * Returns true if the given object is an instance of Certificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/acm/certificate.Certificate */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object CertificateValidation extends js.Object {
    /**
      * Get an existing CertificateValidation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.certificateValidationMod.CertificateValidation = js.native
    def get(name: String, id: Input[ID], state: CertificateValidationState): typingsJapgolly.pulumiAws.certificateValidationMod.CertificateValidation = js.native
    def get(name: String, id: Input[ID], state: CertificateValidationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.certificateValidationMod.CertificateValidation = js.native
    /**
      * Returns true if the given object is an instance of CertificateValidation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/acm/certificateValidation.CertificateValidation */ Boolean = js.native
  }
  
}

