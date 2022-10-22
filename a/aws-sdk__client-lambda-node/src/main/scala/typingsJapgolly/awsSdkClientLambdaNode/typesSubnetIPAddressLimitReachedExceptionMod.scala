package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSubnetIPAddressLimitReachedExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_SubnetIPAddressLimitReachedExceptionDetails> * / any */ trait SubnetIPAddressLimitReachedException
    extends StObject
       with InvokeExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.SubnetIPAddressLimitReachedException
  }
  object SubnetIPAddressLimitReachedException {
    
    inline def apply(): SubnetIPAddressLimitReachedException = {
      val __obj = js.Dynamic.literal(name = "SubnetIPAddressLimitReachedException")
      __obj.asInstanceOf[SubnetIPAddressLimitReachedException]
    }
    
    extension [Self <: SubnetIPAddressLimitReachedException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.SubnetIPAddressLimitReachedException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubnetIPAddressLimitReachedExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Message: js.UndefOr[String] = js.undefined
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  object SubnetIPAddressLimitReachedExceptionDetails {
    
    inline def apply(): SubnetIPAddressLimitReachedExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubnetIPAddressLimitReachedExceptionDetails]
    }
    
    extension [Self <: SubnetIPAddressLimitReachedExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
