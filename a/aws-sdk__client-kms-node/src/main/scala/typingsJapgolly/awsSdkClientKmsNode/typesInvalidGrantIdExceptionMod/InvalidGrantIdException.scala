package typingsJapgolly.awsSdkClientKmsNode.typesInvalidGrantIdExceptionMod

import typingsJapgolly.awsSdkClientKmsNode.retireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typingsJapgolly.awsSdkClientKmsNode.revokeGrantExceptionsUnionMod.RevokeGrantExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidGrantIdException
  extends ServiceException[InvalidGrantIdExceptionDetails]
     with RetireGrantExceptionsUnion
     with RevokeGrantExceptionsUnion {
  @JSName("name")
  var name_InvalidGrantIdException: typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidGrantIdException = js.native
}

