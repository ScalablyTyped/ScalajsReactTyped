package typingsJapgolly.oracledb.mod

import typingsJapgolly.oracledb.AnonType
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to control statement execution.
  */
trait ExecuteOptions extends js.Object {
  /**
    * If true, the transaction in the current connection is automatically committed at the end of statement execution.
    *
    * @default false
    */
  var autoCommit: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines whether additional metadata is available for queries and for REF CURSORs returned from PL/SQL blocks.
    *
    * With this value, the result.metaData result.resultSet.metaData objects only include column names.
    *
    * If extendedMetaData is true then metaData will contain additional attributes.
    *
    * @default false
    */
  var extendedMetaData: js.UndefOr[Boolean] = js.undefined
  /**
    * This property sets the size of an internal buffer used for fetching query rows from Oracle Database.
    * Changing it may affect query performance but does not affect how many rows are returned to the application.
    *
    * The property is used during the default direct fetches, during ResultSet getRow() calls, and for queryStream(). It is not used for getRows().
    *
    * Increasing this value reduces the number of round-trips to the database but increases memory usage for each data fetch.
    * For queries that return a large number of rows, higher values of fetchArraySize may give better performance.
    * For queries that only return a few rows, reduce the value of fetchArraySize to minimize the amount of memory management during data fetches.
    * JavaScript memory fragmentation may occur in some cases.
    *
    * For direct fetches (those using execute() option resultSet: false), the internal buffer size will be based on the lesser of maxRows and fetchArraySize.
    *
    * @default 100
    */
  var fetchArraySize: js.UndefOr[Double] = js.undefined
  /**
    * Defines how query column data should be represented in JavaScript. It can be used in conjunction with,
    * or instead of, the global settings fetchAsString and fetchAsBuffer.
    *
    * Example:
    *
    *      fetchInfo: {
    *          "HIRE_DATE":    { type: oracledb.STRING },  // return the date as a string
    *          "HIRE_DETAILS": { type: oracledb.DEFAULT }  // override fetchAsString or fetchAsBuffer
    *      }
    */
  var fetchInfo: js.UndefOr[Record[String, AnonType]] = js.undefined
  /**
    * The maximum number of rows that are fetched by a query with connection.execute() when not using a ResultSet.
    * Rows beyond this limit are not fetched from the database. A value of 0 means there is no limit.
    *
    * To improve database efficiency, SQL queries should use a row limiting clause like OFFSET / FETCH or equivalent.
    * The maxRows property can be used to stop badly coded queries from returning unexpectedly large numbers of rows.
    *
    * When the number of query rows is relatively big, or can not be predicted, it is recommended to use
    * a ResultSet or queryStream(). This allows applications to process rows in smaller chunks or individually,
    * preventing the Node.js memory limit being exceeded or query results being unexpectedly truncated by a
    * maxRows limit.
    *
    * @default 0 (unlimited)
    */
  var maxRows: js.UndefOr[Double] = js.undefined
  /**
    * The format of query rows fetched when using connection.execute() or connection.queryStream().
    * It affects both ResultSet and non-ResultSet queries. It can be used for top level queries and REF CURSOR output.
    *
    * This can be either of the Oracledb constants oracledb.ARRAY or oracledb.OBJECT.
    *
    * If specified as oracledb.ARRAY, each row is fetched as an array of column values.
    *
    * If specified as oracledb.OBJECT, each row is fetched as a JavaScript object.
    * The object has a property for each column name, with the property value set to the respective column value.
    * The property name follows Oracle’s standard name-casing rules. It will commonly be uppercase,
    * since most applications create tables using unquoted, case-insensitive names.
    *
    * @default ARRAY
    */
  var outFormat: js.UndefOr[Double] = js.undefined
  /**
    * Determines whether query results should be returned as a ResultSet object or directly.
    *
    * @default false
    */
  var resultSet: js.UndefOr[Boolean] = js.undefined
}

object ExecuteOptions {
  @scala.inline
  def apply(
    autoCommit: js.UndefOr[Boolean] = js.undefined,
    extendedMetaData: js.UndefOr[Boolean] = js.undefined,
    fetchArraySize: Int | Double = null,
    fetchInfo: Record[String, AnonType] = null,
    maxRows: Int | Double = null,
    outFormat: Int | Double = null,
    resultSet: js.UndefOr[Boolean] = js.undefined
  ): ExecuteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCommit)) __obj.updateDynamic("autoCommit")(autoCommit.asInstanceOf[js.Any])
    if (!js.isUndefined(extendedMetaData)) __obj.updateDynamic("extendedMetaData")(extendedMetaData.asInstanceOf[js.Any])
    if (fetchArraySize != null) __obj.updateDynamic("fetchArraySize")(fetchArraySize.asInstanceOf[js.Any])
    if (fetchInfo != null) __obj.updateDynamic("fetchInfo")(fetchInfo.asInstanceOf[js.Any])
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (outFormat != null) __obj.updateDynamic("outFormat")(outFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(resultSet)) __obj.updateDynamic("resultSet")(resultSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteOptions]
  }
}

