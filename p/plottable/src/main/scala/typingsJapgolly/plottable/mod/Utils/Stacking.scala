package typingsJapgolly.plottable.mod.Utils

import typingsJapgolly.lodash.mod.MemoizedFunction
import typingsJapgolly.plottable.AnonMaximumExtents
import typingsJapgolly.plottable.datasetMod.Dataset
import typingsJapgolly.plottable.interfacesMod.IAccessor
import typingsJapgolly.plottable.stackingUtilsMod.GenericStackingResult
import typingsJapgolly.plottable.stackingUtilsMod.IStackingOrder
import typingsJapgolly.plottable.stackingUtilsMod.StackingResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Utils.Stacking")
@js.native
object Stacking extends js.Object {
  val normalizeKey: (js.Function1[/* key */ js.Any, String]) with MemoizedFunction = js.native
  def stack(datasets: js.Array[Dataset], keyAccessor: IAccessor[_], valueAccessor: IAccessor[Double]): StackingResult = js.native
  def stack(
    datasets: js.Array[Dataset],
    keyAccessor: IAccessor[_],
    valueAccessor: IAccessor[Double],
    stackingOrder: IStackingOrder
  ): StackingResult = js.native
  def stackedExtent(stackingResult: StackingResult, keyAccessor: IAccessor[_], filter: IAccessor[Boolean]): js.Array[Double] = js.native
  def stackedExtents[D](stackingResult: GenericStackingResult[D]): AnonMaximumExtents[D] = js.native
  @js.native
  object IStackingOrder extends js.Object {
    var bottomup: typingsJapgolly.plottable.plottableStrings.bottomup = js.native
    var topdown: typingsJapgolly.plottable.plottableStrings.topdown = js.native
  }
  
}

