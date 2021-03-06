package typingsJapgolly.plottable.mod.Components

import typingsJapgolly.plottable.componentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Components.Table")
@js.native
/**
  * A Table combines Components in the form of a grid. A
  * common case is combining a y-axis, x-axis, and the plotted data via
  * ```typescript
  * new Table([[yAxis, plot],
  *            [null,  xAxis]]);
  * ```
  *
  * @constructor
  * @param {(Component|null|undefined)[][]} [rows=[]] A 2-D array of Components to be added to the Table.
  *   null can be used if a cell is empty.
  */
class Table ()
  extends typingsJapgolly.plottable.componentsMod.Table {
  def this(rows: js.Array[js.Array[js.UndefOr[Component | Null]]]) = this()
}

/* static members */
@JSImport("plottable", "Components.Table")
@js.native
object Table extends js.Object {
  /* private */ def _calcComponentWeights(setWeights: js.Any, componentGroups: js.Any, fixityAccessor: js.Any): js.Any = js.native
  /* private */ def _calcProportionalSpace(weights: js.Any, freeSpace: js.Any): js.Any = js.native
  /* private */ def _fixedSpace(componentGroup: js.Any, fixityAccessor: js.Any): js.Any = js.native
}

