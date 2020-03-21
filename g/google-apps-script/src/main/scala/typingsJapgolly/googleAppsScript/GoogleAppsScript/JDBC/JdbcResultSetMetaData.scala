package typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC ResultSetMetaData. For documentation of this class, see
  * java.sql.ResultSetMetaData.
  */
trait JdbcResultSetMetaData extends js.Object {
  def getCatalogName(column: Integer): String
  def getColumnClassName(column: Integer): String
  def getColumnCount(): Integer
  def getColumnDisplaySize(column: Integer): Integer
  def getColumnLabel(column: Integer): String
  def getColumnName(column: Integer): String
  def getColumnType(column: Integer): Integer
  def getColumnTypeName(column: Integer): String
  def getPrecision(column: Integer): Integer
  def getScale(column: Integer): Integer
  def getSchemaName(column: Integer): String
  def getTableName(column: Integer): String
  def isAutoIncrement(column: Integer): Boolean
  def isCaseSensitive(column: Integer): Boolean
  def isCurrency(column: Integer): Boolean
  def isDefinitelyWritable(column: Integer): Boolean
  def isNullable(column: Integer): Integer
  def isReadOnly(column: Integer): Boolean
  def isSearchable(column: Integer): Boolean
  def isSigned(column: Integer): Boolean
  def isWritable(column: Integer): Boolean
}

object JdbcResultSetMetaData {
  @scala.inline
  def apply(
    getCatalogName: Integer => CallbackTo[String],
    getColumnClassName: Integer => CallbackTo[String],
    getColumnCount: CallbackTo[Integer],
    getColumnDisplaySize: Integer => CallbackTo[Integer],
    getColumnLabel: Integer => CallbackTo[String],
    getColumnName: Integer => CallbackTo[String],
    getColumnType: Integer => CallbackTo[Integer],
    getColumnTypeName: Integer => CallbackTo[String],
    getPrecision: Integer => CallbackTo[Integer],
    getScale: Integer => CallbackTo[Integer],
    getSchemaName: Integer => CallbackTo[String],
    getTableName: Integer => CallbackTo[String],
    isAutoIncrement: Integer => CallbackTo[Boolean],
    isCaseSensitive: Integer => CallbackTo[Boolean],
    isCurrency: Integer => CallbackTo[Boolean],
    isDefinitelyWritable: Integer => CallbackTo[Boolean],
    isNullable: Integer => CallbackTo[Integer],
    isReadOnly: Integer => CallbackTo[Boolean],
    isSearchable: Integer => CallbackTo[Boolean],
    isSigned: Integer => CallbackTo[Boolean],
    isWritable: Integer => CallbackTo[Boolean]
  ): JdbcResultSetMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCatalogName")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => getCatalogName(t0).runNow()))
    __obj.updateDynamic("getColumnClassName")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => getColumnClassName(t0).runNow()))
    __obj.updateDynamic("getColumnCount")(getColumnCount.toJsFn)
    __obj.updateDynamic("getColumnDisplaySize")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => getColumnDisplaySize(t0).runNow()))
    __obj.updateDynamic("getColumnLabel")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => getColumnLabel(t0).runNow()))
    __obj.updateDynamic("getColumnName")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => getColumnName(t0).runNow()))
    __obj.updateDynamic("getColumnType")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => getColumnType(t0).runNow()))
    __obj.updateDynamic("getColumnTypeName")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => getColumnTypeName(t0).runNow()))
    __obj.updateDynamic("getPrecision")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => getPrecision(t0).runNow()))
    __obj.updateDynamic("getScale")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => getScale(t0).runNow()))
    __obj.updateDynamic("getSchemaName")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => getSchemaName(t0).runNow()))
    __obj.updateDynamic("getTableName")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => getTableName(t0).runNow()))
    __obj.updateDynamic("isAutoIncrement")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => isAutoIncrement(t0).runNow()))
    __obj.updateDynamic("isCaseSensitive")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => isCaseSensitive(t0).runNow()))
    __obj.updateDynamic("isCurrency")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => isCurrency(t0).runNow()))
    __obj.updateDynamic("isDefinitelyWritable")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => isDefinitelyWritable(t0).runNow()))
    __obj.updateDynamic("isNullable")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => isNullable(t0).runNow()))
    __obj.updateDynamic("isReadOnly")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => isReadOnly(t0).runNow()))
    __obj.updateDynamic("isSearchable")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => isSearchable(t0).runNow()))
    __obj.updateDynamic("isSigned")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => isSigned(t0).runNow()))
    __obj.updateDynamic("isWritable")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => isWritable(t0).runNow()))
    __obj.asInstanceOf[JdbcResultSetMetaData]
  }
}

