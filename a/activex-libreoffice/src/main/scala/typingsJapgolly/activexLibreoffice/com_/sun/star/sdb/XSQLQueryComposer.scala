package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * should be provided by a tool which simplifies the handling with SQL select statements.
  *
  * The interface can be used for composing SELECT statements without knowing the structure of the used query.
  */
trait XSQLQueryComposer
  extends StObject
     with XInterface {
  
  /**
    * returns the query composed with filters and sort criteria.
    * @returns the composed query
    */
  val ComposedQuery: String
  
  /**
    * returns the currently used filter.
    *
    * The filter criteria returned is part of the where condition of the select command, but it does not contain the where token.
    * @returns the filter
    */
  var Filter: String
  
  /**
    * returns the currently used sort order.
    *
    * The order criteria returned is part of the ORDER BY clause of the select command, but it does not contain the ORDER BY keyword .
    * @returns the order
    */
  var Order: String
  
  /**
    * returns the query used for composing.
    * @returns the query
    */
  var Query: String
  
  /**
    * returns the currently used filter.
    *
    * The filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an AND criteria with
    * the name of the column and the filter condition. The filter condition is of type string.
    * @returns the structured filter
    */
  val StructuredFilter: SafeArray[SafeArray[PropertyValue]]
  
  /**
    * appends a new filter condition by a {@link com.sun.star.sdb.DataColumn} providing the name and the value for the filter.
    * @param column the column which is used to create a filter
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendFilterByColumn(column: XPropertySet): Unit
  
  /**
    * appends an additional part to the sort order criteria of the select statement.
    * @param column the column which is used to create a order part
    * @param ascending `TRUE` when the order should be ascending, otherwise `FALSE`
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendOrderByColumn(column: XPropertySet, ascending: Boolean): Unit
  
  /**
    * returns the query composed with filters and sort criteria.
    * @returns the composed query
    */
  def getComposedQuery(): String
  
  /**
    * returns the currently used filter.
    *
    * The filter criteria returned is part of the where condition of the select command, but it does not contain the where token.
    * @returns the filter
    */
  def getFilter(): String
  
  /**
    * returns the currently used sort order.
    *
    * The order criteria returned is part of the ORDER BY clause of the select command, but it does not contain the ORDER BY keyword .
    * @returns the order
    */
  def getOrder(): String
  
  /**
    * returns the query used for composing.
    * @returns the query
    */
  def getQuery(): String
  
  /**
    * returns the currently used filter.
    *
    * The filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an AND criteria with
    * the name of the column and the filter condition. The filter condition is of type string.
    * @returns the structured filter
    */
  def getStructuredFilter(): SafeArray[SafeArray[PropertyValue]]
  
  /**
    * makes it possible to set a filter condition for the query.
    * @param filter the filter to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def setFilter(filter: String): Unit
  
  /**
    * makes it possible to set a sort condition for the query.
    * @param order the order part to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def setOrder(order: String): Unit
  
  /**
    * sets a new query for the composer, which may be expanded by filters and sort criteria.
    * @param command the command to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def setQuery(command: String): Unit
}
object XSQLQueryComposer {
  
  inline def apply(
    ComposedQuery: String,
    Filter: String,
    Order: String,
    Query: String,
    StructuredFilter: SafeArray[SafeArray[PropertyValue]],
    acquire: Callback,
    appendFilterByColumn: XPropertySet => Callback,
    appendOrderByColumn: (XPropertySet, Boolean) => Callback,
    getComposedQuery: CallbackTo[String],
    getFilter: CallbackTo[String],
    getOrder: CallbackTo[String],
    getQuery: CallbackTo[String],
    getStructuredFilter: CallbackTo[SafeArray[SafeArray[PropertyValue]]],
    queryInterface: `type` => Any,
    release: Callback,
    setFilter: String => Callback,
    setOrder: String => Callback,
    setQuery: String => Callback
  ): XSQLQueryComposer = {
    val __obj = js.Dynamic.literal(ComposedQuery = ComposedQuery.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], StructuredFilter = StructuredFilter.asInstanceOf[js.Any], acquire = acquire.toJsFn, appendFilterByColumn = js.Any.fromFunction1((t0: XPropertySet) => appendFilterByColumn(t0).runNow()), appendOrderByColumn = js.Any.fromFunction2((t0: XPropertySet, t1: Boolean) => (appendOrderByColumn(t0, t1)).runNow()), getComposedQuery = getComposedQuery.toJsFn, getFilter = getFilter.toJsFn, getOrder = getOrder.toJsFn, getQuery = getQuery.toJsFn, getStructuredFilter = getStructuredFilter.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setFilter = js.Any.fromFunction1((t0: String) => setFilter(t0).runNow()), setOrder = js.Any.fromFunction1((t0: String) => setOrder(t0).runNow()), setQuery = js.Any.fromFunction1((t0: String) => setQuery(t0).runNow()))
    __obj.asInstanceOf[XSQLQueryComposer]
  }
  
  extension [Self <: XSQLQueryComposer](x: Self) {
    
    inline def setAppendFilterByColumn(value: XPropertySet => Callback): Self = StObject.set(x, "appendFilterByColumn", js.Any.fromFunction1((t0: XPropertySet) => value(t0).runNow()))
    
    inline def setAppendOrderByColumn(value: (XPropertySet, Boolean) => Callback): Self = StObject.set(x, "appendOrderByColumn", js.Any.fromFunction2((t0: XPropertySet, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setComposedQuery(value: String): Self = StObject.set(x, "ComposedQuery", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setGetComposedQuery(value: CallbackTo[String]): Self = StObject.set(x, "getComposedQuery", value.toJsFn)
    
    inline def setGetFilter(value: CallbackTo[String]): Self = StObject.set(x, "getFilter", value.toJsFn)
    
    inline def setGetOrder(value: CallbackTo[String]): Self = StObject.set(x, "getOrder", value.toJsFn)
    
    inline def setGetQuery(value: CallbackTo[String]): Self = StObject.set(x, "getQuery", value.toJsFn)
    
    inline def setGetStructuredFilter(value: CallbackTo[SafeArray[SafeArray[PropertyValue]]]): Self = StObject.set(x, "getStructuredFilter", value.toJsFn)
    
    inline def setOrder(value: String): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: String): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
    
    inline def setSetFilter(value: String => Callback): Self = StObject.set(x, "setFilter", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetOrder(value: String => Callback): Self = StObject.set(x, "setOrder", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetQuery(value: String => Callback): Self = StObject.set(x, "setQuery", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setStructuredFilter(value: SafeArray[SafeArray[PropertyValue]]): Self = StObject.set(x, "StructuredFilter", value.asInstanceOf[js.Any])
  }
}
