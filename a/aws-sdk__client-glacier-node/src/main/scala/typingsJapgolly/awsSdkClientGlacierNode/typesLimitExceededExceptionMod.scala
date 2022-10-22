package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.typesAddTagsToVaultExceptionsUnionMod.AddTagsToVaultExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesCreateVaultExceptionsUnionMod.CreateVaultExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityExceptionsUnionMod.PurchaseProvisionedCapacityExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLimitExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_LimitExceededExceptionDetails> * / any */ trait LimitExceededException
    extends StObject
       with AddTagsToVaultExceptionsUnion
       with CreateVaultExceptionsUnion
       with PurchaseProvisionedCapacityExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.LimitExceededException
  }
  object LimitExceededException {
    
    inline def apply(): LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[LimitExceededException]
    }
    
    extension [Self <: LimitExceededException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.LimitExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait LimitExceededExceptionDetails extends StObject {
    
    /**
      * <p>400 Bad Request</p>
      */
    var code: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Returned if the request results in a vault limit or tags limit being exceeded.</p>
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Client</p>
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LimitExceededExceptionDetails {
    
    inline def apply(): LimitExceededExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LimitExceededExceptionDetails]
    }
    
    extension [Self <: LimitExceededExceptionDetails](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
