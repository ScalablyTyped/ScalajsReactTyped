package typingsJapgolly.awsSdkClientKmsNode.typesAlreadyExistsExceptionMod

import typingsJapgolly.awsSdkClientKmsNode.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlreadyExistsException
  extends ServiceException[AlreadyExistsExceptionDetails]
     with CreateAliasExceptionsUnion {
  @JSName("name")
  var name_AlreadyExistsException: typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.AlreadyExistsException = js.native
}

