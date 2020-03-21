package typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type which describes the type of cell.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.code
  - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.markdown
  - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.raw
*/
trait CellType extends js.Object

object CellType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.code = this.cast("code")
  @scala.inline
  def markdown: typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.markdown = this.cast("markdown")
  @scala.inline
  def raw: typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.raw = this.cast("raw")
}

