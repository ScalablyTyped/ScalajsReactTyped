package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSettings
  extends /**
	 * Option for DataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * If set to true, the following behavior will take place:
  	 * if a new row is added, and then deleted, there will be no transaction added to the log
  	 * if an edit is made to a row or cell, then the value is brought back to its original value, the transaction should be removed
  	 * Note: This option takes effect only when autoCommit is set to false.
  	 *
  	 */
  var aggregateTransactions: js.UndefOr[Boolean] = js.undefined
  /**
  	 * If auto commit is true, data will be automatically commited to the data source, once a value or a batch of values are updated via saveChanges()
  	 *
  	 */
  var autoCommit: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Callback function to call when data binding is complete
  	 *
  	 */
  var callback: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Object on which to invoke the callback function
  	 *
  	 */
  var callee: js.UndefOr[js.Any] = js.undefined
  /**
  	 * This is the normalized (transformed) resulting data, after it's fetched from the data source
  	 *
  	 */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Client-side dataBinding event. Can be a string pointing to a function name, or an object pointing to a function
  	 *
  	 */
  var dataBinding: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Client-side dataBound event. Can be a string pointing to a function name, or an object pointing to a function
  	 *
  	 */
  var dataBound: js.UndefOr[js.Any] = js.undefined
  /**
  	 * This is the source of data - non normalized. Can be an array, can be reference to some JSON object, can be a DOM element for a HTML TABLE, or a function
  	 *
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * *** IMPORTANT DEPRECATED ***
  	 * A list of field definitions specifying the schema of the data source.
  	 * Field objects description: {name, [type], [xpath]}
  	 *
  	 */
  var fields: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Settings related to built-in filtering functionality
  	 *
  	 */
  var filtering: js.UndefOr[DataSourceSettingsFiltering] = js.undefined
  /**
  	 * Settings related to built-in group by functionality
  	 *
  	 */
  var groupby: js.UndefOr[DataSourceSettingsGroupby] = js.undefined
  /**
  	 * Setting this is only necessary when the data source is set to a table in string format. we need to create an invisible dummy data container in the body and append the table data to it
  	 *
  	 */
  var id: js.UndefOr[String] = js.undefined
  /**
  	 * If set to false will disable transformations on schema, even if it is defined locally in the javascript code
  	 *
  	 */
  var localSchemaTransform: js.UndefOr[Boolean] = js.undefined
  /**
  	 * This is the property in the dataView where actual resulting records will be put. (So the dataView will not be array but an object if this is defined), after the potential data source transformation
  	 *
  	 */
  var outputResultsName: js.UndefOr[String] = js.undefined
  /**
  	 * Settings related to built-in paging functionality
  	 *
  	 */
  var paging: js.UndefOr[DataSourceSettingsPaging] = js.undefined
  /**
  	 * The unique field identifier
  	 *
  	 */
  var primaryKey: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the HTTP verb to be used to issue the request
  	 *
  	 */
  var requestType: js.UndefOr[String] = js.undefined
  /**
  	 * Content type of the response. See http://api.jquery.com/jQuery.ajax/ => contentType
  	 *
  	 */
  var responseContentType: js.UndefOr[String] = js.undefined
  /**
  	 * Property in the response which specifies where the data records array will be held (if the response is wrapped)
  	 *
  	 */
  var responseDataKey: js.UndefOr[String] = js.undefined
  /**
  	 * Response type when a URL is set as the data source. See http://api.jquery.com/jQuery.ajax/ => dataType
  	 *
  	 *
  	 * Valid values:
  	 * "json"
  	 * "xml"
  	 * "html"
  	 * "script"
  	 * "jsonp"
  	 * "text"
  	 */
  var responseDataType: js.UndefOr[String] = js.undefined
  /**
  	 * Property in the response which specifies the total number of records in the backend (this is needed for paging)
  	 *
  	 */
  var responseTotalRecCountKey: js.UndefOr[String] = js.undefined
  /**
  	 * A function to call when row is added.
  	 * Function takes first argument item and second argument dataSource.
  	 * Use item.row to obtain reference to the added row.
  	 * Use item.rowId to get the row ID.
  	 * Use dataSource to obtain reference to $.ig.DataSource.
  	 *
  	 */
  var rowAdded: js.UndefOr[js.Function] = js.undefined
  /**
  	 * A function to call when row is deleted.
  	 * Use item.row to obtain reference to the deleted row.
  	 * Use item.rowId to get the row ID.
  	 * Use item.rowIndex to get the row index.
  	 * Use dataSource to obtain reference to $.ig.DataSource.
  	 *
  	 */
  var rowDeleted: js.UndefOr[js.Function] = js.undefined
  /**
  	 * A function to call when row is inserted.
  	 * Function takes first argument item and second argument dataSource.
  	 * Use item.row to obtain reference to the inserted row.
  	 * Use item.rowId to get the row ID.
  	 * Use item.rowIndex to get the row index.
  	 * Use dataSource to obtain reference to $.ig.DataSource.
  	 *
  	 */
  var rowInserted: js.UndefOr[js.Function] = js.undefined
  /**
  	 * A function to call when row is updated (edited).
  	 * Function takes first argument item and second argument dataSource.
  	 * Use item.rowIndex to get the row index.
  	 * Use item.newRow to obtain reference to the updated row.
  	 * Use item.oldRow to obtain reference to the row that was updated.
  	 * Use dataSource to obtain reference to $.ig.DataSource.
  	 *
  	 */
  var rowUpdated: js.UndefOr[js.Function] = js.undefined
  /**
  	 * A schema object that defines which fields from the data to bind to
  	 *
  	 */
  var schema: js.UndefOr[js.Any] = js.undefined
  /**
  	 * If true, will serialize the transaction log of updated values - if any - whenever commit is performed via a remote request.
  	 *
  	 */
  var serializeTransactionLog: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Settings related to built-in sorting functionality
  	 *
  	 */
  var sorting: js.UndefOr[DataSourceSettingsSorting] = js.undefined
  /**
  	 * Settings related to built-in summaries functionality
  	 *
  	 */
  var summaries: js.UndefOr[DataSourceSettingsSummaries] = js.undefined
  /**
  	 * Type of the data source
  	 *
  	 *
  	 * Valid values:
  	 * "json" Specifies that the data source is an already evaluated JSON (JavaScript object/array) or a string that can be evaluated to JSON
  	 * "xml" Specifies that the data source is a XML Document object or a string that can be evaluated to XML
  	 * "unknown" Specifies that the data source is of unknown type. In that case it will be analyzed and automatically detected if possible
  	 * "array" Specifies that the data source is a simple array of objects.
  	 * "function" Specifies that the data source points to a function. During data binding the function will be called and the result will be assumed to be an array of objects
  	 * "htmlTableString" Specifies that the data source points to a string that represents a HTML table
  	 * "htmlTableId" Specifies that the data source points to an ID of a HTML Table element that's loaded on the page
  	 * "htmlTableDom" The data source points to a DOM object that is of TABLE type
  	 * "invalid" Set whenever data source is analyzed (in case its type is unknown) and the type cannot be detected
  	 * "remoteUrl" Specifies that the data source points to a remote URL, from which data will be retrieved using an AJAX call ($.ajax)
  	 * "htmlListDom" The data source points to a DOM object that is of UL/OL type
  	 * "htmlSelectDom" The data source points to a DOM object that is of SELECT type
  	 * "empty"
  	 */
  var `type`: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies an update remote URL, to which an AJAX request will be made as soon as saveChages() is called.
  	 *
  	 */
  var updateUrl: js.UndefOr[String] = js.undefined
  /**
  	 * Event that is fired after URL parameters are encoded (When a remote request is done). Can point to a function name or the function object itself
  	 *
  	 */
  var urlParamsEncoded: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Event that is fired before URL parameters are encoded. Can point to a function name or the function object itself
  	 *
  	 */
  var urlParamsEncoding: js.UndefOr[js.Any] = js.undefined
}

object DataSourceSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for DataSourceSettings
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    aggregateTransactions: js.UndefOr[Boolean] = js.undefined,
    autoCommit: js.UndefOr[Boolean] = js.undefined,
    callback: js.Function = null,
    callee: js.Any = null,
    data: js.Array[_] = null,
    dataBinding: js.Any = null,
    dataBound: js.Any = null,
    dataSource: js.Any = null,
    fields: js.Array[_] = null,
    filtering: DataSourceSettingsFiltering = null,
    groupby: DataSourceSettingsGroupby = null,
    id: String = null,
    localSchemaTransform: js.UndefOr[Boolean] = js.undefined,
    outputResultsName: String = null,
    paging: DataSourceSettingsPaging = null,
    primaryKey: String = null,
    requestType: String = null,
    responseContentType: String = null,
    responseDataKey: String = null,
    responseDataType: String = null,
    responseTotalRecCountKey: String = null,
    rowAdded: js.Function = null,
    rowDeleted: js.Function = null,
    rowInserted: js.Function = null,
    rowUpdated: js.Function = null,
    schema: js.Any = null,
    serializeTransactionLog: js.UndefOr[Boolean] = js.undefined,
    sorting: DataSourceSettingsSorting = null,
    summaries: DataSourceSettingsSummaries = null,
    `type`: String = null,
    updateUrl: String = null,
    urlParamsEncoded: js.Any = null,
    urlParamsEncoding: js.Any = null
  ): DataSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(aggregateTransactions)) __obj.updateDynamic("aggregateTransactions")(aggregateTransactions.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCommit)) __obj.updateDynamic("autoCommit")(autoCommit.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (callee != null) __obj.updateDynamic("callee")(callee.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(dataBinding.asInstanceOf[js.Any])
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filtering != null) __obj.updateDynamic("filtering")(filtering.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(localSchemaTransform)) __obj.updateDynamic("localSchemaTransform")(localSchemaTransform.asInstanceOf[js.Any])
    if (outputResultsName != null) __obj.updateDynamic("outputResultsName")(outputResultsName.asInstanceOf[js.Any])
    if (paging != null) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    if (responseContentType != null) __obj.updateDynamic("responseContentType")(responseContentType.asInstanceOf[js.Any])
    if (responseDataKey != null) __obj.updateDynamic("responseDataKey")(responseDataKey.asInstanceOf[js.Any])
    if (responseDataType != null) __obj.updateDynamic("responseDataType")(responseDataType.asInstanceOf[js.Any])
    if (responseTotalRecCountKey != null) __obj.updateDynamic("responseTotalRecCountKey")(responseTotalRecCountKey.asInstanceOf[js.Any])
    if (rowAdded != null) __obj.updateDynamic("rowAdded")(rowAdded.asInstanceOf[js.Any])
    if (rowDeleted != null) __obj.updateDynamic("rowDeleted")(rowDeleted.asInstanceOf[js.Any])
    if (rowInserted != null) __obj.updateDynamic("rowInserted")(rowInserted.asInstanceOf[js.Any])
    if (rowUpdated != null) __obj.updateDynamic("rowUpdated")(rowUpdated.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (!js.isUndefined(serializeTransactionLog)) __obj.updateDynamic("serializeTransactionLog")(serializeTransactionLog.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    if (summaries != null) __obj.updateDynamic("summaries")(summaries.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updateUrl != null) __obj.updateDynamic("updateUrl")(updateUrl.asInstanceOf[js.Any])
    if (urlParamsEncoded != null) __obj.updateDynamic("urlParamsEncoded")(urlParamsEncoded.asInstanceOf[js.Any])
    if (urlParamsEncoding != null) __obj.updateDynamic("urlParamsEncoding")(urlParamsEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceSettings]
  }
}

