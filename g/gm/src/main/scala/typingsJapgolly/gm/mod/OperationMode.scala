package typingsJapgolly.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gm.gmStrings.frame
  - typingsJapgolly.gm.gmStrings.unframe
  - typingsJapgolly.gm.gmStrings.concatenate
*/
trait OperationMode extends js.Object

object OperationMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def concatenate: typingsJapgolly.gm.gmStrings.concatenate = this.cast("concatenate")
  @scala.inline
  def frame: typingsJapgolly.gm.gmStrings.frame = this.cast("frame")
  @scala.inline
  def unframe: typingsJapgolly.gm.gmStrings.unframe = this.cast("unframe")
}

