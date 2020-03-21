package typingsJapgolly.vegaTypings.scaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.width
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.height
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.symbol
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.category
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.ordinal
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.ramp
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.diverging
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.heatmap
*/
trait RangeEnum
  extends _RangeBand
     with _RangeScheme

object RangeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def category: typingsJapgolly.vegaTypings.vegaTypingsStrings.category = this.cast("category")
  @scala.inline
  def diverging: typingsJapgolly.vegaTypings.vegaTypingsStrings.diverging = this.cast("diverging")
  @scala.inline
  def heatmap: typingsJapgolly.vegaTypings.vegaTypingsStrings.heatmap = this.cast("heatmap")
  @scala.inline
  def height: typingsJapgolly.vegaTypings.vegaTypingsStrings.height = this.cast("height")
  @scala.inline
  def ordinal: typingsJapgolly.vegaTypings.vegaTypingsStrings.ordinal = this.cast("ordinal")
  @scala.inline
  def ramp: typingsJapgolly.vegaTypings.vegaTypingsStrings.ramp = this.cast("ramp")
  @scala.inline
  def symbol: typingsJapgolly.vegaTypings.vegaTypingsStrings.symbol = this.cast("symbol")
  @scala.inline
  def width: typingsJapgolly.vegaTypings.vegaTypingsStrings.width = this.cast("width")
}

