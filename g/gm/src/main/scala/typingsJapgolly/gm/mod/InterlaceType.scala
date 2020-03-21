package typingsJapgolly.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gm.gmStrings.None
  - typingsJapgolly.gm.gmStrings.Line
  - typingsJapgolly.gm.gmStrings.Plane
  - typingsJapgolly.gm.gmStrings.Partition
*/
trait InterlaceType extends js.Object

object InterlaceType {
  @scala.inline
  def Line: typingsJapgolly.gm.gmStrings.Line = this.cast("Line")
  @scala.inline
  def None: typingsJapgolly.gm.gmStrings.None = this.cast("None")
  @scala.inline
  def Partition: typingsJapgolly.gm.gmStrings.Partition = this.cast("Partition")
  @scala.inline
  def Plane: typingsJapgolly.gm.gmStrings.Plane = this.cast("Plane")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

