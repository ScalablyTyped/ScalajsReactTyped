package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.getResourceShareMod.GetResourceShareArgs
import typingsJapgolly.pulumiAws.getResourceShareMod.GetResourceShareResult
import typingsJapgolly.pulumiAws.principalAssociationMod.PrincipalAssociationArgs
import typingsJapgolly.pulumiAws.principalAssociationMod.PrincipalAssociationState
import typingsJapgolly.pulumiAws.resourceAssociationMod.ResourceAssociationArgs
import typingsJapgolly.pulumiAws.resourceAssociationMod.ResourceAssociationState
import typingsJapgolly.pulumiAws.resourceShareAccepterMod.ResourceShareAccepterArgs
import typingsJapgolly.pulumiAws.resourceShareAccepterMod.ResourceShareAccepterState
import typingsJapgolly.pulumiAws.resourceShareMod.ResourceShareArgs
import typingsJapgolly.pulumiAws.resourceShareMod.ResourceShareState
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ram")
@js.native
object ram extends js.Object {
  @js.native
  class PrincipalAssociation protected ()
    extends typingsJapgolly.pulumiAws.ramMod.PrincipalAssociation {
    /**
      * Create a PrincipalAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PrincipalAssociationArgs) = this()
    def this(name: String, args: PrincipalAssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ResourceAssociation protected ()
    extends typingsJapgolly.pulumiAws.ramMod.ResourceAssociation {
    /**
      * Create a ResourceAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourceAssociationArgs) = this()
    def this(name: String, args: ResourceAssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ResourceShare protected ()
    extends typingsJapgolly.pulumiAws.ramMod.ResourceShare {
    /**
      * Create a ResourceShare resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ResourceShareArgs) = this()
    def this(name: String, args: ResourceShareArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ResourceShareAccepter protected ()
    extends typingsJapgolly.pulumiAws.ramMod.ResourceShareAccepter {
    /**
      * Create a ResourceShareAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourceShareAccepterArgs) = this()
    def this(name: String, args: ResourceShareAccepterArgs, opts: CustomResourceOptions) = this()
  }
  
  def getResourceShare(args: GetResourceShareArgs): js.Promise[GetResourceShareResult] with GetResourceShareResult = js.native
  def getResourceShare(args: GetResourceShareArgs, opts: InvokeOptions): js.Promise[GetResourceShareResult] with GetResourceShareResult = js.native
  /* static members */
  @js.native
  object PrincipalAssociation extends js.Object {
    /**
      * Get an existing PrincipalAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.principalAssociationMod.PrincipalAssociation = js.native
    def get(name: String, id: Input[ID], state: PrincipalAssociationState): typingsJapgolly.pulumiAws.principalAssociationMod.PrincipalAssociation = js.native
    def get(name: String, id: Input[ID], state: PrincipalAssociationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.principalAssociationMod.PrincipalAssociation = js.native
    /**
      * Returns true if the given object is an instance of PrincipalAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/principalAssociation.PrincipalAssociation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ResourceAssociation extends js.Object {
    /**
      * Get an existing ResourceAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.resourceAssociationMod.ResourceAssociation = js.native
    def get(name: String, id: Input[ID], state: ResourceAssociationState): typingsJapgolly.pulumiAws.resourceAssociationMod.ResourceAssociation = js.native
    def get(name: String, id: Input[ID], state: ResourceAssociationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.resourceAssociationMod.ResourceAssociation = js.native
    /**
      * Returns true if the given object is an instance of ResourceAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/resourceAssociation.ResourceAssociation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ResourceShare extends js.Object {
    /**
      * Get an existing ResourceShare resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.resourceShareMod.ResourceShare = js.native
    def get(name: String, id: Input[ID], state: ResourceShareState): typingsJapgolly.pulumiAws.resourceShareMod.ResourceShare = js.native
    def get(name: String, id: Input[ID], state: ResourceShareState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.resourceShareMod.ResourceShare = js.native
    /**
      * Returns true if the given object is an instance of ResourceShare.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/resourceShare.ResourceShare */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ResourceShareAccepter extends js.Object {
    /**
      * Get an existing ResourceShareAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.resourceShareAccepterMod.ResourceShareAccepter = js.native
    def get(name: String, id: Input[ID], state: ResourceShareAccepterState): typingsJapgolly.pulumiAws.resourceShareAccepterMod.ResourceShareAccepter = js.native
    def get(name: String, id: Input[ID], state: ResourceShareAccepterState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.resourceShareAccepterMod.ResourceShareAccepter = js.native
    /**
      * Returns true if the given object is an instance of ResourceShareAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/resourceShareAccepter.ResourceShareAccepter */ Boolean = js.native
  }
  
}

