package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.delete_
import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.create
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.modify
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.delete_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait RegistryOperation extends js.Object

object RegistryOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: typingsJapgolly.microsoftGraph.microsoftGraphStrings.create = this.cast("create")
  @scala.inline
  def delete: delete_ = this.cast("delete")
  @scala.inline
  def modify: typingsJapgolly.microsoftGraph.microsoftGraphStrings.modify = this.cast("modify")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

