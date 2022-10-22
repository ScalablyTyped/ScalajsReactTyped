package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.chart.XChartDataChangeEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.chart.XComplexDescriptionAccess
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Offers any access to column and row descriptions. This allows to set date values as categories.
  *
  * Can be obtained from interface {@link XChartDocument} via method {@link getData()} .
  * @since OOo 3.4
  */
trait XAnyDescriptionAccess
  extends StObject
     with XComplexDescriptionAccess {
  
  /**
    * retrieves the descriptions for all columns.
    * @returns a sequence of sequences of anys representing the descriptions of all columns. The outer index represents different columns. The inner index repre
    */
  val AnyColumnDescriptions: SafeArray[SafeArray[Any]]
  
  /**
    * retrieves the descriptions for all rows.
    * @returns a sequence of sequences of anys representing the descriptions of all rows. The outer index represents different rows. The inner index represents
    */
  val AnyRowDescriptions: SafeArray[SafeArray[Any]]
  
  /**
    * retrieves the descriptions for all columns.
    * @returns a sequence of sequences of anys representing the descriptions of all columns. The outer index represents different columns. The inner index repre
    */
  def getAnyColumnDescriptions(): SafeArray[SafeArray[Any]]
  
  /**
    * retrieves the descriptions for all rows.
    * @returns a sequence of sequences of anys representing the descriptions of all rows. The outer index represents different rows. The inner index represents
    */
  def getAnyRowDescriptions(): SafeArray[SafeArray[Any]]
  
  /**
    * sets the descriptions for all columns.
    * @param rColumnDescriptions a sequence of sequences of anys which represent the descriptions of all columns. The outer index represents different columns
    */
  def setAnyColumnDescriptions(rColumnDescriptions: SeqEquiv[SeqEquiv[Any]]): Unit
  
  /**
    * sets the descriptions for all rows.
    * @param rRowDescriptions a sequence of sequences of anys representing the descriptions of all rows. The outer index represents different rows. The inner
    */
  def setAnyRowDescriptions(rRowDescriptions: SeqEquiv[SeqEquiv[Any]]): Unit
}
object XAnyDescriptionAccess {
  
