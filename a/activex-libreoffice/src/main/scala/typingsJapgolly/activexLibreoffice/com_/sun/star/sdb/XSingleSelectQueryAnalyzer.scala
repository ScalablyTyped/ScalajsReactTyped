package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * simplifies the analyzing of single select statements.
  *
  * The interface can be used for analyzing single SELECT statements without knowing the structure of the used query.
  */
trait XSingleSelectQueryAnalyzer
  extends StObject
     with XInterface {
  
  /**
    * returns the used filter.
    *
    * The filter criteria returned is part of the where condition of the select command, but it does not contain the where token.
    * @returns the filter
    */
  val Filter: String
  
  /**
    * returns the currently used GROUP BY.
    *
    * The group criteria returned is part of the GROUP BY clause of the select command, but it does not contain the GROUP BY keyword .
    * @returns the group
    */
  val Group: String
  
  /**
    * returns the currently used group.
    *
    * The columns returned form the GROUP BY clause.
    * @returns a collection of com::sun::star::sdb::GroupColumn which form the GROUP BY.
    */
  val GroupColumns: XIndexAccess
  
  /**
    * returns the used HAVING filter.
    *
    * The HAVING filter criteria returned is part of the HAVING condition of the select command, but it does not contain the HAVING token.
    * @returns the filter
    */
  val HavingClause: String
  
  /**
    * returns the currently used sort order.
    *
    * The order criteria returned is part of the ORDER BY clause of the select command, but it does not contain the ORDER BY keyword .
    * @returns the order
    */
  val Order: String
  
  /**
    * returns the currently used sort order.
    *
    * The order criteria returned is part of the ORDER BY clause of the select command, but it does not contain the ORDER BY keyword .
    * @returns a collection of {@link com.sun.star.sdb.OrderColumn} which form the ORDER BY.
    */
  val OrderColumns: XIndexAccess
  
  /**
    * returns the query.
    * @returns the query
    */
  var Query: String
  
  /**
    * returns the query previously set at the analyzer, with all application-level features being substituted by their database-level counterparts.
    *
    * The {@link XSingleSelectQueryAnalyzer} is an application-level component, which in some respect understands SQL features usually not present at the
    * database level. As a prominent example, you might pass a `SELECT` statement to the analyzer which is based on another query.
    *
    * While all other methods will handle those additional features transparently - e.g. the query in the `FROM` part of a `SELECT` statement will be
    * handled as if it really is a table -, `getQueryWithSubstitution` gives you the SQL statement where all those features have been stripped, and replaced
    * with appropriate standard SQL.
    *
    * For example, consider a database document which contains a client-side query named `All Orders` . This query is not known to the underlying database,
    * so an SQL statement like `SELECT * from "All Orders"` would be rejected by the database. However, instantiating a {@link SingleSelectQueryAnalyzer} at
    * the {@link Connection} object, and passing it the above query, you can then use `getQueryWithSubstitution` to retrieve a statement where `"All
    * Orders"` has been replaced with the `SELECT` statement which actually constitutes the `"All Orders"` query.
    * @see Connection
    * @see XQueriesSupplier
    * @see DatabaseDocument
    * @since OOo 2.0.4
    * @throws com::sun::star::sdbc::SQLException if the query represented cannot be completely substituted. A usual case for this is a recursion in the sub que
    */
  val QueryWithSubstitution: String
  
  /**
    * returns the currently used filter.
    *
    * The filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an AND criteria with
    * the name of the column and the filter condition. The filter condition is of type string. The operator used, is defined by {@link
    * com.sun.star.sdb.SQLFilterOperator} .
    * @returns the structured filter
    */
  val StructuredFilter: SafeArray[SafeArray[PropertyValue]]
  
  /**
    * returns the currently used HAVING filter.
    *
    * The HAVING filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an AND criteria
    * with the name of the column and the filter condition. The filter condition is of type string. The operator used, is defined by {@link
    * com.sun.star.sdb.SQLFilterOperator} .
    * @returns the structured HAVING filter
    */
  val StructuredHavingClause: SafeArray[SafeArray[PropertyValue]]
  
  /**
    * returns the used filter.
    *
    * The filter criteria returned is part of the where condition of the select command, but it does not contain the where token.
    * @returns the filter
    */
  def getFilter(): String
  
  /**
    * returns the currently used GROUP BY.
    *
    * The group criteria returned is part of the GROUP BY clause of the select command, but it does not contain the GROUP BY keyword .
    * @returns the group
    */
  def getGroup(): String
  
  /**
    * returns the currently used group.
    *
    * The columns returned form the GROUP BY clause.
    * @returns a collection of com::sun::star::sdb::GroupColumn which form the GROUP BY.
    */
  def getGroupColumns(): XIndexAccess
  
  /**
    * returns the used HAVING filter.
    *
    * The HAVING filter criteria returned is part of the HAVING condition of the select command, but it does not contain the HAVING token.
    * @returns the filter
    */
  def getHavingClause(): String
  
  /**
    * returns the currently used sort order.
    *
    * The order criteria returned is part of the ORDER BY clause of the select command, but it does not contain the ORDER BY keyword .
    * @returns the order
    */
  def getOrder(): String
  
  /**
    * returns the currently used sort order.
    *
    * The order criteria returned is part of the ORDER BY clause of the select command, but it does not contain the ORDER BY keyword .
    * @returns a collection of {@link com.sun.star.sdb.OrderColumn} which form the ORDER BY.
    */
  def getOrderColumns(): XIndexAccess
  
  /**
    * returns the query.
    * @returns the query
    */
  def getQuery(): String
  
  /**
    * returns the query previously set at the analyzer, with all application-level features being substituted by their database-level counterparts.
    *
    * The {@link XSingleSelectQueryAnalyzer} is an application-level component, which in some respect understands SQL features usually not present at the
    * database level. As a prominent example, you might pass a `SELECT` statement to the analyzer which is based on another query.
    *
    * While all other methods will handle those additional features transparently - e.g. the query in the `FROM` part of a `SELECT` statement will be
    * handled as if it really is a table -, `getQueryWithSubstitution` gives you the SQL statement where all those features have been stripped, and replaced
    * with appropriate standard SQL.
    *
    * For example, consider a database document which contains a client-side query named `All Orders` . This query is not known to the underlying database,
    * so an SQL statement like `SELECT * from "All Orders"` would be rejected by the database. However, instantiating a {@link SingleSelectQueryAnalyzer} at
    * the {@link Connection} object, and passing it the above query, you can then use `getQueryWithSubstitution` to retrieve a statement where `"All
    * Orders"` has been replaced with the `SELECT` statement which actually constitutes the `"All Orders"` query.
    * @see Connection
    * @see XQueriesSupplier
    * @see DatabaseDocument
    * @since OOo 2.0.4
    * @throws com::sun::star::sdbc::SQLException if the query represented cannot be completely substituted. A usual case for this is a recursion in the sub que
    */
  def getQueryWithSubstitution(): String
  
  /**
    * returns the currently used filter.
    *
    * The filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an AND criteria with
    * the name of the column and the filter condition. The filter condition is of type string. The operator used, is defined by {@link
    * com.sun.star.sdb.SQLFilterOperator} .
    * @returns the structured filter
    */
  def getStructuredFilter(): SafeArray[SafeArray[PropertyValue]]
  
  /**
    * returns the currently used HAVING filter.
    *
    * The HAVING filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an AND criteria
    * with the name of the column and the filter condition. The filter condition is of type string. The operator used, is defined by {@link
    * com.sun.star.sdb.SQLFilterOperator} .
    * @returns the structured HAVING filter
    */
  def getStructuredHavingClause(): SafeArray[SafeArray[PropertyValue]]
  
  /**
    * sets a new query for the composer, which may be expanded by filters, group by, having and sort criteria.
    * @param Command is the command which should be executed, the type of command depends on the {@link CommandType} .  In case of a `CommandType` of {@link c
    * @param CommandType is the type of the command.
    * @see com.sun.star.sdb.CommandType
    * @see com.sun.star.sdbc.RowSet.EscapeProcessing
    * @see com.sun.star.sdb.CommandType
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs or the statement isn't a single select statement or the statement isn't vali
    */
  def setCommand(Command: String, CommandType: Double): Unit
  
  /**
    * sets a new query for the composer, which may be expanded by filters, group by, having and sort criteria.
    * @param command the single select statement to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs or the statement isn't a single select statement or the statement isn't vali
    */
  def setQuery(command: String): Unit
}
object XSingleSelectQueryAnalyzer {
  
