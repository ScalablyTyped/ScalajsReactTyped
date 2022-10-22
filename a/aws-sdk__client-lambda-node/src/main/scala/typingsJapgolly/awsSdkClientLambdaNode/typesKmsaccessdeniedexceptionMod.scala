package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKmsaccessdeniedexceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_KMSAccessDeniedExceptionDetails> * / any */ trait KMSAccessDeniedException
    extends StObject
       with InvokeExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSAccessDeniedException
  }
  object KMSAccessDeniedException {
    
    inline def apply(): KMSAccessDeniedException = {
      val __obj = js.Dynamic.literal(name = "KMSAccessDeniedException")
      __obj.asInstanceOf[KMSAccessDeniedException]
    }
    
    extension [Self <: KMSAccessDeniedException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSAccessDeniedException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait KMSAccessDeniedExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Message: js.UndefOr[String] = js.undefined
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  object KMSAccessDeniedExceptionDetails {
    
    inline def apply(): KMSAccessDeniedExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KMSAccessDeniedExceptionDetails]
    }
    
    extension [Self <: KMSAccessDeniedExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
