package typingsJapgolly.awsSdkClientCodecommitNode.typesMaximumRepositoryNamesExceededExceptionMod

import typingsJapgolly.awsSdkClientCodecommitNode.batchGetRepositoriesExceptionsUnionMod.BatchGetRepositoriesExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaximumRepositoryNamesExceededException
  extends ServiceException[MaximumRepositoryNamesExceededExceptionDetails]
     with BatchGetRepositoriesExceptionsUnion {
  @JSName("name")
  var name_MaximumRepositoryNamesExceededException: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumRepositoryNamesExceededException = js.native
}

