package typingsJapgolly.awsSdkClientKmsNode.typesInvalidCiphertextExceptionMod

import typingsJapgolly.awsSdkClientKmsNode.decryptExceptionsUnionMod.DecryptExceptionsUnion
import typingsJapgolly.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typingsJapgolly.awsSdkClientKmsNode.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidCiphertextException
  extends ServiceException[InvalidCiphertextExceptionDetails]
     with DecryptExceptionsUnion
     with ImportKeyMaterialExceptionsUnion
     with ReEncryptExceptionsUnion {
  @JSName("name")
  var name_InvalidCiphertextException: typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidCiphertextException = js.native
}

