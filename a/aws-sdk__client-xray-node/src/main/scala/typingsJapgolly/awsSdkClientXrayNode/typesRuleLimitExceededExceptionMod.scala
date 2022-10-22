package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.typesCreateSamplingRuleExceptionsUnionMod.CreateSamplingRuleExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuleLimitExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_RuleLimitExceededExceptionDetails> * / any */ trait RuleLimitExceededException
    extends StObject
       with CreateSamplingRuleExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.RuleLimitExceededException
  }
  object RuleLimitExceededException {
    
    inline def apply(): RuleLimitExceededException = {
      val __obj = js.Dynamic.literal(name = "RuleLimitExceededException")
      __obj.asInstanceOf[RuleLimitExceededException]
    }
    
    extension [Self <: RuleLimitExceededException](x: Self) {
      
      inline def setName(value: typingsJapgolly.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.RuleLimitExceededException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RuleLimitExceededExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var Message: js.UndefOr[String] = js.undefined
  }
  object RuleLimitExceededExceptionDetails {
    
    inline def apply(): RuleLimitExceededExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleLimitExceededExceptionDetails]
    }
    
    extension [Self <: RuleLimitExceededExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    }
  }
}
