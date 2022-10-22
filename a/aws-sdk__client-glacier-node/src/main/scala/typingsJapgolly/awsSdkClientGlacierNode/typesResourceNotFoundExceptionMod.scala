package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.typesAbortMultipartUploadExceptionsUnionMod.AbortMultipartUploadExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesAbortVaultLockExceptionsUnionMod.AbortVaultLockExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesAddTagsToVaultExceptionsUnionMod.AddTagsToVaultExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesCompleteMultipartUploadExceptionsUnionMod.CompleteMultipartUploadExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesCompleteVaultLockExceptionsUnionMod.CompleteVaultLockExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesDeleteArchiveExceptionsUnionMod.DeleteArchiveExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyExceptionsUnionMod.DeleteVaultAccessPolicyExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesDeleteVaultExceptionsUnionMod.DeleteVaultExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesDeleteVaultNotificationsExceptionsUnionMod.DeleteVaultNotificationsExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesDescribeJobExceptionsUnionMod.DescribeJobExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesDescribeVaultExceptionsUnionMod.DescribeVaultExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesGetJobOutputExceptionsUnionMod.GetJobOutputExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesGetVaultAccessPolicyExceptionsUnionMod.GetVaultAccessPolicyExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesGetVaultLockExceptionsUnionMod.GetVaultLockExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesGetVaultNotificationsExceptionsUnionMod.GetVaultNotificationsExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesInitiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesInitiateMultipartUploadExceptionsUnionMod.InitiateMultipartUploadExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesInitiateVaultLockExceptionsUnionMod.InitiateVaultLockExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesListJobsExceptionsUnionMod.ListJobsExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesListMultipartUploadsExceptionsUnionMod.ListMultipartUploadsExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesListPartsExceptionsUnionMod.ListPartsExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesListTagsForVaultExceptionsUnionMod.ListTagsForVaultExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesListVaultsExceptionsUnionMod.ListVaultsExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesRemoveTagsFromVaultExceptionsUnionMod.RemoveTagsFromVaultExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesSetVaultAccessPolicyExceptionsUnionMod.SetVaultAccessPolicyExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesSetVaultNotificationsExceptionsUnionMod.SetVaultNotificationsExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesUploadArchiveExceptionsUnionMod.UploadArchiveExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesUploadMultipartPartExceptionsUnionMod.UploadMultipartPartExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesResourceNotFoundExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ResourceNotFoundExceptionDetails> * / any */ trait ResourceNotFoundException
    extends StObject
       with AbortMultipartUploadExceptionsUnion
       with AbortVaultLockExceptionsUnion
       with AddTagsToVaultExceptionsUnion
       with CompleteMultipartUploadExceptionsUnion
       with CompleteVaultLockExceptionsUnion
       with DeleteArchiveExceptionsUnion
       with DeleteVaultAccessPolicyExceptionsUnion
       with DeleteVaultExceptionsUnion
       with DeleteVaultNotificationsExceptionsUnion
       with DescribeJobExceptionsUnion
       with DescribeVaultExceptionsUnion
       with GetJobOutputExceptionsUnion
       with GetVaultAccessPolicyExceptionsUnion
       with GetVaultLockExceptionsUnion
       with GetVaultNotificationsExceptionsUnion
       with InitiateJobExceptionsUnion
       with InitiateMultipartUploadExceptionsUnion
       with InitiateVaultLockExceptionsUnion
       with ListJobsExceptionsUnion
       with ListMultipartUploadsExceptionsUnion
       with ListPartsExceptionsUnion
       with ListTagsForVaultExceptionsUnion
       with ListVaultsExceptionsUnion
       with RemoveTagsFromVaultExceptionsUnion
       with SetVaultAccessPolicyExceptionsUnion
       with SetVaultNotificationsExceptionsUnion
       with UploadArchiveExceptionsUnion
       with UploadMultipartPartExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ResourceNotFoundException
  }
  object ResourceNotFoundException {
    
    inline def apply(): ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ResourceNotFoundException")
      __obj.asInstanceOf[ResourceNotFoundException]
    }
    
    extension [Self <: ResourceNotFoundException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ResourceNotFoundException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceNotFoundExceptionDetails extends StObject {
    
    /**
      * <p>404 Not Found</p>
      */
    var code: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Returned if the specified resource (such as a vault, upload ID, or job ID) doesn't exist.</p>
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Client</p>
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ResourceNotFoundExceptionDetails {
    
    inline def apply(): ResourceNotFoundExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceNotFoundExceptionDetails]
    }
    
    extension [Self <: ResourceNotFoundExceptionDetails](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
