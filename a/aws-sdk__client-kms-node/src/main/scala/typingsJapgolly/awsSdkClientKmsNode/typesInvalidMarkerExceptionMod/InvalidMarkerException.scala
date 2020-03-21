package typingsJapgolly.awsSdkClientKmsNode.typesInvalidMarkerExceptionMod

import typingsJapgolly.awsSdkClientKmsNode.listAliasesExceptionsUnionMod.ListAliasesExceptionsUnion
import typingsJapgolly.awsSdkClientKmsNode.listGrantsExceptionsUnionMod.ListGrantsExceptionsUnion
import typingsJapgolly.awsSdkClientKmsNode.listKeysExceptionsUnionMod.ListKeysExceptionsUnion
import typingsJapgolly.awsSdkClientKmsNode.listResourceTagsExceptionsUnionMod.ListResourceTagsExceptionsUnion
import typingsJapgolly.awsSdkClientKmsNode.listRetirableGrantsExceptionsUnionMod.ListRetirableGrantsExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidMarkerException
  extends ServiceException[InvalidMarkerExceptionDetails]
     with ListAliasesExceptionsUnion
     with ListGrantsExceptionsUnion
     with ListKeysExceptionsUnion
     with ListResourceTagsExceptionsUnion
     with ListRetirableGrantsExceptionsUnion {
  @JSName("name")
  var name_InvalidMarkerException: typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidMarkerException = js.native
}

