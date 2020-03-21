package typingsJapgolly.awsSdkClientCodecommitNode.typesRepositoryNamesRequiredExceptionMod

import typingsJapgolly.awsSdkClientCodecommitNode.batchGetRepositoriesExceptionsUnionMod.BatchGetRepositoriesExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryNamesRequiredException
  extends ServiceException[RepositoryNamesRequiredExceptionDetails]
     with BatchGetRepositoriesExceptionsUnion {
  @JSName("name")
  var name_RepositoryNamesRequiredException: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNamesRequiredException = js.native
}

