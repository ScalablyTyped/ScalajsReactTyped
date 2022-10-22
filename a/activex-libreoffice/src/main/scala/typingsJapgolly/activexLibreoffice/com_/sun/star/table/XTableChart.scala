package typingsJapgolly.activexLibreoffice.com_.sun.star.table

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the settings of a chart object in a table or spreadsheet.
  * @see com.sun.star.table.TableChart
  */
trait XTableChart
  extends StObject
     with XInterface {
  
  /** returns, whether the cells of the topmost row of the source data are interpreted as column headers. */
  var HasColumnHeaders: Boolean
  
  /** returns, whether the cells of the leftmost column of the source data are interpreted as row headers. */
  var HasRowHeaders: Boolean
  
  /** returns the cell ranges that contain the data for the chart. */
  var Ranges: SafeArray[CellRangeAddress]
  
  /** returns, whether the cells of the topmost row of the source data are interpreted as column headers. */
  def getHasColumnHeaders(): Boolean
  
  /** returns, whether the cells of the leftmost column of the source data are interpreted as row headers. */
  def getHasRowHeaders(): Boolean
  
  /** returns the cell ranges that contain the data for the chart. */
  def getRanges(): SafeArray[CellRangeAddress]
  
  /** specifies whether the cells of the topmost row of the source data are interpreted as column headers. */
  def setHasColumnHeaders(bHasColumnHeaders: Boolean): Unit
  
  /** specifies whether the cells of the leftmost column of the source data are interpreted as row headers. */
  def setHasRowHeaders(bHasRowHeaders: Boolean): Unit
  
  /** sets the cell ranges that contain the data for the chart. */
  def setRanges(aRanges: SeqEquiv[CellRangeAddress]): Unit
}
object XTableChart {
  
  inline def apply(
    HasColumnHeaders: Boolean,
    HasRowHeaders: Boolean,
    Ranges: SafeArray[CellRangeAddress],
    acquire: Callback,
    getHasColumnHeaders: CallbackTo[Boolean],
    getHasRowHeaders: CallbackTo[Boolean],
    getRanges: CallbackTo[SafeArray[CellRangeAddress]],
    queryInterface: `type` => Any,
    release: Callback,
    setHasColumnHeaders: Boolean => Callback,
    setHasRowHeaders: Boolean => Callback,
    setRanges: SeqEquiv[CellRangeAddress] => Callback
  ): XTableChart = {
    val __obj = js.Dynamic.literal(HasColumnHeaders = HasColumnHeaders.asInstanceOf[js.Any], HasRowHeaders = HasRowHeaders.asInstanceOf[js.Any], Ranges = Ranges.asInstanceOf[js.Any], acquire = acquire.toJsFn, getHasColumnHeaders = getHasColumnHeaders.toJsFn, getHasRowHeaders = getHasRowHeaders.toJsFn, getRanges = getRanges.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setHasColumnHeaders = js.Any.fromFunction1((t0: Boolean) => setHasColumnHeaders(t0).runNow()), setHasRowHeaders = js.Any.fromFunction1((t0: Boolean) => setHasRowHeaders(t0).runNow()), setRanges = js.Any.fromFunction1((t0: SeqEquiv[CellRangeAddress]) => setRanges(t0).runNow()))
    __obj.asInstanceOf[XTableChart]
  }
  
  extension [Self <: XTableChart](x: Self) {
    
    inline def setGetHasColumnHeaders(value: CallbackTo[Boolean]): Self = StObject.set(x, "getHasColumnHeaders", value.toJsFn)
    
    inline def setGetHasRowHeaders(value: CallbackTo[Boolean]): Self = StObject.set(x, "getHasRowHeaders", value.toJsFn)
    
    inline def setGetRanges(value: CallbackTo[SafeArray[CellRangeAddress]]): Self = StObject.set(x, "getRanges", value.toJsFn)
    
    inline def setHasColumnHeaders(value: Boolean): Self = StObject.set(x, "HasColumnHeaders", value.asInstanceOf[js.Any])
    
    inline def setHasRowHeaders(value: Boolean): Self = StObject.set(x, "HasRowHeaders", value.asInstanceOf[js.Any])
    
    inline def setRanges(value: SafeArray[CellRangeAddress]): Self = StObject.set(x, "Ranges", value.asInstanceOf[js.Any])
    
    inline def setSetHasColumnHeaders(value: Boolean => Callback): Self = StObject.set(x, "setHasColumnHeaders", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetHasRowHeaders(value: Boolean => Callback): Self = StObject.set(x, "setHasRowHeaders", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetRanges(value: SeqEquiv[CellRangeAddress] => Callback): Self = StObject.set(x, "setRanges", js.Any.fromFunction1((t0: SeqEquiv[CellRangeAddress]) => value(t0).runNow()))
  }
}
