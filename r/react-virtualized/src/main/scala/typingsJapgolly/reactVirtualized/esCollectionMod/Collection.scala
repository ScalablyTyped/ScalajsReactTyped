package typingsJapgolly.reactVirtualized.esCollectionMod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactVirtualized.AnonAlign
import typingsJapgolly.reactVirtualized.AnonArialabel
import typingsJapgolly.reactVirtualized.AnonCellGroupRenderer
import typingsJapgolly.reactVirtualized.isScrollingbooleanSizeInf
import typingsJapgolly.reactVirtualized.mod.ScrollPosition
import typingsJapgolly.reactVirtualized.mod.SizeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/Collection", "Collection")
@js.native
class Collection ()
  extends Component[CollectionProps, js.Object, js.Any] {
  /** CellLayoutManager interface */
  def calculateSizeAndPositionData(): Unit = js.native
  def cellRenderers(params: isScrollingbooleanSizeInf): js.Array[Node] = js.native
  /**
    * Returns the most recently rendered set of cell indices.
    */
  def getLastRenderedIndices(): js.Array[Double] = js.native
  /**
    * Calculates the minimum amount of change from the current scroll position to ensure the specified cell is (fully) visible.
    */
  def getScrollPositionForCell(params: AnonAlign): ScrollPosition = js.native
  def getTotalSize(): SizeInfo = js.native
  /** See Collection#recomputeCellSizesAndPositions */
  def recomputeCellSizesAndPositions(): Unit = js.native
}

/* static members */
@JSImport("react-virtualized/dist/es/Collection", "Collection")
@js.native
object Collection extends js.Object {
  var defaultProps: AnonCellGroupRenderer = js.native
  var propTypes: AnonArialabel = js.native
}

