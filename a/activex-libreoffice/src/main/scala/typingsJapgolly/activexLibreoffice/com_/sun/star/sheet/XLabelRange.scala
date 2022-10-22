package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the settings of a label range in a spreadsheet document.
  *
  * These can be column or row labels, depending on where they are used.
  * @see com.sun.star.sheet.LabelRange
  */
trait XLabelRange
  extends StObject
     with XInterface {
  
  /** returns the cell range address for which the labels are valid. */
  var DataArea: CellRangeAddress
  
  /** returns the cell range address that contains the labels. */
  var LabelArea: CellRangeAddress
  
  /** returns the cell range address for which the labels are valid. */
  def getDataArea(): CellRangeAddress
  
  /** returns the cell range address that contains the labels. */
  def getLabelArea(): CellRangeAddress
  
  /** sets the cell range address for which the labels are valid. */
  def setDataArea(aDataArea: CellRangeAddress): Unit
  
  /** sets the cell range address that contains the labels. */
  def setLabelArea(aLabelArea: CellRangeAddress): Unit
}
object XLabelRange {
  
  inline def apply(
    DataArea: CellRangeAddress,
    LabelArea: CellRangeAddress,
    acquire: Callback,
    getDataArea: CallbackTo[CellRangeAddress],
    getLabelArea: CallbackTo[CellRangeAddress],
    queryInterface: `type` => Any,
    release: Callback,
    setDataArea: CellRangeAddress => Callback,
    setLabelArea: CellRangeAddress => Callback
  ): XLabelRange = {
    val __obj = js.Dynamic.literal(DataArea = DataArea.asInstanceOf[js.Any], LabelArea = LabelArea.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDataArea = getDataArea.toJsFn, getLabelArea = getLabelArea.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDataArea = js.Any.fromFunction1((t0: CellRangeAddress) => setDataArea(t0).runNow()), setLabelArea = js.Any.fromFunction1((t0: CellRangeAddress) => setLabelArea(t0).runNow()))
    __obj.asInstanceOf[XLabelRange]
  }
  
  extension [Self <: XLabelRange](x: Self) {
    
    inline def setDataArea(value: CellRangeAddress): Self = StObject.set(x, "DataArea", value.asInstanceOf[js.Any])
    
    inline def setGetDataArea(value: CallbackTo[CellRangeAddress]): Self = StObject.set(x, "getDataArea", value.toJsFn)
    
    inline def setGetLabelArea(value: CallbackTo[CellRangeAddress]): Self = StObject.set(x, "getLabelArea", value.toJsFn)
    
    inline def setLabelArea(value: CellRangeAddress): Self = StObject.set(x, "LabelArea", value.asInstanceOf[js.Any])
    
    inline def setSetDataArea(value: CellRangeAddress => Callback): Self = StObject.set(x, "setDataArea", js.Any.fromFunction1((t0: CellRangeAddress) => value(t0).runNow()))
    
    inline def setSetLabelArea(value: CellRangeAddress => Callback): Self = StObject.set(x, "setLabelArea", js.Any.fromFunction1((t0: CellRangeAddress) => value(t0).runNow()))
  }
}
