package typingsJapgolly.awsSdkClientKmsBrowser.typesAlreadyExistsExceptionMod

import typingsJapgolly.awsSdkClientKmsBrowser.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlreadyExistsException
  extends ServiceException[AlreadyExistsExceptionDetails]
     with CreateAliasExceptionsUnion {
  @JSName("name")
  var name_AlreadyExistsException: typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.AlreadyExistsException = js.native
}

