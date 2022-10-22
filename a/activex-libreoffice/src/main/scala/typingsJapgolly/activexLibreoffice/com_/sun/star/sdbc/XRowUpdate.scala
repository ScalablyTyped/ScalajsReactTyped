package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used to update data which is collected in a row. */
trait XRowUpdate
  extends StObject
     with XInterface {
  
  /**
    * updates a column with a stream value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @param length how much data should be read out of the stream
    * @throws SQLException if a database access error occurs.
    */
  def updateBinaryStream(columnIndex: Double, x: XInputStream, length: Double): Unit
  
  /**
    * updates a column with a boolean value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateBoolean(columnIndex: Double, x: Boolean): Unit
  
  /**
    * updates a column with a byte value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateByte(columnIndex: Double, x: Double): Unit
  
  /**
    * updates a column with a byte array value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateBytes(columnIndex: Double, x: SeqEquiv[Double]): Unit
  
  /**
    * updates a column with a stream value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @param length how much data should be read out of the stream
    * @throws SQLException if a database access error occurs.
    */
  def updateCharacterStream(columnIndex: Double, x: XInputStream, length: Double): Unit
  
  /**
    * updates a column with a date value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateDate(columnIndex: Double, x: Date): Unit
  
  /**
    * updates a column with a double value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateDouble(columnIndex: Double, x: Double): Unit
  
  /**
    * updates a column with a float value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateFloat(columnIndex: Double, x: Double): Unit
  
  /**
    * updates a column with an long value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateInt(columnIndex: Double, x: Double): Unit
  
  /**
    * updates a column with a hyper value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateLong(columnIndex: Double, x: Double): Unit
  
  /**
    * gives a nullable column a null value.
    * @param columnIndex the position of the column
    * @throws SQLException if a database access error occurs.
    */
  def updateNull(columnIndex: Double): Unit
  
  /**
    * updates a column with an object value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @param scale defines the scale which should be used to write the numeric value
    * @throws SQLException if a database access error occurs.
    */
  def updateNumericObject(columnIndex: Double, x: Any, scale: Double): Unit
  
  /**
    * updates a column with an object value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateObject(columnIndex: Double, x: Any): Unit
  
  /**
    * updates a column with a short value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateShort(columnIndex: Double, x: Double): Unit
  
  /**
    * updates a column with a string value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateString(columnIndex: Double, x: String): Unit
  
  /**
    * updates a column with a time value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateTime(columnIndex: Double, x: Time): Unit
  
  /**
    * updates a column with a timestamp value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateTimestamp(columnIndex: Double, x: DateTime): Unit
}
object XRowUpdate {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    updateBinaryStream: (Double, XInputStream, Double) => Callback,
    updateBoolean: (Double, Boolean) => Callback,
    updateByte: (Double, Double) => Callback,
    updateBytes: (Double, SeqEquiv[Double]) => Callback,
    updateCharacterStream: (Double, XInputStream, Double) => Callback,
    updateDate: (Double, Date) => Callback,
    updateDouble: (Double, Double) => Callback,
    updateFloat: (Double, Double) => Callback,
    updateInt: (Double, Double) => Callback,
    updateLong: (Double, Double) => Callback,
    updateNull: Double => Callback,
    updateNumericObject: (Double, Any, Double) => Callback,
    updateObject: (Double, Any) => Callback,
    updateShort: (Double, Double) => Callback,
    updateString: (Double, String) => Callback,
    updateTime: (Double, Time) => Callback,
    updateTimestamp: (Double, DateTime) => Callback
  ): XRowUpdate = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, updateBinaryStream = js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (updateBinaryStream(t0, t1, t2)).runNow()), updateBoolean = js.Any.fromFunction2((t0: Double, t1: Boolean) => (updateBoolean(t0, t1)).runNow()), updateByte = js.Any.fromFunction2((t0: Double, t1: Double) => (updateByte(t0, t1)).runNow()), updateBytes = js.Any.fromFunction2((t0: Double, t1: SeqEquiv[Double]) => (updateBytes(t0, t1)).runNow()), updateCharacterStream = js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (updateCharacterStream(t0, t1, t2)).runNow()), updateDate = js.Any.fromFunction2((t0: Double, t1: Date) => (updateDate(t0, t1)).runNow()), updateDouble = js.Any.fromFunction2((t0: Double, t1: Double) => (updateDouble(t0, t1)).runNow()), updateFloat = js.Any.fromFunction2((t0: Double, t1: Double) => (updateFloat(t0, t1)).runNow()), updateInt = js.Any.fromFunction2((t0: Double, t1: Double) => (updateInt(t0, t1)).runNow()), updateLong = js.Any.fromFunction2((t0: Double, t1: Double) => (updateLong(t0, t1)).runNow()), updateNull = js.Any.fromFunction1((t0: Double) => updateNull(t0).runNow()), updateNumericObject = js.Any.fromFunction3((t0: Double, t1: Any, t2: Double) => (updateNumericObject(t0, t1, t2)).runNow()), updateObject = js.Any.fromFunction2((t0: Double, t1: Any) => (updateObject(t0, t1)).runNow()), updateShort = js.Any.fromFunction2((t0: Double, t1: Double) => (updateShort(t0, t1)).runNow()), updateString = js.Any.fromFunction2((t0: Double, t1: String) => (updateString(t0, t1)).runNow()), updateTime = js.Any.fromFunction2((t0: Double, t1: Time) => (updateTime(t0, t1)).runNow()), updateTimestamp = js.Any.fromFunction2((t0: Double, t1: DateTime) => (updateTimestamp(t0, t1)).runNow()))
    __obj.asInstanceOf[XRowUpdate]
  }
  
  extension [Self <: XRowUpdate](x: Self) {
    
    inline def setUpdateBinaryStream(value: (Double, XInputStream, Double) => Callback): Self = StObject.set(x, "updateBinaryStream", js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setUpdateBoolean(value: (Double, Boolean) => Callback): Self = StObject.set(x, "updateBoolean", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setUpdateByte(value: (Double, Double) => Callback): Self = StObject.set(x, "updateByte", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setUpdateBytes(value: (Double, SeqEquiv[Double]) => Callback): Self = StObject.set(x, "updateBytes", js.Any.fromFunction2((t0: Double, t1: SeqEquiv[Double]) => (value(t0, t1)).runNow()))
    
    inline def setUpdateCharacterStream(value: (Double, XInputStream, Double) => Callback): Self = StObject.set(x, "updateCharacterStream", js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setUpdateDate(value: (Double, Date) => Callback): Self = StObject.set(x, "updateDate", js.Any.fromFunction2((t0: Double, t1: Date) => (value(t0, t1)).runNow()))
    
    inline def setUpdateDouble(value: (Double, Double) => Callback): Self = StObject.set(x, "updateDouble", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setUpdateFloat(value: (Double, Double) => Callback): Self = StObject.set(x, "updateFloat", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setUpdateInt(value: (Double, Double) => Callback): Self = StObject.set(x, "updateInt", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setUpdateLong(value: (Double, Double) => Callback): Self = StObject.set(x, "updateLong", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setUpdateNull(value: Double => Callback): Self = StObject.set(x, "updateNull", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setUpdateNumericObject(value: (Double, Any, Double) => Callback): Self = StObject.set(x, "updateNumericObject", js.Any.fromFunction3((t0: Double, t1: Any, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setUpdateObject(value: (Double, Any) => Callback): Self = StObject.set(x, "updateObject", js.Any.fromFunction2((t0: Double, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setUpdateShort(value: (Double, Double) => Callback): Self = StObject.set(x, "updateShort", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setUpdateString(value: (Double, String) => Callback): Self = StObject.set(x, "updateString", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setUpdateTime(value: (Double, Time) => Callback): Self = StObject.set(x, "updateTime", js.Any.fromFunction2((t0: Double, t1: Time) => (value(t0, t1)).runNow()))
    
    inline def setUpdateTimestamp(value: (Double, DateTime) => Callback): Self = StObject.set(x, "updateTimestamp", js.Any.fromFunction2((t0: Double, t1: DateTime) => (value(t0, t1)).runNow()))
  }
}
