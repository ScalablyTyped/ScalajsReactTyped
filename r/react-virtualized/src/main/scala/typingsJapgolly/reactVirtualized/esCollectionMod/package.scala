package typingsJapgolly.reactVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esCollectionMod {
  type CollectionCellGroupRenderer = js.Function1[
    /* params */ typingsJapgolly.reactVirtualized.esCollectionMod.CollectionCellGroupRendererParams, 
    js.Array[japgolly.scalajs.react.raw.React.Node]
  ]
  type CollectionCellRenderer = js.Function1[
    /* params */ typingsJapgolly.reactVirtualized.esCollectionMod.CollectionCellRendererParams, 
    japgolly.scalajs.react.raw.React.Node
  ]
  type CollectionCellSizeAndPositionGetter = js.Function1[
    /* params */ typingsJapgolly.reactVirtualized.mod.Index, 
    typingsJapgolly.reactVirtualized.esCollectionMod.CollectionCellSizeAndPosition
  ]
}
