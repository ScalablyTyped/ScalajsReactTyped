package typingsJapgolly.plottable.mod.Plots

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Plots.ClusteredBar")
@js.native
/**
  * A ClusteredBar Plot groups bars across Datasets based on the primary value of the bars.
  *   On a vertical ClusteredBar Plot, the bars with the same X value are grouped.
  *   On a horizontal ClusteredBar Plot, the bars with the same Y value are grouped.
  *
  * @constructor
  * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
  */
class ClusteredBar[X, Y] ()
  extends typingsJapgolly.plottable.plotsMod.ClusteredBar[X, Y] {
  def this(orientation: typingsJapgolly.plottable.barPlotMod.BarOrientation) = this()
}

