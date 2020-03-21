package typingsJapgolly.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.codemirror.codemirrorStrings.window
  - typingsJapgolly.codemirror.codemirrorStrings.page
  - typingsJapgolly.codemirror.codemirrorStrings.local
  - typingsJapgolly.codemirror.codemirrorStrings.div
*/
trait CoordsMode extends js.Object

object CoordsMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def div: typingsJapgolly.codemirror.codemirrorStrings.div = this.cast("div")
  @scala.inline
  def local: typingsJapgolly.codemirror.codemirrorStrings.local = this.cast("local")
  @scala.inline
  def page: typingsJapgolly.codemirror.codemirrorStrings.page = this.cast("page")
  @scala.inline
  def window: typingsJapgolly.codemirror.codemirrorStrings.window = this.cast("window")
}

