package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx.XColumnsSupplier
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx.XTablesSupplier
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a tool for composing SQL select statements.
  *
  * It hides the complexity of parsing and evaluating SQL Statements and provides sophisticated methods for expanding a SQL-Statement with filter and
  * order criteria.
  */
trait SQLQueryComposer
  extends StObject
     with XSQLQueryComposer
     with XTablesSupplier
     with XColumnsSupplier
object SQLQueryComposer {
  
  inline def apply(
    Columns: XNameAccess,
    ComposedQuery: String,
    Filter: String,
    Order: String,
    Query: String,
    StructuredFilter: SafeArray[SafeArray[PropertyValue]],
    Tables: XNameAccess,
    acquire: Callback,
    appendFilterByColumn: XPropertySet => Callback,
    appendOrderByColumn: (XPropertySet, Boolean) => Callback,
    getColumns: CallbackTo[XNameAccess],
    getComposedQuery: CallbackTo[String],
    getFilter: CallbackTo[String],
    getOrder: CallbackTo[String],
    getQuery: CallbackTo[String],
    getStructuredFilter: CallbackTo[SafeArray[SafeArray[PropertyValue]]],
    getTables: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback,
    setFilter: String => Callback,
    setOrder: String => Callback,
    setQuery: String => Callback
  ): SQLQueryComposer = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], ComposedQuery = ComposedQuery.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], StructuredFilter = StructuredFilter.asInstanceOf[js.Any], Tables = Tables.asInstanceOf[js.Any], acquire = acquire.toJsFn, appendFilterByColumn = js.Any.fromFunction1((t0: XPropertySet) => appendFilterByColumn(t0).runNow()), appendOrderByColumn = js.Any.fromFunction2((t0: XPropertySet, t1: Boolean) => (appendOrderByColumn(t0, t1)).runNow()), getColumns = getColumns.toJsFn, getComposedQuery = getComposedQuery.toJsFn, getFilter = getFilter.toJsFn, getOrder = getOrder.toJsFn, getQuery = getQuery.toJsFn, getStructuredFilter = getStructuredFilter.toJsFn, getTables = getTables.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setFilter = js.Any.fromFunction1((t0: String) => setFilter(t0).runNow()), setOrder = js.Any.fromFunction1((t0: String) => setOrder(t0).runNow()), setQuery = js.Any.fromFunction1((t0: String) => setQuery(t0).runNow()))
    __obj.asInstanceOf[SQLQueryComposer]
  }
}
