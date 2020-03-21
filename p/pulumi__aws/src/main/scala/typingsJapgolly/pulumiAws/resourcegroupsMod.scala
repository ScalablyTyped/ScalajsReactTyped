package typingsJapgolly.pulumiAws

import typingsJapgolly.pulumiAws.resourcegroupsGroupMod.GroupArgs
import typingsJapgolly.pulumiAws.resourcegroupsGroupMod.GroupState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/resourcegroups", JSImport.Namespace)
@js.native
object resourcegroupsMod extends js.Object {
  @js.native
  class Group protected ()
    extends typingsJapgolly.pulumiAws.resourcegroupsGroupMod.Group {
    /**
      * Create a Group resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GroupArgs) = this()
    def this(name: String, args: GroupArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Group extends js.Object {
    /**
      * Get an existing Group resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.resourcegroupsGroupMod.Group = js.native
    def get(name: String, id: Input[ID], state: GroupState): typingsJapgolly.pulumiAws.resourcegroupsGroupMod.Group = js.native
    def get(name: String, id: Input[ID], state: GroupState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.resourcegroupsGroupMod.Group = js.native
    /**
      * Returns true if the given object is an instance of Group.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/resourcegroups/group.Group */ Boolean = js.native
  }
  
}

