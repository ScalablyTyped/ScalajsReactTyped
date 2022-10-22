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
  * gives access to data represented as an array of rows.
  *
  * Can be obtained from interface {@link XChartDocument} via method {@link getData()} .
  *
  * If used for an {@link XYDiagram} , the row number 0 represents the **x** -values.
  */
trait XChartDataArray
  extends StObject
     with XChartData {
  
  /**
    * retrieves the description texts for all columns.
    * @returns a sequence of strings, each representing the description of a column.
    */
  var ColumnDescriptions: SafeArray[String]
  
  /**
    * retrieves the numerical data as a nested sequence of values.
    * @returns the values as a sequence of sequences. The inner sequence represents rows.
    */
  var Data: SafeArray[SafeArray[Double]]
  
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of strings, each representing the description of a row.
    */
  var RowDescriptions: SafeArray[String]
  
  /**
    * retrieves the description texts for all columns.
    * @returns a sequence of strings, each representing the description of a column.
    */
  def getColumnDescriptions(): SafeArray[String]
  
  /**
    * retrieves the numerical data as a nested sequence of values.
    * @returns the values as a sequence of sequences. The inner sequence represents rows.
    */
  def getData(): SafeArray[SafeArray[Double]]
  
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of strings, each representing the description of a row.
    */
  def getRowDescriptions(): SafeArray[String]
  
  /**
    * sets the description texts for all columns.
    * @param aColumnDescriptions a sequence of strings which represent a description for each column.
    */
  def setColumnDescriptions(aColumnDescriptions: SeqEquiv[String]): Unit
  
  /**
    * sets the chart data as an array of numbers.
    * @param aData the values as a sequence of sequences. The inner sequence represents rows.
    */
  def setData(aData: SeqEquiv[SeqEquiv[Double]]): Unit
  
  /**
    * sets the description texts for all rows.
    * @param aRowDescriptions a sequence of strings which represent a description for each row.
    */
  def setRowDescriptions(aRowDescriptions: SeqEquiv[String]): Unit
}
object XChartDataArray {
  
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
  ): XChartDataArray = {
    val __obj = js.Dynamic.literal(ColumnDescriptions = ColumnDescriptions.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], NotANumber = NotANumber.asInstanceOf[js.Any], RowDescriptions = RowDescriptions.asInstanceOf[js.Any], acquire = acquire.toJsFn, addChartDataChangeEventListener = js.Any.fromFunction1((t0: XChartDataChangeEventListener) => addChartDataChangeEventListener(t0).runNow()), getColumnDescriptions = getColumnDescriptions.toJsFn, getData = getData.toJsFn, getNotANumber = getNotANumber.toJsFn, getRowDescriptions = getRowDescriptions.toJsFn, isNotANumber = js.Any.fromFunction1(isNotANumber), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeChartDataChangeEventListener = js.Any.fromFunction1((t0: XChartDataChangeEventListener) => removeChartDataChangeEventListener(t0).runNow()), setColumnDescriptions = js.Any.fromFunction1((t0: SeqEquiv[String]) => setColumnDescriptions(t0).runNow()), setData = js.Any.fromFunction1((t0: SeqEquiv[SeqEquiv[Double]]) => setData(t0).runNow()), setRowDescriptions = js.Any.fromFunction1((t0: SeqEquiv[String]) => setRowDescriptions(t0).runNow()))
    __obj.asInstanceOf[XChartDataArray]
  }
  
  extension [Self <: XChartDataArray](x: Self) {
    
    inline def setColumnDescriptions(value: SafeArray[String]): Self = StObject.set(x, "ColumnDescriptions", value.asInstanceOf[js.Any])
    
    inline def setData(value: SafeArray[SafeArray[Double]]): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setGetColumnDescriptions(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getColumnDescriptions", value.toJsFn)
    
    inline def setGetData(value: CallbackTo[SafeArray[SafeArray[Double]]]): Self = StObject.set(x, "getData", value.toJsFn)
    
    inline def setGetRowDescriptions(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getRowDescriptions", value.toJsFn)
    
    inline def setRowDescriptions(value: SafeArray[String]): Self = StObject.set(x, "RowDescriptions", value.asInstanceOf[js.Any])
    
    inline def setSetColumnDescriptions(value: SeqEquiv[String] => Callback): Self = StObject.set(x, "setColumnDescriptions", js.Any.fromFunction1((t0: SeqEquiv[String]) => value(t0).runNow()))
    
    inline def setSetData(value: SeqEquiv[SeqEquiv[Double]] => Callback): Self = StObject.set(x, "setData", js.Any.fromFunction1((t0: SeqEquiv[SeqEquiv[Double]]) => value(t0).runNow()))
    
    inline def setSetRowDescriptions(value: SeqEquiv[String] => Callback): Self = StObject.set(x, "setRowDescriptions", js.Any.fromFunction1((t0: SeqEquiv[String]) => value(t0).runNow()))
  }
}
