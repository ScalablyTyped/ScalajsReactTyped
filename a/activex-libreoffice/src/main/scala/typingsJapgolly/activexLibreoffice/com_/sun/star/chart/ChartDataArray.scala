package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * must be supported by each data source for charts, where you want to access the values directly.
  *
  * It contains the data values as well as the descriptions for each row and column.
  */
trait ChartDataArray
  extends StObject
     with XChartDataArray
object ChartDataArray {
  
  inline def apply(
    ColumnDescriptions: SafeArray[String],
    Data: SafeArray[SafeArray[Double]],
    NotANumber: Double,
    RowDescriptions: SafeArray[String],
    acquire: Callback,
    addChartDataChangeEventListener: XChartDataChangeEventListener => Callback,
    getColumnDescriptions: CallbackTo[SafeArray[String]],
    getData: CallbackTo[SafeArray[SafeArray[Double]]],
    getNotANumber: CallbackTo[Double],
    getRowDescriptions: CallbackTo[SafeArray[String]],
    isNotANumber: Double => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    removeChartDataChangeEventListener: XChartDataChangeEventListener => Callback,
    setColumnDescriptions: SeqEquiv[String] => Callback,
    setData: SeqEquiv[SeqEquiv[Double]] => Callback,
    setRowDescriptions: SeqEquiv[String] => Callback
  ): ChartDataArray = {
    val __obj = js.Dynamic.literal(ColumnDescriptions = ColumnDescriptions.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], NotANumber = NotANumber.asInstanceOf[js.Any], RowDescriptions = RowDescriptions.asInstanceOf[js.Any], acquire = acquire.toJsFn, addChartDataChangeEventListener = js.Any.fromFunction1((t0: XChartDataChangeEventListener) => addChartDataChangeEventListener(t0).runNow()), getColumnDescriptions = getColumnDescriptions.toJsFn, getData = getData.toJsFn, getNotANumber = getNotANumber.toJsFn, getRowDescriptions = getRowDescriptions.toJsFn, isNotANumber = js.Any.fromFunction1(isNotANumber), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeChartDataChangeEventListener = js.Any.fromFunction1((t0: XChartDataChangeEventListener) => removeChartDataChangeEventListener(t0).runNow()), setColumnDescriptions = js.Any.fromFunction1((t0: SeqEquiv[String]) => setColumnDescriptions(t0).runNow()), setData = js.Any.fromFunction1((t0: SeqEquiv[SeqEquiv[Double]]) => setData(t0).runNow()), setRowDescriptions = js.Any.fromFunction1((t0: SeqEquiv[String]) => setRowDescriptions(t0).runNow()))
    __obj.asInstanceOf[ChartDataArray]
  }
}
