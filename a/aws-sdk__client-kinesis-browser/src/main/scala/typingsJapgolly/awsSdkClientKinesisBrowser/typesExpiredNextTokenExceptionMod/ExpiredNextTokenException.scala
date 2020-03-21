package typingsJapgolly.awsSdkClientKinesisBrowser.typesExpiredNextTokenExceptionMod

import typingsJapgolly.awsSdkClientKinesisBrowser.listShardsExceptionsUnionMod.ListShardsExceptionsUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.listStreamConsumersExceptionsUnionMod.ListStreamConsumersExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpiredNextTokenException
  extends ServiceException[ExpiredNextTokenExceptionDetails]
     with ListShardsExceptionsUnion
     with ListStreamConsumersExceptionsUnion {
  @JSName("name")
  var name_ExpiredNextTokenException: typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ExpiredNextTokenException = js.native
}

