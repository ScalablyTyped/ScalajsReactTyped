package typingsJapgolly.awsSdkClientKmsNode.typesIncorrectKeyMaterialExceptionMod

import typingsJapgolly.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncorrectKeyMaterialException
  extends ServiceException[IncorrectKeyMaterialExceptionDetails]
     with ImportKeyMaterialExceptionsUnion {
  @JSName("name")
  var name_IncorrectKeyMaterialException: typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.IncorrectKeyMaterialException = js.native
}

