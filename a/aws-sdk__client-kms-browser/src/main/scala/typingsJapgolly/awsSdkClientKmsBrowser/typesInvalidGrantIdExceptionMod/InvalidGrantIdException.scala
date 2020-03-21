package typingsJapgolly.awsSdkClientKmsBrowser.typesInvalidGrantIdExceptionMod

import typingsJapgolly.awsSdkClientKmsBrowser.retireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.revokeGrantExceptionsUnionMod.RevokeGrantExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidGrantIdException
  extends ServiceException[InvalidGrantIdExceptionDetails]
     with RetireGrantExceptionsUnion
     with RevokeGrantExceptionsUnion {
  @JSName("name")
  var name_InvalidGrantIdException: typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidGrantIdException = js.native
}

