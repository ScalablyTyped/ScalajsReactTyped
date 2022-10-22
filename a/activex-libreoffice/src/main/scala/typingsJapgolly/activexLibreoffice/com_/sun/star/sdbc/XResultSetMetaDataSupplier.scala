package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the meta data of a result set.
  *
  * The number, types, and properties of a {@link ResultSet} 's columns are provided by the {@link com.sun.star.sdbc.XResultSetMetaData} interface
  * returned by the {@link com.sun.star.sdbc.XResultSetMetaDataSupplier.getMetaData()} method.
  */
trait XResultSetMetaDataSupplier
  extends StObject
     with XInterface {
  
  /**
    * retrieves the number, types, and properties of a {@link ResultSet} 's columns.
    * @returns the meta data of the {@link ResultSet} .
    * @throws SQLException if a database access error occurs.
    */
  val MetaData: XResultSetMetaData
  
  /**
    * retrieves the number, types, and properties of a {@link ResultSet} 's columns.
    * @returns the meta data of the {@link ResultSet} .
    * @throws SQLException if a database access error occurs.
    */
  def getMetaData(): XResultSetMetaData
}
object XResultSetMetaDataSupplier {
  
  inline def apply(
    MetaData: XResultSetMetaData,
    acquire: Callback,
    getMetaData: CallbackTo[XResultSetMetaData],
    queryInterface: `type` => Any,
    release: Callback
  ): XResultSetMetaDataSupplier = {
    val __obj = js.Dynamic.literal(MetaData = MetaData.asInstanceOf[js.Any], acquire = acquire.toJsFn, getMetaData = getMetaData.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XResultSetMetaDataSupplier]
  }
  
  extension [Self <: XResultSetMetaDataSupplier](x: Self) {
    
    inline def setGetMetaData(value: CallbackTo[XResultSetMetaData]): Self = StObject.set(x, "getMetaData", value.toJsFn)
    
    inline def setMetaData(value: XResultSetMetaData): Self = StObject.set(x, "MetaData", value.asInstanceOf[js.Any])
  }
}
