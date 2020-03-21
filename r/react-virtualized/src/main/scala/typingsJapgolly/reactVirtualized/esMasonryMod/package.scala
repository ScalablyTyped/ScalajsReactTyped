package typingsJapgolly.reactVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esMasonryMod {
  type CellRenderer = js.Function1[
    /* props */ typingsJapgolly.reactVirtualized.esMasonryMod.MasonryCellProps, 
    japgolly.scalajs.react.raw.React.Node
  ]
  type OnCellsRenderedCallback = js.Function1[/* params */ typingsJapgolly.reactVirtualized.AnonStartIndex, scala.Unit]
  type OnScrollCallback = js.Function1[/* params */ typingsJapgolly.reactVirtualized.AnonClientHeight, scala.Unit]
  type Positioner = (js.Function1[/* index */ scala.Double, typingsJapgolly.reactVirtualized.esMasonryMod.Position]) with typingsJapgolly.reactVirtualized.AnonReset
  type emptyObject = js.Object
  type identity = js.Function1[/* value */ js.Any, js.Any]
  type noop = js.Function0[scala.Unit]
}