  inline def apply(
    AnyColumnDescriptions: SafeArray[SafeArray[Any]],
    AnyRowDescriptions: SafeArray[SafeArray[Any]],
    ColumnDescriptions: SafeArray[String],
    ComplexColumnDescriptions: SafeArray[SafeArray[String]],
    ComplexRowDescriptions: SafeArray[SafeArray[String]],
    Data: SafeArray[SafeArray[Double]],
    NotANumber: Double,
    RowDescriptions: SafeArray[String],
    acquire: Callback,
    addChartDataChangeEventListener: XChartDataChangeEventListener => Callback,
    getAnyColumnDescriptions: CallbackTo[SafeArray[SafeArray[Any]]],
    getAnyRowDescriptions: CallbackTo[SafeArray[SafeArray[Any]]],
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
    setAnyColumnDescriptions: SeqEquiv[SeqEquiv[Any]] => Callback,
    setAnyRowDescriptions: SeqEquiv[SeqEquiv[Any]] => Callback,
    setColumnDescriptions: SeqEquiv[String] => Callback,
    setComplexColumnDescriptions: SeqEquiv[SeqEquiv[String]] => Callback,
    setComplexRowDescriptions: SeqEquiv[SeqEquiv[String]] => Callback,
    setData: SeqEquiv[SeqEquiv[Double]] => Callback,
    setRowDescriptions: SeqEquiv[String] => Callback
  ): XAnyDescriptionAccess = {
    val __obj = js.Dynamic.literal(AnyColumnDescriptions = AnyColumnDescriptions.asInstanceOf[js.Any], AnyRowDescriptions = AnyRowDescriptions.asInstanceOf[js.Any], ColumnDescriptions = ColumnDescriptions.asInstanceOf[js.Any], ComplexColumnDescriptions = ComplexColumnDescriptions.asInstanceOf[js.Any], ComplexRowDescriptions = ComplexRowDescriptions.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], NotANumber = NotANumber.asInstanceOf[js.Any], RowDescriptions = RowDescriptions.asInstanceOf[js.Any], acquire = acquire.toJsFn, addChartDataChangeEventListener = js.Any.fromFunction1((t0: XChartDataChangeEventListener) => addChartDataChangeEventListener(t0).runNow()), getAnyColumnDescriptions = getAnyColumnDescriptions.toJsFn, getAnyRowDescriptions = getAnyRowDescriptions.toJsFn, getColumnDescriptions = getColumnDescriptions.toJsFn, getComplexColumnDescriptions = getComplexColumnDescriptions.toJsFn, getComplexRowDescriptions = getComplexRowDescriptions.toJsFn, getData = getData.toJsFn, getNotANumber = getNotANumber.toJsFn, getRowDescriptions = getRowDescriptions.toJsFn, isNotANumber = js.Any.fromFunction1(isNotANumber), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeChartDataChangeEventListener = js.Any.fromFunction1((t0: XChartDataChangeEventListener) => removeChartDataChangeEventListener(t0).runNow()), setAnyColumnDescriptions = js.Any.fromFunction1((t0: SeqEquiv[SeqEquiv[Any]]) => setAnyColumnDescriptions(t0).runNow()), setAnyRowDescriptions = js.Any.fromFunction1((t0: SeqEquiv[SeqEquiv[Any]]) => setAnyRowDescriptions(t0).runNow()), setColumnDescriptions = js.Any.fromFunction1((t0: SeqEquiv[String]) => setColumnDescriptions(t0).runNow()), setComplexColumnDescriptions = js.Any.fromFunction1((t0: SeqEquiv[SeqEquiv[String]]) => setComplexColumnDescriptions(t0).runNow()), setComplexRowDescriptions = js.Any.fromFunction1((t0: SeqEquiv[SeqEquiv[String]]) => setComplexRowDescriptions(t0).runNow()), setData = js.Any.fromFunction1((t0: SeqEquiv[SeqEquiv[Double]]) => setData(t0).runNow()), setRowDescriptions = js.Any.fromFunction1((t0: SeqEquiv[String]) => setRowDescriptions(t0).runNow()))
    __obj.asInstanceOf[XAnyDescriptionAccess]
  }
  
  extension [Self <: XAnyDescriptionAccess](x: Self) {
    
    inline def setAnyColumnDescriptions(value: SafeArray[SafeArray[Any]]): Self = StObject.set(x, "AnyColumnDescriptions", value.asInstanceOf[js.Any])
    
    inline def setAnyRowDescriptions(value: SafeArray[SafeArray[Any]]): Self = StObject.set(x, "AnyRowDescriptions", value.asInstanceOf[js.Any])
    
    inline def setGetAnyColumnDescriptions(value: CallbackTo[SafeArray[SafeArray[Any]]]): Self = StObject.set(x, "getAnyColumnDescriptions", value.toJsFn)
    
    inline def setGetAnyRowDescriptions(value: CallbackTo[SafeArray[SafeArray[Any]]]): Self = StObject.set(x, "getAnyRowDescriptions", value.toJsFn)
    
    inline def setSetAnyColumnDescriptions(value: SeqEquiv[SeqEquiv[Any]] => Callback): Self = StObject.set(x, "setAnyColumnDescriptions", js.Any.fromFunction1((t0: SeqEquiv[SeqEquiv[Any]]) => value(t0).runNow()))
    
    inline def setSetAnyRowDescriptions(value: SeqEquiv[SeqEquiv[Any]] => Callback): Self = StObject.set(x, "setAnyRowDescriptions", js.Any.fromFunction1((t0: SeqEquiv[SeqEquiv[Any]]) => value(t0).runNow()))
  }
}
