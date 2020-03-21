package typingsJapgolly.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object selection {
  type rowSelectionChangedBatchHandler[TEntity] = js.Function2[
    /* row */ js.Array[typingsJapgolly.uiGrid.mod.IGridRowOf[TEntity]], 
    /* event */ js.UndefOr[typingsJapgolly.angular.mod.IAngularEvent], 
    scala.Unit
  ]
  type rowSelectionChangedHandler[TEntity] = js.Function2[
    /* row */ typingsJapgolly.uiGrid.mod.IGridRowOf[TEntity], 
    /* event */ js.UndefOr[typingsJapgolly.angular.mod.IAngularEvent], 
    scala.Unit
  ]
}
