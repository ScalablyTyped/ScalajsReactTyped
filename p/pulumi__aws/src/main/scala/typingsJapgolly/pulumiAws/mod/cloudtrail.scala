package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.getServiceAccountMod.GetServiceAccountArgs
import typingsJapgolly.pulumiAws.getServiceAccountMod.GetServiceAccountResult
import typingsJapgolly.pulumiAws.trailMod.TrailArgs
import typingsJapgolly.pulumiAws.trailMod.TrailState
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cloudtrail")
@js.native
object cloudtrail extends js.Object {
  @js.native
  class Trail protected ()
    extends typingsJapgolly.pulumiAws.cloudtrailMod.Trail {
    /**
      * Create a Trail resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TrailArgs) = this()
    def this(name: String, args: TrailArgs, opts: CustomResourceOptions) = this()
  }
  
  def getServiceAccount(): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
  def getServiceAccount(args: GetServiceAccountArgs): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
  def getServiceAccount(args: GetServiceAccountArgs, opts: InvokeOptions): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
  /* static members */
  @js.native
  object Trail extends js.Object {
    /**
      * Get an existing Trail resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.trailMod.Trail = js.native
    def get(name: String, id: Input[ID], state: TrailState): typingsJapgolly.pulumiAws.trailMod.Trail = js.native
    def get(name: String, id: Input[ID], state: TrailState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.trailMod.Trail = js.native
    /**
      * Returns true if the given object is an instance of Trail.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudtrail/trail.Trail */ Boolean = js.native
  }
  
}

