package typingsJapgolly.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object grouping {
  type aggregationChangedHandler[TEntity] = js.Function1[/* col */ typingsJapgolly.uiGrid.mod.IGridColumnOf[TEntity], scala.Unit]
  type groupingChangedHandler[TEntity] = js.Function1[/* col */ typingsJapgolly.uiGrid.mod.IGridColumnOf[TEntity], scala.Unit]
}
