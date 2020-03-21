package typingsJapgolly.blueprintjsTable

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsTable.blueprintjsTableStrings.horizontal
import typingsJapgolly.blueprintjsTable.blueprintjsTableStrings.vertical
import typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/common/internal/scrollUtils", JSImport.Namespace)
@js.native
object scrollUtilsMod extends js.Object {
  def getScrollPositionForRegion(
    region: IRegion,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double]
  ): AnonScrollLeft = js.native
  def getScrollPositionForRegion(
    region: IRegion,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double],
    numFrozenRows: Double
  ): AnonScrollLeft = js.native
  def getScrollPositionForRegion(
    region: IRegion,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double],
    numFrozenRows: Double,
    numFrozenColumns: Double
  ): AnonScrollLeft = js.native
  @JSName("measureScrollBarThickness")
  def measureScrollBarThickness_horizontal(element: HTMLElement, direction: horizontal): Double = js.native
  @JSName("measureScrollBarThickness")
  def measureScrollBarThickness_vertical(element: HTMLElement, direction: vertical): Double = js.native
}

