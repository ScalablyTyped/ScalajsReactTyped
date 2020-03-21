package typingsJapgolly.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.blessed.blessedStrings.adopt
  - typingsJapgolly.blessed.blessedStrings.remove
  - typingsJapgolly.blessed.blessedStrings.reparent
  - typingsJapgolly.blessed.blessedStrings.attach
  - typingsJapgolly.blessed.blessedStrings.detach
*/
trait NodeEventType extends js.Object

object NodeEventType {
  @scala.inline
  def adopt: typingsJapgolly.blessed.blessedStrings.adopt = this.cast("adopt")
  @scala.inline
  def attach: typingsJapgolly.blessed.blessedStrings.attach = this.cast("attach")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def detach: typingsJapgolly.blessed.blessedStrings.detach = this.cast("detach")
  @scala.inline
  def remove: typingsJapgolly.blessed.blessedStrings.remove = this.cast("remove")
  @scala.inline
  def reparent: typingsJapgolly.blessed.blessedStrings.reparent = this.cast("reparent")
}

