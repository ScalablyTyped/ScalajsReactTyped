package typingsJapgolly.theo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.theo.theoStrings.colorSlashrgb
  - typingsJapgolly.theo.theoStrings.colorSlashhex
  - typingsJapgolly.theo.theoStrings.colorSlashhex8rgba
  - typingsJapgolly.theo.theoStrings.colorSlashhex8argb
  - typingsJapgolly.theo.theoStrings.percentageSlashfloat
  - typingsJapgolly.theo.theoStrings.relativeSlashpixel
  - typingsJapgolly.theo.theoStrings.relativeSlashpixelValue
*/
trait ValueTransform extends js.Object

object ValueTransform {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def colorSlashhex: typingsJapgolly.theo.theoStrings.colorSlashhex = this.cast("color/hex")
  @scala.inline
  def colorSlashhex8argb: typingsJapgolly.theo.theoStrings.colorSlashhex8argb = this.cast("color/hex8argb")
  @scala.inline
  def colorSlashhex8rgba: typingsJapgolly.theo.theoStrings.colorSlashhex8rgba = this.cast("color/hex8rgba")
  @scala.inline
  def colorSlashrgb: typingsJapgolly.theo.theoStrings.colorSlashrgb = this.cast("color/rgb")
  @scala.inline
  def percentageSlashfloat: typingsJapgolly.theo.theoStrings.percentageSlashfloat = this.cast("percentage/float")
  @scala.inline
  def relativeSlashpixel: typingsJapgolly.theo.theoStrings.relativeSlashpixel = this.cast("relative/pixel")
  @scala.inline
  def relativeSlashpixelValue: typingsJapgolly.theo.theoStrings.relativeSlashpixelValue = this.cast("relative/pixelValue")
}

