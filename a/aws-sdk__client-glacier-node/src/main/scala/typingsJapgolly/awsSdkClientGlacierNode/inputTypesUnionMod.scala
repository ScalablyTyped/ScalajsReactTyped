package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.typesUploadArchiveInputMod.UploadArchiveInput
import typingsJapgolly.awsSdkClientGlacierNode.typesUploadMultipartPartInputMod.UploadMultipartPartInput
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/InputTypesUnion", JSImport.Namespace)
@js.native
object inputTypesUnionMod extends js.Object {
  trait _InputTypesUnion extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientGlacierNode.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesAbortVaultLockInputMod.AbortVaultLockInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesAddTagsToVaultInputMod.AddTagsToVaultInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesCompleteVaultLockInputMod.CompleteVaultLockInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesCreateVaultInputMod.CreateVaultInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesDeleteArchiveInputMod.DeleteArchiveInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesDeleteVaultInputMod.DeleteVaultInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyInputMod.DeleteVaultAccessPolicyInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesDeleteVaultNotificationsInputMod.DeleteVaultNotificationsInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesDescribeJobInputMod.DescribeJobInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesDescribeVaultInputMod.DescribeVaultInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyInputMod.GetDataRetrievalPolicyInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesGetJobOutputInputMod.GetJobOutputInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesGetVaultAccessPolicyInputMod.GetVaultAccessPolicyInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesGetVaultLockInputMod.GetVaultLockInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesGetVaultNotificationsInputMod.GetVaultNotificationsInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesInitiateJobInputMod.InitiateJobInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesInitiateMultipartUploadInputMod.InitiateMultipartUploadInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesInitiateVaultLockInputMod.InitiateVaultLockInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesListJobsInputMod.ListJobsInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesListPartsInputMod.ListPartsInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesListProvisionedCapacityInputMod.ListProvisionedCapacityInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesListTagsForVaultInputMod.ListTagsForVaultInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesListVaultsInputMod.ListVaultsInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityInputMod.PurchaseProvisionedCapacityInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesRemoveTagsFromVaultInputMod.RemoveTagsFromVaultInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyInputMod.SetDataRetrievalPolicyInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesSetVaultAccessPolicyInputMod.SetVaultAccessPolicyInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesSetVaultNotificationsInputMod.SetVaultNotificationsInput
    - typingsJapgolly.awsSdkClientGlacierNode.typesUploadArchiveInputMod.UploadArchiveInput[typingsJapgolly.node.streamMod.Readable]
    - typingsJapgolly.awsSdkClientGlacierNode.typesUploadMultipartPartInputMod.UploadMultipartPartInput[typingsJapgolly.node.streamMod.Readable]
  */
  type InputTypesUnion = _InputTypesUnion | UploadArchiveInput[Readable] | UploadMultipartPartInput[Readable]
}

