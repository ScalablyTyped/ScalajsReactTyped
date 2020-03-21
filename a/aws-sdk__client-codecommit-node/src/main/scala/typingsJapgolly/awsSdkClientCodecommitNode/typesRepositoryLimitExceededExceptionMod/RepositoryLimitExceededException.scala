package typingsJapgolly.awsSdkClientCodecommitNode.typesRepositoryLimitExceededExceptionMod

import typingsJapgolly.awsSdkClientCodecommitNode.createRepositoryExceptionsUnionMod.CreateRepositoryExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryLimitExceededException
  extends ServiceException[RepositoryLimitExceededExceptionDetails]
     with CreateRepositoryExceptionsUnion {
  @JSName("name")
  var name_RepositoryLimitExceededException: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryLimitExceededException = js.native
}

