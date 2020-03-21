package typingsJapgolly.rcTable.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rcTable.rcTableStrings.left
  - typingsJapgolly.rcTable.rcTableStrings.center
  - typingsJapgolly.rcTable.rcTableStrings.right
*/
trait AlignType extends js.Object

object AlignType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typingsJapgolly.rcTable.rcTableStrings.center = this.cast("center")
  @scala.inline
  def left: typingsJapgolly.rcTable.rcTableStrings.left = this.cast("left")
  @scala.inline
  def right: typingsJapgolly.rcTable.rcTableStrings.right = this.cast("right")
}

