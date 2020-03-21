package typingsJapgolly.reactVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esGridMod {
  type GridCellRangeRenderer = js.Function1[
    /* params */ typingsJapgolly.reactVirtualized.esGridMod.GridCellRangeProps, 
    js.Array[japgolly.scalajs.react.raw.React.Node]
  ]
  type GridCellRenderer = js.Function1[
    /* props */ typingsJapgolly.reactVirtualized.esGridMod.GridCellProps, 
    japgolly.scalajs.react.raw.React.Node
  ]
  type OverscanIndicesGetter = js.Function1[
    /* params */ typingsJapgolly.reactVirtualized.esGridMod.OverscanIndicesGetterParams, 
    typingsJapgolly.reactVirtualized.esGridMod.OverscanIndices
  ]
  type SCROLL_DIRECTION_HORIZONTAL = typingsJapgolly.reactVirtualized.reactVirtualizedStrings.horizontal
  type SCROLL_DIRECTION_VERTICAL = typingsJapgolly.reactVirtualized.reactVirtualizedStrings.vertical
  type SectionRenderedParams = typingsJapgolly.reactVirtualized.esGridMod.RenderedSection
}
