package typingsJapgolly.pulumiAws.mod.s3

import typingsJapgolly.pulumiAws.bucketNotificationMod.BucketNotificationArgs
import typingsJapgolly.pulumiAws.bucketNotificationMod.BucketNotificationState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "s3.BucketNotification")
@js.native
class BucketNotification protected ()
  extends typingsJapgolly.pulumiAws.s3Mod.BucketNotification {
  /**
    * Create a BucketNotification resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BucketNotificationArgs) = this()
  def this(name: String, args: BucketNotificationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "s3.BucketNotification")
@js.native
object BucketNotification extends js.Object {
  /**
    * Get an existing BucketNotification resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.bucketNotificationMod.BucketNotification = js.native
  def get(name: String, id: Input[ID], state: BucketNotificationState): typingsJapgolly.pulumiAws.bucketNotificationMod.BucketNotification = js.native
  def get(name: String, id: Input[ID], state: BucketNotificationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.bucketNotificationMod.BucketNotification = js.native
  /**
    * Returns true if the given object is an instance of BucketNotification.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketNotification.BucketNotification */ Boolean = js.native
}

