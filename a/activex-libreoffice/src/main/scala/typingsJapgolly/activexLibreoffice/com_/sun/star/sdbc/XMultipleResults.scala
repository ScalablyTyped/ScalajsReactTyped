package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used for inspecting multiple results produced by the execution of a SQL statement.
  *
  * Under some (uncommon) situations a single SQL statement may return multiple result sets and/or update counts. Normally you can ignore this unless you
  * are (1) executing a stored procedure that you know may return multiple results or (2) you are dynamically executing an unknown SQL string. The methods
  * {@link com.sun.star.sdbc.XMultipleResults.getMoreResults()} , {@link com.sun.star.sdbc.XMultipleResults.getResultSet()} and {@link
  * com.sun.star.sdbc.XMultipleResults.getUpdateCount()} let you navigate through multiple results.
  * @see com.sun.star.sdbc.XStatement
  * @see com.sun.star.sdbc.XPreparedStatement
  */
trait XMultipleResults
  extends StObject
     with XInterface {
  
  /**
    * moves to a {@link Statement} 's next result. It returns `TRUE` if this result is a {@link ResultSet} . This method also implicitly closes any current
    * {@link ResultSet} obtained with getResultSet.
    *
    * There are no more results when `(!getMoreResults() &amp;&amp; getUpdateCount() == -1)` .
    * @returns `TRUE` if there exists more {@link ResultSet} objects
    * @throws SQLException if a database access error occurs.
    */
  val MoreResults: Boolean
  
  /**
    * returns the current result as a {@link com.sun.star.sdbc.ResultSet} object. This method should be called only once per result.
    * @returns the {@link ResultSet} object
    * @throws SQLException if a database access error occurs.
    */
  val ResultSet: XResultSet
  
  /**
    * returns the current result as an update count.
    *
    * If the result is a {@link ResultSet} or there are no more results, -1 is returned. This method should be called only once per result.
    * @returns the current result as an update count.
    * @throws SQLException if a database access error occurs.
    */
  val UpdateCount: Double
  
  /**
    * moves to a {@link Statement} 's next result. It returns `TRUE` if this result is a {@link ResultSet} . This method also implicitly closes any current
    * {@link ResultSet} obtained with getResultSet.
    *
    * There are no more results when `(!getMoreResults() &amp;&amp; getUpdateCount() == -1)` .
    * @returns `TRUE` if there exists more {@link ResultSet} objects
    * @throws SQLException if a database access error occurs.
    */
  def getMoreResults(): Boolean
  
  /**
    * returns the current result as a {@link com.sun.star.sdbc.ResultSet} object. This method should be called only once per result.
    * @returns the {@link ResultSet} object
    * @throws SQLException if a database access error occurs.
    */
  def getResultSet(): XResultSet
  
  /**
    * returns the current result as an update count.
    *
    * If the result is a {@link ResultSet} or there are no more results, -1 is returned. This method should be called only once per result.
    * @returns the current result as an update count.
    * @throws SQLException if a database access error occurs.
    */
  def getUpdateCount(): Double
}
object XMultipleResults {
  
  inline def apply(
    MoreResults: Boolean,
    ResultSet: XResultSet,
    UpdateCount: Double,
    acquire: Callback,
    getMoreResults: CallbackTo[Boolean],
    getResultSet: CallbackTo[XResultSet],
    getUpdateCount: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback
  ): XMultipleResults = {
    val __obj = js.Dynamic.literal(MoreResults = MoreResults.asInstanceOf[js.Any], ResultSet = ResultSet.asInstanceOf[js.Any], UpdateCount = UpdateCount.asInstanceOf[js.Any], acquire = acquire.toJsFn, getMoreResults = getMoreResults.toJsFn, getResultSet = getResultSet.toJsFn, getUpdateCount = getUpdateCount.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XMultipleResults]
  }
  
  extension [Self <: XMultipleResults](x: Self) {
    
    inline def setGetMoreResults(value: CallbackTo[Boolean]): Self = StObject.set(x, "getMoreResults", value.toJsFn)
    
    inline def setGetResultSet(value: CallbackTo[XResultSet]): Self = StObject.set(x, "getResultSet", value.toJsFn)
    
    inline def setGetUpdateCount(value: CallbackTo[Double]): Self = StObject.set(x, "getUpdateCount", value.toJsFn)
    
    inline def setMoreResults(value: Boolean): Self = StObject.set(x, "MoreResults", value.asInstanceOf[js.Any])
    
    inline def setResultSet(value: XResultSet): Self = StObject.set(x, "ResultSet", value.asInstanceOf[js.Any])
    
    inline def setUpdateCount(value: Double): Self = StObject.set(x, "UpdateCount", value.asInstanceOf[js.Any])
  }
}
