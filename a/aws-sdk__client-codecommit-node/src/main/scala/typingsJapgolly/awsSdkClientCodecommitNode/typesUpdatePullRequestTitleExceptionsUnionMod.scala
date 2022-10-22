package typingsJapgolly.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdatePullRequestTitleExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestDoesNotExistExceptionMod.PullRequestDoesNotExistException
    - typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException
    - typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestIdRequiredExceptionMod.PullRequestIdRequiredException
    - typingsJapgolly.awsSdkClientCodecommitNode.typesTitleRequiredExceptionMod.TitleRequiredException
    - typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidTitleExceptionMod.InvalidTitleException
    - typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestAlreadyClosedExceptionMod.PullRequestAlreadyClosedException
  */
  trait UpdatePullRequestTitleExceptionsUnion extends StObject
  object UpdatePullRequestTitleExceptionsUnion {
    
    inline def InvalidPullRequestIdException(): typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException = {
      val __obj = js.Dynamic.literal(name = "InvalidPullRequestIdException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidPullRequestIdExceptionMod.InvalidPullRequestIdException]
    }
    
    inline def InvalidTitleException(): typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidTitleExceptionMod.InvalidTitleException = {
      val __obj = js.Dynamic.literal(name = "InvalidTitleException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidTitleExceptionMod.InvalidTitleException]
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
    
    inline def TitleRequiredException(): typingsJapgolly.awsSdkClientCodecommitNode.typesTitleRequiredExceptionMod.TitleRequiredException = {
      val __obj = js.Dynamic.literal(name = "TitleRequiredException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesTitleRequiredExceptionMod.TitleRequiredException]
    }
  }
}
