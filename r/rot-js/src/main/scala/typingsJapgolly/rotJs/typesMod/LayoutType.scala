package typingsJapgolly.rotJs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rotJs.rotJsStrings.hex
  - typingsJapgolly.rotJs.rotJsStrings.rect
  - typingsJapgolly.rotJs.rotJsStrings.tile
  - typingsJapgolly.rotJs.rotJsStrings.`tile-gl`
  - typingsJapgolly.rotJs.rotJsStrings.term
*/
trait LayoutType extends js.Object

object LayoutType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typingsJapgolly.rotJs.rotJsStrings.hex = this.cast("hex")
  @scala.inline
  def rect: typingsJapgolly.rotJs.rotJsStrings.rect = this.cast("rect")
  @scala.inline
  def term: typingsJapgolly.rotJs.rotJsStrings.term = this.cast("term")
  @scala.inline
  def tile: typingsJapgolly.rotJs.rotJsStrings.tile = this.cast("tile")
  @scala.inline
  def `tile-gl`: typingsJapgolly.rotJs.rotJsStrings.`tile-gl` = this.cast("tile-gl")
}

