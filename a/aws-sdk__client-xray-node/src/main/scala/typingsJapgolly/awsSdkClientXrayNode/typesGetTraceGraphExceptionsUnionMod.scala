package typingsJapgolly.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetTraceGraphExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
    - typingsJapgolly.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
  */
  trait GetTraceGraphExceptionsUnion extends StObject
  object GetTraceGraphExceptionsUnion {
    
    inline def InvalidRequestException(): typingsJapgolly.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException = {
      val __obj = js.Dynamic.literal(name = "InvalidRequestException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException]
    }
    
    inline def ThrottledException(): typingsJapgolly.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException = {
      val __obj = js.Dynamic.literal(name = "ThrottledException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException]
    }
  }
}
