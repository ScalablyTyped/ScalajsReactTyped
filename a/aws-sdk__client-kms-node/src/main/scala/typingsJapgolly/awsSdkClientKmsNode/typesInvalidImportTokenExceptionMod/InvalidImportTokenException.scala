package typingsJapgolly.awsSdkClientKmsNode.typesInvalidImportTokenExceptionMod

import typingsJapgolly.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidImportTokenException
  extends ServiceException[InvalidImportTokenExceptionDetails]
     with ImportKeyMaterialExceptionsUnion {
  @JSName("name")
  var name_InvalidImportTokenException: typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidImportTokenException = js.native
}

