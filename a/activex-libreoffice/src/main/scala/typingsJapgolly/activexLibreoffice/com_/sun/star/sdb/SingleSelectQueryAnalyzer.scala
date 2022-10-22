package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx.XColumnsSupplier
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx.XTablesSupplier
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a service for analyzing a single select statement.
  *
  * It hides the complexity of parsing and evaluating a single select statement and provides sophisticated methods for accessing a statements filter,
  * group by, having and order criteria, as well as the corresponding select columns and tables. If supported, it even gives access to the parameters.
  * @see com.sun.star.sdb.SingleSelectQueryComposer
  */
trait SingleSelectQueryAnalyzer
  extends StObject
     with XSingleSelectQueryAnalyzer
     with XTablesSupplier
     with XColumnsSupplier
     with XParametersSupplier
object SingleSelectQueryAnalyzer {
  
  inline def apply(
    Columns: XNameAccess,
    Filter: String,
    Group: String,
    GroupColumns: XIndexAccess,
    HavingClause: String,
    Order: String,
    OrderColumns: XIndexAccess,
    Parameters: XIndexAccess,
    Query: String,
    QueryWithSubstitution: String,
    StructuredFilter: SafeArray[SafeArray[PropertyValue]],
    StructuredHavingClause: SafeArray[SafeArray[PropertyValue]],
    Tables: XNameAccess,
    acquire: Callback,
    getColumns: CallbackTo[XNameAccess],
    getFilter: CallbackTo[String],
    getGroup: CallbackTo[String],
    getGroupColumns: CallbackTo[XIndexAccess],
    getHavingClause: CallbackTo[String],
    getOrder: CallbackTo[String],
    getOrderColumns: CallbackTo[XIndexAccess],
    getParameters: CallbackTo[XIndexAccess],
    getQuery: CallbackTo[String],
    getQueryWithSubstitution: CallbackTo[String],
    getStructuredFilter: CallbackTo[SafeArray[SafeArray[PropertyValue]]],
    getStructuredHavingClause: CallbackTo[SafeArray[SafeArray[PropertyValue]]],
    getTables: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback,
    setCommand: (String, Double) => Callback,
    setQuery: String => Callback
  ): SingleSelectQueryAnalyzer = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], GroupColumns = GroupColumns.asInstanceOf[js.Any], HavingClause = HavingClause.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], OrderColumns = OrderColumns.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], QueryWithSubstitution = QueryWithSubstitution.asInstanceOf[js.Any], StructuredFilter = StructuredFilter.asInstanceOf[js.Any], StructuredHavingClause = StructuredHavingClause.asInstanceOf[js.Any], Tables = Tables.asInstanceOf[js.Any], acquire = acquire.toJsFn, getColumns = getColumns.toJsFn, getFilter = getFilter.toJsFn, getGroup = getGroup.toJsFn, getGroupColumns = getGroupColumns.toJsFn, getHavingClause = getHavingClause.toJsFn, getOrder = getOrder.toJsFn, getOrderColumns = getOrderColumns.toJsFn, getParameters = getParameters.toJsFn, getQuery = getQuery.toJsFn, getQueryWithSubstitution = getQueryWithSubstitution.toJsFn, getStructuredFilter = getStructuredFilter.toJsFn, getStructuredHavingClause = getStructuredHavingClause.toJsFn, getTables = getTables.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setCommand = js.Any.fromFunction2((t0: String, t1: Double) => (setCommand(t0, t1)).runNow()), setQuery = js.Any.fromFunction1((t0: String) => setQuery(t0).runNow()))
    __obj.asInstanceOf[SingleSelectQueryAnalyzer]
  }
}
