package typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The valid output types.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.execute_result
  - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.display_data
  - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.stream
  - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.error
  - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.update_display_data
*/
trait OutputType extends js.Object

object OutputType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def display_data: typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.display_data = this.cast("display_data")
  @scala.inline
  def error: typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.error = this.cast("error")
  @scala.inline
  def execute_result: typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.execute_result = this.cast("execute_result")
  @scala.inline
  def stream: typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.stream = this.cast("stream")
  @scala.inline
  def update_display_data: typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.update_display_data = this.cast("update_display_data")
}

