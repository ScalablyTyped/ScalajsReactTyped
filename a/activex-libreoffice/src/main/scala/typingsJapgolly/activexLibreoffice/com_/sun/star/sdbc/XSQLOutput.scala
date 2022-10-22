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

/**
  * is used as an output stream for writing the attributes of a user-defined type back to the database. This interface, used only for custom mapping, is
  * used by the driver, and its methods are never directly invoked by a programmer.
  *
  * When an object of a class implementing interface {@link com.sun.star.sdbc.XSQLData} is passed as an argument to a SQL statement, the JDBC driver calls
  * com::sun::star::sdbc::SQLData::getSQLType() to determine the kind of SQL datum being passed to the database. ;  The driver then creates an instance of
  * `XSQLOutput` and passes it to the method {@link com.sun.star.sdbc.XSQLData.writeSQL()} . The method `writeSQL` in turn calls the appropriate
  * `XSQLOutput.writeXXX` methods to write data from the {@link com.sun.star.sdbc.XSQLData} object to the `XSQLOutput` output stream as the representation
  * of a SQL user-defined type.
  */
trait XSQLOutput
  extends StObject
     with XInterface {
  
  /**
    * writes an array to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeArray(x: XArray): Unit
  
  /**
    * writes the next attribute to the stream as a stream of uninterpreted bytes.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeBinaryStream(x: XInputStream): Unit
  
  /**
    * writes a BLOB to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeBlob(x: XBlob): Unit
  
  /**
    * writes the next attribute to the stream as boolean.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeBoolean(x: Boolean): Unit
  
  /**
    * writes the next attribute to the stream as byte.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeByte(x: Double): Unit
  
  /**
    * writes the next attribute to the stream as byte sequence.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeBytes(x: SeqEquiv[Double]): Unit
  
  /**
    * writes the next attribute to the stream as a stream of Unicode string.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeCharacterStream(x: XInputStream): Unit
  
  /**
    * writes a CLOB to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeClob(x: XClob): Unit
  
  /**
    * writes the next attribute to the stream as a date.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeDate(x: Date): Unit
  
  /**
    * writes the next attribute to the stream as double.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeDouble(x: Double): Unit
  
  /**
    * writes the next attribute to the stream as float.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeFloat(x: Double): Unit
  
  /**
    * writes the next attribute to the stream as long.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeInt(x: Double): Unit
  
  /**
    * writes the next attribute to the stream as hyper.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeLong(x: Double): Unit
  
  /**
    * writes to the stream the data contained in the given `XSQLData` object.
    *
    * When the `XSQLData` object is `NULL` , this method writes an SQL NULL to the stream. Otherwise, it calls the {@link
    * com.sun.star.sdbc.XSQLData.writeSQL()} method of the given object, which writes the object's attributes to the stream. The implementation of the
    * method `XSQLData::writeSQL()` calls the appropriate `XSQLOutput.writeXXX` method(s) for writing each of the object's attributes in order. ;  The
    * attributes must be read from an {@link com.sun.star.sdbc.XSQLInput} input stream and written to an `XSQLOutput` output stream in the same order in
    * which they were listed in the SQL definition of the user-defined type.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeObject(x: XSQLData): Unit
  
  /**
    * writes a REF(&lt;structured-type&gt;) to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeRef(x: XRef): Unit
  
  /**
    * writes the next attribute to the stream as short.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeShort(x: Double): Unit
  
  /**
    * writes the next attribute to the stream as a string.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeString(x: String): Unit
  
  /**
    * writes a structured-type to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeStruct(x: XStruct): Unit
  
  /**
    * writes the next attribute to the stream as a time.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeTime(x: Time): Unit
  
  /**
    * writes the next attribute to the stream as a datetime.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeTimestamp(x: DateTime): Unit
}
object XSQLOutput {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    writeArray: XArray => Callback,
    writeBinaryStream: XInputStream => Callback,
    writeBlob: XBlob => Callback,
    writeBoolean: Boolean => Callback,
    writeByte: Double => Callback,
    writeBytes: SeqEquiv[Double] => Callback,
    writeCharacterStream: XInputStream => Callback,
    writeClob: XClob => Callback,
    writeDate: Date => Callback,
    writeDouble: Double => Callback,
    writeFloat: Double => Callback,
    writeInt: Double => Callback,
    writeLong: Double => Callback,
    writeObject: XSQLData => Callback,
    writeRef: XRef => Callback,
    writeShort: Double => Callback,
    writeString: String => Callback,
    writeStruct: XStruct => Callback,
    writeTime: Time => Callback,
    writeTimestamp: DateTime => Callback
  ): XSQLOutput = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, writeArray = js.Any.fromFunction1((t0: XArray) => writeArray(t0).runNow()), writeBinaryStream = js.Any.fromFunction1((t0: XInputStream) => writeBinaryStream(t0).runNow()), writeBlob = js.Any.fromFunction1((t0: XBlob) => writeBlob(t0).runNow()), writeBoolean = js.Any.fromFunction1((t0: Boolean) => writeBoolean(t0).runNow()), writeByte = js.Any.fromFunction1((t0: Double) => writeByte(t0).runNow()), writeBytes = js.Any.fromFunction1((t0: SeqEquiv[Double]) => writeBytes(t0).runNow()), writeCharacterStream = js.Any.fromFunction1((t0: XInputStream) => writeCharacterStream(t0).runNow()), writeClob = js.Any.fromFunction1((t0: XClob) => writeClob(t0).runNow()), writeDate = js.Any.fromFunction1((t0: Date) => writeDate(t0).runNow()), writeDouble = js.Any.fromFunction1((t0: Double) => writeDouble(t0).runNow()), writeFloat = js.Any.fromFunction1((t0: Double) => writeFloat(t0).runNow()), writeInt = js.Any.fromFunction1((t0: Double) => writeInt(t0).runNow()), writeLong = js.Any.fromFunction1((t0: Double) => writeLong(t0).runNow()), writeObject = js.Any.fromFunction1((t0: XSQLData) => writeObject(t0).runNow()), writeRef = js.Any.fromFunction1((t0: XRef) => writeRef(t0).runNow()), writeShort = js.Any.fromFunction1((t0: Double) => writeShort(t0).runNow()), writeString = js.Any.fromFunction1((t0: String) => writeString(t0).runNow()), writeStruct = js.Any.fromFunction1((t0: XStruct) => writeStruct(t0).runNow()), writeTime = js.Any.fromFunction1((t0: Time) => writeTime(t0).runNow()), writeTimestamp = js.Any.fromFunction1((t0: DateTime) => writeTimestamp(t0).runNow()))
    __obj.asInstanceOf[XSQLOutput]
  }
  
  extension [Self <: XSQLOutput](x: Self) {
    
    inline def setWriteArray(value: XArray => Callback): Self = StObject.set(x, "writeArray", js.Any.fromFunction1((t0: XArray) => value(t0).runNow()))
    
    inline def setWriteBinaryStream(value: XInputStream => Callback): Self = StObject.set(x, "writeBinaryStream", js.Any.fromFunction1((t0: XInputStream) => value(t0).runNow()))
    
    inline def setWriteBlob(value: XBlob => Callback): Self = StObject.set(x, "writeBlob", js.Any.fromFunction1((t0: XBlob) => value(t0).runNow()))
    
    inline def setWriteBoolean(value: Boolean => Callback): Self = StObject.set(x, "writeBoolean", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setWriteByte(value: Double => Callback): Self = StObject.set(x, "writeByte", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setWriteBytes(value: SeqEquiv[Double] => Callback): Self = StObject.set(x, "writeBytes", js.Any.fromFunction1((t0: SeqEquiv[Double]) => value(t0).runNow()))
    
    inline def setWriteCharacterStream(value: XInputStream => Callback): Self = StObject.set(x, "writeCharacterStream", js.Any.fromFunction1((t0: XInputStream) => value(t0).runNow()))
    
    inline def setWriteClob(value: XClob => Callback): Self = StObject.set(x, "writeClob", js.Any.fromFunction1((t0: XClob) => value(t0).runNow()))
    
    inline def setWriteDate(value: Date => Callback): Self = StObject.set(x, "writeDate", js.Any.fromFunction1((t0: Date) => value(t0).runNow()))
    
    inline def setWriteDouble(value: Double => Callback): Self = StObject.set(x, "writeDouble", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setWriteFloat(value: Double => Callback): Self = StObject.set(x, "writeFloat", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setWriteInt(value: Double => Callback): Self = StObject.set(x, "writeInt", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setWriteLong(value: Double => Callback): Self = StObject.set(x, "writeLong", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setWriteObject(value: XSQLData => Callback): Self = StObject.set(x, "writeObject", js.Any.fromFunction1((t0: XSQLData) => value(t0).runNow()))
    
    inline def setWriteRef(value: XRef => Callback): Self = StObject.set(x, "writeRef", js.Any.fromFunction1((t0: XRef) => value(t0).runNow()))
    
    inline def setWriteShort(value: Double => Callback): Self = StObject.set(x, "writeShort", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setWriteString(value: String => Callback): Self = StObject.set(x, "writeString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setWriteStruct(value: XStruct => Callback): Self = StObject.set(x, "writeStruct", js.Any.fromFunction1((t0: XStruct) => value(t0).runNow()))
    
    inline def setWriteTime(value: Time => Callback): Self = StObject.set(x, "writeTime", js.Any.fromFunction1((t0: Time) => value(t0).runNow()))
    
    inline def setWriteTimestamp(value: DateTime => Callback): Self = StObject.set(x, "writeTimestamp", js.Any.fromFunction1((t0: DateTime) => value(t0).runNow()))
  }
}
