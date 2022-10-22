package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a result set which gives access to automatically generated values after a new row was inserted.
  *
  * The relative order of columns in the result set returned by {@link getGeneratedValues()} must be the same as the relative order of the same columns as
  * returned when executing a "SELECT * FROM table". This ensures that clients of this interface can reliably fetch the column values.
  * @see com.sun.star.sdbc.Statement
  * @see com.sun.star.sdbc.PreparedStatement
  * @since OOo 1.1.2
  */
trait XGeneratedResultSet
  extends StObject
     with XInterface {
  
  /**
    * gives access to automatically generated values after a new row was inserted.
    * @returns a result set that contains the data produced by the query
    * @throws SQLException if a database access error occurs.
    */
  val GeneratedValues: XResultSet
  
  /**
    * gives access to automatically generated values after a new row was inserted.
    * @returns a result set that contains the data produced by the query
    * @throws SQLException if a database access error occurs.
    */
  def getGeneratedValues(): XResultSet
}
object XGeneratedResultSet {
  
  inline def apply(
    GeneratedValues: XResultSet,
    acquire: Callback,
    getGeneratedValues: CallbackTo[XResultSet],
    queryInterface: `type` => Any,
    release: Callback
  ): XGeneratedResultSet = {
    val __obj = js.Dynamic.literal(GeneratedValues = GeneratedValues.asInstanceOf[js.Any], acquire = acquire.toJsFn, getGeneratedValues = getGeneratedValues.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XGeneratedResultSet]
  }
  
  extension [Self <: XGeneratedResultSet](x: Self) {
    
    inline def setGeneratedValues(value: XResultSet): Self = StObject.set(x, "GeneratedValues", value.asInstanceOf[js.Any])
    
    inline def setGetGeneratedValues(value: CallbackTo[XResultSet]): Self = StObject.set(x, "getGeneratedValues", value.toJsFn)
  }
}
