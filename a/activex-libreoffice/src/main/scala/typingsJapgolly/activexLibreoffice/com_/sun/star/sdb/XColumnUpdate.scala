package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

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
trait XColumnUpdate
  extends StObject
     with XInterface {
  
  /**
    * updates a column with a stream value.
    * @param x the new column value
    * @param length the length of the stream
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateBinaryStream(x: XInputStream, length: Double): Unit
  
  /**
    * updates a column with a boolean value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateBoolean(x: Boolean): Unit
  
  /**
    * updates a column with a byte value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateByte(x: Double): Unit
  
  /**
    * updates a column with a byte array value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateBytes(x: SeqEquiv[Double]): Unit
  
  /**
    * updates a column with a stream value.
    * @param x the new column value
    * @param length the length of the stream
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateCharacterStream(x: XInputStream, length: Double): Unit
  
  /**
    * updates a column with a Date value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateDate(x: Date): Unit
  
  /**
    * updates a column with a double value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateDouble(x: Double): Unit
  
  /**
    * updates a column with a float value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateFloat(x: Double): Unit
  
  /**
    * updates a column with a long value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateInt(x: Double): Unit
  
  /**
    * updates a column with a hyper value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateLong(x: Double): Unit
  
  /**
    * gives a nullable column a null value.
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateNull(): Unit
  
  /**
    * updates a column with an Object value.
    * @param x the new column value
    * @param scale the scale
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateNumericObject(x: Any, scale: Double): Unit
  
  /**
    * updates a column with an Object value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateObject(x: Any): Unit
  
  /**
    * updates a column with a short value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateShort(x: Double): Unit
  
  /**
    * updates a column with a string value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateString(x: String): Unit
  
  /**
    * updates a column with a Time value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateTime(x: Time): Unit
  
  /**
    * updates a column with a Timestamp value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateTimestamp(x: DateTime): Unit
}
object XColumnUpdate {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    updateBinaryStream: (XInputStream, Double) => Callback,
    updateBoolean: Boolean => Callback,
    updateByte: Double => Callback,
    updateBytes: SeqEquiv[Double] => Callback,
    updateCharacterStream: (XInputStream, Double) => Callback,
    updateDate: Date => Callback,
    updateDouble: Double => Callback,
    updateFloat: Double => Callback,
    updateInt: Double => Callback,
    updateLong: Double => Callback,
    updateNull: Callback,
    updateNumericObject: (Any, Double) => Callback,
    updateObject: Any => Callback,
    updateShort: Double => Callback,
    updateString: String => Callback,
    updateTime: Time => Callback,
    updateTimestamp: DateTime => Callback
  ): XColumnUpdate = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, updateBinaryStream = js.Any.fromFunction2((t0: XInputStream, t1: Double) => (updateBinaryStream(t0, t1)).runNow()), updateBoolean = js.Any.fromFunction1((t0: Boolean) => updateBoolean(t0).runNow()), updateByte = js.Any.fromFunction1((t0: Double) => updateByte(t0).runNow()), updateBytes = js.Any.fromFunction1((t0: SeqEquiv[Double]) => updateBytes(t0).runNow()), updateCharacterStream = js.Any.fromFunction2((t0: XInputStream, t1: Double) => (updateCharacterStream(t0, t1)).runNow()), updateDate = js.Any.fromFunction1((t0: Date) => updateDate(t0).runNow()), updateDouble = js.Any.fromFunction1((t0: Double) => updateDouble(t0).runNow()), updateFloat = js.Any.fromFunction1((t0: Double) => updateFloat(t0).runNow()), updateInt = js.Any.fromFunction1((t0: Double) => updateInt(t0).runNow()), updateLong = js.Any.fromFunction1((t0: Double) => updateLong(t0).runNow()), updateNull = updateNull.toJsFn, updateNumericObject = js.Any.fromFunction2((t0: Any, t1: Double) => (updateNumericObject(t0, t1)).runNow()), updateObject = js.Any.fromFunction1((t0: Any) => updateObject(t0).runNow()), updateShort = js.Any.fromFunction1((t0: Double) => updateShort(t0).runNow()), updateString = js.Any.fromFunction1((t0: String) => updateString(t0).runNow()), updateTime = js.Any.fromFunction1((t0: Time) => updateTime(t0).runNow()), updateTimestamp = js.Any.fromFunction1((t0: DateTime) => updateTimestamp(t0).runNow()))
    __obj.asInstanceOf[XColumnUpdate]
  }
  
  extension [Self <: XColumnUpdate](x: Self) {
    
    inline def setUpdateBinaryStream(value: (XInputStream, Double) => Callback): Self = StObject.set(x, "updateBinaryStream", js.Any.fromFunction2((t0: XInputStream, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setUpdateBoolean(value: Boolean => Callback): Self = StObject.set(x, "updateBoolean", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setUpdateByte(value: Double => Callback): Self = StObject.set(x, "updateByte", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setUpdateBytes(value: SeqEquiv[Double] => Callback): Self = StObject.set(x, "updateBytes", js.Any.fromFunction1((t0: SeqEquiv[Double]) => value(t0).runNow()))
    
    inline def setUpdateCharacterStream(value: (XInputStream, Double) => Callback): Self = StObject.set(x, "updateCharacterStream", js.Any.fromFunction2((t0: XInputStream, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setUpdateDate(value: Date => Callback): Self = StObject.set(x, "updateDate", js.Any.fromFunction1((t0: Date) => value(t0).runNow()))
    
    inline def setUpdateDouble(value: Double => Callback): Self = StObject.set(x, "updateDouble", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setUpdateFloat(value: Double => Callback): Self = StObject.set(x, "updateFloat", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setUpdateInt(value: Double => Callback): Self = StObject.set(x, "updateInt", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setUpdateLong(value: Double => Callback): Self = StObject.set(x, "updateLong", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setUpdateNull(value: Callback): Self = StObject.set(x, "updateNull", value.toJsFn)
    
    inline def setUpdateNumericObject(value: (Any, Double) => Callback): Self = StObject.set(x, "updateNumericObject", js.Any.fromFunction2((t0: Any, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setUpdateObject(value: Any => Callback): Self = StObject.set(x, "updateObject", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setUpdateShort(value: Double => Callback): Self = StObject.set(x, "updateShort", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setUpdateString(value: String => Callback): Self = StObject.set(x, "updateString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setUpdateTime(value: Time => Callback): Self = StObject.set(x, "updateTime", js.Any.fromFunction1((t0: Time) => value(t0).runNow()))
    
    inline def setUpdateTimestamp(value: DateTime => Callback): Self = StObject.set(x, "updateTimestamp", js.Any.fromFunction1((t0: DateTime) => value(t0).runNow()))
  }
}
