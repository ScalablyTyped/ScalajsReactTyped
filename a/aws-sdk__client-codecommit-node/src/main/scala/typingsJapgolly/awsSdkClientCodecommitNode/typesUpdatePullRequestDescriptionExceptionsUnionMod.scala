package typingsJapgolly.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdatePullRequestDescriptionExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestDoesNotExistExceptionMod.PullRequestDoesNotExistException
    - typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException
    - typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestIdRequiredExceptionMod.PullRequestIdRequiredException
    - typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidDescriptionExceptionMod.InvalidDescriptionException
    - typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestAlreadyClosedExceptionMod.PullRequestAlreadyClosedException
  */
  trait UpdatePullRequestDescriptionExceptionsUnion extends StObject
  object UpdatePullRequestDescriptionExceptionsUnion {
    
    inline def InvalidDescriptionException(): typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidDescriptionExceptionMod.InvalidDescriptionException = {
      val __obj = js.Dynamic.literal(name = "InvalidDescriptionException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidDescriptionExceptionMod.InvalidDescriptionException]
    }
    
    inline def InvalidPullRequestIdException(): typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException = {
      val __obj = js.Dynamic.literal(name = "InvalidPullRequestIdException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException]
    }
    
    inline def PullRequestAlreadyClosedException(): typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestAlreadyClosedExceptionMod.PullRequestAlreadyClosedException = {
      val __obj = js.Dynamic.literal(name = "PullRequestAlreadyClosedException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestAlreadyClosedExceptionMod.PullRequestAlreadyClosedException]
    }
    
    inline def PullRequestDoesNotExistException(): typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestDoesNotExistExceptionMod.PullRequestDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "PullRequestDoesNotExistException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestDoesNotExistExceptionMod.PullRequestDoesNotExistException]
    }
    
    inline def PullRequestIdRequiredException(): typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestIdRequiredExceptionMod.PullRequestIdRequiredException = {
      val __obj = js.Dynamic.literal(name = "PullRequestIdRequiredException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestIdRequiredExceptionMod.PullRequestIdRequiredException]
    }
  }
}
