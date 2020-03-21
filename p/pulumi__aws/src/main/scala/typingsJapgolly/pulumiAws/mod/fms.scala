package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.adminAccountMod.AdminAccountArgs
import typingsJapgolly.pulumiAws.adminAccountMod.AdminAccountState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "fms")
@js.native
object fms extends js.Object {
  @js.native
  class AdminAccount protected ()
    extends typingsJapgolly.pulumiAws.fmsMod.AdminAccount {
    /**
      * Create a AdminAccount resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AdminAccountArgs) = this()
    def this(name: String, args: AdminAccountArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object AdminAccount extends js.Object {
    /**
      * Get an existing AdminAccount resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.adminAccountMod.AdminAccount = js.native
    def get(name: String, id: Input[ID], state: AdminAccountState): typingsJapgolly.pulumiAws.adminAccountMod.AdminAccount = js.native
    def get(name: String, id: Input[ID], state: AdminAccountState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.adminAccountMod.AdminAccount = js.native
    /**
      * Returns true if the given object is an instance of AdminAccount.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/fms/adminAccount.AdminAccount */ Boolean = js.native
  }
  
}

