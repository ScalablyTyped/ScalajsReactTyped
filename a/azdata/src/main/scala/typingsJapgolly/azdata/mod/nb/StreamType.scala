package typingsJapgolly.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.azdata.azdataStrings.stdout
  - typingsJapgolly.azdata.azdataStrings.stderr
*/
trait StreamType extends js.Object

object StreamType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def stderr: typingsJapgolly.azdata.azdataStrings.stderr = this.cast("stderr")
  @scala.inline
  def stdout: typingsJapgolly.azdata.azdataStrings.stdout = this.cast("stdout")
}

