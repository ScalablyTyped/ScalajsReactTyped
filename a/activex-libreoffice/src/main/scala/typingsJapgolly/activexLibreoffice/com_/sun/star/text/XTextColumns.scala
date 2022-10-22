package typingsJapgolly.activexLibreoffice.com_.sun.star.text

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
  * manages columns within the object.
  *
  * The values used are relative. So it is not necessary to know the width of the object. The sum of the relative width values depends on the object and
  * is defined in "ReferenceValue."
  */
trait XTextColumns
  extends StObject
     with XInterface {
  
  /** @returns the number of columns. */
  var ColumnCount: Double
  
  /**
    * returns the column description of the object.
    * @see TextColumn
    */
  var Columns: SafeArray[TextColumn]
  
  /** @returns the sum of all values.  As described above, the width values are relative. */
  val ReferenceValue: Double
  
  /** @returns the number of columns. */
  def getColumnCount(): Double
  
  /**
    * returns the column description of the object.
    * @see TextColumn
    */
  def getColumns(): SafeArray[TextColumn]
  
  /** @returns the sum of all values.  As described above, the width values are relative. */
  def getReferenceValue(): Double
  
  /**
    * sets the number of columns.
    *
    * The minimum is 1 column.
    */
  def setColumnCount(nColumns: Double): Unit
  
  /**
    * sets the descriptors of all columns.
    *
    * The number of members in the sequence must be the same as the number of columns of the object.
    * @see TextColumn
    */
  def setColumns(Columns: SeqEquiv[TextColumn]): Unit
}
object XTextColumns {
  
  inline def apply(
    ColumnCount: Double,
    Columns: SafeArray[TextColumn],
    ReferenceValue: Double,
    acquire: Callback,
    getColumnCount: CallbackTo[Double],
    getColumns: CallbackTo[SafeArray[TextColumn]],
    getReferenceValue: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    setColumnCount: Double => Callback,
    setColumns: SeqEquiv[TextColumn] => Callback
  ): XTextColumns = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], ReferenceValue = ReferenceValue.asInstanceOf[js.Any], acquire = acquire.toJsFn, getColumnCount = getColumnCount.toJsFn, getColumns = getColumns.toJsFn, getReferenceValue = getReferenceValue.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setColumnCount = js.Any.fromFunction1((t0: Double) => setColumnCount(t0).runNow()), setColumns = js.Any.fromFunction1((t0: SeqEquiv[TextColumn]) => setColumns(t0).runNow()))
    __obj.asInstanceOf[XTextColumns]
  }
  
  extension [Self <: XTextColumns](x: Self) {
    
    inline def setColumnCount(value: Double): Self = StObject.set(x, "ColumnCount", value.asInstanceOf[js.Any])
    
    inline def setColumns(value: SafeArray[TextColumn]): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setGetColumnCount(value: CallbackTo[Double]): Self = StObject.set(x, "getColumnCount", value.toJsFn)
    
    inline def setGetColumns(value: CallbackTo[SafeArray[TextColumn]]): Self = StObject.set(x, "getColumns", value.toJsFn)
    
    inline def setGetReferenceValue(value: CallbackTo[Double]): Self = StObject.set(x, "getReferenceValue", value.toJsFn)
    
    inline def setReferenceValue(value: Double): Self = StObject.set(x, "ReferenceValue", value.asInstanceOf[js.Any])
    
    inline def setSetColumnCount(value: Double => Callback): Self = StObject.set(x, "setColumnCount", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetColumns(value: SeqEquiv[TextColumn] => Callback): Self = StObject.set(x, "setColumns", js.Any.fromFunction1((t0: SeqEquiv[TextColumn]) => value(t0).runNow()))
  }
}
