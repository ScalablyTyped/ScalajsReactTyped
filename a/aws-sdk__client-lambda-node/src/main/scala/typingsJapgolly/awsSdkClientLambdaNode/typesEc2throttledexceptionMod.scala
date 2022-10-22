package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEc2throttledexceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_EC2ThrottledExceptionDetails> * / any */ trait EC2ThrottledException
    extends StObject
       with InvokeExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2ThrottledException
  }
  object EC2ThrottledException {
    
    inline def apply(): EC2ThrottledException = {
      val __obj = js.Dynamic.literal(name = "EC2ThrottledException")
      __obj.asInstanceOf[EC2ThrottledException]
    }
    
    extension [Self <: EC2ThrottledException](x: Self) {
      
      inline def setName(value: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2ThrottledException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait EC2ThrottledExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Message: js.UndefOr[String] = js.undefined
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  object EC2ThrottledExceptionDetails {
    
    inline def apply(): EC2ThrottledExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EC2ThrottledExceptionDetails]
    }
    
    extension [Self <: EC2ThrottledExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
