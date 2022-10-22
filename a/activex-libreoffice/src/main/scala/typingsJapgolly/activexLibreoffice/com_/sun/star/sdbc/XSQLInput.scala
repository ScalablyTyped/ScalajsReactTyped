package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents an input stream that contains a stream of values representing an instance of a SQL structured or distinct type.
  *
  * This interface, used only for custom mapping, is used by the driver behind the scenes, and a programmer never directly invokes `SQLInput` methods.
  *
  * When the method `getObject` is called with an object of a service implementing the interface `SQLData` , the SDBC driver calls the method
  * com::sun::star::sdbc::XSQLData::getSQLType() to determine the SQL type of the user-defined type (UDT) being custom mapped. The driver creates an
  * instance of {@link com.sun.star.sdbc.XSQLInput} , populating it with the attributes of the UDT. The driver then passes the input stream to the method
  * {@link com.sun.star.sdbc.XSQLData.readSQL()} , which in turn calls the `XSQLInput.readXXX` methods in its implementation for reading the attributes
  * from the input stream.
  */
trait XSQLInput
  extends StObject
     with XInterface {
  
  /**
    * reads an array from the stream.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readArray(): XArray
  
  /**
    * reads the next attribute in the stream as sequence of bytes.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readBinaryStream(): XInputStream
  
  /**
    * reads a BLOB from the stream.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readBlob(): XBlob
  
  /**
    * reads the next attribute in the stream as boolean.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readBoolean(): Boolean
  
  /**
    * reads the next attribute in the stream as byte.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readByte(): Double
  
  /**
    * reads the next attribute in the stream as sequence of bytes.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readBytes(): SafeArray[Double]
  
  /**
    * reads the next attribute in the stream as a Unicode string.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readCharacterStream(): XInputStream
  
  /**
    * reads a CLOB from the stream.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readClob(): XClob
  
  /**
    * reads the next attribute in the stream as date.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readDate(): Date
  
  /**
    * reads the next attribute in the stream as double.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readDouble(): Double
  
  /**
    * reads the next attribute in the stream as float.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readFloat(): Double
  
  /**
    * reads the next attribute in the stream as long.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readInt(): Double
  
  /**
    * reads the next attribute in the stream as hyper.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readLong(): Double
  
  /**
    * returns the datum at the head of the stream as an any.
    *
    * The actual type of the any returned is determined by the default type mapping, and any customizations present in this stream's type map.
    *
    * ;  A type map is registered with the stream by the SDBC driver before the stream is passed to the application.
    *
    * ;  When the datum at the head of the stream is a SQL NULL, the method returns `VOID` . If the datum is a SQL structured or distinct type, it
    * determines the SQL type of the datum at the head of the stream, constructs an object of the appropriate service, and calls the method {@link
    * com.sun.star.sdbc.XSQLData.readSQL()} on that object, which reads additional data from the stream using the protocol described for that method.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readObject(): Any
  
  /**
    * reads a REF(&lt;structured-type&gt;) from the stream.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readRef(): XRef
  
  /**
    * reads the next attribute in the stream as short.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readShort(): Double
  
  /**
    * reads the next attribute in the stream as string.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readString(): String
  
  /**
    * reads the next attribute in the stream as time.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readTime(): Time
  
  /**
    * reads the next attribute in the stream as datetime.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readTimestamp(): DateTime
  
  /**
    * determines whether the last value read was null.
    * @returns `TRUE` if the most recently gotten SQL value was null; otherwise, `FALSE`
    * @throws SQLException if a database access error occurs.
    */
  def wasNull(): Boolean
}
object XSQLInput {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    readArray: CallbackTo[XArray],
    readBinaryStream: CallbackTo[XInputStream],
    readBlob: CallbackTo[XBlob],
    readBoolean: CallbackTo[Boolean],
    readByte: CallbackTo[Double],
    readBytes: CallbackTo[SafeArray[Double]],
    readCharacterStream: CallbackTo[XInputStream],
    readClob: CallbackTo[XClob],
    readDate: CallbackTo[Date],
    readDouble: CallbackTo[Double],
    readFloat: CallbackTo[Double],
    readInt: CallbackTo[Double],
    readLong: CallbackTo[Double],
    readObject: CallbackTo[Any],
    readRef: CallbackTo[XRef],
    readShort: CallbackTo[Double],
    readString: CallbackTo[String],
    readTime: CallbackTo[Time],
    readTimestamp: CallbackTo[DateTime],
    release: Callback,
    wasNull: CallbackTo[Boolean]
  ): XSQLInput = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), readArray = readArray.toJsFn, readBinaryStream = readBinaryStream.toJsFn, readBlob = readBlob.toJsFn, readBoolean = readBoolean.toJsFn, readByte = readByte.toJsFn, readBytes = readBytes.toJsFn, readCharacterStream = readCharacterStream.toJsFn, readClob = readClob.toJsFn, readDate = readDate.toJsFn, readDouble = readDouble.toJsFn, readFloat = readFloat.toJsFn, readInt = readInt.toJsFn, readLong = readLong.toJsFn, readObject = readObject.toJsFn, readRef = readRef.toJsFn, readShort = readShort.toJsFn, readString = readString.toJsFn, readTime = readTime.toJsFn, readTimestamp = readTimestamp.toJsFn, release = release.toJsFn, wasNull = wasNull.toJsFn)
    __obj.asInstanceOf[XSQLInput]
  }
  
  extension [Self <: XSQLInput](x: Self) {
    
    inline def setReadArray(value: CallbackTo[XArray]): Self = StObject.set(x, "readArray", value.toJsFn)
    
    inline def setReadBinaryStream(value: CallbackTo[XInputStream]): Self = StObject.set(x, "readBinaryStream", value.toJsFn)
    
    inline def setReadBlob(value: CallbackTo[XBlob]): Self = StObject.set(x, "readBlob", value.toJsFn)
    
    inline def setReadBoolean(value: CallbackTo[Boolean]): Self = StObject.set(x, "readBoolean", value.toJsFn)
    
    inline def setReadByte(value: CallbackTo[Double]): Self = StObject.set(x, "readByte", value.toJsFn)
    
    inline def setReadBytes(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "readBytes", value.toJsFn)
    
    inline def setReadCharacterStream(value: CallbackTo[XInputStream]): Self = StObject.set(x, "readCharacterStream", value.toJsFn)
    
    inline def setReadClob(value: CallbackTo[XClob]): Self = StObject.set(x, "readClob", value.toJsFn)
    
    inline def setReadDate(value: CallbackTo[Date]): Self = StObject.set(x, "readDate", value.toJsFn)
    
    inline def setReadDouble(value: CallbackTo[Double]): Self = StObject.set(x, "readDouble", value.toJsFn)
    
    inline def setReadFloat(value: CallbackTo[Double]): Self = StObject.set(x, "readFloat", value.toJsFn)
    
    inline def setReadInt(value: CallbackTo[Double]): Self = StObject.set(x, "readInt", value.toJsFn)
    
    inline def setReadLong(value: CallbackTo[Double]): Self = StObject.set(x, "readLong", value.toJsFn)
    
    inline def setReadObject(value: CallbackTo[Any]): Self = StObject.set(x, "readObject", value.toJsFn)
    
    inline def setReadRef(value: CallbackTo[XRef]): Self = StObject.set(x, "readRef", value.toJsFn)
    
    inline def setReadShort(value: CallbackTo[Double]): Self = StObject.set(x, "readShort", value.toJsFn)
    
    inline def setReadString(value: CallbackTo[String]): Self = StObject.set(x, "readString", value.toJsFn)
    
    inline def setReadTime(value: CallbackTo[Time]): Self = StObject.set(x, "readTime", value.toJsFn)
    
    inline def setReadTimestamp(value: CallbackTo[DateTime]): Self = StObject.set(x, "readTimestamp", value.toJsFn)
    
    inline def setWasNull(value: CallbackTo[Boolean]): Self = StObject.set(x, "wasNull", value.toJsFn)
  }
}
