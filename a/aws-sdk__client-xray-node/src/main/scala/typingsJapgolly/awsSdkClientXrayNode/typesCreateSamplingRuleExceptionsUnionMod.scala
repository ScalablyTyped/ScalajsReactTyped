package typingsJapgolly.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateSamplingRuleExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
    - typingsJapgolly.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
    - typingsJapgolly.awsSdkClientXrayNode.typesRuleLimitExceededExceptionMod.RuleLimitExceededException
  */
  trait CreateSamplingRuleExceptionsUnion extends StObject
  object CreateSamplingRuleExceptionsUnion {
    
    inline def InvalidRequestException(): typingsJapgolly.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException = {
      val __obj = js.Dynamic.literal(name = "InvalidRequestException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException]
    }
    
    inline def RuleLimitExceededException(): typingsJapgolly.awsSdkClientXrayNode.typesRuleLimitExceededExceptionMod.RuleLimitExceededException = {
      val __obj = js.Dynamic.literal(name = "RuleLimitExceededException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientXrayNode.typesRuleLimitExceededExceptionMod.RuleLimitExceededException]
    }
    
    inline def ThrottledException(): typingsJapgolly.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException = {
      val __obj = js.Dynamic.literal(name = "ThrottledException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException]
    }
  }
}
