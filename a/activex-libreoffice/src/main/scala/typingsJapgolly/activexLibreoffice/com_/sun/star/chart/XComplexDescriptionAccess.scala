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
  * Offers access to complex column and row descriptions.
  *
  * Can be obtained from interface {@link XChartDocument} via method {@link getData()} .
  * @since OOo 3.3
  */
trait XComplexDescriptionAccess
  extends StObject
     with XChartDataArray {
  
  /**
    * retrieves the description texts for all columns.
    * @returns a sequence of sequences of strings representing the descriptions of all columns. The outer index represents different columns. The inner index re
    */
  var ComplexColumnDescriptions: SafeArray[SafeArray[String]]
  
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of sequences of strings representing the descriptions of all rows. The outer index represents different rows. The inner index represen
    */
  var ComplexRowDescriptions: SafeArray[SafeArray[String]]
  
  /**
    * retrieves the description texts for all columns.
    * @returns a sequence of sequences of strings representing the descriptions of all columns. The outer index represents different columns. The inner index re
    */
  def getComplexColumnDescriptions(): SafeArray[SafeArray[String]]
  
  /**
    * retrieves the description texts for all rows.
    * @returns a sequence of sequences of strings representing the descriptions of all rows. The outer index represents different rows. The inner index represen
    */
  def getComplexRowDescriptions(): SafeArray[SafeArray[String]]
  
  /**
    * sets the description texts for all columns.
    * @param rColumnDescriptions a sequence of sequences of strings which represent the descriptions of all columns. The outer index represents different colu
    */
  def setComplexColumnDescriptions(rColumnDescriptions: SeqEquiv[SeqEquiv[String]]): Unit
  
  /**
    * sets the description texts for all rows.
    * @param rRowDescriptions a sequence of sequences of strings representing the descriptions of all rows. The outer index represents different rows. The inn
    */
  def setComplexRowDescriptions(rRowDescriptions: SeqEquiv[SeqEquiv[String]]): Unit
}
object XComplexDescriptionAccess {
  
  inline def apply(
    ColumnDescriptions: SafeArray[String],
    ComplexColumnDescriptions: SafeArray[SafeArray[String]],
    ComplexRowDescriptions: SafeArray[SafeArray[String]],
    Data: SafeArray[SafeArray[Double]],
    NotANumber: Double,
    RowDescriptions: SafeArray[String],
    acquire: Callback,
    addChartDataChangeEventListener: XChartDataChangeEventListener => Callback,
    getColumnDescriptions: CallbackTo[SafeArray[String]],
    getComplexColumnDescriptions: CallbackTo[SafeArray[SafeArray[String]]],
    getComplexRowDescriptions: CallbackTo[SafeArray[SafeArray[String]]],
    getData: CallbackTo[SafeArray[SafeArray[Double]]],
    getNotANumber: CallbackTo[Double],
    getRowDescriptions: CallbackTo[SafeArray[String]],
    isNotANumber: Double => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    removeChartDataChangeEventListener: XChartDataChangeEventListener => Callback,
    setColumnDescriptions: SeqEquiv[String] => Callback,
    setComplexColumnDescriptions: SeqEquiv[SeqEquiv[String]] => Callback,
    setComplexRowDescriptions: SeqEquiv[SeqEquiv[String]] => Callback,
    setData: SeqEquiv[SeqEquiv[Double]] => Callback,
    setRowDescriptions: SeqEquiv[String] => Callback
  ): XComplexDescriptionAccess = {
    val __obj = js.Dynamic.literal(ColumnDescriptions = ColumnDescriptions.asInstanceOf[js.Any], ComplexColumnDescriptions = ComplexColumnDescriptions.asInstanceOf[js.Any], ComplexRowDescriptions = ComplexRowDescriptions.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], NotANumber = NotANumber.asInstanceOf[js.Any], RowDescriptions = RowDescriptions.asInstanceOf[js.Any], acquire = acquire.toJsFn, addChartDataChangeEventListener = js.Any.fromFunction1((t0: XChartDataChangeEventListener) => addChartDataChangeEventListener(t0).runNow()), getColumnDescriptions = getColumnDescriptions.toJsFn, getComplexColumnDescriptions = getComplexColumnDescriptions.toJsFn, getComplexRowDescriptions = getComplexRowDescriptions.toJsFn, getData = getData.toJsFn, getNotANumber = getNotANumber.toJsFn, getRowDescriptions = getRowDescriptions.toJsFn, isNotANumber = js.Any.fromFunction1(isNotANumber), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeChartDataChangeEventListener = js.Any.fromFunction1((t0: XChartDataChangeEventListener) => removeChartDataChangeEventListener(t0).runNow()), setColumnDescriptions = js.Any.fromFunction1((t0: SeqEquiv[String]) => setColumnDescriptions(t0).runNow()), setComplexColumnDescriptions = js.Any.fromFunction1((t0: SeqEquiv[SeqEquiv[String]]) => setComplexColumnDescriptions(t0).runNow()), setComplexRowDescriptions = js.Any.fromFunction1((t0: SeqEquiv[SeqEquiv[String]]) => setComplexRowDescriptions(t0).runNow()), setData = js.Any.fromFunction1((t0: SeqEquiv[SeqEquiv[Double]]) => setData(t0).runNow()), setRowDescriptions = js.Any.fromFunction1((t0: SeqEquiv[String]) => setRowDescriptions(t0).runNow()))
    __obj.asInstanceOf[XComplexDescriptionAccess]
  }
  
  extension [Self <: XComplexDescriptionAccess](x: Self) {
    
    inline def setComplexColumnDescriptions(value: SafeArray[SafeArray[String]]): Self = StObject.set(x, "ComplexColumnDescriptions", value.asInstanceOf[js.Any])
    
    inline def setComplexRowDescriptions(value: SafeArray[SafeArray[String]]): Self = StObject.set(x, "ComplexRowDescriptions", value.asInstanceOf[js.Any])
    
    inline def setGetComplexColumnDescriptions(value: CallbackTo[SafeArray[SafeArray[String]]]): Self = StObject.set(x, "getComplexColumnDescriptions", value.toJsFn)
    
    inline def setGetComplexRowDescriptions(value: CallbackTo[SafeArray[SafeArray[String]]]): Self = StObject.set(x, "getComplexRowDescriptions", value.toJsFn)
    
    inline def setSetComplexColumnDescriptions(value: SeqEquiv[SeqEquiv[String]] => Callback): Self = StObject.set(x, "setComplexColumnDescriptions", js.Any.fromFunction1((t0: SeqEquiv[SeqEquiv[String]]) => value(t0).runNow()))
    
    inline def setSetComplexRowDescriptions(value: SeqEquiv[SeqEquiv[String]] => Callback): Self = StObject.set(x, "setComplexRowDescriptions", js.Any.fromFunction1((t0: SeqEquiv[SeqEquiv[String]]) => value(t0).runNow()))
  }
}
