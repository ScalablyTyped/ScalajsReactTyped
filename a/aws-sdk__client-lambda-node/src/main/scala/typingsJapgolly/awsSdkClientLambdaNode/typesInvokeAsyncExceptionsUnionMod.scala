package typingsJapgolly.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvokeAsyncExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
    - typingsJapgolly.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typingsJapgolly.awsSdkClientLambdaNode.typesInvalidRequestContentExceptionMod.InvalidRequestContentException
    - typingsJapgolly.awsSdkClientLambdaNode.typesInvalidRuntimeExceptionMod.InvalidRuntimeException
  */
  trait InvokeAsyncExceptionsUnion extends StObject
  object InvokeAsyncExceptionsUnion {
    
    inline def InvalidRequestContentException(): typingsJapgolly.awsSdkClientLambdaNode.typesInvalidRequestContentExceptionMod.InvalidRequestContentException = {
      val __obj = js.Dynamic.literal(name = "InvalidRequestContentException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesInvalidRequestContentExceptionMod.InvalidRequestContentException]
    }
    
    inline def InvalidRuntimeException(): typingsJapgolly.awsSdkClientLambdaNode.typesInvalidRuntimeExceptionMod.InvalidRuntimeException = {
      val __obj = js.Dynamic.literal(name = "InvalidRuntimeException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesInvalidRuntimeExceptionMod.InvalidRuntimeException]
    }
    
    inline def ResourceNotFoundException(): typingsJapgolly.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ResourceNotFoundException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException]
    }
    
    inline def ServiceException(): typingsJapgolly.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException = {
      val __obj = js.Dynamic.literal(name = "ServiceException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException]
    }
  }
}
