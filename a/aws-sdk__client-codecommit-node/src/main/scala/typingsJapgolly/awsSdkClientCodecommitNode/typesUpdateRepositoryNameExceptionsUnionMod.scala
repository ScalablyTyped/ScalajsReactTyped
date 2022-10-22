package typingsJapgolly.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateRepositoryNameExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException
    - typingsJapgolly.awsSdkClientCodecommitNode.typesRepositoryNameExistsExceptionMod.RepositoryNameExistsException
    - typingsJapgolly.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException
    - typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException
  */
  trait UpdateRepositoryNameExceptionsUnion extends StObject
  object UpdateRepositoryNameExceptionsUnion {
    
    inline def InvalidRepositoryNameException(): typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException = {
      val __obj = js.Dynamic.literal(name = "InvalidRepositoryNameException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidRepositoryNameExceptionMod.InvalidRepositoryNameException]
    }
    
    inline def RepositoryDoesNotExistException(): typingsJapgolly.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "RepositoryDoesNotExistException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesRepositoryDoesNotExistExceptionMod.RepositoryDoesNotExistException]
    }
    
    inline def RepositoryNameExistsException(): typingsJapgolly.awsSdkClientCodecommitNode.typesRepositoryNameExistsExceptionMod.RepositoryNameExistsException = {
      val __obj = js.Dynamic.literal(name = "RepositoryNameExistsException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesRepositoryNameExistsExceptionMod.RepositoryNameExistsException]
    }
    
    inline def RepositoryNameRequiredException(): typingsJapgolly.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException = {
      val __obj = js.Dynamic.literal(name = "RepositoryNameRequiredException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesRepositoryNameRequiredExceptionMod.RepositoryNameRequiredException]
    }
  }
}
