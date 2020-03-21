package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.activationMod.ActivationArgs
import typingsJapgolly.pulumiAws.activationMod.ActivationState
import typingsJapgolly.pulumiAws.documentMod.DocumentArgs
import typingsJapgolly.pulumiAws.documentMod.DocumentState
import typingsJapgolly.pulumiAws.getDocumentMod.GetDocumentArgs
import typingsJapgolly.pulumiAws.getDocumentMod.GetDocumentResult
import typingsJapgolly.pulumiAws.getParameterMod.GetParameterArgs
import typingsJapgolly.pulumiAws.getParameterMod.GetParameterResult
import typingsJapgolly.pulumiAws.getPatchBaselineMod.GetPatchBaselineArgs
import typingsJapgolly.pulumiAws.getPatchBaselineMod.GetPatchBaselineResult
import typingsJapgolly.pulumiAws.maintenanceWindowMod.MaintenanceWindowArgs
import typingsJapgolly.pulumiAws.maintenanceWindowMod.MaintenanceWindowState
import typingsJapgolly.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTargetArgs
import typingsJapgolly.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTargetState
import typingsJapgolly.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTaskArgs
import typingsJapgolly.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTaskState
import typingsJapgolly.pulumiAws.parameterMod.ParameterArgs
import typingsJapgolly.pulumiAws.parameterMod.ParameterState
import typingsJapgolly.pulumiAws.parameterTypeMod.ParameterType
import typingsJapgolly.pulumiAws.patchBaselineMod.PatchBaselineArgs
import typingsJapgolly.pulumiAws.patchBaselineMod.PatchBaselineState
import typingsJapgolly.pulumiAws.patchGroupMod.PatchGroupArgs
import typingsJapgolly.pulumiAws.patchGroupMod.PatchGroupState
import typingsJapgolly.pulumiAws.resourceDataSyncMod.ResourceDataSyncArgs
import typingsJapgolly.pulumiAws.resourceDataSyncMod.ResourceDataSyncState
import typingsJapgolly.pulumiAws.ssmAssociationMod.AssociationArgs
import typingsJapgolly.pulumiAws.ssmAssociationMod.AssociationState
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ssm")
@js.native
object ssm extends js.Object {
  @js.native
  class Activation protected ()
    extends typingsJapgolly.pulumiAws.ssmMod.Activation {
    /**
      * Create a Activation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ActivationArgs) = this()
    def this(name: String, args: ActivationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Association protected ()
    extends typingsJapgolly.pulumiAws.ssmMod.Association {
    /**
      * Create a Association resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AssociationArgs) = this()
    def this(name: String, args: AssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Document protected ()
    extends typingsJapgolly.pulumiAws.ssmMod.Document {
    /**
      * Create a Document resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DocumentArgs) = this()
    def this(name: String, args: DocumentArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class MaintenanceWindow protected ()
    extends typingsJapgolly.pulumiAws.ssmMod.MaintenanceWindow {
    /**
      * Create a MaintenanceWindow resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MaintenanceWindowArgs) = this()
    def this(name: String, args: MaintenanceWindowArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class MaintenanceWindowTarget protected ()
    extends typingsJapgolly.pulumiAws.ssmMod.MaintenanceWindowTarget {
    /**
      * Create a MaintenanceWindowTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MaintenanceWindowTargetArgs) = this()
    def this(name: String, args: MaintenanceWindowTargetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class MaintenanceWindowTask protected ()
    extends typingsJapgolly.pulumiAws.ssmMod.MaintenanceWindowTask {
    /**
      * Create a MaintenanceWindowTask resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MaintenanceWindowTaskArgs) = this()
    def this(name: String, args: MaintenanceWindowTaskArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Parameter protected ()
    extends typingsJapgolly.pulumiAws.ssmMod.Parameter {
    /**
      * Create a Parameter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ParameterArgs) = this()
    def this(name: String, args: ParameterArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class PatchBaseline protected ()
    extends typingsJapgolly.pulumiAws.ssmMod.PatchBaseline {
    /**
      * Create a PatchBaseline resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PatchBaselineArgs) = this()
    def this(name: String, args: PatchBaselineArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class PatchGroup protected ()
    extends typingsJapgolly.pulumiAws.ssmMod.PatchGroup {
    /**
      * Create a PatchGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PatchGroupArgs) = this()
    def this(name: String, args: PatchGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ResourceDataSync protected ()
    extends typingsJapgolly.pulumiAws.ssmMod.ResourceDataSync {
    /**
      * Create a ResourceDataSync resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourceDataSyncArgs) = this()
    def this(name: String, args: ResourceDataSyncArgs, opts: CustomResourceOptions) = this()
  }
  
  var SecureStringParameter: ParameterType = js.native
  var StringListParameter: ParameterType = js.native
  var StringParameter: ParameterType = js.native
  def getDocument(args: GetDocumentArgs): js.Promise[GetDocumentResult] with GetDocumentResult = js.native
  def getDocument(args: GetDocumentArgs, opts: InvokeOptions): js.Promise[GetDocumentResult] with GetDocumentResult = js.native
  def getParameter(args: GetParameterArgs): js.Promise[GetParameterResult] with GetParameterResult = js.native
  def getParameter(args: GetParameterArgs, opts: InvokeOptions): js.Promise[GetParameterResult] with GetParameterResult = js.native
  def getPatchBaseline(args: GetPatchBaselineArgs): js.Promise[GetPatchBaselineResult] with GetPatchBaselineResult = js.native
  def getPatchBaseline(args: GetPatchBaselineArgs, opts: InvokeOptions): js.Promise[GetPatchBaselineResult] with GetPatchBaselineResult = js.native
  /* static members */
  @js.native
  object Activation extends js.Object {
    /**
      * Get an existing Activation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.activationMod.Activation = js.native
    def get(name: String, id: Input[ID], state: ActivationState): typingsJapgolly.pulumiAws.activationMod.Activation = js.native
    def get(name: String, id: Input[ID], state: ActivationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.activationMod.Activation = js.native
    /**
      * Returns true if the given object is an instance of Activation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/activation.Activation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Association extends js.Object {
    /**
      * Get an existing Association resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.ssmAssociationMod.Association = js.native
    def get(name: String, id: Input[ID], state: AssociationState): typingsJapgolly.pulumiAws.ssmAssociationMod.Association = js.native
    def get(name: String, id: Input[ID], state: AssociationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.ssmAssociationMod.Association = js.native
    /**
      * Returns true if the given object is an instance of Association.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/association.Association */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Document extends js.Object {
    /**
      * Get an existing Document resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.documentMod.Document = js.native
    def get(name: String, id: Input[ID], state: DocumentState): typingsJapgolly.pulumiAws.documentMod.Document = js.native
    def get(name: String, id: Input[ID], state: DocumentState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.documentMod.Document = js.native
    /**
      * Returns true if the given object is an instance of Document.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/document.Document */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MaintenanceWindow extends js.Object {
    /**
      * Get an existing MaintenanceWindow resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.maintenanceWindowMod.MaintenanceWindow = js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowState): typingsJapgolly.pulumiAws.maintenanceWindowMod.MaintenanceWindow = js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.maintenanceWindowMod.MaintenanceWindow = js.native
    /**
      * Returns true if the given object is an instance of MaintenanceWindow.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindow.MaintenanceWindow */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MaintenanceWindowTarget extends js.Object {
    /**
      * Get an existing MaintenanceWindowTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTarget = js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowTargetState): typingsJapgolly.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTarget = js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowTargetState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.maintenanceWindowTargetMod.MaintenanceWindowTarget = js.native
    /**
      * Returns true if the given object is an instance of MaintenanceWindowTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindowTarget.MaintenanceWindowTarget */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MaintenanceWindowTask extends js.Object {
    /**
      * Get an existing MaintenanceWindowTask resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTask = js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowTaskState): typingsJapgolly.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTask = js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowTaskState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.maintenanceWindowTaskMod.MaintenanceWindowTask = js.native
    /**
      * Returns true if the given object is an instance of MaintenanceWindowTask.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindowTask.MaintenanceWindowTask */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Parameter extends js.Object {
    /**
      * Get an existing Parameter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.parameterMod.Parameter = js.native
    def get(name: String, id: Input[ID], state: ParameterState): typingsJapgolly.pulumiAws.parameterMod.Parameter = js.native
    def get(name: String, id: Input[ID], state: ParameterState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.parameterMod.Parameter = js.native
    /**
      * Returns true if the given object is an instance of Parameter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/parameter.Parameter */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PatchBaseline extends js.Object {
    /**
      * Get an existing PatchBaseline resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.patchBaselineMod.PatchBaseline = js.native
    def get(name: String, id: Input[ID], state: PatchBaselineState): typingsJapgolly.pulumiAws.patchBaselineMod.PatchBaseline = js.native
    def get(name: String, id: Input[ID], state: PatchBaselineState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.patchBaselineMod.PatchBaseline = js.native
    /**
      * Returns true if the given object is an instance of PatchBaseline.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/patchBaseline.PatchBaseline */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PatchGroup extends js.Object {
    /**
      * Get an existing PatchGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.patchGroupMod.PatchGroup = js.native
    def get(name: String, id: Input[ID], state: PatchGroupState): typingsJapgolly.pulumiAws.patchGroupMod.PatchGroup = js.native
    def get(name: String, id: Input[ID], state: PatchGroupState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.patchGroupMod.PatchGroup = js.native
    /**
      * Returns true if the given object is an instance of PatchGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/patchGroup.PatchGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ResourceDataSync extends js.Object {
    /**
      * Get an existing ResourceDataSync resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.resourceDataSyncMod.ResourceDataSync = js.native
    def get(name: String, id: Input[ID], state: ResourceDataSyncState): typingsJapgolly.pulumiAws.resourceDataSyncMod.ResourceDataSync = js.native
    def get(name: String, id: Input[ID], state: ResourceDataSyncState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.resourceDataSyncMod.ResourceDataSync = js.native
    /**
      * Returns true if the given object is an instance of ResourceDataSync.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/resourceDataSync.ResourceDataSync */ Boolean = js.native
  }
  
}

