package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.glacierVaultMod.VaultArgs
import typingsJapgolly.pulumiAws.glacierVaultMod.VaultState
import typingsJapgolly.pulumiAws.vaultLockMod.VaultLockArgs
import typingsJapgolly.pulumiAws.vaultLockMod.VaultLockState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "glacier")
@js.native
object glacier extends js.Object {
  @js.native
  class Vault protected ()
    extends typingsJapgolly.pulumiAws.glacierMod.Vault {
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
  
  @js.native
  class VaultLock protected ()
    extends typingsJapgolly.pulumiAws.glacierMod.VaultLock {
    /**
      * Create a VaultLock resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VaultLockArgs) = this()
    def this(name: String, args: VaultLockArgs, opts: CustomResourceOptions) = this()
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
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.glacierVaultMod.Vault = js.native
    def get(name: String, id: Input[ID], state: VaultState): typingsJapgolly.pulumiAws.glacierVaultMod.Vault = js.native
    def get(name: String, id: Input[ID], state: VaultState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.glacierVaultMod.Vault = js.native
    /**
      * Returns true if the given object is an instance of Vault.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glacier/vault.Vault */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object VaultLock extends js.Object {
    /**
      * Get an existing VaultLock resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.vaultLockMod.VaultLock = js.native
    def get(name: String, id: Input[ID], state: VaultLockState): typingsJapgolly.pulumiAws.vaultLockMod.VaultLock = js.native
    def get(name: String, id: Input[ID], state: VaultLockState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.vaultLockMod.VaultLock = js.native
    /**
      * Returns true if the given object is an instance of VaultLock.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glacier/vaultLock.VaultLock */ Boolean = js.native
  }
  
}

