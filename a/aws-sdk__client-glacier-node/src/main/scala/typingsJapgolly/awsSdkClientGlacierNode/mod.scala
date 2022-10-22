package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierConfiguration
import typingsJapgolly.awsSdkClientGlacierNode.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput
import typingsJapgolly.awsSdkClientGlacierNode.typesAbortVaultLockInputMod.AbortVaultLockInput
import typingsJapgolly.awsSdkClientGlacierNode.typesAddTagsToVaultInputMod.AddTagsToVaultInput
import typingsJapgolly.awsSdkClientGlacierNode.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput
import typingsJapgolly.awsSdkClientGlacierNode.typesCompleteVaultLockInputMod.CompleteVaultLockInput
import typingsJapgolly.awsSdkClientGlacierNode.typesCreateVaultInputMod.CreateVaultInput
import typingsJapgolly.awsSdkClientGlacierNode.typesDeleteArchiveInputMod.DeleteArchiveInput
import typingsJapgolly.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyInputMod.DeleteVaultAccessPolicyInput
import typingsJapgolly.awsSdkClientGlacierNode.typesDeleteVaultInputMod.DeleteVaultInput
import typingsJapgolly.awsSdkClientGlacierNode.typesDeleteVaultNotificationsInputMod.DeleteVaultNotificationsInput
import typingsJapgolly.awsSdkClientGlacierNode.typesDescribeJobInputMod.DescribeJobInput
import typingsJapgolly.awsSdkClientGlacierNode.typesDescribeVaultInputMod.DescribeVaultInput
import typingsJapgolly.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyInputMod.GetDataRetrievalPolicyInput
import typingsJapgolly.awsSdkClientGlacierNode.typesGetJobOutputInputMod.GetJobOutputInput
import typingsJapgolly.awsSdkClientGlacierNode.typesGetVaultAccessPolicyInputMod.GetVaultAccessPolicyInput
import typingsJapgolly.awsSdkClientGlacierNode.typesGetVaultLockInputMod.GetVaultLockInput
import typingsJapgolly.awsSdkClientGlacierNode.typesGetVaultNotificationsInputMod.GetVaultNotificationsInput
import typingsJapgolly.awsSdkClientGlacierNode.typesInitiateJobInputMod.InitiateJobInput
import typingsJapgolly.awsSdkClientGlacierNode.typesInitiateMultipartUploadInputMod.InitiateMultipartUploadInput
import typingsJapgolly.awsSdkClientGlacierNode.typesInitiateVaultLockInputMod.InitiateVaultLockInput
import typingsJapgolly.awsSdkClientGlacierNode.typesListJobsInputMod.ListJobsInput
import typingsJapgolly.awsSdkClientGlacierNode.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
import typingsJapgolly.awsSdkClientGlacierNode.typesListPartsInputMod.ListPartsInput
import typingsJapgolly.awsSdkClientGlacierNode.typesListProvisionedCapacityInputMod.ListProvisionedCapacityInput
import typingsJapgolly.awsSdkClientGlacierNode.typesListTagsForVaultInputMod.ListTagsForVaultInput
import typingsJapgolly.awsSdkClientGlacierNode.typesListVaultsInputMod.ListVaultsInput
import typingsJapgolly.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityInputMod.PurchaseProvisionedCapacityInput
import typingsJapgolly.awsSdkClientGlacierNode.typesRemoveTagsFromVaultInputMod.RemoveTagsFromVaultInput
import typingsJapgolly.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyInputMod.SetDataRetrievalPolicyInput
import typingsJapgolly.awsSdkClientGlacierNode.typesSetVaultAccessPolicyInputMod.SetVaultAccessPolicyInput
import typingsJapgolly.awsSdkClientGlacierNode.typesSetVaultNotificationsInputMod.SetVaultNotificationsInput
import typingsJapgolly.awsSdkClientGlacierNode.typesUploadArchiveInputMod.UploadArchiveInput
import typingsJapgolly.awsSdkClientGlacierNode.typesUploadMultipartPartInputMod.UploadMultipartPartInput
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/client-glacier-node", "AbortMultipartUploadCommand")
  @js.native
  open class AbortMultipartUploadCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsAbortMultipartUploadCommandMod.AbortMultipartUploadCommand {
    def this(input: AbortMultipartUploadInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "AbortVaultLockCommand")
  @js.native
  open class AbortVaultLockCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsAbortVaultLockCommandMod.AbortVaultLockCommand {
    def this(input: AbortVaultLockInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "AddTagsToVaultCommand")
  @js.native
  open class AddTagsToVaultCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsAddTagsToVaultCommandMod.AddTagsToVaultCommand {
    def this(input: AddTagsToVaultInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "CompleteMultipartUploadCommand")
  @js.native
  open class CompleteMultipartUploadCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsCompleteMultipartUploadCommandMod.CompleteMultipartUploadCommand {
    def this(input: CompleteMultipartUploadInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "CompleteVaultLockCommand")
  @js.native
  open class CompleteVaultLockCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsCompleteVaultLockCommandMod.CompleteVaultLockCommand {
    def this(input: CompleteVaultLockInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "CreateVaultCommand")
  @js.native
  open class CreateVaultCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsCreateVaultCommandMod.CreateVaultCommand {
    def this(input: CreateVaultInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "DeleteArchiveCommand")
  @js.native
  open class DeleteArchiveCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsDeleteArchiveCommandMod.DeleteArchiveCommand {
    def this(input: DeleteArchiveInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "DeleteVaultAccessPolicyCommand")
  @js.native
  open class DeleteVaultAccessPolicyCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsDeleteVaultAccessPolicyCommandMod.DeleteVaultAccessPolicyCommand {
    def this(input: DeleteVaultAccessPolicyInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "DeleteVaultCommand")
  @js.native
  open class DeleteVaultCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsDeleteVaultCommandMod.DeleteVaultCommand {
    def this(input: DeleteVaultInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "DeleteVaultNotificationsCommand")
  @js.native
  open class DeleteVaultNotificationsCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsDeleteVaultNotificationsCommandMod.DeleteVaultNotificationsCommand {
    def this(input: DeleteVaultNotificationsInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "DescribeJobCommand")
  @js.native
  open class DescribeJobCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsDescribeJobCommandMod.DescribeJobCommand {
    def this(input: DescribeJobInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "DescribeVaultCommand")
  @js.native
  open class DescribeVaultCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsDescribeVaultCommandMod.DescribeVaultCommand {
    def this(input: DescribeVaultInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "GetDataRetrievalPolicyCommand")
  @js.native
  open class GetDataRetrievalPolicyCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsGetDataRetrievalPolicyCommandMod.GetDataRetrievalPolicyCommand {
    def this(input: GetDataRetrievalPolicyInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "GetJobOutputCommand")
  @js.native
  open class GetJobOutputCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsGetJobOutputCommandMod.GetJobOutputCommand {
    def this(input: GetJobOutputInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "GetVaultAccessPolicyCommand")
  @js.native
  open class GetVaultAccessPolicyCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsGetVaultAccessPolicyCommandMod.GetVaultAccessPolicyCommand {
    def this(input: GetVaultAccessPolicyInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "GetVaultLockCommand")
  @js.native
  open class GetVaultLockCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsGetVaultLockCommandMod.GetVaultLockCommand {
    def this(input: GetVaultLockInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "GetVaultNotificationsCommand")
  @js.native
  open class GetVaultNotificationsCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsGetVaultNotificationsCommandMod.GetVaultNotificationsCommand {
    def this(input: GetVaultNotificationsInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "Glacier")
  @js.native
  open class Glacier protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.glacierMod.Glacier {
    def this(configuration: GlacierConfiguration) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "GlacierClient")
  @js.native
  open class GlacierClient protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.glacierClientMod.GlacierClient {
    def this(configuration: GlacierConfiguration) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "InitiateJobCommand")
  @js.native
  open class InitiateJobCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsInitiateJobCommandMod.InitiateJobCommand {
    def this(input: InitiateJobInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "InitiateMultipartUploadCommand")
  @js.native
  open class InitiateMultipartUploadCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsInitiateMultipartUploadCommandMod.InitiateMultipartUploadCommand {
    def this(input: InitiateMultipartUploadInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "InitiateVaultLockCommand")
  @js.native
  open class InitiateVaultLockCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsInitiateVaultLockCommandMod.InitiateVaultLockCommand {
    def this(input: InitiateVaultLockInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "ListJobsCommand")
  @js.native
  open class ListJobsCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsListJobsCommandMod.ListJobsCommand {
    def this(input: ListJobsInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "ListMultipartUploadsCommand")
  @js.native
  open class ListMultipartUploadsCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsListMultipartUploadsCommandMod.ListMultipartUploadsCommand {
    def this(input: ListMultipartUploadsInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "ListPartsCommand")
  @js.native
  open class ListPartsCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsListPartsCommandMod.ListPartsCommand {
    def this(input: ListPartsInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "ListProvisionedCapacityCommand")
  @js.native
  open class ListProvisionedCapacityCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsListProvisionedCapacityCommandMod.ListProvisionedCapacityCommand {
    def this(input: ListProvisionedCapacityInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "ListTagsForVaultCommand")
  @js.native
  open class ListTagsForVaultCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsListTagsForVaultCommandMod.ListTagsForVaultCommand {
    def this(input: ListTagsForVaultInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "ListVaultsCommand")
  @js.native
  open class ListVaultsCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsListVaultsCommandMod.ListVaultsCommand {
    def this(input: ListVaultsInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "PurchaseProvisionedCapacityCommand")
  @js.native
  open class PurchaseProvisionedCapacityCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsPurchaseProvisionedCapacityCommandMod.PurchaseProvisionedCapacityCommand {
    def this(input: PurchaseProvisionedCapacityInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "RemoveTagsFromVaultCommand")
  @js.native
  open class RemoveTagsFromVaultCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsRemoveTagsFromVaultCommandMod.RemoveTagsFromVaultCommand {
    def this(input: RemoveTagsFromVaultInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "SetDataRetrievalPolicyCommand")
  @js.native
  open class SetDataRetrievalPolicyCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsSetDataRetrievalPolicyCommandMod.SetDataRetrievalPolicyCommand {
    def this(input: SetDataRetrievalPolicyInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "SetVaultAccessPolicyCommand")
  @js.native
  open class SetVaultAccessPolicyCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsSetVaultAccessPolicyCommandMod.SetVaultAccessPolicyCommand {
    def this(input: SetVaultAccessPolicyInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "SetVaultNotificationsCommand")
  @js.native
  open class SetVaultNotificationsCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsSetVaultNotificationsCommandMod.SetVaultNotificationsCommand {
    def this(input: SetVaultNotificationsInput) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "UploadArchiveCommand")
  @js.native
  open class UploadArchiveCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsUploadArchiveCommandMod.UploadArchiveCommand {
    def this(input: UploadArchiveInput[Readable]) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "UploadMultipartPartCommand")
  @js.native
  open class UploadMultipartPartCommand protected ()
    extends typingsJapgolly.awsSdkClientGlacierNode.commandsUploadMultipartPartCommandMod.UploadMultipartPartCommand {
    def this(input: UploadMultipartPartInput[Readable]) = this()
  }
  
  @JSImport("@aws-sdk/client-glacier-node", "configurationProperties")
  @js.native
  val configurationProperties: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ConfigurationDefinition<GlacierResolvableConfiguration, GlacierResolvedConfiguration> */ Any = js.native
}
