package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.planMod.PlanArgs
import typingsJapgolly.pulumiAws.planMod.PlanState
import typingsJapgolly.pulumiAws.selectionMod.SelectionArgs
import typingsJapgolly.pulumiAws.selectionMod.SelectionState
import typingsJapgolly.pulumiAws.vaultMod.VaultArgs
import typingsJapgolly.pulumiAws.vaultMod.VaultState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "backup")
@js.native
object backup extends js.Object {
  @js.native
  class Plan protected ()
    extends typingsJapgolly.pulumiAws.backupMod.Plan {
    /**
      * Create a Plan resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PlanArgs) = this()
    def this(name: String, args: PlanArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Selection protected ()
    extends typingsJapgolly.pulumiAws.backupMod.Selection {
    /**
      * Create a Selection resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SelectionArgs) = this()
    def this(name: String, args: SelectionArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Vault protected ()
    extends typingsJapgolly.pulumiAws.backupMod.Vault {
    /**
      * Create a Vault resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: VaultArgs) = this()
    def this(name: String, args: VaultArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Plan extends js.Object {
    /**
      * Get an existing Plan resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.planMod.Plan = js.native
    def get(name: String, id: Input[ID], state: PlanState): typingsJapgolly.pulumiAws.planMod.Plan = js.native
    def get(name: String, id: Input[ID], state: PlanState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.planMod.Plan = js.native
    /**
      * Returns true if the given object is an instance of Plan.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/plan.Plan */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Selection extends js.Object {
    /**
      * Get an existing Selection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.selectionMod.Selection = js.native
    def get(name: String, id: Input[ID], state: SelectionState): typingsJapgolly.pulumiAws.selectionMod.Selection = js.native
    def get(name: String, id: Input[ID], state: SelectionState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.selectionMod.Selection = js.native
    /**
      * Returns true if the given object is an instance of Selection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/selection.Selection */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Vault extends js.Object {
    /**
      * Get an existing Vault resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.vaultMod.Vault = js.native
    def get(name: String, id: Input[ID], state: VaultState): typingsJapgolly.pulumiAws.vaultMod.Vault = js.native
    def get(name: String, id: Input[ID], state: VaultState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.vaultMod.Vault = js.native
    /**
      * Returns true if the given object is an instance of Vault.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/vault.Vault */ Boolean = js.native
  }
  
}

