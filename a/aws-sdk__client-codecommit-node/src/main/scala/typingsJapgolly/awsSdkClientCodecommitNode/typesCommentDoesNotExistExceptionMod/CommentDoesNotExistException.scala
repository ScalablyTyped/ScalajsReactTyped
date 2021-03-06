package typingsJapgolly.awsSdkClientCodecommitNode.typesCommentDoesNotExistExceptionMod

import typingsJapgolly.awsSdkClientCodecommitNode.deleteCommentContentExceptionsUnionMod.DeleteCommentContentExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.getCommentExceptionsUnionMod.GetCommentExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.postCommentReplyExceptionsUnionMod.PostCommentReplyExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.updateCommentExceptionsUnionMod.UpdateCommentExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentDoesNotExistException
  extends ServiceException[CommentDoesNotExistExceptionDetails]
     with DeleteCommentContentExceptionsUnion
     with GetCommentExceptionsUnion
     with PostCommentReplyExceptionsUnion
     with UpdateCommentExceptionsUnion {
  @JSName("name")
  var name_CommentDoesNotExistException: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentDoesNotExistException = js.native
}