  inline def apply(
    Filter: String,
    Group: String,
    GroupColumns: XIndexAccess,
    HavingClause: String,
    Order: String,
    OrderColumns: XIndexAccess,
    Query: String,
    QueryWithSubstitution: String,
    StructuredFilter: SafeArray[SafeArray[PropertyValue]],
    StructuredHavingClause: SafeArray[SafeArray[PropertyValue]],
    acquire: Callback,
    getFilter: CallbackTo[String],
    getGroup: CallbackTo[String],
    getGroupColumns: CallbackTo[XIndexAccess],
    getHavingClause: CallbackTo[String],
    getOrder: CallbackTo[String],
    getOrderColumns: CallbackTo[XIndexAccess],
    getQuery: CallbackTo[String],
    getQueryWithSubstitution: CallbackTo[String],
    getStructuredFilter: CallbackTo[SafeArray[SafeArray[PropertyValue]]],
    getStructuredHavingClause: CallbackTo[SafeArray[SafeArray[PropertyValue]]],
    queryInterface: `type` => Any,
    release: Callback,
    setCommand: (String, Double) => Callback,
    setQuery: String => Callback
  ): XSingleSelectQueryAnalyzer = {
    val __obj = js.Dynamic.literal(Filter = Filter.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], GroupColumns = GroupColumns.asInstanceOf[js.Any], HavingClause = HavingClause.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], OrderColumns = OrderColumns.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], QueryWithSubstitution = QueryWithSubstitution.asInstanceOf[js.Any], StructuredFilter = StructuredFilter.asInstanceOf[js.Any], StructuredHavingClause = StructuredHavingClause.asInstanceOf[js.Any], acquire = acquire.toJsFn, getFilter = getFilter.toJsFn, getGroup = getGroup.toJsFn, getGroupColumns = getGroupColumns.toJsFn, getHavingClause = getHavingClause.toJsFn, getOrder = getOrder.toJsFn, getOrderColumns = getOrderColumns.toJsFn, getQuery = getQuery.toJsFn, getQueryWithSubstitution = getQueryWithSubstitution.toJsFn, getStructuredFilter = getStructuredFilter.toJsFn, getStructuredHavingClause = getStructuredHavingClause.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setCommand = js.Any.fromFunction2((t0: String, t1: Double) => (setCommand(t0, t1)).runNow()), setQuery = js.Any.fromFunction1((t0: String) => setQuery(t0).runNow()))
    __obj.asInstanceOf[XSingleSelectQueryAnalyzer]
  }
  
  extension [Self <: XSingleSelectQueryAnalyzer](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setGetFilter(value: CallbackTo[String]): Self = StObject.set(x, "getFilter", value.toJsFn)
    
    inline def setGetGroup(value: CallbackTo[String]): Self = StObject.set(x, "getGroup", value.toJsFn)
    
    inline def setGetGroupColumns(value: CallbackTo[XIndexAccess]): Self = StObject.set(x, "getGroupColumns", value.toJsFn)
    
    inline def setGetHavingClause(value: CallbackTo[String]): Self = StObject.set(x, "getHavingClause", value.toJsFn)
    
    inline def setGetOrder(value: CallbackTo[String]): Self = StObject.set(x, "getOrder", value.toJsFn)
    
    inline def setGetOrderColumns(value: CallbackTo[XIndexAccess]): Self = StObject.set(x, "getOrderColumns", value.toJsFn)
    
    inline def setGetQuery(value: CallbackTo[String]): Self = StObject.set(x, "getQuery", value.toJsFn)
    
    inline def setGetQueryWithSubstitution(value: CallbackTo[String]): Self = StObject.set(x, "getQueryWithSubstitution", value.toJsFn)
    
    inline def setGetStructuredFilter(value: CallbackTo[SafeArray[SafeArray[PropertyValue]]]): Self = StObject.set(x, "getStructuredFilter", value.toJsFn)
    
    inline def setGetStructuredHavingClause(value: CallbackTo[SafeArray[SafeArray[PropertyValue]]]): Self = StObject.set(x, "getStructuredHavingClause", value.toJsFn)
    
    inline def setGroup(value: String): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupColumns(value: XIndexAccess): Self = StObject.set(x, "GroupColumns", value.asInstanceOf[js.Any])
    
    inline def setHavingClause(value: String): Self = StObject.set(x, "HavingClause", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: String): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    inline def setOrderColumns(value: XIndexAccess): Self = StObject.set(x, "OrderColumns", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: String): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
    
    inline def setQueryWithSubstitution(value: String): Self = StObject.set(x, "QueryWithSubstitution", value.asInstanceOf[js.Any])
    
    inline def setSetCommand(value: (String, Double) => Callback): Self = StObject.set(x, "setCommand", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetQuery(value: String => Callback): Self = StObject.set(x, "setQuery", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setStructuredFilter(value: SafeArray[SafeArray[PropertyValue]]): Self = StObject.set(x, "StructuredFilter", value.asInstanceOf[js.Any])
    
    inline def setStructuredHavingClause(value: SafeArray[SafeArray[PropertyValue]]): Self = StObject.set(x, "StructuredHavingClause", value.asInstanceOf[js.Any])
  }
}
