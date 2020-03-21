package typingsJapgolly.agGrid.floatingFilterMod

import typingsJapgolly.agGrid.columnMod.Column
import typingsJapgolly.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFloatingFilterParams[M, F /* <: FloatingFilterChange */] extends js.Object {
  var api: GridApi = js.native
  var column: Column = js.native
  var debounceMs: js.UndefOr[Double] = js.native
  var suppressFilterButton: Boolean = js.native
  def currentParentModel(): M = js.native
  def onFloatingFilterChanged(change: F | M): Boolean = js.native
}

