package typingsJapgolly.gm.mod

import typingsJapgolly.gm.gmStrings.color_
import typingsJapgolly.gm.gmStrings.matte_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gm.gmStrings.color_
  - typingsJapgolly.gm.gmStrings.matte_
*/
trait SetDrawProperty extends js.Object

object SetDrawProperty {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def color: color_ = this.cast("color")
  @scala.inline
  def matte: matte_ = this.cast("matte")
}

