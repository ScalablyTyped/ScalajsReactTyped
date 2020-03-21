package typingsJapgolly.reactVirtualized

import typingsJapgolly.reactVirtualized.esGridMod.GridCellRangeRenderer
import typingsJapgolly.reactVirtualized.esGridMod.OverscanIndicesGetter
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`150`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/commonjs/Grid", JSImport.Namespace)
@js.native
object gridMod extends js.Object {
  @js.native
  class Grid ()
    extends typingsJapgolly.reactVirtualized.esGridMod.Grid
  
  val DEFAULT_SCROLLING_RESET_TIME_INTERVAL: `150` = js.native
  val accessibilityOverscanIndicesGetter: OverscanIndicesGetter = js.native
  val defaultCellRangeRenderer: GridCellRangeRenderer = js.native
  val defaultOverscanIndicesGetter: OverscanIndicesGetter = js.native
  /* static members */
  @js.native
  object Grid extends js.Object {
    var defaultProps: AnonAriareadonly = js.native
  }
  
}

