package typingsJapgolly.awsSdkClientKmsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEncryptExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
    - typingsJapgolly.awsSdkClientKmsNode.typesDisabledExceptionMod.DisabledException
    - typingsJapgolly.awsSdkClientKmsNode.typesKeyUnavailableExceptionMod.KeyUnavailableException
    - typingsJapgolly.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
    - typingsJapgolly.awsSdkClientKmsNode.typesInvalidKeyUsageExceptionMod.InvalidKeyUsageException
    - typingsJapgolly.awsSdkClientKmsNode.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException
    - typingsJapgolly.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
    - typingsJapgolly.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  */
  trait EncryptExceptionsUnion extends StObject
  object EncryptExceptionsUnion {
    
    inline def DependencyTimeoutException(): typingsJapgolly.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException = {
      val __obj = js.Dynamic.literal(name = "DependencyTimeoutException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException]
    }
    
    inline def DisabledException(): typingsJapgolly.awsSdkClientKmsNode.typesDisabledExceptionMod.DisabledException = {
      val __obj = js.Dynamic.literal(name = "DisabledException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesDisabledExceptionMod.DisabledException]
    }
    
    inline def InvalidGrantTokenException(): typingsJapgolly.awsSdkClientKmsNode.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException = {
      val __obj = js.Dynamic.literal(name = "InvalidGrantTokenException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesInvalidGrantTokenExceptionMod.InvalidGrantTokenException]
    }
    
    inline def InvalidKeyUsageException(): typingsJapgolly.awsSdkClientKmsNode.typesInvalidKeyUsageExceptionMod.InvalidKeyUsageException = {
      val __obj = js.Dynamic.literal(name = "InvalidKeyUsageException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesInvalidKeyUsageExceptionMod.InvalidKeyUsageException]
    }
    
    inline def KMSInternalException(): typingsJapgolly.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException = {
      val __obj = js.Dynamic.literal(name = "KMSInternalException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException]
    }
    
    inline def KMSInvalidStateException(): typingsJapgolly.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException = {
      val __obj = js.Dynamic.literal(name = "KMSInvalidStateException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException]
    }
    
    inline def KeyUnavailableException(): typingsJapgolly.awsSdkClientKmsNode.typesKeyUnavailableExceptionMod.KeyUnavailableException = {
      val __obj = js.Dynamic.literal(name = "KeyUnavailableException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesKeyUnavailableExceptionMod.KeyUnavailableException]
    }
    
    inline def NotFoundException(): typingsJapgolly.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = "NotFoundException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException]
    }
  }
}
