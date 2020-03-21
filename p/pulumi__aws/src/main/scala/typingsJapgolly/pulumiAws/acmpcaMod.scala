package typingsJapgolly.pulumiAws

import typingsJapgolly.pulumiAws.certificateAuthorityMod.CertificateAuthorityArgs
import typingsJapgolly.pulumiAws.certificateAuthorityMod.CertificateAuthorityState
import typingsJapgolly.pulumiAws.getCertificateAuthorityMod.GetCertificateAuthorityArgs
import typingsJapgolly.pulumiAws.getCertificateAuthorityMod.GetCertificateAuthorityResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/acmpca", JSImport.Namespace)
@js.native
object acmpcaMod extends js.Object {
  @js.native
  class CertificateAuthority protected ()
    extends typingsJapgolly.pulumiAws.certificateAuthorityMod.CertificateAuthority {
    /**
      * Create a CertificateAuthority resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CertificateAuthorityArgs) = this()
    def this(name: String, args: CertificateAuthorityArgs, opts: CustomResourceOptions) = this()
  }
  
  def getCertificateAuthority(args: GetCertificateAuthorityArgs): js.Promise[GetCertificateAuthorityResult] with GetCertificateAuthorityResult = js.native
  def getCertificateAuthority(args: GetCertificateAuthorityArgs, opts: InvokeOptions): js.Promise[GetCertificateAuthorityResult] with GetCertificateAuthorityResult = js.native
  /* static members */
  @js.native
  object CertificateAuthority extends js.Object {
    /**
      * Get an existing CertificateAuthority resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.certificateAuthorityMod.CertificateAuthority = js.native
    def get(name: String, id: Input[ID], state: CertificateAuthorityState): typingsJapgolly.pulumiAws.certificateAuthorityMod.CertificateAuthority = js.native
    def get(name: String, id: Input[ID], state: CertificateAuthorityState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.certificateAuthorityMod.CertificateAuthority = js.native
    /**
      * Returns true if the given object is an instance of CertificateAuthority.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/acmpca/certificateAuthority.CertificateAuthority */ Boolean = js.native
  }
  
}

