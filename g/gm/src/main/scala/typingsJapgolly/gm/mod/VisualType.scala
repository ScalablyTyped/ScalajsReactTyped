package typingsJapgolly.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gm.gmStrings.StaticGray
  - typingsJapgolly.gm.gmStrings.GrayScale
  - typingsJapgolly.gm.gmStrings.StaticColor
  - typingsJapgolly.gm.gmStrings.PseudoColor
  - typingsJapgolly.gm.gmStrings.TrueColor
  - typingsJapgolly.gm.gmStrings.DirectColor
  - typingsJapgolly.gm.gmStrings.default
*/
trait VisualType extends js.Object

object VisualType {
  @scala.inline
  def DirectColor: typingsJapgolly.gm.gmStrings.DirectColor = this.cast("DirectColor")
  @scala.inline
  def GrayScale: typingsJapgolly.gm.gmStrings.GrayScale = this.cast("GrayScale")
  @scala.inline
  def PseudoColor: typingsJapgolly.gm.gmStrings.PseudoColor = this.cast("PseudoColor")
  @scala.inline
  def StaticColor: typingsJapgolly.gm.gmStrings.StaticColor = this.cast("StaticColor")
  @scala.inline
  def StaticGray: typingsJapgolly.gm.gmStrings.StaticGray = this.cast("StaticGray")
  @scala.inline
  def TrueColor: typingsJapgolly.gm.gmStrings.TrueColor = this.cast("TrueColor")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsJapgolly.gm.gmStrings.default = this.cast("default")
}

