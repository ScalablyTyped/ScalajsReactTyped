package typingsJapgolly.awsSdkClientCodecommitNode.typesPullRequestStatusRequiredExceptionMod

import typingsJapgolly.awsSdkClientCodecommitNode.updatePullRequestStatusExceptionsUnionMod.UpdatePullRequestStatusExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestStatusRequiredException
  extends ServiceException[PullRequestStatusRequiredExceptionDetails]
     with UpdatePullRequestStatusExceptionsUnion {
  @JSName("name")
  var name_PullRequestStatusRequiredException: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestStatusRequiredException = js.native
}

