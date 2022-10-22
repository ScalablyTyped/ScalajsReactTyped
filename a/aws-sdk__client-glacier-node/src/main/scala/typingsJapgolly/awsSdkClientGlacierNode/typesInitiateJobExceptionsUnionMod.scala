package typingsJapgolly.awsSdkClientGlacierNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInitiateJobExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typingsJapgolly.awsSdkClientGlacierNode.typesPolicyEnforcedExceptionMod.PolicyEnforcedException
    - typingsJapgolly.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
    - typingsJapgolly.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
    - typingsJapgolly.awsSdkClientGlacierNode.typesInsufficientCapacityExceptionMod.InsufficientCapacityException
    - typingsJapgolly.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
  */
  trait InitiateJobExceptionsUnion extends StObject
  object InitiateJobExceptionsUnion {
    
    inline def InsufficientCapacityException(): typingsJapgolly.awsSdkClientGlacierNode.typesInsufficientCapacityExceptionMod.InsufficientCapacityException = {
      val __obj = js.Dynamic.literal(name = "InsufficientCapacityException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesInsufficientCapacityExceptionMod.InsufficientCapacityException]
    }
    
    inline def InvalidParameterValueException(): typingsJapgolly.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException = {
      val __obj = js.Dynamic.literal(name = "InvalidParameterValueException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException]
    }
    
    inline def MissingParameterValueException(): typingsJapgolly.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException = {
      val __obj = js.Dynamic.literal(name = "MissingParameterValueException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException]
    }
    
    inline def PolicyEnforcedException(): typingsJapgolly.awsSdkClientGlacierNode.typesPolicyEnforcedExceptionMod.PolicyEnforcedException = {
      val __obj = js.Dynamic.literal(name = "PolicyEnforcedException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesPolicyEnforcedExceptionMod.PolicyEnforcedException]
    }
    
    inline def ResourceNotFoundException(): typingsJapgolly.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ResourceNotFoundException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException]
    }
    
    inline def ServiceUnavailableException(): typingsJapgolly.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException = {
      val __obj = js.Dynamic.literal(name = "ServiceUnavailableException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException]
    }
  }
}
