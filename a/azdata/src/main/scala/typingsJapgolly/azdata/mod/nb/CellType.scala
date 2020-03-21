package typingsJapgolly.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.azdata.azdataStrings.code
  - typingsJapgolly.azdata.azdataStrings.markdown
  - typingsJapgolly.azdata.azdataStrings.raw
*/
trait CellType extends js.Object

object CellType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: typingsJapgolly.azdata.azdataStrings.code = this.cast("code")
  @scala.inline
  def markdown: typingsJapgolly.azdata.azdataStrings.markdown = this.cast("markdown")
  @scala.inline
  def raw: typingsJapgolly.azdata.azdataStrings.raw = this.cast("raw")
}

