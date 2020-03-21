package typingsJapgolly.gm.mod

import typingsJapgolly.gm.gmStrings.Grayscale_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gm.gmStrings.Bilevel
  - typingsJapgolly.gm.gmStrings.Grayscale_
  - typingsJapgolly.gm.gmStrings.Palette
  - typingsJapgolly.gm.gmStrings.PaletteMatte
  - typingsJapgolly.gm.gmStrings.TrueColor
  - typingsJapgolly.gm.gmStrings.TrueColorMatte
  - typingsJapgolly.gm.gmStrings.ColorSeparation
  - typingsJapgolly.gm.gmStrings.ColorSeparationMatte
  - typingsJapgolly.gm.gmStrings.Optimize
*/
trait ImageType extends js.Object

object ImageType {
  @scala.inline
  def Bilevel: typingsJapgolly.gm.gmStrings.Bilevel = this.cast("Bilevel")
  @scala.inline
  def ColorSeparation: typingsJapgolly.gm.gmStrings.ColorSeparation = this.cast("ColorSeparation")
  @scala.inline
  def ColorSeparationMatte: typingsJapgolly.gm.gmStrings.ColorSeparationMatte = this.cast("ColorSeparationMatte")
  @scala.inline
  def Grayscale: Grayscale_ = this.cast("Grayscale")
  @scala.inline
  def Optimize: typingsJapgolly.gm.gmStrings.Optimize = this.cast("Optimize")
  @scala.inline
  def Palette: typingsJapgolly.gm.gmStrings.Palette = this.cast("Palette")
  @scala.inline
  def PaletteMatte: typingsJapgolly.gm.gmStrings.PaletteMatte = this.cast("PaletteMatte")
  @scala.inline
  def TrueColor: typingsJapgolly.gm.gmStrings.TrueColor = this.cast("TrueColor")
  @scala.inline
  def TrueColorMatte: typingsJapgolly.gm.gmStrings.TrueColorMatte = this.cast("TrueColorMatte")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

