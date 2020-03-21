package typingsJapgolly.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.csstype.csstypeStrings.`fill-box`
  - typingsJapgolly.csstype.csstypeStrings.`margin-box`
  - typingsJapgolly.csstype.csstypeStrings.`stroke-box`
  - typingsJapgolly.csstype.csstypeStrings.`view-box`
  - typingsJapgolly.csstype.csstypeStrings.`border-box`
  - typingsJapgolly.csstype.csstypeStrings.`content-box`
  - typingsJapgolly.csstype.csstypeStrings.`padding-box`
*/
trait GeometryBox
  extends _MaskLayer[js.Any]
     with _ClipPathProperty
     with _MaskClipProperty
     with _MaskOriginProperty
     with _OffsetPathProperty
     with _OffsetProperty[js.Any]

object GeometryBox {
  @scala.inline
  def `border-box`: typingsJapgolly.csstype.csstypeStrings.`border-box` = this.cast("border-box")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `content-box`: typingsJapgolly.csstype.csstypeStrings.`content-box` = this.cast("content-box")
  @scala.inline
  def `fill-box`: typingsJapgolly.csstype.csstypeStrings.`fill-box` = this.cast("fill-box")
  @scala.inline
  def `margin-box`: typingsJapgolly.csstype.csstypeStrings.`margin-box` = this.cast("margin-box")
  @scala.inline
  def `padding-box`: typingsJapgolly.csstype.csstypeStrings.`padding-box` = this.cast("padding-box")
  @scala.inline
  def `stroke-box`: typingsJapgolly.csstype.csstypeStrings.`stroke-box` = this.cast("stroke-box")
  @scala.inline
  def `view-box`: typingsJapgolly.csstype.csstypeStrings.`view-box` = this.cast("view-box")
}

