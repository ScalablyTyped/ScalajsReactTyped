package typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidFilePositionExceptionMod

import typingsJapgolly.awsSdkClientCodecommitNode.postCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidFilePositionException
  extends ServiceException[InvalidFilePositionExceptionDetails]
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion {
  @JSName("name")
  var name_InvalidFilePositionException: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidFilePositionException = js.native
}

