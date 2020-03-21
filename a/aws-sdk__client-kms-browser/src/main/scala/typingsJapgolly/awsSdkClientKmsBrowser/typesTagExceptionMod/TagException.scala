package typingsJapgolly.awsSdkClientKmsBrowser.typesTagExceptionMod

import typingsJapgolly.awsSdkClientKmsBrowser.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagException
  extends ServiceException[TagExceptionDetails]
     with CreateKeyExceptionsUnion
     with TagResourceExceptionsUnion
     with UntagResourceExceptionsUnion {
  @JSName("name")
  var name_TagException: typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.TagException = js.native
}

