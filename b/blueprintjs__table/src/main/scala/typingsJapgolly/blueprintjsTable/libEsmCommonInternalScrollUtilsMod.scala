package typingsJapgolly.blueprintjsTable

import org.scalajs.dom.HTMLElement
import typingsJapgolly.blueprintjsTable.anon.ScrollLeft
import typingsJapgolly.blueprintjsTable.blueprintjsTableStrings.horizontal
import typingsJapgolly.blueprintjsTable.blueprintjsTableStrings.vertical
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.Region
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonInternalScrollUtilsMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/internal/scrollUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getScrollPositionForRegion(
    region: Region,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double]
  ): ScrollLeft = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollPositionForRegion")(region.asInstanceOf[js.Any], currScrollLeft.asInstanceOf[js.Any], currScrollTop.asInstanceOf[js.Any], getLeftOffset.asInstanceOf[js.Any], getTopOffset.asInstanceOf[js.Any])).asInstanceOf[ScrollLeft]
  inline def getScrollPositionForRegion(
    region: Region,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double],
    numFrozenRows: Double
  ): ScrollLeft = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollPositionForRegion")(region.asInstanceOf[js.Any], currScrollLeft.asInstanceOf[js.Any], currScrollTop.asInstanceOf[js.Any], getLeftOffset.asInstanceOf[js.Any], getTopOffset.asInstanceOf[js.Any], numFrozenRows.asInstanceOf[js.Any])).asInstanceOf[ScrollLeft]
  inline def getScrollPositionForRegion(
    region: Region,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double],
    numFrozenRows: Double,
    numFrozenColumns: Double
  ): ScrollLeft = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollPositionForRegion")(region.asInstanceOf[js.Any], currScrollLeft.asInstanceOf[js.Any], currScrollTop.asInstanceOf[js.Any], getLeftOffset.asInstanceOf[js.Any], getTopOffset.asInstanceOf[js.Any], numFrozenRows.asInstanceOf[js.Any], numFrozenColumns.asInstanceOf[js.Any])).asInstanceOf[ScrollLeft]
  inline def getScrollPositionForRegion(
    region: Region,
    currScrollLeft: Double,
    currScrollTop: Double,
    getLeftOffset: js.Function1[/* columnIndex */ Double, Double],
    getTopOffset: js.Function1[/* rowIndex */ Double, Double],
    numFrozenRows: Unit,
    numFrozenColumns: Double
  ): ScrollLeft = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollPositionForRegion")(region.asInstanceOf[js.Any], currScrollLeft.asInstanceOf[js.Any], currScrollTop.asInstanceOf[js.Any], getLeftOffset.asInstanceOf[js.Any], getTopOffset.asInstanceOf[js.Any], numFrozenRows.asInstanceOf[js.Any], numFrozenColumns.asInstanceOf[js.Any])).asInstanceOf[ScrollLeft]
  
  inline def measureScrollBarThickness(element: HTMLElement, direction: horizontal | vertical): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("measureScrollBarThickness")(element.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Double]
}
