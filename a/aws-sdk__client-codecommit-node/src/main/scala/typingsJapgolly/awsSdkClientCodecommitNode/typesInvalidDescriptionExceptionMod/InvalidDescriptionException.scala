package typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidDescriptionExceptionMod

import typingsJapgolly.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.updatePullRequestDescriptionExceptionsUnionMod.UpdatePullRequestDescriptionExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidDescriptionException
  extends ServiceException[InvalidDescriptionExceptionDetails]
     with CreatePullRequestExceptionsUnion
     with UpdatePullRequestDescriptionExceptionsUnion {
  @JSName("name")
  var name_InvalidDescriptionException: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidDescriptionException = js.native
}

