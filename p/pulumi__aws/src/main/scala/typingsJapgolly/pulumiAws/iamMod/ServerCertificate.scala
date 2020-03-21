package typingsJapgolly.pulumiAws.iamMod

import typingsJapgolly.pulumiAws.serverCertificateMod.ServerCertificateArgs
import typingsJapgolly.pulumiAws.serverCertificateMod.ServerCertificateState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam", "ServerCertificate")
@js.native
class ServerCertificate protected ()
  extends typingsJapgolly.pulumiAws.serverCertificateMod.ServerCertificate {
  /**
    * Create a ServerCertificate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ServerCertificateArgs) = this()
  def this(name: String, args: ServerCertificateArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/iam", "ServerCertificate")
@js.native
object ServerCertificate extends js.Object {
  /**
    * Get an existing ServerCertificate resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.serverCertificateMod.ServerCertificate = js.native
  def get(name: String, id: Input[ID], state: ServerCertificateState): typingsJapgolly.pulumiAws.serverCertificateMod.ServerCertificate = js.native
  def get(name: String, id: Input[ID], state: ServerCertificateState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.serverCertificateMod.ServerCertificate = js.native
  /**
    * Returns true if the given object is an instance of ServerCertificate.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/serverCertificate.ServerCertificate */ Boolean = js.native
}

