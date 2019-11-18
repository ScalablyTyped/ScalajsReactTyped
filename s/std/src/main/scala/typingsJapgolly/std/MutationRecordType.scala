package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.attributes
  - typings.std.stdStrings.characterData
  - typings.std.stdStrings.childList
*/
trait MutationRecordType extends js.Object

object MutationRecordType {
  @scala.inline
  def attributes: typingsJapgolly.std.stdStrings.attributes = this.cast("attributes")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def characterData: typingsJapgolly.std.stdStrings.characterData = this.cast("characterData")
  @scala.inline
  def childList: typingsJapgolly.std.stdStrings.childList = this.cast("childList")
}

