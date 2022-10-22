package typingsJapgolly.awsSdkClientKmsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateAliasExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
    - typingsJapgolly.awsSdkClientKmsNode.typesAlreadyExistsExceptionMod.AlreadyExistsException
    - typingsJapgolly.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
    - typingsJapgolly.awsSdkClientKmsNode.typesInvalidAliasNameExceptionMod.InvalidAliasNameException
    - typingsJapgolly.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
    - typingsJapgolly.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException
    - typingsJapgolly.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  */
  trait CreateAliasExceptionsUnion extends StObject
  object CreateAliasExceptionsUnion {
    
    inline def AlreadyExistsException(): typingsJapgolly.awsSdkClientKmsNode.typesAlreadyExistsExceptionMod.AlreadyExistsException = {
      val __obj = js.Dynamic.literal(name = "AlreadyExistsException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesAlreadyExistsExceptionMod.AlreadyExistsException]
    }
    
    inline def DependencyTimeoutException(): typingsJapgolly.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException = {
      val __obj = js.Dynamic.literal(name = "DependencyTimeoutException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException]
    }
    
    inline def InvalidAliasNameException(): typingsJapgolly.awsSdkClientKmsNode.typesInvalidAliasNameExceptionMod.InvalidAliasNameException = {
      val __obj = js.Dynamic.literal(name = "InvalidAliasNameException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesInvalidAliasNameExceptionMod.InvalidAliasNameException]
    }
    
    inline def KMSInternalException(): typingsJapgolly.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException = {
      val __obj = js.Dynamic.literal(name = "KMSInternalException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException]
    }
    
    inline def KMSInvalidStateException(): typingsJapgolly.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException = {
      val __obj = js.Dynamic.literal(name = "KMSInvalidStateException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException]
    }
    
    inline def LimitExceededException(): typingsJapgolly.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    inline def NotFoundException(): typingsJapgolly.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = "NotFoundException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException]
    }
  }
}
