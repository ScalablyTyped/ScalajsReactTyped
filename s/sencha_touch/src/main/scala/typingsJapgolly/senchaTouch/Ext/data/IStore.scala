package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.IEvented
import typingsJapgolly.senchaTouch.Ext.mixin.IObservable
import typingsJapgolly.senchaTouch.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStore extends IEvented {
  /** [Method] Adds Model instance to the Store
  		* @param model Ext.data.Model[]/Ext.data.Model... An array of Model instances or Model configuration objects, or variable number of Model instance or config arguments.
  		* @returns Ext.data.Model[] The model instances that were added.
  		*/
  var add: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], Array]] = js.undefined
  /** [Method] Uses the configured reader to convert the data into records and adds it to the Store
  		* @param data Object[] Array of data to load
  		*/
  var addData: js.UndefOr[js.Function1[/* data */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] We are using applyData so that we can return nothing and prevent the this data property to be overridden
  		* @param data Array/Object
  		*/
  var applyData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var autoLoad: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var autoSync: js.UndefOr[Boolean] = js.undefined
  /** [Method] Gets the average value in the store
  		* @param field String The field in each record you want to get the average for.
  		* @returns Number The average value, if no items exist, 0.
  		*/
  var average: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], Double]] = js.undefined
  /** [Config Option] (Boolean) */
  var buffered: js.UndefOr[Boolean] = js.undefined
  /** [Method] Reverts to a view of the Record cache with no filtering applied
  		* @param suppressEvent Boolean true to clear silently without firing the refresh event.
  		*/
  var clearFilter: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var clearOnPageLoad: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Number) */
  var currentPage: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Object[]/Ext.data.Model[]) */
  var data: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var destroyRemovedRecords: js.UndefOr[Boolean] = js.undefined
  /** [Method] Calls the specified function for each of the Records in the cache
  		* @param fn Function The function to call. Returning false aborts and exits the iteration.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Record in the iteration.
  		*/
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Object[]/Ext.util.Collection) */
  var fields: js.UndefOr[js.Any] = js.undefined
  /** [Method] Filters the loaded set of records by a given set of filters
  		* @param filters Object[]/Ext.util.Filter[]/String The set of filters to apply to the data. These are stored internally on the store, but the filtering itself is done on the Store's MixedCollection. See MixedCollection's filter method for filter syntax. Alternatively, pass in a property string.
  		* @param value String value to filter by (only if using a property string as the first argument).
  		* @param anyMatch Boolean true to allow any match, false to anchor regex beginning with ^.
  		* @param caseSensitive Boolean true to make the filtering regex case sensitive.
  		*/
  var filter: js.UndefOr[
    js.Function4[
      /* filters */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[String], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Filter by a function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
  		*/
  var filterBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Object[]) */
  var filters: js.UndefOr[Array] = js.undefined
  /** [Method] Finds the index of the first matching Record in this store by a specific field value
  		* @param fieldName String The name of the Record field to test.
  		* @param value String/RegExp Either a string that the field value should begin with, or a RegExp to test against the field.
  		* @param startIndex Number The index to start searching at.
  		* @param anyMatch Boolean true to match any part of the string, not just the beginning.
  		* @param caseSensitive Boolean true for case sensitive comparison.
  		* @param exactMatch Boolean true to force exact match (^ and $ characters added to the regex).
  		* @returns Number The matched index or -1
  		*/
  var find: js.UndefOr[
    js.Function6[
      /* fieldName */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      /* exactMatch */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.undefined
  /** [Method] Find the index of the first matching Record in this Store by a function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
  		* @param startIndex Number The index to start searching at.
  		* @returns Number The matched index or -1.
  		*/
  var findBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      Double
    ]
  ] = js.undefined
  /** [Method] Finds the index of the first matching Record in this store by a specific field value
  		* @param fieldName String The name of the Record field to test.
  		* @param value Object The value to match the field against.
  		* @param startIndex Number The index to start searching at.
  		* @returns Number The matched index or -1.
  		*/
  var findExact: js.UndefOr[
    js.Function3[
      /* fieldName */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      Double
    ]
  ] = js.undefined
  /** [Method] Finds the first matching Record in this store by a specific field value
  		* @param fieldName String The name of the Record field to test.
  		* @param value String/RegExp Either a string that the field value should begin with, or a RegExp to test against the field.
  		* @param startIndex Number The index to start searching at.
  		* @param anyMatch Boolean true to match any part of the string, not just the beginning.
  		* @param caseSensitive Boolean true for case sensitive comparison.
  		* @param exactMatch Boolean true to force exact match (^ and $ characters added to the regex).
  		* @returns Ext.data.Model The matched record or null.
  		*/
  var findRecord: js.UndefOr[
    js.Function6[
      /* fieldName */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      /* exactMatch */ js.UndefOr[Boolean], 
      IModel
    ]
  ] = js.undefined
  /** [Method] Convenience function for getting the first model instance in the store
  		* @returns Ext.data.Model/undefined The first model instance in the store, or undefined.
  		*/
  var first: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the number of all cached records including the ones currently filtered
  		* @returns Number The number of all Records in the Store's cache.
  		*/
  var getAllCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Get the Record at the specified index
  		* @param index Number The index of the Record to find.
  		* @returns Ext.data.Model/undefined The Record at the passed index. Returns undefined if not found.
  		*/
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.undefined
  /** [Method] Returns the value of autoLoad
  		* @returns Boolean/Object
  		*/
  var getAutoLoad: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of autoSync
  		* @returns Boolean
  		*/
  var getAutoSync: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of buffered
  		* @returns Boolean
  		*/
  var getBuffered: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Get the Record with the specified id
  		* @param id String The id of the Record to find.
  		* @returns Ext.data.Model/undefined The Record with the passed id. Returns undefined if not found.
  		*/
  var getById: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], _]] = js.undefined
  /** [Method] Returns the value of clearOnPageLoad
  		* @returns Boolean
  		*/
  var getClearOnPageLoad: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Gets the number of cached records
  		* @returns Number The number of Records in the Store's cache.
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of data
  		* @returns Object[]/Ext.data.Model[]
  		*/
  var getData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of destroyRemovedRecords
  		* @returns Boolean
  		*/
  var getDestroyRemovedRecords: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of fields
  		* @returns Object[]/Ext.util.Collection
  		*/
  var getFields: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of getGroupString
  		* @returns Function
  		*/
  var getGetGroupString: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of groupDir
  		* @returns String
  		*/
  var getGroupDir: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of groupField
  		* @returns String
  		*/
  var getGroupField: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (Function) */
  var getGroupString: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of grouper
  		* @returns Object
  		*/
  var getGrouper: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an array containing the result of applying the grouper to the records in this store
  		* @param groupName String Pass in an optional groupName argument to access a specific group as defined by grouper.
  		* @returns Object/Object[] The grouped data.
  		*/
  var getGroups: js.UndefOr[js.Function1[/* groupName */ js.UndefOr[String], _]] = js.undefined
  /** [Method] Returns the value of model
  		* @returns String
  		*/
  var getModel: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of modelDefaults
  		* @returns Object
  		*/
  var getModelDefaults: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns all Model instances that are either currently a phantom e g
  		* @returns Ext.data.Model[] The Model instances.
  		*/
  var getNewRecords: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of pageSize
  		* @returns Number
  		*/
  var getPageSize: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of params
  		* @returns Object
  		*/
  var getParams: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of plugins
  		* @returns Object/Array
  		*/
  var getPlugins: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of proxy
  		* @returns String/Ext.data.proxy.Proxy/Object
  		*/
  var getProxy: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns a range of Records between specified indices
  		* @param startIndex Number The starting index.
  		* @param endIndex Number The ending index (defaults to the last Record in the Store).
  		* @returns Ext.data.Model[] An array of Records.
  		*/
  var getRange: js.UndefOr[
    js.Function2[/* startIndex */ js.UndefOr[Double], /* endIndex */ js.UndefOr[Double], Array]
  ] = js.undefined
  /** [Method] Returns the value of remoteFilter
  		* @returns Boolean
  		*/
  var getRemoteFilter: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of remoteGroup
  		* @returns Boolean
  		*/
  var getRemoteGroup: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of remoteSort
  		* @returns Boolean
  		*/
  var getRemoteSort: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns any records that have been removed from the store but not yet destroyed on the proxy
  		* @returns Ext.data.Model[] The removed Model instances.
  		*/
  var getRemovedRecords: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of storeId
  		* @returns String
  		*/
  var getStoreId: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of syncRemovedRecords
  		* @returns Boolean
  		*/
  var getSyncRemovedRecords: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of totalCount
  		* @returns Number
  		*/
  var getTotalCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns all Model instances that have been updated in the Store but not yet synchronized with the Proxy
  		* @returns Ext.data.Model[] The updated Model instances.
  		*/
  var getUpdatedRecords: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Config Option] (String) */
  var groupDir: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var groupField: js.UndefOr[String] = js.undefined
  /** [Config Option] (Object) */
  var grouper: js.UndefOr[js.Any] = js.undefined
  /** [Method] Get the index within the cache of the passed Record
  		* @param record Ext.data.Model The Ext.data.Model object to find.
  		* @returns Number The index of the passed Record. Returns -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Double]] = js.undefined
  /** [Method] Get the index within the cache of the Record with the passed id
  		* @param id String The id of the Record to find.
  		* @returns Number The index of the Record. Returns -1 if not found.
  		*/
  var indexOfId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Double]] = js.undefined
  /** [Method] Inserts Model instances into the Store at the given index and fires the add event
  		* @param index Number The start index at which to insert the passed Records.
  		* @param records Ext.data.Model[] An Array of Ext.data.Model objects to add to the cache.
  		* @returns Object
  		*/
  var insert: js.UndefOr[js.Function2[/* index */ js.UndefOr[Double], /* records */ js.UndefOr[Array], _]] = js.undefined
  /** [Method] Returns true if the Store is set to autoLoad or is a type which loads upon instantiation
  		* @returns Boolean
  		*/
  var isAutoLoading: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if this store is currently filtered
  		* @returns Boolean
  		*/
  var isFiltered: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] This method tells you if this store has a grouper defined on it
  		* @returns Boolean true if this store has a grouper defined.
  		*/
  var isGrouped: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if the Store has been loaded
  		* @returns Boolean true if the Store has been loaded.
  		*/
  var isLoaded: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if the Store is currently performing a load operation
  		* @returns Boolean true if the Store is currently loading.
  		*/
  var isLoading: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if this store is currently sorted
  		* @returns Boolean
  		*/
  var isSorted: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Convenience function for getting the last model instance in the store
  		* @returns Ext.data.Model/undefined The last model instance in the store, or undefined.
  		*/
  var last: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Loads data into the Store via the configured proxy
  		* @param options Object/Function config object, passed into the Ext.data.Operation object before loading.
  		* @param scope Object Scope for the function.
  		* @returns Object
  		*/
  var load: js.UndefOr[
    js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Loads an array of data straight into the Store
  		* @param data Ext.data.Model[]/Object[] Array of data to load. Any non-model instances will be cast into model instances first.
  		* @param append Boolean true to add the records to the existing records in the store, false to remove the old ones first.
  		*/
  var loadData: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Loads a given page of data by setting the start and limit values appropriately
  		* @param page Number The number of the page to load.
  		* @param options Object See options for load.
  		* @param scope Object
  		*/
  var loadPage: js.UndefOr[
    js.Function3[
      /* page */ js.UndefOr[Double], 
      /* options */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Adds Model instance to the Store
  		* @param model Ext.data.Model[]/Ext.data.Model... An array of Model instances or Model configuration objects, or variable number of Model instance or config arguments.
  		* @returns Ext.data.Model[] The model instances that were added.
  		*/
  var loadRecords: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], Array]] = js.undefined
  /** [Method] Gets the maximum value in the store
  		* @param field String The field in each record.
  		* @returns Object/undefined The maximum value, if no items exist, undefined.
  		*/
  var max: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], _]] = js.undefined
  /** [Method] Gets the minimum value in the store
  		* @param field String The field in each record.
  		* @returns Object/undefined The minimum value, if no items exist, undefined.
  		*/
  var min: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], _]] = js.undefined
  /** [Config Option] (String) */
  var model: js.UndefOr[String] = js.undefined
  /** [Method] Loads the next page in the current data set
  		* @param options Object See options for load.
  		*/
  var nextPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var pageSize: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object/Array) */
  var plugins: js.UndefOr[js.Any] = js.undefined
  /** [Method] Loads the previous page in the current data set
  		* @param options Object See options for load.
  		*/
  var previousPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String/Ext.data.proxy.Proxy/Object) */
  var proxy: js.UndefOr[js.Any] = js.undefined
  /** [Method] Query the cached records in this Store using a filtering function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
  		* @returns Ext.util.MixedCollection Returns an Ext.util.MixedCollection of the matched records.
  		*/
  var queryBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IMixedCollection]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var remoteFilter: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var remoteGroup: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var remoteSort: js.UndefOr[Boolean] = js.undefined
  /** [Method] Removes the given record from the Store firing the removerecords event passing all the instances that are removed
  		* @param records Ext.data.Model/Ext.data.Model[] Model instance or array of instances to remove.
  		*/
  var remove: js.UndefOr[js.Function1[/* records */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Remove all items from the store
  		* @param silent Boolean Prevent the clear event from being fired.
  		*/
  var removeAll: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Removes the model instance at the given index
  		* @param index Number The record index.
  		*/
  var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of autoLoad
  		* @param autoLoad Boolean/Object The new value.
  		*/
  var setAutoLoad: js.UndefOr[js.Function1[/* autoLoad */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of autoSync
  		* @param autoSync Boolean The new value.
  		*/
  var setAutoSync: js.UndefOr[js.Function1[/* autoSync */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of buffered
  		* @param buffered Boolean The new value.
  		*/
  var setBuffered: js.UndefOr[js.Function1[/* buffered */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of clearOnPageLoad
  		* @param clearOnPageLoad Boolean The new value.
  		*/
  var setClearOnPageLoad: js.UndefOr[js.Function1[/* clearOnPageLoad */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of data
  		* @param data Object[]/Ext.data.Model[] The new value.
  		*/
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of destroyRemovedRecords
  		* @param destroyRemovedRecords Boolean The new value.
  		*/
  var setDestroyRemovedRecords: js.UndefOr[js.Function1[/* destroyRemovedRecords */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of fields
  		* @param fields Object[]/Ext.util.Collection The new value.
  		* @returns Object Ext.util.Collection
  		*/
  var setFields: js.UndefOr[js.Function1[/* fields */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Sets the value of filters
  		* @param filters Object[] The new value.
  		*/
  var setFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of getGroupString
  		* @param getGroupString Function The new value.
  		*/
  var setGetGroupString: js.UndefOr[js.Function1[/* getGroupString */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of groupDir
  		* @param groupDir String The new value.
  		*/
  var setGroupDir: js.UndefOr[js.Function1[/* groupDir */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of groupField
  		* @param groupField String The new value.
  		*/
  var setGroupField: js.UndefOr[js.Function1[/* groupField */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of grouper
  		* @param grouper Object The new value.
  		*/
  var setGrouper: js.UndefOr[js.Function1[/* grouper */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of model
  		* @param model String The new value.
  		*/
  var setModel: js.UndefOr[js.Function1[/* model */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of modelDefaults
  		* @param modelDefaults Object The new value.
  		*/
  var setModelDefaults: js.UndefOr[js.Function1[/* modelDefaults */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of pageSize
  		* @param pageSize Number The new value.
  		*/
  var setPageSize: js.UndefOr[js.Function1[/* pageSize */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of params
  		* @param params Object The new value.
  		*/
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of plugins
  		* @param plugins Object/Array The new value.
  		*/
  var setPlugins: js.UndefOr[js.Function1[/* plugins */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of proxy
  		* @param proxy String/Ext.data.proxy.Proxy/Object The new value.
  		*/
  var setProxy: js.UndefOr[js.Function1[/* proxy */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of remoteFilter
  		* @param remoteFilter Boolean The new value.
  		*/
  var setRemoteFilter: js.UndefOr[js.Function1[/* remoteFilter */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of remoteGroup
  		* @param remoteGroup Boolean The new value.
  		*/
  var setRemoteGroup: js.UndefOr[js.Function1[/* remoteGroup */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of remoteSort
  		* @param remoteSort Boolean The new value.
  		*/
  var setRemoteSort: js.UndefOr[js.Function1[/* remoteSort */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of sorters
  		* @param sorters Object[] The new value.
  		*/
  var setSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of storeId
  		* @param storeId String The new value.
  		*/
  var setStoreId: js.UndefOr[js.Function1[/* storeId */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of syncRemovedRecords
  		* @param syncRemovedRecords Boolean The new value.
  		*/
  var setSyncRemovedRecords: js.UndefOr[js.Function1[/* syncRemovedRecords */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of totalCount
  		* @param totalCount Number The new value.
  		*/
  var setTotalCount: js.UndefOr[js.Function1[/* totalCount */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sorts the data in the Store by one or more of its properties
  		* @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
  		* @param defaultDirection String The default overall direction to sort the data by.
  		* @param where String This can be either 'prepend' or 'append'. If you leave this undefined it will clear the current sorters.
  		*/
  var sort: js.UndefOr[
    js.Function3[
      /* sorters */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[String], 
      /* where */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (Object[]) */
  var sorters: js.UndefOr[Array] = js.undefined
  /** [Config Option] (String) */
  var storeId: js.UndefOr[String] = js.undefined
  /** [Method] Sums the value of property for each record between start and end and returns the result
  		* @param field String The field in each record.
  		* @returns Number The sum.
  		*/
  var sum: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], Double]] = js.undefined
  /** [Method] Synchronizes the Store with its Proxy
  		* @param options Object
  		* @returns Object
  		*/
  var sync: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Boolean) */
  var syncRemovedRecords: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var totalCount: js.UndefOr[Double] = js.undefined
}

object IStore {
  @scala.inline
  def apply(
    add: /* model */ js.UndefOr[js.Any] => CallbackTo[Array] = null,
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addData: /* data */ js.UndefOr[Array] => Callback = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    applyData: /* data */ js.UndefOr[js.Any] => Callback = null,
    autoLoad: js.Any = null,
    autoSync: js.UndefOr[Boolean] = js.undefined,
    average: /* field */ js.UndefOr[String] => CallbackTo[Double] = null,
    bubbleEvents: js.Any = null,
    buffered: js.UndefOr[Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clearFilter: /* suppressEvent */ js.UndefOr[Boolean] => Callback = null,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    clearOnPageLoad: js.UndefOr[Boolean] = js.undefined,
    config: js.Any = null,
    currentPage: Int | Double = null,
    data: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    destroyRemovedRecords: js.UndefOr[Boolean] = js.undefined,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    fields: js.Any = null,
    filter: (/* filters */ js.UndefOr[js.Any], /* value */ js.UndefOr[String], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean]) => Callback = null,
    filterBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    filters: Array = null,
    find: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => CallbackTo[Double] = null,
    findBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double]) => CallbackTo[Double] = null,
    findExact: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double]) => CallbackTo[Double] = null,
    findRecord: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => CallbackTo[IModel] = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    first: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getAllCount: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getAt: /* index */ js.UndefOr[Double] => CallbackTo[js.Any] = null,
    getAutoLoad: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getAutoSync: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getBubbleEvents: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getBuffered: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getById: /* id */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getClearOnPageLoad: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getCount: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getDestroyRemovedRecords: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getFields: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getGetGroupString: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getGroupDir: js.UndefOr[CallbackTo[String]] = js.undefined,
    getGroupField: js.UndefOr[CallbackTo[String]] = js.undefined,
    getGroupString: js.Any = null,
    getGrouper: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getGroups: /* groupName */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getId: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getListeners: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getModel: js.UndefOr[CallbackTo[String]] = js.undefined,
    getModelDefaults: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getNewRecords: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getPageSize: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getParams: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getPlugins: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getProxy: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getRange: (/* startIndex */ js.UndefOr[Double], /* endIndex */ js.UndefOr[Double]) => CallbackTo[Array] = null,
    getRemoteFilter: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getRemoteGroup: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getRemoteSort: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getRemovedRecords: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getStoreId: js.UndefOr[CallbackTo[String]] = js.undefined,
    getSyncRemovedRecords: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getTotalCount: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getUpdatedRecords: js.UndefOr[CallbackTo[Array]] = js.undefined,
    groupDir: String = null,
    groupField: String = null,
    grouper: js.Any = null,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    indexOf: /* record */ js.UndefOr[IModel] => CallbackTo[Double] = null,
    indexOfId: /* id */ js.UndefOr[String] => CallbackTo[Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    insert: (/* index */ js.UndefOr[Double], /* records */ js.UndefOr[Array]) => CallbackTo[js.Any] = null,
    isAutoLoading: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isFiltered: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isGrouped: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isLoaded: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isLoading: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isSorted: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    last: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    listeners: js.Any = null,
    load: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    loadData: (/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[Boolean]) => Callback = null,
    loadPage: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    loadRecords: /* model */ js.UndefOr[js.Any] => CallbackTo[Array] = null,
    max: /* field */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    min: /* field */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    model: String = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    nextPage: /* options */ js.UndefOr[js.Any] => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    pageSize: Int | Double = null,
    params: js.Any = null,
    platformConfig: js.Any = null,
    plugins: js.Any = null,
    previousPage: /* options */ js.UndefOr[js.Any] => Callback = null,
    proxy: js.Any = null,
    queryBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IMixedCollection] = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => CallbackTo[IObservable] = null,
    remoteFilter: js.UndefOr[Boolean] = js.undefined,
    remoteGroup: js.UndefOr[Boolean] = js.undefined,
    remoteSort: js.UndefOr[Boolean] = js.undefined,
    remove: /* records */ js.UndefOr[js.Any] => Callback = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeAll: /* silent */ js.UndefOr[Boolean] => Callback = null,
    removeAt: /* index */ js.UndefOr[Double] => Callback = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Callback = null,
    self: IClass = null,
    setAutoLoad: /* autoLoad */ js.UndefOr[js.Any] => Callback = null,
    setAutoSync: /* autoSync */ js.UndefOr[Boolean] => Callback = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Callback = null,
    setBuffered: /* buffered */ js.UndefOr[Boolean] => Callback = null,
    setClearOnPageLoad: /* clearOnPageLoad */ js.UndefOr[Boolean] => Callback = null,
    setData: /* data */ js.UndefOr[js.Any] => Callback = null,
    setDestroyRemovedRecords: /* destroyRemovedRecords */ js.UndefOr[Boolean] => Callback = null,
    setFields: /* fields */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    setFilters: /* filters */ js.UndefOr[Array] => Callback = null,
    setGetGroupString: /* getGroupString */ js.UndefOr[js.Any] => Callback = null,
    setGroupDir: /* groupDir */ js.UndefOr[String] => Callback = null,
    setGroupField: /* groupField */ js.UndefOr[String] => Callback = null,
    setGrouper: /* grouper */ js.UndefOr[js.Any] => Callback = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Callback = null,
    setModel: /* model */ js.UndefOr[String] => Callback = null,
    setModelDefaults: /* modelDefaults */ js.UndefOr[js.Any] => Callback = null,
    setPageSize: /* pageSize */ js.UndefOr[Double] => Callback = null,
    setParams: /* params */ js.UndefOr[js.Any] => Callback = null,
    setPlugins: /* plugins */ js.UndefOr[js.Any] => Callback = null,
    setProxy: /* proxy */ js.UndefOr[js.Any] => Callback = null,
    setRemoteFilter: /* remoteFilter */ js.UndefOr[Boolean] => Callback = null,
    setRemoteGroup: /* remoteGroup */ js.UndefOr[Boolean] => Callback = null,
    setRemoteSort: /* remoteSort */ js.UndefOr[Boolean] => Callback = null,
    setSorters: /* sorters */ js.UndefOr[Array] => Callback = null,
    setStoreId: /* storeId */ js.UndefOr[String] => Callback = null,
    setSyncRemovedRecords: /* syncRemovedRecords */ js.UndefOr[Boolean] => Callback = null,
    setTotalCount: /* totalCount */ js.UndefOr[Double] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sort: (/* sorters */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[String], /* where */ js.UndefOr[String]) => Callback = null,
    sorters: Array = null,
    statics: js.Any = null,
    storeId: String = null,
    sum: /* field */ js.UndefOr[String] => CallbackTo[Double] = null,
    suspendEvents: js.UndefOr[Callback] = js.undefined,
    sync: /* options */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    syncRemovedRecords: js.UndefOr[Boolean] = js.undefined,
    totalCount: Int | Double = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null
  ): IStore = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1((t0: /* model */ js.UndefOr[js.Any]) => add(t0).runNow()))
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addAfterListener(t0, t1, t2, t3).runNow()))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addBeforeListener(t0, t1, t2, t3).runNow()))
    if (addData != null) __obj.updateDynamic("addData")(js.Any.fromFunction1((t0: /* data */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => addData(t0).runNow()))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => addListener(t0, t1, t2, t3, t4).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (applyData != null) __obj.updateDynamic("applyData")(js.Any.fromFunction1((t0: /* data */ js.UndefOr[js.Any]) => applyData(t0).runNow()))
    if (autoLoad != null) __obj.updateDynamic("autoLoad")(autoLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSync)) __obj.updateDynamic("autoSync")(autoSync.asInstanceOf[js.Any])
    if (average != null) __obj.updateDynamic("average")(js.Any.fromFunction1((t0: /* field */ js.UndefOr[java.lang.String]) => average(t0).runNow()))
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(buffered)) __obj.updateDynamic("buffered")(buffered.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (clearFilter != null) __obj.updateDynamic("clearFilter")(js.Any.fromFunction1((t0: /* suppressEvent */ js.UndefOr[scala.Boolean]) => clearFilter(t0).runNow()))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    if (!js.isUndefined(clearOnPageLoad)) __obj.updateDynamic("clearOnPageLoad")(clearOnPageLoad.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (!js.isUndefined(destroyRemovedRecords)) __obj.updateDynamic("destroyRemovedRecords")(destroyRemovedRecords.asInstanceOf[js.Any])
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => each(t0, t1).runNow()))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* events */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction4((t0: /* filters */ js.UndefOr[js.Any], t1: /* value */ js.UndefOr[java.lang.String], t2: /* anyMatch */ js.UndefOr[scala.Boolean], t3: /* caseSensitive */ js.UndefOr[scala.Boolean]) => filter(t0, t1, t2, t3).runNow()))
    if (filterBy != null) __obj.updateDynamic("filterBy")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => filterBy(t0, t1).runNow()))
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (find != null) __obj.updateDynamic("find")(js.Any.fromFunction6((t0: /* fieldName */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[js.Any], t2: /* startIndex */ js.UndefOr[scala.Double], t3: /* anyMatch */ js.UndefOr[scala.Boolean], t4: /* caseSensitive */ js.UndefOr[scala.Boolean], t5: /* exactMatch */ js.UndefOr[scala.Boolean]) => find(t0, t1, t2, t3, t4, t5).runNow()))
    if (findBy != null) __obj.updateDynamic("findBy")(js.Any.fromFunction3((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any], t2: /* startIndex */ js.UndefOr[scala.Double]) => findBy(t0, t1, t2).runNow()))
    if (findExact != null) __obj.updateDynamic("findExact")(js.Any.fromFunction3((t0: /* fieldName */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[js.Any], t2: /* startIndex */ js.UndefOr[scala.Double]) => findExact(t0, t1, t2).runNow()))
    if (findRecord != null) __obj.updateDynamic("findRecord")(js.Any.fromFunction6((t0: /* fieldName */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[js.Any], t2: /* startIndex */ js.UndefOr[scala.Double], t3: /* anyMatch */ js.UndefOr[scala.Boolean], t4: /* caseSensitive */ js.UndefOr[scala.Boolean], t5: /* exactMatch */ js.UndefOr[scala.Boolean]) => findRecord(t0, t1, t2, t3, t4, t5).runNow()))
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => fireAction(t0, t1, t2, t3).runNow()))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    first.foreach(p => __obj.updateDynamic("first")(p.toJsFn))
    getAllCount.foreach(p => __obj.updateDynamic("getAllCount")(p.toJsFn))
    if (getAt != null) __obj.updateDynamic("getAt")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => getAt(t0).runNow()))
    getAutoLoad.foreach(p => __obj.updateDynamic("getAutoLoad")(p.toJsFn))
    getAutoSync.foreach(p => __obj.updateDynamic("getAutoSync")(p.toJsFn))
    getBubbleEvents.foreach(p => __obj.updateDynamic("getBubbleEvents")(p.toJsFn))
    getBuffered.foreach(p => __obj.updateDynamic("getBuffered")(p.toJsFn))
    if (getById != null) __obj.updateDynamic("getById")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[java.lang.String]) => getById(t0).runNow()))
    getClearOnPageLoad.foreach(p => __obj.updateDynamic("getClearOnPageLoad")(p.toJsFn))
    getCount.foreach(p => __obj.updateDynamic("getCount")(p.toJsFn))
    getData.foreach(p => __obj.updateDynamic("getData")(p.toJsFn))
    getDestroyRemovedRecords.foreach(p => __obj.updateDynamic("getDestroyRemovedRecords")(p.toJsFn))
    getFields.foreach(p => __obj.updateDynamic("getFields")(p.toJsFn))
    getGetGroupString.foreach(p => __obj.updateDynamic("getGetGroupString")(p.toJsFn))
    getGroupDir.foreach(p => __obj.updateDynamic("getGroupDir")(p.toJsFn))
    getGroupField.foreach(p => __obj.updateDynamic("getGroupField")(p.toJsFn))
    if (getGroupString != null) __obj.updateDynamic("getGroupString")(getGroupString.asInstanceOf[js.Any])
    getGrouper.foreach(p => __obj.updateDynamic("getGrouper")(p.toJsFn))
    if (getGroups != null) __obj.updateDynamic("getGroups")(js.Any.fromFunction1((t0: /* groupName */ js.UndefOr[java.lang.String]) => getGroups(t0).runNow()))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getListeners.foreach(p => __obj.updateDynamic("getListeners")(p.toJsFn))
    getModel.foreach(p => __obj.updateDynamic("getModel")(p.toJsFn))
    getModelDefaults.foreach(p => __obj.updateDynamic("getModelDefaults")(p.toJsFn))
    getNewRecords.foreach(p => __obj.updateDynamic("getNewRecords")(p.toJsFn))
    getPageSize.foreach(p => __obj.updateDynamic("getPageSize")(p.toJsFn))
    getParams.foreach(p => __obj.updateDynamic("getParams")(p.toJsFn))
    getPlugins.foreach(p => __obj.updateDynamic("getPlugins")(p.toJsFn))
    getProxy.foreach(p => __obj.updateDynamic("getProxy")(p.toJsFn))
    if (getRange != null) __obj.updateDynamic("getRange")(js.Any.fromFunction2((t0: /* startIndex */ js.UndefOr[scala.Double], t1: /* endIndex */ js.UndefOr[scala.Double]) => getRange(t0, t1).runNow()))
    getRemoteFilter.foreach(p => __obj.updateDynamic("getRemoteFilter")(p.toJsFn))
    getRemoteGroup.foreach(p => __obj.updateDynamic("getRemoteGroup")(p.toJsFn))
    getRemoteSort.foreach(p => __obj.updateDynamic("getRemoteSort")(p.toJsFn))
    getRemovedRecords.foreach(p => __obj.updateDynamic("getRemovedRecords")(p.toJsFn))
    getStoreId.foreach(p => __obj.updateDynamic("getStoreId")(p.toJsFn))
    getSyncRemovedRecords.foreach(p => __obj.updateDynamic("getSyncRemovedRecords")(p.toJsFn))
    getTotalCount.foreach(p => __obj.updateDynamic("getTotalCount")(p.toJsFn))
    getUpdatedRecords.foreach(p => __obj.updateDynamic("getUpdatedRecords")(p.toJsFn))
    if (groupDir != null) __obj.updateDynamic("groupDir")(groupDir.asInstanceOf[js.Any])
    if (groupField != null) __obj.updateDynamic("groupField")(groupField.asInstanceOf[js.Any])
    if (grouper != null) __obj.updateDynamic("grouper")(grouper.asInstanceOf[js.Any])
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IModel]) => indexOf(t0).runNow()))
    if (indexOfId != null) __obj.updateDynamic("indexOfId")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[java.lang.String]) => indexOfId(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: /* index */ js.UndefOr[scala.Double], t1: /* records */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => insert(t0, t1).runNow()))
    isAutoLoading.foreach(p => __obj.updateDynamic("isAutoLoading")(p.toJsFn))
    isFiltered.foreach(p => __obj.updateDynamic("isFiltered")(p.toJsFn))
    isGrouped.foreach(p => __obj.updateDynamic("isGrouped")(p.toJsFn))
    isLoaded.foreach(p => __obj.updateDynamic("isLoaded")(p.toJsFn))
    isLoading.foreach(p => __obj.updateDynamic("isLoading")(p.toJsFn))
    isSorted.foreach(p => __obj.updateDynamic("isSorted")(p.toJsFn))
    last.foreach(p => __obj.updateDynamic("last")(p.toJsFn))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction2((t0: /* options */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => load(t0, t1).runNow()))
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction2((t0: /* data */ js.UndefOr[js.Any], t1: /* append */ js.UndefOr[scala.Boolean]) => loadData(t0, t1).runNow()))
    if (loadPage != null) __obj.updateDynamic("loadPage")(js.Any.fromFunction3((t0: /* page */ js.UndefOr[scala.Double], t1: /* options */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => loadPage(t0, t1, t2).runNow()))
    if (loadRecords != null) __obj.updateDynamic("loadRecords")(js.Any.fromFunction1((t0: /* model */ js.UndefOr[js.Any]) => loadRecords(t0).runNow()))
    if (max != null) __obj.updateDynamic("max")(js.Any.fromFunction1((t0: /* field */ js.UndefOr[java.lang.String]) => max(t0).runNow()))
    if (min != null) __obj.updateDynamic("min")(js.Any.fromFunction1((t0: /* field */ js.UndefOr[java.lang.String]) => min(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (nextPage != null) __obj.updateDynamic("nextPage")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => nextPage(t0).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => on(t0, t1, t2, t3, t4).runNow()))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onAfter(t0, t1, t2, t3).runNow()))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onBefore(t0, t1, t2, t3).runNow()))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (previousPage != null) __obj.updateDynamic("previousPage")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => previousPage(t0).runNow()))
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (queryBy != null) __obj.updateDynamic("queryBy")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => queryBy(t0, t1).runNow()))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2((t0: /* object */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[js.Any]) => relayEvents(t0, t1).runNow()))
    if (!js.isUndefined(remoteFilter)) __obj.updateDynamic("remoteFilter")(remoteFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteGroup)) __obj.updateDynamic("remoteGroup")(remoteGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteSort)) __obj.updateDynamic("remoteSort")(remoteSort.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: /* records */ js.UndefOr[js.Any]) => remove(t0).runNow()))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeAfterListener(t0, t1, t2, t3).runNow()))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction1((t0: /* silent */ js.UndefOr[scala.Boolean]) => removeAll(t0).runNow()))
    if (removeAt != null) __obj.updateDynamic("removeAt")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => removeAt(t0).runNow()))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeBeforeListener(t0, t1, t2, t3).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => removeListener(t0, t1, t2, t3, t4).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1((t0: /* discardQueuedEvents */ js.UndefOr[scala.Boolean]) => resumeEvents(t0).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAutoLoad != null) __obj.updateDynamic("setAutoLoad")(js.Any.fromFunction1((t0: /* autoLoad */ js.UndefOr[js.Any]) => setAutoLoad(t0).runNow()))
    if (setAutoSync != null) __obj.updateDynamic("setAutoSync")(js.Any.fromFunction1((t0: /* autoSync */ js.UndefOr[scala.Boolean]) => setAutoSync(t0).runNow()))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1((t0: /* bubbleEvents */ js.UndefOr[js.Any]) => setBubbleEvents(t0).runNow()))
    if (setBuffered != null) __obj.updateDynamic("setBuffered")(js.Any.fromFunction1((t0: /* buffered */ js.UndefOr[scala.Boolean]) => setBuffered(t0).runNow()))
    if (setClearOnPageLoad != null) __obj.updateDynamic("setClearOnPageLoad")(js.Any.fromFunction1((t0: /* clearOnPageLoad */ js.UndefOr[scala.Boolean]) => setClearOnPageLoad(t0).runNow()))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction1((t0: /* data */ js.UndefOr[js.Any]) => setData(t0).runNow()))
    if (setDestroyRemovedRecords != null) __obj.updateDynamic("setDestroyRemovedRecords")(js.Any.fromFunction1((t0: /* destroyRemovedRecords */ js.UndefOr[scala.Boolean]) => setDestroyRemovedRecords(t0).runNow()))
    if (setFields != null) __obj.updateDynamic("setFields")(js.Any.fromFunction1((t0: /* fields */ js.UndefOr[js.Any]) => setFields(t0).runNow()))
    if (setFilters != null) __obj.updateDynamic("setFilters")(js.Any.fromFunction1((t0: /* filters */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setFilters(t0).runNow()))
    if (setGetGroupString != null) __obj.updateDynamic("setGetGroupString")(js.Any.fromFunction1((t0: /* getGroupString */ js.UndefOr[js.Any]) => setGetGroupString(t0).runNow()))
    if (setGroupDir != null) __obj.updateDynamic("setGroupDir")(js.Any.fromFunction1((t0: /* groupDir */ js.UndefOr[java.lang.String]) => setGroupDir(t0).runNow()))
    if (setGroupField != null) __obj.updateDynamic("setGroupField")(js.Any.fromFunction1((t0: /* groupField */ js.UndefOr[java.lang.String]) => setGroupField(t0).runNow()))
    if (setGrouper != null) __obj.updateDynamic("setGrouper")(js.Any.fromFunction1((t0: /* grouper */ js.UndefOr[js.Any]) => setGrouper(t0).runNow()))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1((t0: /* listeners */ js.UndefOr[js.Any]) => setListeners(t0).runNow()))
    if (setModel != null) __obj.updateDynamic("setModel")(js.Any.fromFunction1((t0: /* model */ js.UndefOr[java.lang.String]) => setModel(t0).runNow()))
    if (setModelDefaults != null) __obj.updateDynamic("setModelDefaults")(js.Any.fromFunction1((t0: /* modelDefaults */ js.UndefOr[js.Any]) => setModelDefaults(t0).runNow()))
    if (setPageSize != null) __obj.updateDynamic("setPageSize")(js.Any.fromFunction1((t0: /* pageSize */ js.UndefOr[scala.Double]) => setPageSize(t0).runNow()))
    if (setParams != null) __obj.updateDynamic("setParams")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[js.Any]) => setParams(t0).runNow()))
    if (setPlugins != null) __obj.updateDynamic("setPlugins")(js.Any.fromFunction1((t0: /* plugins */ js.UndefOr[js.Any]) => setPlugins(t0).runNow()))
    if (setProxy != null) __obj.updateDynamic("setProxy")(js.Any.fromFunction1((t0: /* proxy */ js.UndefOr[js.Any]) => setProxy(t0).runNow()))
    if (setRemoteFilter != null) __obj.updateDynamic("setRemoteFilter")(js.Any.fromFunction1((t0: /* remoteFilter */ js.UndefOr[scala.Boolean]) => setRemoteFilter(t0).runNow()))
    if (setRemoteGroup != null) __obj.updateDynamic("setRemoteGroup")(js.Any.fromFunction1((t0: /* remoteGroup */ js.UndefOr[scala.Boolean]) => setRemoteGroup(t0).runNow()))
    if (setRemoteSort != null) __obj.updateDynamic("setRemoteSort")(js.Any.fromFunction1((t0: /* remoteSort */ js.UndefOr[scala.Boolean]) => setRemoteSort(t0).runNow()))
    if (setSorters != null) __obj.updateDynamic("setSorters")(js.Any.fromFunction1((t0: /* sorters */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setSorters(t0).runNow()))
    if (setStoreId != null) __obj.updateDynamic("setStoreId")(js.Any.fromFunction1((t0: /* storeId */ js.UndefOr[java.lang.String]) => setStoreId(t0).runNow()))
    if (setSyncRemovedRecords != null) __obj.updateDynamic("setSyncRemovedRecords")(js.Any.fromFunction1((t0: /* syncRemovedRecords */ js.UndefOr[scala.Boolean]) => setSyncRemovedRecords(t0).runNow()))
    if (setTotalCount != null) __obj.updateDynamic("setTotalCount")(js.Any.fromFunction1((t0: /* totalCount */ js.UndefOr[scala.Double]) => setTotalCount(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction3((t0: /* sorters */ js.UndefOr[js.Any], t1: /* defaultDirection */ js.UndefOr[java.lang.String], t2: /* where */ js.UndefOr[java.lang.String]) => sort(t0, t1, t2).runNow()))
    if (sorters != null) __obj.updateDynamic("sorters")(sorters.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (storeId != null) __obj.updateDynamic("storeId")(storeId.asInstanceOf[js.Any])
    if (sum != null) __obj.updateDynamic("sum")(js.Any.fromFunction1((t0: /* field */ js.UndefOr[java.lang.String]) => sum(t0).runNow()))
    suspendEvents.foreach(p => __obj.updateDynamic("suspendEvents")(p.toJsFn))
    if (sync != null) __obj.updateDynamic("sync")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => sync(t0).runNow()))
    if (!js.isUndefined(syncRemovedRecords)) __obj.updateDynamic("syncRemovedRecords")(syncRemovedRecords.asInstanceOf[js.Any])
    if (totalCount != null) __obj.updateDynamic("totalCount")(totalCount.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => un(t0, t1, t2, t3, t4).runNow()))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unAfter(t0, t1, t2, t3).runNow()))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unBefore(t0, t1, t2, t3).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStore]
  }
}

