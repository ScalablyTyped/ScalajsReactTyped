package typingsJapgolly.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBatchGetRepositoriesExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientCodecommitNode.typesRepositoryNamesRequiredExceptionMod.RepositoryNamesRequiredException
    - typingsJapgolly.awsSdkClientCodecommitNode.typesMaximumRepositoryNamesExceededExceptionMod.MaximumRepositoryNamesExceededException
    - typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException
    - typingsJapgolly.awsSdkClientCodecommitNode.typesEncryptionIntegrityChecksFailedExceptionMod.EncryptionIntegrityChecksFailedException
    - typingsJapgolly.awsSdkClientCodecommitNode.typesEncryptionKeyAccessDeniedExceptionMod.EncryptionKeyAccessDeniedException
    - typingsJapgolly.awsSdkClientCodecommitNode.typesEncryptionKeyDisabledExceptionMod.EncryptionKeyDisabledException
    - typingsJapgolly.awsSdkClientCodecommitNode.typesEncryptionKeyNotFoundExceptionMod.EncryptionKeyNotFoundException
    - typingsJapgolly.awsSdkClientCodecommitNode.typesEncryptionKeyUnavailableExceptionMod.EncryptionKeyUnavailableException
  */
  trait BatchGetRepositoriesExceptionsUnion extends StObject
  object BatchGetRepositoriesExceptionsUnion {
    
    inline def EncryptionIntegrityChecksFailedException(): typingsJapgolly.awsSdkClientCodecommitNode.typesEncryptionIntegrityChecksFailedExceptionMod.EncryptionIntegrityChecksFailedException = {
      val __obj = js.Dynamic.literal(name = "EncryptionIntegrityChecksFailedException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesEncryptionIntegrityChecksFailedExceptionMod.EncryptionIntegrityChecksFailedException]
    }
    
    inline def EncryptionKeyAccessDeniedException(): typingsJapgolly.awsSdkClientCodecommitNode.typesEncryptionKeyAccessDeniedExceptionMod.EncryptionKeyAccessDeniedException = {
      val __obj = js.Dynamic.literal(name = "EncryptionKeyAccessDeniedException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesEncryptionKeyAccessDeniedExceptionMod.EncryptionKeyAccessDeniedException]
    }
    
    inline def EncryptionKeyDisabledException(): typingsJapgolly.awsSdkClientCodecommitNode.typesEncryptionKeyDisabledExceptionMod.EncryptionKeyDisabledException = {
      val __obj = js.Dynamic.literal(name = "EncryptionKeyDisabledException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesEncryptionKeyDisabledExceptionMod.EncryptionKeyDisabledException]
    }
    
    inline def EncryptionKeyNotFoundException(): typingsJapgolly.awsSdkClientCodecommitNode.typesEncryptionKeyNotFoundExceptionMod.EncryptionKeyNotFoundException = {
      val __obj = js.Dynamic.literal(name = "EncryptionKeyNotFoundException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesEncryptionKeyNotFoundExceptionMod.EncryptionKeyNotFoundException]
    }
    
    inline def EncryptionKeyUnavailableException(): typingsJapgolly.awsSdkClientCodecommitNode.typesEncryptionKeyUnavailableExceptionMod.EncryptionKeyUnavailableException = {
      val __obj = js.Dynamic.literal(name = "EncryptionKeyUnavailableException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesEncryptionKeyUnavailableExceptionMod.EncryptionKeyUnavailableException]
    }
    
    inline def InvalidRepositoryNameException(): typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException = {
      val __obj = js.Dynamic.literal(name = "InvalidRepositoryNameException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException]
    }
    
    inline def MaximumRepositoryNamesExceededException(): typingsJapgolly.awsSdkClientCodecommitNode.typesMaximumRepositoryNamesExceededExceptionMod.MaximumRepositoryNamesExceededException = {
      val __obj = js.Dynamic.literal(name = "MaximumRepositoryNamesExceededException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesMaximumRepositoryNamesExceededExceptionMod.MaximumRepositoryNamesExceededException]
    }
    
    inline def RepositoryNamesRequiredException(): typingsJapgolly.awsSdkClientCodecommitNode.typesRepositoryNamesRequiredExceptionMod.RepositoryNamesRequiredException = {
      val __obj = js.Dynamic.literal(name = "RepositoryNamesRequiredException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesRepositoryNamesRequiredExceptionMod.RepositoryNamesRequiredException]
    }
  }
}
