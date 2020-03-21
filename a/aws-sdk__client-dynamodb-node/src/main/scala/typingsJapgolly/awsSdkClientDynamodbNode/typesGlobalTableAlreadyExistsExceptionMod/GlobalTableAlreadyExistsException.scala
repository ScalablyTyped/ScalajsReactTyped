package typingsJapgolly.awsSdkClientDynamodbNode.typesGlobalTableAlreadyExistsExceptionMod

import typingsJapgolly.awsSdkClientDynamodbNode.createGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalTableAlreadyExistsException
  extends ServiceException[GlobalTableAlreadyExistsExceptionDetails]
     with CreateGlobalTableExceptionsUnion {
  @JSName("name")
  var name_GlobalTableAlreadyExistsException: typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.GlobalTableAlreadyExistsException = js.native
}

