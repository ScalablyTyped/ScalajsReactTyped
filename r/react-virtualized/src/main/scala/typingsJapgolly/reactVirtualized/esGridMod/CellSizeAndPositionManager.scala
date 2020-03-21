package typingsJapgolly.reactVirtualized.esGridMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactVirtualized.AnonContainerSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSizeAndPositionManager extends js.Object {
  def areOffsetsAdjusted(): Boolean
  def configure(hasCellCountEstimatedCellSize: ConfigureParams): Unit
  def getCellCount(): Double
  def getEstimatedCellSize(): Double
  def getLastMeasuredIndex(): Double
  def getOffsetAdjustment(hasContainerSizeOffset: ContainerSizeAndOffset): Double
  /**
    * This method returns the size and position for the cell at the specified index.
    * It just-in-time calculates (or used cached values) for cells leading up to the index.
    */
  def getSizeAndPositionOfCell(index: Double): SizeAndPositionData
  def getSizeAndPositionOfLastMeasuredCell(): SizeAndPositionData
  /**
    * Total size of all cells being measured.
    * This value will be completedly estimated initially.
    * As cells as measured the estimate will be updated.
    */
  def getTotalSize(): Double
  /**
    * Determines a new offset that ensures a certain cell is visible, given the current offset.
    * If the cell is already visible then the current offset will be returned.
    * If the current offset is too great or small, it will be adjusted just enough to ensure the specified index is visible.
    *
    * @param align Desired alignment within container; one of "auto" (default), "start", or "end"
    * @param containerSize Size (width or height) of the container viewport
    * @param currentOffset Container's current (x or y) offset
    * @param totalSize Total size (width or height) of all cells
    * @return Offset to use to ensure the specified cell is visible
    */
  def getUpdatedOffsetForIndex(params: AnonContainerSize): Double
  def getVisibleCellRange(params: GetVisibleCellRangeParams): VisibleCellRange
  /**
    * Clear all cached values for cells after the specified index.
    * This method should be called for any cell that has changed its size.
    * It will not immediately perform any calculations; they'll be performed the next time getSizeAndPositionOfCell() is called.
    */
  def resetCell(index: Double): Unit
}

object CellSizeAndPositionManager {
  @scala.inline
  def apply(
    areOffsetsAdjusted: CallbackTo[Boolean],
    configure: ConfigureParams => Callback,
    getCellCount: CallbackTo[Double],
    getEstimatedCellSize: CallbackTo[Double],
    getLastMeasuredIndex: CallbackTo[Double],
    getOffsetAdjustment: ContainerSizeAndOffset => CallbackTo[Double],
    getSizeAndPositionOfCell: Double => CallbackTo[SizeAndPositionData],
    getSizeAndPositionOfLastMeasuredCell: CallbackTo[SizeAndPositionData],
    getTotalSize: CallbackTo[Double],
    getUpdatedOffsetForIndex: AnonContainerSize => CallbackTo[Double],
    getVisibleCellRange: GetVisibleCellRangeParams => CallbackTo[VisibleCellRange],
    resetCell: Double => Callback
  ): CellSizeAndPositionManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("areOffsetsAdjusted")(areOffsetsAdjusted.toJsFn)
    __obj.updateDynamic("configure")(js.Any.fromFunction1((t0: typingsJapgolly.reactVirtualized.esGridMod.ConfigureParams) => configure(t0).runNow()))
    __obj.updateDynamic("getCellCount")(getCellCount.toJsFn)
    __obj.updateDynamic("getEstimatedCellSize")(getEstimatedCellSize.toJsFn)
    __obj.updateDynamic("getLastMeasuredIndex")(getLastMeasuredIndex.toJsFn)
    __obj.updateDynamic("getOffsetAdjustment")(js.Any.fromFunction1((t0: typingsJapgolly.reactVirtualized.esGridMod.ContainerSizeAndOffset) => getOffsetAdjustment(t0).runNow()))
    __obj.updateDynamic("getSizeAndPositionOfCell")(js.Any.fromFunction1((t0: scala.Double) => getSizeAndPositionOfCell(t0).runNow()))
    __obj.updateDynamic("getSizeAndPositionOfLastMeasuredCell")(getSizeAndPositionOfLastMeasuredCell.toJsFn)
    __obj.updateDynamic("getTotalSize")(getTotalSize.toJsFn)
    __obj.updateDynamic("getUpdatedOffsetForIndex")(js.Any.fromFunction1((t0: typingsJapgolly.reactVirtualized.AnonContainerSize) => getUpdatedOffsetForIndex(t0).runNow()))
    __obj.updateDynamic("getVisibleCellRange")(js.Any.fromFunction1((t0: typingsJapgolly.reactVirtualized.esGridMod.GetVisibleCellRangeParams) => getVisibleCellRange(t0).runNow()))
    __obj.updateDynamic("resetCell")(js.Any.fromFunction1((t0: scala.Double) => resetCell(t0).runNow()))
    __obj.asInstanceOf[CellSizeAndPositionManager]
  }
}

