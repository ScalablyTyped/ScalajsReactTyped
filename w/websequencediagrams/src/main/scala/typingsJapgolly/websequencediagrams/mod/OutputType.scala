package typingsJapgolly.websequencediagrams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.websequencediagrams.websequencediagramsStrings.png
  - typingsJapgolly.websequencediagrams.websequencediagramsStrings.svg
  - typingsJapgolly.websequencediagrams.websequencediagramsStrings.pdf
*/
trait OutputType extends js.Object

object OutputType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pdf: typingsJapgolly.websequencediagrams.websequencediagramsStrings.pdf = this.cast("pdf")
  @scala.inline
  def png: typingsJapgolly.websequencediagrams.websequencediagramsStrings.png = this.cast("png")
  @scala.inline
  def svg: typingsJapgolly.websequencediagrams.websequencediagramsStrings.svg = this.cast("svg")
}

