package typingsJapgolly.mdast.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mdast.mdastStrings.shortcut
  - typingsJapgolly.mdast.mdastStrings.collapsed
  - typingsJapgolly.mdast.mdastStrings.full
*/
trait ReferenceType extends js.Object

object ReferenceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def collapsed: typingsJapgolly.mdast.mdastStrings.collapsed = this.cast("collapsed")
  @scala.inline
  def full: typingsJapgolly.mdast.mdastStrings.full = this.cast("full")
  @scala.inline
  def shortcut: typingsJapgolly.mdast.mdastStrings.shortcut = this.cast("shortcut")
}

