package typingsJapgolly.reactImgpro.mod.ReactImgpro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactImgpro.reactImgproStrings.neighbor
  - typingsJapgolly.reactImgpro.reactImgproStrings.bilinear
  - typingsJapgolly.reactImgpro.reactImgproStrings.bicubic
  - typingsJapgolly.reactImgpro.reactImgproStrings.hermite
  - typingsJapgolly.reactImgpro.reactImgproStrings.bezier
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  def bezier: typingsJapgolly.reactImgpro.reactImgproStrings.bezier = this.cast("bezier")
  @scala.inline
  def bicubic: typingsJapgolly.reactImgpro.reactImgproStrings.bicubic = this.cast("bicubic")
  @scala.inline
  def bilinear: typingsJapgolly.reactImgpro.reactImgproStrings.bilinear = this.cast("bilinear")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hermite: typingsJapgolly.reactImgpro.reactImgproStrings.hermite = this.cast("hermite")
  @scala.inline
  def neighbor: typingsJapgolly.reactImgpro.reactImgproStrings.neighbor = this.cast("neighbor")
}

