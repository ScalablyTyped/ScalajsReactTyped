package typingsJapgolly.awsSdkClientKmsBrowser.typesKeyUnavailableExceptionMod

import typingsJapgolly.awsSdkClientKmsBrowser.decryptExceptionsUnionMod.DecryptExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.encryptExceptionsUnionMod.EncryptExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.generateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.generateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyUnavailableException
  extends ServiceException[KeyUnavailableExceptionDetails]
     with DecryptExceptionsUnion
     with EncryptExceptionsUnion
     with GenerateDataKeyExceptionsUnion
     with GenerateDataKeyWithoutPlaintextExceptionsUnion
     with ReEncryptExceptionsUnion {
  @JSName("name")
  var name_KeyUnavailableException: typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.KeyUnavailableException = js.native
}

