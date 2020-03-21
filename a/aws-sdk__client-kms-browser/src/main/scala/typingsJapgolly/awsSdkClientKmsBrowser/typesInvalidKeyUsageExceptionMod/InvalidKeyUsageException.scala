package typingsJapgolly.awsSdkClientKmsBrowser.typesInvalidKeyUsageExceptionMod

import typingsJapgolly.awsSdkClientKmsBrowser.encryptExceptionsUnionMod.EncryptExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.generateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.generateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
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
  var name_InvalidKeyUsageException: typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidKeyUsageException = js.native
}

