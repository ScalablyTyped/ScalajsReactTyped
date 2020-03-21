package typingsJapgolly.awsSdkClientKinesisBrowser.typesExpiredIteratorExceptionMod

import typingsJapgolly.awsSdkClientKinesisBrowser.getRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpiredIteratorException
  extends ServiceException[ExpiredIteratorExceptionDetails]
     with GetRecordsExceptionsUnion {
  @JSName("name")
  var name_ExpiredIteratorException: typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ExpiredIteratorException = js.native
}

