package typingsJapgolly.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.blessed.blessedStrings.resize
  - typingsJapgolly.blessed.blessedStrings.prerender
  - typingsJapgolly.blessed.blessedStrings.render
  - typingsJapgolly.blessed.blessedStrings.destroy
  - typingsJapgolly.blessed.blessedStrings.move
  - typingsJapgolly.blessed.blessedStrings.show
  - typingsJapgolly.blessed.blessedStrings.hide
  - typingsJapgolly.blessed.blessedStrings.`set content`
  - typingsJapgolly.blessed.blessedStrings.`parsed content`
*/
trait NodeGenericEventType extends js.Object

object NodeGenericEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def destroy: typingsJapgolly.blessed.blessedStrings.destroy = this.cast("destroy")
  @scala.inline
  def hide: typingsJapgolly.blessed.blessedStrings.hide = this.cast("hide")
  @scala.inline
  def move: typingsJapgolly.blessed.blessedStrings.move = this.cast("move")
  @scala.inline
  def `parsed content`: typingsJapgolly.blessed.blessedStrings.`parsed content` = this.cast("parsed content")
  @scala.inline
  def prerender: typingsJapgolly.blessed.blessedStrings.prerender = this.cast("prerender")
  @scala.inline
  def render: typingsJapgolly.blessed.blessedStrings.render = this.cast("render")
  @scala.inline
  def resize: typingsJapgolly.blessed.blessedStrings.resize = this.cast("resize")
  @scala.inline
  def `set content`: typingsJapgolly.blessed.blessedStrings.`set content` = this.cast("set content")
  @scala.inline
  def show: typingsJapgolly.blessed.blessedStrings.show = this.cast("show")
}

