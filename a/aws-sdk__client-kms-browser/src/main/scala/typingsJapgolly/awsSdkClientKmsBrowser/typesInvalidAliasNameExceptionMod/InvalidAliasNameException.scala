package typingsJapgolly.awsSdkClientKmsBrowser.typesInvalidAliasNameExceptionMod

import typingsJapgolly.awsSdkClientKmsBrowser.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidAliasNameException
  extends ServiceException[InvalidAliasNameExceptionDetails]
     with CreateAliasExceptionsUnion {
  @JSName("name")
  var name_InvalidAliasNameException: typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidAliasNameException = js.native
}

