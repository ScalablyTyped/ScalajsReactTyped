package typingsJapgolly.awsSdkClientKmsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListKeysExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
    - typingsJapgolly.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
    - typingsJapgolly.awsSdkClientKmsNode.typesInvalidMarkerExceptionMod.InvalidMarkerException
  */
  trait ListKeysExceptionsUnion extends StObject
  object ListKeysExceptionsUnion {
    
    inline def DependencyTimeoutException(): typingsJapgolly.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException = {
      val __obj = js.Dynamic.literal(name = "DependencyTimeoutException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException]
    }
    
    inline def InvalidMarkerException(): typingsJapgolly.awsSdkClientKmsNode.typesInvalidMarkerExceptionMod.InvalidMarkerException = {
      val __obj = js.Dynamic.literal(name = "InvalidMarkerException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesInvalidMarkerExceptionMod.InvalidMarkerException]
    }
    
    inline def KMSInternalException(): typingsJapgolly.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException = {
      val __obj = js.Dynamic.literal(name = "KMSInternalException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException]
    }
  }
}
