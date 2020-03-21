package typingsJapgolly.awsSdkClientKmsNode.typesMalformedPolicyDocumentExceptionMod

import typingsJapgolly.awsSdkClientKmsNode.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typingsJapgolly.awsSdkClientKmsNode.putKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MalformedPolicyDocumentException
  extends ServiceException[MalformedPolicyDocumentExceptionDetails]
     with CreateKeyExceptionsUnion
     with PutKeyPolicyExceptionsUnion {
  @JSName("name")
  var name_MalformedPolicyDocumentException: typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.MalformedPolicyDocumentException = js.native
}

