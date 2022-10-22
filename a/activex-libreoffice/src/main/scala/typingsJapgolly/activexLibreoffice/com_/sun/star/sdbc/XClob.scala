package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the mapping for the SQL `CLOB` type.
  *
  * A SQL `CLOB` is a built-in type that stores a Character Large Object as a column value in a row of a database table. The driver implements a `Clob`
  * object using a SQL `locator(CLOB)` , which means that a `Clob` object contains a logical pointer to the SQL `CLOB` data rather than the data itself. A
  * `Clob` object is valid for the duration of the transaction in which it was created.
  *
  * The `Clob` interface provides methods for getting the length of a SQL `CLOB` (Character Large Object) value, for materializing a `CLOB` value on the
  * client, and for searching for a substring or `CLOB` object within a `CLOB` value.
  *
  * Methods in the interfaces {@link com.sun.star.sdbc.XResultSet} , and {@link com.sun.star.sdbc.XPreparedStatement} , such as `getClob` and `setClob`
  * allow a programmer to access the SQL `CLOB` .
  */
trait XClob
  extends StObject
     with XInterface {
  
  /**
    * gets the `Clob` contents as a stream.
    * @returns the stream
    * @throws SQLException if a database access error occurs.
    */
  val CharacterStream: XInputStream
  
  /**
    * gets the `Clob` contents as a stream.
    * @returns the stream
    * @throws SQLException if a database access error occurs.
    */
  def getCharacterStream(): XInputStream
  
  /**
    * returns a copy of the specified substring in the `Clob` value designated by this `Clob` object.
    *
    * The substring begins at position `pos` and has up to `length` consecutive characters.
    * @param pos the starting position
    * @param length the length of the substring
    * @returns the substring
    * @throws SQLException if a database access error occurs.
    */
  def getSubString(pos: Double, length: Double): String
  
  /**
    * returns the number of characters in the `CLOB` value designated by this `Clob` object.
    * @returns the length of the CLOB object
    * @throws SQLException if a database access error occurs.
    */
  def length(): Double
  
  /**
    * determines the character position at which the specified substring `searchstr` appears in the `Clob` . The search begins at position `start` .
    * @param searchstr the string to search
    * @param start the starting position
    * @returns the length of the CLOB object
    * @throws SQLException if a database access error occurs.
    */
  def position(searchstr: String, start: Double): Double
  
  /**
    * determines the position at which the specified `Clob` object `pattern` appears in this `Clob` object. The search begins at position `start` .
    * @param pattern the CLOB to search
    * @param start the starting position
    * @returns the position of the CLOB inside
    * @throws SQLException if a database access error occurs.
    */
  def positionOfClob(pattern: XClob, start: Double): Double
}
object XClob {
  
  inline def apply(
    CharacterStream: XInputStream,
    acquire: Callback,
    getCharacterStream: CallbackTo[XInputStream],
    getSubString: (Double, Double) => String,
    length: CallbackTo[Double],
    position: (String, Double) => Double,
    positionOfClob: (XClob, Double) => Double,
    queryInterface: `type` => Any,
    release: Callback
  ): XClob = {
    val __obj = js.Dynamic.literal(CharacterStream = CharacterStream.asInstanceOf[js.Any], acquire = acquire.toJsFn, getCharacterStream = getCharacterStream.toJsFn, getSubString = js.Any.fromFunction2(getSubString), length = length.toJsFn, position = js.Any.fromFunction2(position), positionOfClob = js.Any.fromFunction2(positionOfClob), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XClob]
  }
  
  extension [Self <: XClob](x: Self) {
    
    inline def setCharacterStream(value: XInputStream): Self = StObject.set(x, "CharacterStream", value.asInstanceOf[js.Any])
    
    inline def setGetCharacterStream(value: CallbackTo[XInputStream]): Self = StObject.set(x, "getCharacterStream", value.toJsFn)
    
    inline def setGetSubString(value: (Double, Double) => String): Self = StObject.set(x, "getSubString", js.Any.fromFunction2(value))
    
    inline def setLength(value: CallbackTo[Double]): Self = StObject.set(x, "length", value.toJsFn)
    
    inline def setPosition(value: (String, Double) => Double): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
    
    inline def setPositionOfClob(value: (XClob, Double) => Double): Self = StObject.set(x, "positionOfClob", js.Any.fromFunction2(value))
  }
}
