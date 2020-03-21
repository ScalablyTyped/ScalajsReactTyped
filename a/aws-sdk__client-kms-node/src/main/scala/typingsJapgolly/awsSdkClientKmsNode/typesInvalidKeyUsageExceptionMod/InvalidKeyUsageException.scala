package typingsJapgolly.awsSdkClientKmsNode.typesInvalidKeyUsageExceptionMod

import typingsJapgolly.awsSdkClientKmsNode.encryptExceptionsUnionMod.EncryptExceptionsUnion
import typingsJapgolly.awsSdkClientKmsNode.generateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typingsJapgolly.awsSdkClientKmsNode.generateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typingsJapgolly.awsSdkClientKmsNode.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidKeyUsageException
  extends ServiceException[InvalidKeyUsageExceptionDetails]
     with EncryptExceptionsUnion
     with GenerateDataKeyExceptionsUnion
     with GenerateDataKeyWithoutPlaintextExceptionsUnion
     with ReEncryptExceptionsUnion {
  @JSName("name")
  var name_InvalidKeyUsageException: typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidKeyUsageException = js.native
}

