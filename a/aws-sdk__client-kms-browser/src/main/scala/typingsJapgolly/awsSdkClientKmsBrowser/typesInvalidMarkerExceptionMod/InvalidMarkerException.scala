package typingsJapgolly.awsSdkClientKmsBrowser.typesInvalidMarkerExceptionMod

import typingsJapgolly.awsSdkClientKmsBrowser.listAliasesExceptionsUnionMod.ListAliasesExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.listGrantsExceptionsUnionMod.ListGrantsExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.listKeysExceptionsUnionMod.ListKeysExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.listResourceTagsExceptionsUnionMod.ListResourceTagsExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.listRetirableGrantsExceptionsUnionMod.ListRetirableGrantsExceptionsUnion
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
  var name_InvalidMarkerException: typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidMarkerException = js.native
}

