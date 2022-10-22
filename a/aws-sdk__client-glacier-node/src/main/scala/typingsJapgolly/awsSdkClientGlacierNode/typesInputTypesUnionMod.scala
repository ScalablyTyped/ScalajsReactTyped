package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.typesUploadArchiveInputMod.UploadArchiveInput
import typingsJapgolly.awsSdkClientGlacierNode.typesUploadMultipartPartInputMod.UploadMultipartPartInput
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInputTypesUnionMod {
  
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
  
  trait _InputTypesUnion extends StObject
  object _InputTypesUnion {
    
    inline def AbortMultipartUploadInput(accountId: String, uploadId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput]
    }
    
    inline def AbortVaultLockInput(accountId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesAbortVaultLockInputMod.AbortVaultLockInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesAbortVaultLockInputMod.AbortVaultLockInput]
    }
    
    inline def AddTagsToVaultInput(accountId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesAddTagsToVaultInputMod.AddTagsToVaultInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesAddTagsToVaultInputMod.AddTagsToVaultInput]
    }
    
    inline def CompleteMultipartUploadInput(accountId: String, uploadId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput]
    }
    
    inline def CompleteVaultLockInput(accountId: String, lockId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesCompleteVaultLockInputMod.CompleteVaultLockInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], lockId = lockId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesCompleteVaultLockInputMod.CompleteVaultLockInput]
    }
    
    inline def CreateVaultInput(accountId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesCreateVaultInputMod.CreateVaultInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesCreateVaultInputMod.CreateVaultInput]
    }
    
    inline def DeleteArchiveInput(accountId: String, archiveId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesDeleteArchiveInputMod.DeleteArchiveInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], archiveId = archiveId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesDeleteArchiveInputMod.DeleteArchiveInput]
    }
    
    inline def DeleteVaultAccessPolicyInput(accountId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyInputMod.DeleteVaultAccessPolicyInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyInputMod.DeleteVaultAccessPolicyInput]
    }
    
    inline def DeleteVaultInput(accountId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesDeleteVaultInputMod.DeleteVaultInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesDeleteVaultInputMod.DeleteVaultInput]
    }
    
    inline def DeleteVaultNotificationsInput(accountId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesDeleteVaultNotificationsInputMod.DeleteVaultNotificationsInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesDeleteVaultNotificationsInputMod.DeleteVaultNotificationsInput]
    }
    
    inline def DescribeJobInput(accountId: String, jobId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesDescribeJobInputMod.DescribeJobInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesDescribeJobInputMod.DescribeJobInput]
    }
    
    inline def DescribeVaultInput(accountId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesDescribeVaultInputMod.DescribeVaultInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesDescribeVaultInputMod.DescribeVaultInput]
    }
    
    inline def GetDataRetrievalPolicyInput(accountId: String): typingsJapgolly.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyInputMod.GetDataRetrievalPolicyInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyInputMod.GetDataRetrievalPolicyInput]
    }
    
    inline def GetJobOutputInput(accountId: String, jobId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesGetJobOutputInputMod.GetJobOutputInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesGetJobOutputInputMod.GetJobOutputInput]
    }
    
    inline def GetVaultAccessPolicyInput(accountId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesGetVaultAccessPolicyInputMod.GetVaultAccessPolicyInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesGetVaultAccessPolicyInputMod.GetVaultAccessPolicyInput]
    }
    
    inline def GetVaultLockInput(accountId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesGetVaultLockInputMod.GetVaultLockInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesGetVaultLockInputMod.GetVaultLockInput]
    }
    
    inline def GetVaultNotificationsInput(accountId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesGetVaultNotificationsInputMod.GetVaultNotificationsInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesGetVaultNotificationsInputMod.GetVaultNotificationsInput]
    }
    
    inline def InitiateJobInput(accountId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesInitiateJobInputMod.InitiateJobInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesInitiateJobInputMod.InitiateJobInput]
    }
    
    inline def InitiateMultipartUploadInput(accountId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesInitiateMultipartUploadInputMod.InitiateMultipartUploadInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesInitiateMultipartUploadInputMod.InitiateMultipartUploadInput]
    }
    
    inline def InitiateVaultLockInput(accountId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesInitiateVaultLockInputMod.InitiateVaultLockInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesInitiateVaultLockInputMod.InitiateVaultLockInput]
    }
    
    inline def ListJobsInput(accountId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesListJobsInputMod.ListJobsInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesListJobsInputMod.ListJobsInput]
    }
    
    inline def ListMultipartUploadsInput(accountId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesListMultipartUploadsInputMod.ListMultipartUploadsInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesListMultipartUploadsInputMod.ListMultipartUploadsInput]
    }
    
    inline def ListPartsInput(accountId: String, uploadId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesListPartsInputMod.ListPartsInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesListPartsInputMod.ListPartsInput]
    }
    
    inline def ListProvisionedCapacityInput(accountId: String): typingsJapgolly.awsSdkClientGlacierNode.typesListProvisionedCapacityInputMod.ListProvisionedCapacityInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesListProvisionedCapacityInputMod.ListProvisionedCapacityInput]
    }
    
    inline def ListTagsForVaultInput(accountId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesListTagsForVaultInputMod.ListTagsForVaultInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesListTagsForVaultInputMod.ListTagsForVaultInput]
    }
    
    inline def ListVaultsInput(accountId: String): typingsJapgolly.awsSdkClientGlacierNode.typesListVaultsInputMod.ListVaultsInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesListVaultsInputMod.ListVaultsInput]
    }
    
    inline def PurchaseProvisionedCapacityInput(accountId: String): typingsJapgolly.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityInputMod.PurchaseProvisionedCapacityInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityInputMod.PurchaseProvisionedCapacityInput]
    }
    
    inline def RemoveTagsFromVaultInput(accountId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesRemoveTagsFromVaultInputMod.RemoveTagsFromVaultInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesRemoveTagsFromVaultInputMod.RemoveTagsFromVaultInput]
    }
    
    inline def SetDataRetrievalPolicyInput(accountId: String): typingsJapgolly.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyInputMod.SetDataRetrievalPolicyInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyInputMod.SetDataRetrievalPolicyInput]
    }
    
    inline def SetVaultAccessPolicyInput(accountId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesSetVaultAccessPolicyInputMod.SetVaultAccessPolicyInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesSetVaultAccessPolicyInputMod.SetVaultAccessPolicyInput]
    }
    
    inline def SetVaultNotificationsInput(accountId: String, vaultName: String): typingsJapgolly.awsSdkClientGlacierNode.typesSetVaultNotificationsInputMod.SetVaultNotificationsInput = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesSetVaultNotificationsInputMod.SetVaultNotificationsInput]
    }
  }
}
