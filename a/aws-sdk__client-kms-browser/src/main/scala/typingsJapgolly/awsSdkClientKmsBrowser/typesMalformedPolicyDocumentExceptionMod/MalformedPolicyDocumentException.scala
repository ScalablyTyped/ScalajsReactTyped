package typingsJapgolly.awsSdkClientKmsBrowser.typesMalformedPolicyDocumentExceptionMod

import typingsJapgolly.awsSdkClientKmsBrowser.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.putKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
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
  var name_MalformedPolicyDocumentException: typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.MalformedPolicyDocumentException = js.native
}

