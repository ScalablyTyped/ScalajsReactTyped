package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XArray
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XBlob
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XClob
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XRef
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used to access data which is collected in a row. */
trait XColumn
  extends StObject
     with XInterface {
  
  /**
    * gets a SQL ARRAY value from the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Array: XArray
  
  /**
    * gets the value of a column in the current row as a stream of uninterpreted bytes. The value can then be read in chunks from the stream. This method is
    * particularly suitable for retrieving large LONGVARBINARY or LONGVARCHAR values.
    *
    * **Note:** All the data in the returned stream must be read prior to getting the value of any other column. The next call to a get method implicitly
    * closes the stream. Also, a stream may return 0 when the method {@link com.sun.star.io.XInputStream.available()} is called whether there is data
    * available or not.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val BinaryStream: XInputStream
  
  /**
    * gets a BLOB (Binary Large OBject) value in the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Blob: XBlob
  
  /**
    * gets the value of a column in the current row as boolean.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Boolean: scala.Boolean
  
  /**
    * gets the value of a column in the current row as a byte.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Byte: scala.Double
  
  /**
    * gets the value of a column in the current row as a byte array. The bytes represent the raw values returned by the driver.
    * @returns the column value; if the value is SQL NULL, the result is empty.
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Bytes: SafeArray[scala.Double]
  
  /**
    * gets the value of a column in the current row as a stream of uninterpreted bytes. The value can then be read in chunks from the stream. This method is
    * particularly suitable for retrieving large LONGVARCHAR values.
    *
    * **Note:** All the data in the returned stream must be read prior to getting the value of any other column. The next call to a get method implicitly
    * closes the stream. Also, a stream may return 0 when the method {@link com.sun.star.io.XInputStream.available()} is called whether there is data
    * available or not.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val CharacterStream: XInputStream
  
  /**
    * gets a CLOB value in the current row of this `ResultSet` object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Clob: XClob
  
  /**
    * gets the value of a column in the current row as a date object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Date: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date
  
  /**
    * gets the value of a column in the current row as a double.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Double: scala.Double
  
  /**
    * gets the value of a column in the current row as a float.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Float: scala.Double
  
  /**
    * gets the value of a column in the current row as a long.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Int: scala.Double
  
  /**
    * gets the value of a column in the current row as a hyper.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Long: scala.Double
  
  /**
    * gets a REF(<structured-type&gt) column value from the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Ref: XRef
  
  /**
    * gets the value of a column in the current row as a short.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Short: scala.Double
  
  /**
    * gets the value of a column in the current row as a String.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val String: java.lang.String
  
  /**
    * gets the value of a column in the current row as a time object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Time: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time
  
  /**
    * gets the value of a column in the current row as a datetime object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Timestamp: DateTime
  
  /**
    * gets a SQL ARRAY value from the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getArray(): XArray
  
  /**
    * gets the value of a column in the current row as a stream of uninterpreted bytes. The value can then be read in chunks from the stream. This method is
    * particularly suitable for retrieving large LONGVARBINARY or LONGVARCHAR values.
    *
    * **Note:** All the data in the returned stream must be read prior to getting the value of any other column. The next call to a get method implicitly
    * closes the stream. Also, a stream may return 0 when the method {@link com.sun.star.io.XInputStream.available()} is called whether there is data
    * available or not.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getBinaryStream(): XInputStream
  
  /**
    * gets a BLOB (Binary Large OBject) value in the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getBlob(): XBlob
  
  /**
    * gets the value of a column in the current row as boolean.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getBoolean(): scala.Boolean
  
  /**
    * gets the value of a column in the current row as a byte.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getByte(): scala.Double
  
  /**
    * gets the value of a column in the current row as a byte array. The bytes represent the raw values returned by the driver.
    * @returns the column value; if the value is SQL NULL, the result is empty.
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getBytes(): SafeArray[scala.Double]
  
  /**
    * gets the value of a column in the current row as a stream of uninterpreted bytes. The value can then be read in chunks from the stream. This method is
    * particularly suitable for retrieving large LONGVARCHAR values.
    *
    * **Note:** All the data in the returned stream must be read prior to getting the value of any other column. The next call to a get method implicitly
    * closes the stream. Also, a stream may return 0 when the method {@link com.sun.star.io.XInputStream.available()} is called whether there is data
    * available or not.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getCharacterStream(): XInputStream
  
  /**
    * gets a CLOB value in the current row of this `ResultSet` object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getClob(): XClob
  
  /**
    * gets the value of a column in the current row as a date object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getDate(): typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date
  
  /**
    * gets the value of a column in the current row as a double.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getDouble(): scala.Double
  
  /**
    * gets the value of a column in the current row as a float.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getFloat(): scala.Double
  
  /**
    * gets the value of a column in the current row as a long.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getInt(): scala.Double
  
  /**
    * gets the value of a column in the current row as a hyper.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getLong(): scala.Double
  
  /**
    * @param typeMap the type map is used to fetch the correct type
    * @returns the value of a column in the current row as an object. This method uses the given `Map` object for the custom mapping of the SQL structure or dis
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getObject(typeMap: XNameAccess): Any
  
  /**
    * gets a REF(<structured-type&gt) column value from the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getRef(): XRef
  
  /**
    * gets the value of a column in the current row as a short.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getShort(): scala.Double
  
  /**
    * gets the value of a column in the current row as a String.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getString(): java.lang.String
  
  /**
    * gets the value of a column in the current row as a time object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getTime(): typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time
  
  /**
    * gets the value of a column in the current row as a datetime object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getTimestamp(): DateTime
  
  /**
    * reports whether the last column read had a value of SQL NULL. Note that you must first call getXXX on a column to try to read its value and then call
    * `wasNull()` to see if the value read was SQL NULL.
    * @returns `TRUE` if so
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def wasNull(): scala.Boolean
}
object XColumn {
  
  inline def apply(
    Array: XArray,
    BinaryStream: XInputStream,
    Blob: XBlob,
    Boolean: Boolean,
    Byte: Double,
    Bytes: SafeArray[Double],
    CharacterStream: XInputStream,
    Clob: XClob,
    Date: Date,
    Double: Double,
    Float: Double,
    Int: Double,
    Long: Double,
    Ref: XRef,
    Short: Double,
    String: String,
    Time: Time,
    Timestamp: DateTime,
    acquire: Callback,
    getArray: CallbackTo[XArray],
    getBinaryStream: CallbackTo[XInputStream],
    getBlob: CallbackTo[XBlob],
    getBoolean: CallbackTo[Boolean],
    getByte: CallbackTo[Double],
    getBytes: CallbackTo[SafeArray[Double]],
    getCharacterStream: CallbackTo[XInputStream],
    getClob: CallbackTo[XClob],
    getDate: CallbackTo[Date],
    getDouble: CallbackTo[Double],
    getFloat: CallbackTo[Double],
    getInt: CallbackTo[Double],
    getLong: CallbackTo[Double],
    getObject: XNameAccess => Any,
    getRef: CallbackTo[XRef],
    getShort: CallbackTo[Double],
    getString: CallbackTo[String],
    getTime: CallbackTo[Time],
    getTimestamp: CallbackTo[DateTime],
    queryInterface: `type` => Any,
    release: Callback,
    wasNull: CallbackTo[Boolean]
  ): XColumn = {
    val __obj = js.Dynamic.literal(Array = Array.asInstanceOf[js.Any], BinaryStream = BinaryStream.asInstanceOf[js.Any], Blob = Blob.asInstanceOf[js.Any], Boolean = Boolean.asInstanceOf[js.Any], Byte = Byte.asInstanceOf[js.Any], Bytes = Bytes.asInstanceOf[js.Any], CharacterStream = CharacterStream.asInstanceOf[js.Any], Clob = Clob.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], Double = Double.asInstanceOf[js.Any], Float = Float.asInstanceOf[js.Any], Int = Int.asInstanceOf[js.Any], Long = Long.asInstanceOf[js.Any], Ref = Ref.asInstanceOf[js.Any], Short = Short.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any], acquire = acquire.toJsFn, getArray = getArray.toJsFn, getBinaryStream = getBinaryStream.toJsFn, getBlob = getBlob.toJsFn, getBoolean = getBoolean.toJsFn, getByte = getByte.toJsFn, getBytes = getBytes.toJsFn, getCharacterStream = getCharacterStream.toJsFn, getClob = getClob.toJsFn, getDate = getDate.toJsFn, getDouble = getDouble.toJsFn, getFloat = getFloat.toJsFn, getInt = getInt.toJsFn, getLong = getLong.toJsFn, getObject = js.Any.fromFunction1(getObject), getRef = getRef.toJsFn, getShort = getShort.toJsFn, getString = getString.toJsFn, getTime = getTime.toJsFn, getTimestamp = getTimestamp.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, wasNull = wasNull.toJsFn)
    __obj.asInstanceOf[XColumn]
  }
  
  extension [Self <: XColumn](x: Self) {
    
    inline def setArray(value: XArray): Self = StObject.set(x, "Array", value.asInstanceOf[js.Any])
    
    inline def setBinaryStream(value: XInputStream): Self = StObject.set(x, "BinaryStream", value.asInstanceOf[js.Any])
    
    inline def setBlob(value: XBlob): Self = StObject.set(x, "Blob", value.asInstanceOf[js.Any])
    
    inline def setBoolean(value: Boolean): Self = StObject.set(x, "Boolean", value.asInstanceOf[js.Any])
    
    inline def setByte(value: Double): Self = StObject.set(x, "Byte", value.asInstanceOf[js.Any])
    
    inline def setBytes(value: SafeArray[Double]): Self = StObject.set(x, "Bytes", value.asInstanceOf[js.Any])
    
    inline def setCharacterStream(value: XInputStream): Self = StObject.set(x, "CharacterStream", value.asInstanceOf[js.Any])
    
    inline def setClob(value: XClob): Self = StObject.set(x, "Clob", value.asInstanceOf[js.Any])
    
    inline def setDate(value: Date): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setDouble(value: Double): Self = StObject.set(x, "Double", value.asInstanceOf[js.Any])
    
    inline def setFloat(value: Double): Self = StObject.set(x, "Float", value.asInstanceOf[js.Any])
    
    inline def setGetArray(value: CallbackTo[XArray]): Self = StObject.set(x, "getArray", value.toJsFn)
    
    inline def setGetBinaryStream(value: CallbackTo[XInputStream]): Self = StObject.set(x, "getBinaryStream", value.toJsFn)
    
    inline def setGetBlob(value: CallbackTo[XBlob]): Self = StObject.set(x, "getBlob", value.toJsFn)
    
    inline def setGetBoolean(value: CallbackTo[Boolean]): Self = StObject.set(x, "getBoolean", value.toJsFn)
    
    inline def setGetByte(value: CallbackTo[Double]): Self = StObject.set(x, "getByte", value.toJsFn)
    
    inline def setGetBytes(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getBytes", value.toJsFn)
    
    inline def setGetCharacterStream(value: CallbackTo[XInputStream]): Self = StObject.set(x, "getCharacterStream", value.toJsFn)
    
    inline def setGetClob(value: CallbackTo[XClob]): Self = StObject.set(x, "getClob", value.toJsFn)
    
    inline def setGetDate(value: CallbackTo[Date]): Self = StObject.set(x, "getDate", value.toJsFn)
    
    inline def setGetDouble(value: CallbackTo[Double]): Self = StObject.set(x, "getDouble", value.toJsFn)
    
    inline def setGetFloat(value: CallbackTo[Double]): Self = StObject.set(x, "getFloat", value.toJsFn)
    
    inline def setGetInt(value: CallbackTo[Double]): Self = StObject.set(x, "getInt", value.toJsFn)
    
    inline def setGetLong(value: CallbackTo[Double]): Self = StObject.set(x, "getLong", value.toJsFn)
    
    inline def setGetObject(value: XNameAccess => Any): Self = StObject.set(x, "getObject", js.Any.fromFunction1(value))
    
    inline def setGetRef(value: CallbackTo[XRef]): Self = StObject.set(x, "getRef", value.toJsFn)
    
    inline def setGetShort(value: CallbackTo[Double]): Self = StObject.set(x, "getShort", value.toJsFn)
    
    inline def setGetString(value: CallbackTo[String]): Self = StObject.set(x, "getString", value.toJsFn)
    
    inline def setGetTime(value: CallbackTo[Time]): Self = StObject.set(x, "getTime", value.toJsFn)
    
    inline def setGetTimestamp(value: CallbackTo[DateTime]): Self = StObject.set(x, "getTimestamp", value.toJsFn)
    
    inline def setInt(value: Double): Self = StObject.set(x, "Int", value.asInstanceOf[js.Any])
    
    inline def setLong(value: Double): Self = StObject.set(x, "Long", value.asInstanceOf[js.Any])
    
    inline def setRef(value: XRef): Self = StObject.set(x, "Ref", value.asInstanceOf[js.Any])
    
    inline def setShort(value: Double): Self = StObject.set(x, "Short", value.asInstanceOf[js.Any])
    
    inline def setString(value: String): Self = StObject.set(x, "String", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Time): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: DateTime): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setWasNull(value: CallbackTo[Boolean]): Self = StObject.set(x, "wasNull", value.toJsFn)
  }
}
