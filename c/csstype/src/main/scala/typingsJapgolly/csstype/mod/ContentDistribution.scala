package typingsJapgolly.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.csstype.csstypeStrings.`space-around`
  - typingsJapgolly.csstype.csstypeStrings.`space-between`
  - typingsJapgolly.csstype.csstypeStrings.`space-evenly`
  - typingsJapgolly.csstype.csstypeStrings.stretch
*/
trait ContentDistribution
  extends _AlignContentProperty
     with _JustifyContentProperty
     with _PlaceContentProperty

object ContentDistribution {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `space-around`: typingsJapgolly.csstype.csstypeStrings.`space-around` = this.cast("space-around")
  @scala.inline
  def `space-between`: typingsJapgolly.csstype.csstypeStrings.`space-between` = this.cast("space-between")
  @scala.inline
  def `space-evenly`: typingsJapgolly.csstype.csstypeStrings.`space-evenly` = this.cast("space-evenly")
  @scala.inline
  def stretch: typingsJapgolly.csstype.csstypeStrings.stretch = this.cast("stretch")
}

