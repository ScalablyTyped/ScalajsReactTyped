package typingsJapgolly.escPosEncoder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.escPosEncoder.escPosEncoderStrings.threshold
  - typingsJapgolly.escPosEncoder.escPosEncoderStrings.bayer
  - typingsJapgolly.escPosEncoder.escPosEncoderStrings.floydsteinberg
  - typingsJapgolly.escPosEncoder.escPosEncoderStrings.atkinson
*/
trait imgAlgType extends js.Object

object imgAlgType {
  @scala.inline
  def atkinson: typingsJapgolly.escPosEncoder.escPosEncoderStrings.atkinson = this.cast("atkinson")
  @scala.inline
  def bayer: typingsJapgolly.escPosEncoder.escPosEncoderStrings.bayer = this.cast("bayer")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def floydsteinberg: typingsJapgolly.escPosEncoder.escPosEncoderStrings.floydsteinberg = this.cast("floydsteinberg")
  @scala.inline
  def threshold: typingsJapgolly.escPosEncoder.escPosEncoderStrings.threshold = this.cast("threshold")
}

