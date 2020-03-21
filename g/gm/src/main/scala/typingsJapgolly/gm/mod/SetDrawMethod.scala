package typingsJapgolly.gm.mod

import typingsJapgolly.gm.gmStrings.point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gm.gmStrings.point_
  - typingsJapgolly.gm.gmStrings.replace
  - typingsJapgolly.gm.gmStrings.floodfill
  - typingsJapgolly.gm.gmStrings.filltoborder
  - typingsJapgolly.gm.gmStrings.reset
*/
trait SetDrawMethod extends js.Object

object SetDrawMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def filltoborder: typingsJapgolly.gm.gmStrings.filltoborder = this.cast("filltoborder")
  @scala.inline
  def floodfill: typingsJapgolly.gm.gmStrings.floodfill = this.cast("floodfill")
  @scala.inline
  def point: point_ = this.cast("point")
  @scala.inline
  def replace: typingsJapgolly.gm.gmStrings.replace = this.cast("replace")
  @scala.inline
  def reset: typingsJapgolly.gm.gmStrings.reset = this.cast("reset")
}

