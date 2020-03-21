package typingsJapgolly.awsSdkClientKmsBrowser.typesInvalidCiphertextExceptionMod

import typingsJapgolly.awsSdkClientKmsBrowser.decryptExceptionsUnionMod.DecryptExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
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
  var name_InvalidCiphertextException: typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidCiphertextException = js.native
}

