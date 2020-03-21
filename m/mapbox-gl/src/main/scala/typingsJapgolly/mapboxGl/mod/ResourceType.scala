package typingsJapgolly.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mapboxGl.mapboxGlStrings.Unknown
  - typingsJapgolly.mapboxGl.mapboxGlStrings.Style
  - typingsJapgolly.mapboxGl.mapboxGlStrings.Source
  - typingsJapgolly.mapboxGl.mapboxGlStrings.Tile
  - typingsJapgolly.mapboxGl.mapboxGlStrings.Glyphs
  - typingsJapgolly.mapboxGl.mapboxGlStrings.SpriteImage
  - typingsJapgolly.mapboxGl.mapboxGlStrings.SpriteJSON
  - typingsJapgolly.mapboxGl.mapboxGlStrings.Image
*/
trait ResourceType extends js.Object

object ResourceType {
  @scala.inline
  def Glyphs: typingsJapgolly.mapboxGl.mapboxGlStrings.Glyphs = this.cast("Glyphs")
  @scala.inline
  def Image: typingsJapgolly.mapboxGl.mapboxGlStrings.Image = this.cast("Image")
  @scala.inline
  def Source: typingsJapgolly.mapboxGl.mapboxGlStrings.Source = this.cast("Source")
  @scala.inline
  def SpriteImage: typingsJapgolly.mapboxGl.mapboxGlStrings.SpriteImage = this.cast("SpriteImage")
  @scala.inline
  def SpriteJSON: typingsJapgolly.mapboxGl.mapboxGlStrings.SpriteJSON = this.cast("SpriteJSON")
  @scala.inline
  def Style: typingsJapgolly.mapboxGl.mapboxGlStrings.Style = this.cast("Style")
  @scala.inline
  def Tile: typingsJapgolly.mapboxGl.mapboxGlStrings.Tile = this.cast("Tile")
  @scala.inline
  def Unknown: typingsJapgolly.mapboxGl.mapboxGlStrings.Unknown = this.cast("Unknown")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

