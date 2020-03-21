package typingsJapgolly.awsSdkClientKmsNode.typesExpiredImportTokenExceptionMod

import typingsJapgolly.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpiredImportTokenException
  extends ServiceException[ExpiredImportTokenExceptionDetails]
     with ImportKeyMaterialExceptionsUnion {
  @JSName("name")
  var name_ExpiredImportTokenException: typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ExpiredImportTokenException = js.native
}

