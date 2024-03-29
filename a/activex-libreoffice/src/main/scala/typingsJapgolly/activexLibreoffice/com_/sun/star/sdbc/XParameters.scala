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
  * is used for parameter setting, commonly implemented in conjunction with PreparedStatements.
  *
  * **Note:** The setXXX methods for setting IN parameter values must specify types that are compatible with the defined SQL type of the input parameter.
  * For instance, if the IN parameter has SQL type Integer, then the method {@link com.sun.star.sdbc.XParameters.setInt()} should be used.
  *
  * If arbitrary parameter type conversions are required, the method {@link com.sun.star.sdbc.XParameters.setObject()} should be used with a target SQL
  * type. ; ;  Example of setting a parameter; `con` is an active connection.
  *
  * {{program example here, see documentation}}
  * @see com.sun.star.sdbc.XPreparedStatement
  */
trait XParameters
  extends StObject
     with XInterface {
  
  /**
    * clears the current parameter values immediately.
    *
    * In general, parameter values remain in force for repeated use of a {@link Statement} . Setting a parameter value automatically clears its previous
    * value. However, in some cases it is useful to immediately release the resources used by the current parameter values; this can be done by calling
    * clearParameters.
    * @throws SQLException if a database access error occurs.
    */
  def clearParameters(): Unit
  
  /**
    * sets an Array parameter.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setArray(parameterIndex: Double, x: XArray): Unit
  
  /**
    * sets the designated parameter to the given input stream, which will have the specified number of bytes. When a very large binary value is input to a
    * LONGVARBINARY or LONGVARCHAR parameter, it may be more practical to send it via an {@link com.sun.star.io.XInputStream} . SDBC will read the data from
    * the stream as needed, until it reaches end-of-file.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @param length the number of bytes in the stream
    * @throws SQLException if a database access error occurs.
    */
  def setBinaryStream(parameterIndex: Double, x: XInputStream, length: Double): Unit
  
  /**
    * sets a BLOB parameter.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setBlob(parameterIndex: Double, x: XBlob): Unit
  
  /**
    * sets the designated parameter to a boolean value. The driver converts this to a SQL BIT value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setBoolean(parameterIndex: Double, x: Boolean): Unit
  
  /**
    * sets the designated parameter to a byte value. The driver converts this to a SQL TINYINT value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setByte(parameterIndex: Double, x: Double): Unit
  
  /**
    * sets the designated parameter to a sequence of bytes. The driver converts this to a SQL VARBINARY or LONGVARBINARY (depending on the argument's size
    * relative to the driver's limits on VARBINARYs) when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setBytes(parameterIndex: Double, x: SeqEquiv[Double]): Unit
  
  /**
    * sets the designated parameter to the given input stream, which will have the specified number of bytes. When a very large binary value is input to a
    * LONGVARCHAR parameter, it may be more practical to send it via a {@link com.sun.star.io.XInputStream} . SDBC will read the data from the stream as
    * needed, until it reaches end-of-file.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @param length the number of characters in the stream
    * @throws SQLException if a database access error occurs.
    */
  def setCharacterStream(parameterIndex: Double, x: XInputStream, length: Double): Unit
  
  /**
    * sets a CLOB parameter.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setClob(parameterIndex: Double, x: XClob): Unit
  
  /**
    * sets the designated parameter to a date value. The driver converts this to a SQL DATE value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setDate(parameterIndex: Double, x: Date): Unit
  
  /**
    * sets the designated parameter to a double value. The driver converts this to a SQL DOUBLE value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setDouble(parameterIndex: Double, x: Double): Unit
  
  /**
    * sets the designated parameter to a float value. The driver converts this to a SQL FLOAT value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setFloat(parameterIndex: Double, x: Double): Unit
  
  /**
    * sets the designated parameter to a long value. The driver converts this to a SQL INTEGER value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setInt(parameterIndex: Double, x: Double): Unit
  
  /**
    * sets the designated parameter to a hyper value. The driver converts this to a SQL BIGINT value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setLong(parameterIndex: Double, x: Double): Unit
  
  /** sets the designated parameter to SQL NULL. */
  def setNull(parameterIndex: Double, sqlType: Double): Unit
  
  /**
    * sets the value of a parameter using an any.
    *
    * The given object will be converted to the targetSqlType before being sent to the database. If the object has a custom mapping (is of a class
    * implementing SQLData), the SDBC driver should call its method `writeSQL` to write it to the SQL data stream. If, on the other hand, the object is of a
    * service implementing Ref, Blob, Clob, Struct, or Array, the driver should pass it to the database as a value of the corresponding SQL type.
    *
    * Note that this method may be used to pass database-specific abstract data types.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setObject(parameterIndex: Double, x: Any): Unit
  
  /**
    * sets the designated parameter to SQL NULL. This version of setNull should be used for user-named types and REF type parameters. Examples of user-named
    * types include: STRUCT, DISTINCT, OBJECT, and named array types.
    *
    * **Note:** To be portable, applications must give the SQL type code and the fully-qualified SQL type name when specifying a NULL user-defined or REF
    * parameter. In the case of a user-named type the name is the type name of the parameter itself. For a REF parameter the name is the type name of the
    * referenced type. If a SDBC driver does not need the type code or type name information, it may ignore it. ;  Although it is intended for user-named
    * and Ref parameters, this method may be used to set a null parameter of any JDBC type. If the parameter does not have a user-named or REF type, the
    * given typeName is ignored.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param sqlType the type of the column to set to `NULL`
    * @param typeName the name of the type
    * @throws SQLException if a database access error occurs.
    */
  def setObjectNull(parameterIndex: Double, sqlType: Double, typeName: String): Unit
  
  /**
    * set a value from the Datatype ANY for a parameter.
    *
    * The given object will be converted to the targetSqlType before being sent to the database. If the object has a custom mapping (is of a class
    * implementing SQLData), the SDBC driver should call its method `writeSQL` to write it to the SQL data stream. If, on the other hand, the object is of a
    * service implementing Ref, Blob, Clob, Struct, or Array, the driver should pass it to the database as a value of the corresponding SQL type.
    *
    * Note that this method may be used to pass database-specific abstract data types.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @param targetSqlType the SQL type (as defined in {@link com.sun.star.sdbc.DataType} ) to be sent to the database. The scale argument may further qualify
    * @param scale for {@link com.sun.star.sdbc.DataType.DECIMAL} or {@link com.sun.star.sdbc.DataType.NUMERIC} types, this is the number of digits after the
    * @throws SQLException if a database access error occurs.
    */
  def setObjectWithInfo(parameterIndex: Double, x: Any, targetSqlType: Double, scale: Double): Unit
  
  /**
    * sets a REF(&lt;structured-type&gt;) parameter.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setRef(parameterIndex: Double, x: XRef): Unit
  
  /**
    * sets the designated parameter to a short value. The driver converts this to a SQL SMALLINT value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setShort(parameterIndex: Double, x: Double): Unit
  
  /**
    * sets the designated parameter to a string value. The driver converts this to a SQL VARCHAR or LONGVARCHAR value (depending on the argument's size
    * relative to the driver's limits on VARCHARs) when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setString(parameterIndex: Double, x: String): Unit
  
  /**
    * sets the designated parameter to a time value. The driver converts this to a SQL TIME value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setTime(parameterIndex: Double, x: Time): Unit
  
  /**
    * sets the designated parameter to a datetime value. The driver converts this to a SQL TIMESTAMP value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setTimestamp(parameterIndex: Double, x: DateTime): Unit
}
object XParameters {
  
  inline def apply(
    acquire: Callback,
    clearParameters: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setArray: (Double, XArray) => Callback,
    setBinaryStream: (Double, XInputStream, Double) => Callback,
    setBlob: (Double, XBlob) => Callback,
    setBoolean: (Double, Boolean) => Callback,
    setByte: (Double, Double) => Callback,
    setBytes: (Double, SeqEquiv[Double]) => Callback,
    setCharacterStream: (Double, XInputStream, Double) => Callback,
    setClob: (Double, XClob) => Callback,
    setDate: (Double, Date) => Callback,
    setDouble: (Double, Double) => Callback,
    setFloat: (Double, Double) => Callback,
    setInt: (Double, Double) => Callback,
    setLong: (Double, Double) => Callback,
    setNull: (Double, Double) => Callback,
    setObject: (Double, Any) => Callback,
    setObjectNull: (Double, Double, String) => Callback,
    setObjectWithInfo: (Double, Any, Double, Double) => Callback,
    setRef: (Double, XRef) => Callback,
    setShort: (Double, Double) => Callback,
    setString: (Double, String) => Callback,
    setTime: (Double, Time) => Callback,
    setTimestamp: (Double, DateTime) => Callback
  ): XParameters = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, clearParameters = clearParameters.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setArray = js.Any.fromFunction2((t0: Double, t1: XArray) => (setArray(t0, t1)).runNow()), setBinaryStream = js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (setBinaryStream(t0, t1, t2)).runNow()), setBlob = js.Any.fromFunction2((t0: Double, t1: XBlob) => (setBlob(t0, t1)).runNow()), setBoolean = js.Any.fromFunction2((t0: Double, t1: Boolean) => (setBoolean(t0, t1)).runNow()), setByte = js.Any.fromFunction2((t0: Double, t1: Double) => (setByte(t0, t1)).runNow()), setBytes = js.Any.fromFunction2((t0: Double, t1: SeqEquiv[Double]) => (setBytes(t0, t1)).runNow()), setCharacterStream = js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (setCharacterStream(t0, t1, t2)).runNow()), setClob = js.Any.fromFunction2((t0: Double, t1: XClob) => (setClob(t0, t1)).runNow()), setDate = js.Any.fromFunction2((t0: Double, t1: Date) => (setDate(t0, t1)).runNow()), setDouble = js.Any.fromFunction2((t0: Double, t1: Double) => (setDouble(t0, t1)).runNow()), setFloat = js.Any.fromFunction2((t0: Double, t1: Double) => (setFloat(t0, t1)).runNow()), setInt = js.Any.fromFunction2((t0: Double, t1: Double) => (setInt(t0, t1)).runNow()), setLong = js.Any.fromFunction2((t0: Double, t1: Double) => (setLong(t0, t1)).runNow()), setNull = js.Any.fromFunction2((t0: Double, t1: Double) => (setNull(t0, t1)).runNow()), setObject = js.Any.fromFunction2((t0: Double, t1: Any) => (setObject(t0, t1)).runNow()), setObjectNull = js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (setObjectNull(t0, t1, t2)).runNow()), setObjectWithInfo = js.Any.fromFunction4((t0: Double, t1: Any, t2: Double, t3: Double) => (setObjectWithInfo(t0, t1, t2, t3)).runNow()), setRef = js.Any.fromFunction2((t0: Double, t1: XRef) => (setRef(t0, t1)).runNow()), setShort = js.Any.fromFunction2((t0: Double, t1: Double) => (setShort(t0, t1)).runNow()), setString = js.Any.fromFunction2((t0: Double, t1: String) => (setString(t0, t1)).runNow()), setTime = js.Any.fromFunction2((t0: Double, t1: Time) => (setTime(t0, t1)).runNow()), setTimestamp = js.Any.fromFunction2((t0: Double, t1: DateTime) => (setTimestamp(t0, t1)).runNow()))
    __obj.asInstanceOf[XParameters]
  }
  
  extension [Self <: XParameters](x: Self) {
    
    inline def setClearParameters(value: Callback): Self = StObject.set(x, "clearParameters", value.toJsFn)
    
    inline def setSetArray(value: (Double, XArray) => Callback): Self = StObject.set(x, "setArray", js.Any.fromFunction2((t0: Double, t1: XArray) => (value(t0, t1)).runNow()))
    
    inline def setSetBinaryStream(value: (Double, XInputStream, Double) => Callback): Self = StObject.set(x, "setBinaryStream", js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetBlob(value: (Double, XBlob) => Callback): Self = StObject.set(x, "setBlob", js.Any.fromFunction2((t0: Double, t1: XBlob) => (value(t0, t1)).runNow()))
    
    inline def setSetBoolean(value: (Double, Boolean) => Callback): Self = StObject.set(x, "setBoolean", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setSetByte(value: (Double, Double) => Callback): Self = StObject.set(x, "setByte", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetBytes(value: (Double, SeqEquiv[Double]) => Callback): Self = StObject.set(x, "setBytes", js.Any.fromFunction2((t0: Double, t1: SeqEquiv[Double]) => (value(t0, t1)).runNow()))
    
    inline def setSetCharacterStream(value: (Double, XInputStream, Double) => Callback): Self = StObject.set(x, "setCharacterStream", js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetClob(value: (Double, XClob) => Callback): Self = StObject.set(x, "setClob", js.Any.fromFunction2((t0: Double, t1: XClob) => (value(t0, t1)).runNow()))
    
    inline def setSetDate(value: (Double, Date) => Callback): Self = StObject.set(x, "setDate", js.Any.fromFunction2((t0: Double, t1: Date) => (value(t0, t1)).runNow()))
    
    inline def setSetDouble(value: (Double, Double) => Callback): Self = StObject.set(x, "setDouble", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetFloat(value: (Double, Double) => Callback): Self = StObject.set(x, "setFloat", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetInt(value: (Double, Double) => Callback): Self = StObject.set(x, "setInt", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetLong(value: (Double, Double) => Callback): Self = StObject.set(x, "setLong", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetNull(value: (Double, Double) => Callback): Self = StObject.set(x, "setNull", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetObject(value: (Double, Any) => Callback): Self = StObject.set(x, "setObject", js.Any.fromFunction2((t0: Double, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setSetObjectNull(value: (Double, Double, String) => Callback): Self = StObject.set(x, "setObjectNull", js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetObjectWithInfo(value: (Double, Any, Double, Double) => Callback): Self = StObject.set(x, "setObjectWithInfo", js.Any.fromFunction4((t0: Double, t1: Any, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setSetRef(value: (Double, XRef) => Callback): Self = StObject.set(x, "setRef", js.Any.fromFunction2((t0: Double, t1: XRef) => (value(t0, t1)).runNow()))
    
    inline def setSetShort(value: (Double, Double) => Callback): Self = StObject.set(x, "setShort", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetString(value: (Double, String) => Callback): Self = StObject.set(x, "setString", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetTime(value: (Double, Time) => Callback): Self = StObject.set(x, "setTime", js.Any.fromFunction2((t0: Double, t1: Time) => (value(t0, t1)).runNow()))
    
    inline def setSetTimestamp(value: (Double, DateTime) => Callback): Self = StObject.set(x, "setTimestamp", js.Any.fromFunction2((t0: Double, t1: DateTime) => (value(t0, t1)).runNow()))
  }
}
