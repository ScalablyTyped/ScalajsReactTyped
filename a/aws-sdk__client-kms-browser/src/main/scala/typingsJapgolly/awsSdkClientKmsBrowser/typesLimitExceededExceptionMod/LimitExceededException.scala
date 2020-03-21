package typingsJapgolly.awsSdkClientKmsBrowser.typesLimitExceededExceptionMod

import typingsJapgolly.awsSdkClientKmsBrowser.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.createGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.enableKeyExceptionsUnionMod.EnableKeyExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.putKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
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
  var name_LimitExceededException: typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.LimitExceededException = js.native
}

