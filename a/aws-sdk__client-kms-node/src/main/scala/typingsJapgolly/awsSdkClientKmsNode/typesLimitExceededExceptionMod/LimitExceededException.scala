package typingsJapgolly.awsSdkClientKmsNode.typesLimitExceededExceptionMod

import typingsJapgolly.awsSdkClientKmsNode.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typingsJapgolly.awsSdkClientKmsNode.createGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typingsJapgolly.awsSdkClientKmsNode.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typingsJapgolly.awsSdkClientKmsNode.enableKeyExceptionsUnionMod.EnableKeyExceptionsUnion
import typingsJapgolly.awsSdkClientKmsNode.putKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typingsJapgolly.awsSdkClientKmsNode.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LimitExceededException
  extends ServiceException[LimitExceededExceptionDetails]
     with CreateAliasExceptionsUnion
     with CreateGrantExceptionsUnion
     with CreateKeyExceptionsUnion
     with EnableKeyExceptionsUnion
     with PutKeyPolicyExceptionsUnion
     with TagResourceExceptionsUnion {
  @JSName("name")
  var name_LimitExceededException: typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.LimitExceededException = js.native
}

