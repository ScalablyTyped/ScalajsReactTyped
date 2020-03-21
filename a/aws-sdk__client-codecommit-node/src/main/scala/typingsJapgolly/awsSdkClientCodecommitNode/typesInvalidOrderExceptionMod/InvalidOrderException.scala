package typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidOrderExceptionMod

import typingsJapgolly.awsSdkClientCodecommitNode.listRepositoriesExceptionsUnionMod.ListRepositoriesExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidOrderException
  extends ServiceException[InvalidOrderExceptionDetails]
     with ListRepositoriesExceptionsUnion {
  @JSName("name")
  var name_InvalidOrderException: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidOrderException = js.native
}

