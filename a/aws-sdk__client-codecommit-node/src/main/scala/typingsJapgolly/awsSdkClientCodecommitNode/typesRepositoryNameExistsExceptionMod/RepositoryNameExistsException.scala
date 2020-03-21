package typingsJapgolly.awsSdkClientCodecommitNode.typesRepositoryNameExistsExceptionMod

import typingsJapgolly.awsSdkClientCodecommitNode.createRepositoryExceptionsUnionMod.CreateRepositoryExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.updateRepositoryNameExceptionsUnionMod.UpdateRepositoryNameExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryNameExistsException
  extends ServiceException[RepositoryNameExistsExceptionDetails]
     with CreateRepositoryExceptionsUnion
     with UpdateRepositoryNameExceptionsUnion {
  @JSName("name")
  var name_RepositoryNameExistsException: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNameExistsException = js.native
}

