package typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An alias for a stream type.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.stdout
  - typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.stderr
*/
trait StreamType extends js.Object

object StreamType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def stderr: typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.stderr = this.cast("stderr")
  @scala.inline
  def stdout: typingsJapgolly.jupyterlabCoreutils.jupyterlabCoreutilsStrings.stdout = this.cast("stdout")
}

