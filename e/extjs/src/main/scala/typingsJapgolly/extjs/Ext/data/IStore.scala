package typingsJapgolly.extjs.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.util.IMixedCollection
import typingsJapgolly.extjs.Ext.util.ISorter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStore extends IAbstractStore {
  /** [Method] Adds Model instance to the Store
  		* @param model Ext.data.Model[]/Ext.data.Model.../Object[]/Object... An array of Model instances or Model configuration objects, or variable number of Model instance or config arguments.
  		* @returns Ext.data.Model[] The model instances that were added
  		*/
  var add: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], Array]] = js.undefined
  /** [Method] Adds a new Filter to this Store s filter set and by default applys the updated filter set to the Store s unfiltered
  		* @param filters Object[]/Ext.util.Filter[] The set of filters to add to the current filter set.
  		* @param applyFilters Boolean Pass as false to add the filter but not apply the updated filter set.
  		*/
  var addFilter: js.UndefOr[
    js.Function2[/* filters */ js.UndefOr[js.Any], /* applyFilters */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Local sort only Inserts the passed Record into the Store at the index where it should go based on the current sort
  		* @param record Ext.data.Record
  		*/
  var addSorted: js.UndefOr[js.Function1[/* record */ js.UndefOr[IRecord], Unit]] = js.undefined
  /** [Method] Runs the aggregate function for all the records in the store
  		* @param fn Function The function to execute. The function is called with a single parameter, an array of records for that group.
  		* @param scope Object The scope to execute the function in. Defaults to the store.
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the group average being the value. The grouped parameter is only honored if the store has a groupField.
  		* @param args Array Any arguments to append to the function call
  		* @returns Object An object literal with the group names and their appropriate values.
  		*/
  var aggregate: js.UndefOr[
    js.Function4[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* grouped */ js.UndefOr[Boolean], 
      /* args */ js.UndefOr[Array], 
      _
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var autoDestroy: js.UndefOr[Boolean] = js.undefined
  /** [Method] Gets the average value in the store
  		* @param field String The field in each record
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the group average being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Object The average value, if no items exist, 0.
  		*/
  var average: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var buffered: js.UndefOr[Boolean] = js.undefined
  /** [Method] Reverts to a view of the Record cache with no filtering applied
  		* @param suppressEvent Boolean If true the filter is cleared silently. For a locally filtered Store, this means that the filter collection is cleared without firing the datachanged event. For a remotely filtered Store, this means that the filter collection is cleared, but the store is not reloaded from the server.
  		*/
  var clearFilter: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Clear any groupers in the store */
  var clearGrouping: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var clearOnPageLoad: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var clearRemovedOnLoad: js.UndefOr[Boolean] = js.undefined
  /** [Method] Collects unique values for a particular dataIndex from this store
  		* @param dataIndex String The property to collect
  		* @param allowNull Boolean Pass true to allow null, undefined or empty string values
  		* @param bypassFilter Boolean Pass true to collect from all records, even ones which are filtered.
  		* @returns Object[] An array of the unique values
  		*/
  var collect: js.UndefOr[
    js.Function3[
      /* dataIndex */ js.UndefOr[String], 
      /* allowNull */ js.UndefOr[Boolean], 
      /* bypassFilter */ js.UndefOr[Boolean], 
      Array
    ]
  ] = js.undefined
  /** [Method] Commits all Records with outstanding changes  */
  var commitChanges: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Gets the count of items in the store
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the count for each group being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Number the count
  		*/
  var count: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[Boolean], Double]] = js.undefined
  /** [Property] (Number) */
  var currentPage: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Object[]/Ext.data.Model[]) */
  var data: js.UndefOr[js.Any] = js.undefined
  /** [Method] Calls the specified function for each record in the store
  		* @param fn Function The function to call. The Record is passed as the first parameter. Returning false aborts and exits the iteration.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current record in the iteration.
  		*/
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Filters the loaded set of records by a given set of filters
  		* @param filters Object[]/Ext.util.Filter[]/String The set of filters to apply to the data. These are stored internally on the store, but the filtering itself is done on the Store's MixedCollection. See MixedCollection's filter method for filter syntax. Alternatively, pass in a property string. If no parameters are passed, the Store's existing filter set is applied.
  		* @param value String value to filter by (only if using a property string as the first argument)
  		*/
  var filter: js.UndefOr[
    js.Function2[/* filters */ js.UndefOr[js.Any], /* value */ js.UndefOr[String], Unit]
  ] = js.undefined
  /** [Method] Filters by a function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
  		*/
  var filterBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Finds the index of the first matching Record in this store by a specific field value
  		* @param fieldName String The name of the Record field to test.
  		* @param value String/RegExp Either a string that the field value should begin with, or a RegExp to test against the field.
  		* @param startIndex Number The index to start searching at
  		* @param anyMatch Boolean True to match any part of the string, not just the beginning
  		* @param caseSensitive Boolean True for case sensitive comparison
  		* @param exactMatch Boolean True to force exact match (^ and $ characters added to the regex).
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
  		* @param startIndex Number The index to start searching at
  		* @returns Number The matched index or -1
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
  		* @param startIndex Number The index to start searching at
  		* @returns Number The matched index or -1
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
  		* @param startIndex Number The index to start searching at
  		* @param anyMatch Boolean True to match any part of the string, not just the beginning
  		* @param caseSensitive Boolean True for case sensitive comparison
  		* @param exactMatch Boolean True to force exact match (^ and $ characters added to the regex).
  		* @returns Ext.data.Model The matched record or null
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
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the first record being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Ext.data.Model/undefined The first model instance in the store, or undefined
  		*/
  var first: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[Boolean], _]] = js.undefined
  /** [Method] Get the Record at the specified index
  		* @param index Number The index of the Record to find.
  		* @returns Ext.data.Model The Record at the passed index. Returns undefined if not found.
  		*/
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], IModel]] = js.undefined
  /** [Method] Get the Record with the specified id
  		* @param id Mixed The id of the Record to find.
  		* @returns Ext.data.Model The Record with the passed id. Returns null if not found.
  		*/
  var getById: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], IModel]] = js.undefined
  /** [Method] Gets the number of records in store
  		* @returns Number The number of Records in the Store.
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the string to group on for a given model instance
  		* @param instance Ext.data.Model The model instance
  		* @returns String The string to compare when forming groups
  		*/
  var getGroupString: js.UndefOr[js.Function1[/* instance */ js.UndefOr[IModel], String]] = js.undefined
  /** [Method] Returns an array containing the result of applying grouping to the records in this store
  		* @param groupName String Pass in an optional groupName argument to access a specific group as defined by getGroupString.
  		* @returns Object/Object[] The grouped data
  		*/
  var getGroups: js.UndefOr[js.Function1[/* groupName */ js.UndefOr[String], _]] = js.undefined
  /** [Method] Determines the page from a record index
  		* @param index Number The record index
  		* @returns Number The page the record belongs to
  		*/
  var getPageFromRecordIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Double]] = js.undefined
  /** [Method] Gathers a range of Records between specified indices
  		* @param start Number The starting index. Defaults to zero for non buffered Stores.
  		* @param end Number The ending index. Defaults to the last Record for non buffered Stores.
  		* @param options Object Used when the Store is {@link buffered] and the range may not be available synchronously.
  		* @returns Ext.data.Model[] An array of records if the records are immediately available. For buffered stores, you should pass the callback option unless you know that the range will be present - see rangeCached.
  		*/
  var getRange: js.UndefOr[
    js.Function3[
      /* start */ js.UndefOr[Double], 
      /* end */ js.UndefOr[Double], 
      /* options */ js.UndefOr[js.Any], 
      Array
    ]
  ] = js.undefined
  /** [Method] Returns the total number of Model instances that the Proxy indicates exist
  		* @returns Number The total number of Model instances available via the Proxy. 0 returned if no value has been set via the reader.
  		*/
  var getTotalCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Groups data inside the store
  		* @param groupers String/Object[] Either a string name of one of the fields in this Store's configured Model, or an Array of grouper configurations.
  		* @param direction String The overall direction to group the data by.
  		*/
  var group: js.UndefOr[
    js.Function2[/* groupers */ js.UndefOr[js.Any], /* direction */ js.UndefOr[String], Unit]
  ] = js.undefined
  /** [Config Option] (String) */
  var groupDir: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var groupField: js.UndefOr[String] = js.undefined
  /** [Config Option] (Ext.util.MixedCollection) */
  var groupers: js.UndefOr[IMixedCollection] = js.undefined
  /** [Method] Guarantee a specific range this will load the store with a range that must be the pageSize or smaller and take car
  		* @param start Object
  		* @param end Object
  		* @param callback Object
  		* @param scope Object
  		* @param options Object
  		*/
  var guaranteeRange: js.UndefOr[
    js.Function5[
      /* start */ js.UndefOr[js.Any], 
      /* end */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Get the index of the record within the store
  		* @param record Ext.data.Model The Ext.data.Model object to find.
  		* @returns Number The index of the passed Record. Returns -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Double]] = js.undefined
  /** [Method] Get the index within the store of the Record with the passed id
  		* @param id String The id of the Record to find.
  		* @returns Number The index of the Record. Returns -1 if not found.
  		*/
  var indexOfId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Double]] = js.undefined
  /** [Method] Get the index within the entire dataset
  		* @param record Ext.data.Model The Ext.data.Model object to find.
  		* @returns Number The index of the passed Record. Returns -1 if not found.
  		*/
  var indexOfTotal: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Double]] = js.undefined
  /** [Method] Inserts Model instances into the Store at the given index and fires the add event
  		* @param index Number The start index at which to insert the passed Records.
  		* @param records Ext.data.Model[] An Array of Ext.data.Model objects to add to the store.
  		* @returns Ext.data.Model[] records The added records
  		*/
  var insert: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* records */ js.UndefOr[Array], Array]
  ] = js.undefined
  /** [Method] Returns true if this store is currently filtered
  		* @returns Boolean
  		*/
  var isFiltered: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Checks if the store is currently grouped
  		* @returns Boolean true if the store is grouped.
  		*/
  var isGrouped: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Convenience function for getting the last model instance in the store
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the last record being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Ext.data.Model/undefined The last model instance in the store, or undefined
  		*/
  var last: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[Boolean], _]] = js.undefined
  /** [Config Option] (Number) */
  var leadingBufferZone: js.UndefOr[Double] = js.undefined
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
  		*/
  var loadPage: js.UndefOr[
    js.Function2[/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Loads data via the bound Proxy s reader Use this method if you are attempting to load data and want to utilize the c
  		* @param data Object[] The full JSON object you'd like to load into the Data store.
  		* @param append Boolean true to add the records to the existing records in the store, false to remove the old ones first.
  		*/
  var loadRawData: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[Array], /* append */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Loads an array of model instances into the store fires the datachanged event
  		* @param records Ext.data.Model[] The array of records to load
  		* @param options Object
  		*/
  var loadRecords: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[Array], /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Gets the maximum value in the store
  		* @param field String The field in each record
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the maximum in the group being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Object The maximum value, if no items exist, undefined.
  		*/
  var max: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Gets the minimum value in the store
  		* @param field String The field in each record
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the minimum in the group being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Object The minimum value, if no items exist, undefined.
  		*/
  var min: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Loads the next page in the current data set
  		* @param options Object See options for load
  		*/
  var nextPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var pageSize: js.UndefOr[Double] = js.undefined
  /** [Method] Prefetches data into the store using its configured proxy
  		* @param options Object config object, passed into the Ext.data.Operation object before loading. See load
  		*/
  var prefetch: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Prefetches a page of data
  		* @param page Number The page to prefetch
  		* @param options Object config object, passed into the Ext.data.Operation object before loading. See load
  		*/
  var prefetchPage: js.UndefOr[
    js.Function2[/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Ensures that the specified range of rows is present in the cache
  		* @param start Object
  		* @param end Object
  		*/
  var prefetchRange: js.UndefOr[js.Function2[/* start */ js.UndefOr[js.Any], /* end */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Loads the previous page in the current data set
  		* @param options Object See options for load
  		*/
  var previousPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var purgePageCount: js.UndefOr[Double] = js.undefined
  /** [Method] Query all the cached records in this Store by name value pair
  		* @param property String The property to create the filter function for
  		* @param value String/RegExp The string/regex to compare the property value to
  		* @param anyMatch Boolean true if we don't care if the filter value is not the full value.
  		* @param caseSensitive Boolean true to create a case-sensitive regex.
  		* @param exactMatch Boolean true to force exact match (^ and $ characters added to the regex). Ignored if anyMatch is true.
  		* @returns Ext.util.MixedCollection Returns an Ext.util.MixedCollection of the matched records
  		*/
  var query: js.UndefOr[
    js.Function5[
      /* property */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      /* exactMatch */ js.UndefOr[Boolean], 
      IMixedCollection
    ]
  ] = js.undefined
  /** [Method] Query all the cached records in this Store using a filtering function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed Defaults to this Store.
  		* @returns Ext.util.MixedCollection Returns an Ext.util.MixedCollection of the matched records
  		*/
  var queryBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IMixedCollection]
  ] = js.undefined
  /** [Method] Rejects outstanding changes on all modified records and re insert any records that were removed locally  */
  var rejectChanges: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var remoteGroup: js.UndefOr[Boolean] = js.undefined
  /** [Method] Removes the specified record s from the Store firing the remove event for each instance that is removed
  		* @param records Ext.data.Model/Ext.data.Model[]/Number/Number[] Model instance or array of instances to remove or an array of indices from which to remove records.
  		*/
  var remove: js.UndefOr[js.Function1[/* records */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Removes all items from the store
  		* @param silent Boolean Pass true to prevent the record bulkremove and clear events from being fired.
  		*/
  @JSName("removeAll")
  var removeAll_IStore: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Removes the model instance s at the given index
  		* @param index Number The record index
  		* @param count Number The number of records to delete
  		*/
  var removeAt: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* count */ js.UndefOr[Double], Unit]
  ] = js.undefined
  /** [Method] Removes an individual Filter from the current filter set using the passed Filter Filter id and by default applys the
  		* @param toRemove Mixed The id of a Filter to remove from the filter set, or a Filter instance to remove.
  		* @param applyFilters Boolean Pass as false to remove the filter but not apply the updated filter set. If null is passed, all anonymous Filters (Filters with no id property) will be removed.
  		*/
  var removeFilter: js.UndefOr[
    js.Function2[/* toRemove */ js.UndefOr[js.Any], /* applyFilters */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Property] (Ext.util.MixedCollection) */
  var snapshot: js.UndefOr[IMixedCollection] = js.undefined
  /** [Config Option] (Boolean) */
  var sortOnFilter: js.UndefOr[Boolean] = js.undefined
  /** [Method] because prefetchData is stored by index this invalidates all of the prefetchedData
  		* @returns Ext.util.Sorter[]
  		*/
  @JSName("sort")
  var sort_IStore: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Sums the value of field for each record in store and returns the result
  		* @param field String A field in each record
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the sum for that group being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Number The sum
  		*/
  var sum: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean], Double]
  ] = js.undefined
  /** [Config Option] (Number) */
  var trailingBufferZone: js.UndefOr[Double] = js.undefined
}

object IStore {
  @scala.inline
  def apply(
    add: /* model */ js.UndefOr[js.Any] => CallbackTo[Array] = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addFilter: (/* filters */ js.UndefOr[js.Any], /* applyFilters */ js.UndefOr[Boolean]) => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    addSorted: /* record */ js.UndefOr[IRecord] => Callback = null,
    aggregate: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* grouped */ js.UndefOr[Boolean], /* args */ js.UndefOr[Array]) => CallbackTo[js.Any] = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    autoDestroy: js.UndefOr[Boolean] = js.undefined,
    autoLoad: js.Any = null,
    autoSync: js.UndefOr[Boolean] = js.undefined,
    average: (/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    batchUpdateMode: String = null,
    buffered: js.UndefOr[Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clearFilter: /* suppressEvent */ js.UndefOr[Boolean] => Callback = null,
    clearGrouping: js.UndefOr[Callback] = js.undefined,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    clearManagedListeners: js.UndefOr[Callback] = js.undefined,
    clearOnPageLoad: js.UndefOr[Boolean] = js.undefined,
    clearRemovedOnLoad: js.UndefOr[Boolean] = js.undefined,
    collect: (/* dataIndex */ js.UndefOr[String], /* allowNull */ js.UndefOr[Boolean], /* bypassFilter */ js.UndefOr[Boolean]) => CallbackTo[Array] = null,
    commitChanges: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    count: /* grouped */ js.UndefOr[Boolean] => CallbackTo[Double] = null,
    currentPage: Int | Double = null,
    data: js.Any = null,
    defaultProxyType: String = null,
    defaultSortDirection: String = null,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    fields: Array = null,
    filter: (/* filters */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => Callback = null,
    filterBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    filterOnLoad: js.UndefOr[Boolean] = js.undefined,
    filters: js.Any = null,
    find: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => CallbackTo[Double] = null,
    findBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double]) => CallbackTo[Double] = null,
    findExact: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double]) => CallbackTo[Double] = null,
    findRecord: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => CallbackTo[IModel] = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    fireEventArgs: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array]) => CallbackTo[Boolean] = null,
    first: /* grouped */ js.UndefOr[Boolean] => CallbackTo[js.Any] = null,
    generateComparator: js.UndefOr[Callback] = js.undefined,
    getAt: /* index */ js.UndefOr[Double] => CallbackTo[IModel] = null,
    getById: /* id */ js.UndefOr[js.Any] => CallbackTo[IModel] = null,
    getCount: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getFirstSorter: js.UndefOr[CallbackTo[ISorter]] = js.undefined,
    getGroupString: /* instance */ js.UndefOr[IModel] => CallbackTo[String] = null,
    getGroups: /* groupName */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getModifiedRecords: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getNewRecords: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getPageFromRecordIndex: /* index */ js.UndefOr[Double] => CallbackTo[Double] = null,
    getProxy: js.UndefOr[CallbackTo[typingsJapgolly.extjs.Ext.data.proxy.IProxy]] = js.undefined,
    getRange: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => CallbackTo[Array] = null,
    getRemovedRecords: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getTotalCount: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getUpdatedRecords: js.UndefOr[CallbackTo[Array]] = js.undefined,
    group: (/* groupers */ js.UndefOr[js.Any], /* direction */ js.UndefOr[String]) => Callback = null,
    groupDir: String = null,
    groupField: String = null,
    groupers: IMixedCollection = null,
    guaranteeRange: (/* start */ js.UndefOr[js.Any], /* end */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    hasListeners: js.Any = null,
    indexOf: /* record */ js.UndefOr[IModel] => CallbackTo[Double] = null,
    indexOfId: /* id */ js.UndefOr[String] => CallbackTo[Double] = null,
    indexOfTotal: /* record */ js.UndefOr[IModel] => CallbackTo[Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IStore] = null,
    initSortable: js.UndefOr[Callback] = js.undefined,
    insert: (/* index */ js.UndefOr[Double], /* records */ js.UndefOr[Array]) => CallbackTo[Array] = null,
    isDestroyed: js.UndefOr[Boolean] = js.undefined,
    isFiltered: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isGrouped: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isLoading: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isSortable: js.UndefOr[Boolean] = js.undefined,
    isStore: js.UndefOr[Boolean] = js.undefined,
    last: /* grouped */ js.UndefOr[Boolean] => CallbackTo[js.Any] = null,
    leadingBufferZone: Int | Double = null,
    listeners: js.Any = null,
    load: /* options */ js.UndefOr[js.Any] => Callback = null,
    loadData: (/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[Boolean]) => Callback = null,
    loadPage: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => Callback = null,
    loadRawData: (/* data */ js.UndefOr[Array], /* append */ js.UndefOr[Boolean]) => Callback = null,
    loadRecords: (/* records */ js.UndefOr[Array], /* options */ js.UndefOr[js.Any]) => Callback = null,
    max: (/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    min: (/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    model: String = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    nextPage: /* options */ js.UndefOr[js.Any] => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    pageSize: Int | Double = null,
    prefetch: /* options */ js.UndefOr[js.Any] => Callback = null,
    prefetchPage: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => Callback = null,
    prefetchRange: (/* start */ js.UndefOr[js.Any], /* end */ js.UndefOr[js.Any]) => Callback = null,
    previousPage: /* options */ js.UndefOr[js.Any] => Callback = null,
    proxy: js.Any = null,
    purgePageCount: Int | Double = null,
    query: (/* property */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => CallbackTo[IMixedCollection] = null,
    queryBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IMixedCollection] = null,
    rejectChanges: js.UndefOr[Callback] = js.undefined,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[String]) => CallbackTo[js.Any] = null,
    reload: /* options */ js.UndefOr[js.Any] => Callback = null,
    remoteFilter: js.UndefOr[Boolean] = js.undefined,
    remoteGroup: js.UndefOr[Boolean] = js.undefined,
    remoteSort: js.UndefOr[Boolean] = js.undefined,
    remove: /* records */ js.UndefOr[js.Any] => Callback = null,
    removeAll: /* silent */ js.UndefOr[Boolean] => Callback = null,
    removeAt: (/* index */ js.UndefOr[Double], /* count */ js.UndefOr[Double]) => Callback = null,
    removeFilter: (/* toRemove */ js.UndefOr[js.Any], /* applyFilters */ js.UndefOr[Boolean]) => Callback = null,
    removeListener: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    removed: Array = null,
    requires: Array = null,
    resumeAutoSync: js.UndefOr[Callback] = js.undefined,
    resumeEvent: /* repeated */ js.Any => Callback = null,
    resumeEvents: js.UndefOr[Callback] = js.undefined,
    save: js.UndefOr[Callback] = js.undefined,
    self: IClass = null,
    setProxy: /* proxy */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.extjs.Ext.data.proxy.IProxy] = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    snapshot: IMixedCollection = null,
    sort: js.UndefOr[CallbackTo[Array]] = js.undefined,
    sortOnFilter: js.UndefOr[Boolean] = js.undefined,
    sortOnLoad: js.UndefOr[Boolean] = js.undefined,
    sortRoot: String = null,
    sorters: js.Any = null,
    statefulFilters: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    storeId: String = null,
    sum: (/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean]) => CallbackTo[Double] = null,
    suspendAutoSync: js.UndefOr[Callback] = js.undefined,
    suspendEvent: /* repeated */ js.Any => Callback = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Callback = null,
    sync: /* options */ js.UndefOr[js.Any] => CallbackTo[IStore] = null,
    trailingBufferZone: Int | Double = null,
    un: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null
  ): IStore = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1((t0: /* model */ js.UndefOr[js.Any]) => add(t0).runNow()))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addFilter != null) __obj.updateDynamic("addFilter")(js.Any.fromFunction2((t0: /* filters */ js.UndefOr[js.Any], t1: /* applyFilters */ js.UndefOr[scala.Boolean]) => addFilter(t0, t1).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addListener(t0, t1, t2, t3).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (addSorted != null) __obj.updateDynamic("addSorted")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IRecord]) => addSorted(t0).runNow()))
    if (aggregate != null) __obj.updateDynamic("aggregate")(js.Any.fromFunction4((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any], t2: /* grouped */ js.UndefOr[scala.Boolean], t3: /* args */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => aggregate(t0, t1, t2, t3).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy.asInstanceOf[js.Any])
    if (autoLoad != null) __obj.updateDynamic("autoLoad")(autoLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSync)) __obj.updateDynamic("autoSync")(autoSync.asInstanceOf[js.Any])
    if (average != null) __obj.updateDynamic("average")(js.Any.fromFunction2((t0: /* field */ js.UndefOr[java.lang.String], t1: /* grouped */ js.UndefOr[scala.Boolean]) => average(t0, t1).runNow()))
    if (batchUpdateMode != null) __obj.updateDynamic("batchUpdateMode")(batchUpdateMode.asInstanceOf[js.Any])
    if (!js.isUndefined(buffered)) __obj.updateDynamic("buffered")(buffered.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (clearFilter != null) __obj.updateDynamic("clearFilter")(js.Any.fromFunction1((t0: /* suppressEvent */ js.UndefOr[scala.Boolean]) => clearFilter(t0).runNow()))
    clearGrouping.foreach(p => __obj.updateDynamic("clearGrouping")(p.toJsFn))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    clearManagedListeners.foreach(p => __obj.updateDynamic("clearManagedListeners")(p.toJsFn))
    if (!js.isUndefined(clearOnPageLoad)) __obj.updateDynamic("clearOnPageLoad")(clearOnPageLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(clearRemovedOnLoad)) __obj.updateDynamic("clearRemovedOnLoad")(clearRemovedOnLoad.asInstanceOf[js.Any])
    if (collect != null) __obj.updateDynamic("collect")(js.Any.fromFunction3((t0: /* dataIndex */ js.UndefOr[java.lang.String], t1: /* allowNull */ js.UndefOr[scala.Boolean], t2: /* bypassFilter */ js.UndefOr[scala.Boolean]) => collect(t0, t1, t2).runNow()))
    commitChanges.foreach(p => __obj.updateDynamic("commitChanges")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(js.Any.fromFunction1((t0: /* grouped */ js.UndefOr[scala.Boolean]) => count(t0).runNow()))
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultProxyType != null) __obj.updateDynamic("defaultProxyType")(defaultProxyType.asInstanceOf[js.Any])
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection.asInstanceOf[js.Any])
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => each(t0, t1).runNow()))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2((t0: /* filters */ js.UndefOr[js.Any], t1: /* value */ js.UndefOr[java.lang.String]) => filter(t0, t1).runNow()))
    if (filterBy != null) __obj.updateDynamic("filterBy")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => filterBy(t0, t1).runNow()))
    if (!js.isUndefined(filterOnLoad)) __obj.updateDynamic("filterOnLoad")(filterOnLoad.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (find != null) __obj.updateDynamic("find")(js.Any.fromFunction6((t0: /* fieldName */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[js.Any], t2: /* startIndex */ js.UndefOr[scala.Double], t3: /* anyMatch */ js.UndefOr[scala.Boolean], t4: /* caseSensitive */ js.UndefOr[scala.Boolean], t5: /* exactMatch */ js.UndefOr[scala.Boolean]) => find(t0, t1, t2, t3, t4, t5).runNow()))
    if (findBy != null) __obj.updateDynamic("findBy")(js.Any.fromFunction3((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any], t2: /* startIndex */ js.UndefOr[scala.Double]) => findBy(t0, t1, t2).runNow()))
    if (findExact != null) __obj.updateDynamic("findExact")(js.Any.fromFunction3((t0: /* fieldName */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[js.Any], t2: /* startIndex */ js.UndefOr[scala.Double]) => findExact(t0, t1, t2).runNow()))
    if (findRecord != null) __obj.updateDynamic("findRecord")(js.Any.fromFunction6((t0: /* fieldName */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[js.Any], t2: /* startIndex */ js.UndefOr[scala.Double], t3: /* anyMatch */ js.UndefOr[scala.Boolean], t4: /* caseSensitive */ js.UndefOr[scala.Boolean], t5: /* exactMatch */ js.UndefOr[scala.Boolean]) => findRecord(t0, t1, t2, t3, t4, t5).runNow()))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => fireEventArgs(t0, t1).runNow()))
    if (first != null) __obj.updateDynamic("first")(js.Any.fromFunction1((t0: /* grouped */ js.UndefOr[scala.Boolean]) => first(t0).runNow()))
    generateComparator.foreach(p => __obj.updateDynamic("generateComparator")(p.toJsFn))
    if (getAt != null) __obj.updateDynamic("getAt")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => getAt(t0).runNow()))
    if (getById != null) __obj.updateDynamic("getById")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[js.Any]) => getById(t0).runNow()))
    getCount.foreach(p => __obj.updateDynamic("getCount")(p.toJsFn))
    getFirstSorter.foreach(p => __obj.updateDynamic("getFirstSorter")(p.toJsFn))
    if (getGroupString != null) __obj.updateDynamic("getGroupString")(js.Any.fromFunction1((t0: /* instance */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel]) => getGroupString(t0).runNow()))
    if (getGroups != null) __obj.updateDynamic("getGroups")(js.Any.fromFunction1((t0: /* groupName */ js.UndefOr[java.lang.String]) => getGroups(t0).runNow()))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getModifiedRecords.foreach(p => __obj.updateDynamic("getModifiedRecords")(p.toJsFn))
    getNewRecords.foreach(p => __obj.updateDynamic("getNewRecords")(p.toJsFn))
    if (getPageFromRecordIndex != null) __obj.updateDynamic("getPageFromRecordIndex")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => getPageFromRecordIndex(t0).runNow()))
    getProxy.foreach(p => __obj.updateDynamic("getProxy")(p.toJsFn))
    if (getRange != null) __obj.updateDynamic("getRange")(js.Any.fromFunction3((t0: /* start */ js.UndefOr[scala.Double], t1: /* end */ js.UndefOr[scala.Double], t2: /* options */ js.UndefOr[js.Any]) => getRange(t0, t1, t2).runNow()))
    getRemovedRecords.foreach(p => __obj.updateDynamic("getRemovedRecords")(p.toJsFn))
    getTotalCount.foreach(p => __obj.updateDynamic("getTotalCount")(p.toJsFn))
    getUpdatedRecords.foreach(p => __obj.updateDynamic("getUpdatedRecords")(p.toJsFn))
    if (group != null) __obj.updateDynamic("group")(js.Any.fromFunction2((t0: /* groupers */ js.UndefOr[js.Any], t1: /* direction */ js.UndefOr[java.lang.String]) => group(t0, t1).runNow()))
    if (groupDir != null) __obj.updateDynamic("groupDir")(groupDir.asInstanceOf[js.Any])
    if (groupField != null) __obj.updateDynamic("groupField")(groupField.asInstanceOf[js.Any])
    if (groupers != null) __obj.updateDynamic("groupers")(groupers.asInstanceOf[js.Any])
    if (guaranteeRange != null) __obj.updateDynamic("guaranteeRange")(js.Any.fromFunction5((t0: /* start */ js.UndefOr[js.Any], t1: /* end */ js.UndefOr[js.Any], t2: /* callback */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => guaranteeRange(t0, t1, t2, t3, t4).runNow()))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel]) => indexOf(t0).runNow()))
    if (indexOfId != null) __obj.updateDynamic("indexOfId")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[java.lang.String]) => indexOfId(t0).runNow()))
    if (indexOfTotal != null) __obj.updateDynamic("indexOfTotal")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel]) => indexOfTotal(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    initSortable.foreach(p => __obj.updateDynamic("initSortable")(p.toJsFn))
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: /* index */ js.UndefOr[scala.Double], t1: /* records */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => insert(t0, t1).runNow()))
    if (!js.isUndefined(isDestroyed)) __obj.updateDynamic("isDestroyed")(isDestroyed.asInstanceOf[js.Any])
    isFiltered.foreach(p => __obj.updateDynamic("isFiltered")(p.toJsFn))
    isGrouped.foreach(p => __obj.updateDynamic("isGrouped")(p.toJsFn))
    isLoading.foreach(p => __obj.updateDynamic("isLoading")(p.toJsFn))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.asInstanceOf[js.Any])
    if (!js.isUndefined(isSortable)) __obj.updateDynamic("isSortable")(isSortable.asInstanceOf[js.Any])
    if (!js.isUndefined(isStore)) __obj.updateDynamic("isStore")(isStore.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(js.Any.fromFunction1((t0: /* grouped */ js.UndefOr[scala.Boolean]) => last(t0).runNow()))
    if (leadingBufferZone != null) __obj.updateDynamic("leadingBufferZone")(leadingBufferZone.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => load(t0).runNow()))
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction2((t0: /* data */ js.UndefOr[js.Any], t1: /* append */ js.UndefOr[scala.Boolean]) => loadData(t0, t1).runNow()))
    if (loadPage != null) __obj.updateDynamic("loadPage")(js.Any.fromFunction2((t0: /* page */ js.UndefOr[scala.Double], t1: /* options */ js.UndefOr[js.Any]) => loadPage(t0, t1).runNow()))
    if (loadRawData != null) __obj.updateDynamic("loadRawData")(js.Any.fromFunction2((t0: /* data */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t1: /* append */ js.UndefOr[scala.Boolean]) => loadRawData(t0, t1).runNow()))
    if (loadRecords != null) __obj.updateDynamic("loadRecords")(js.Any.fromFunction2((t0: /* records */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t1: /* options */ js.UndefOr[js.Any]) => loadRecords(t0, t1).runNow()))
    if (max != null) __obj.updateDynamic("max")(js.Any.fromFunction2((t0: /* field */ js.UndefOr[java.lang.String], t1: /* grouped */ js.UndefOr[scala.Boolean]) => max(t0, t1).runNow()))
    if (min != null) __obj.updateDynamic("min")(js.Any.fromFunction2((t0: /* field */ js.UndefOr[java.lang.String], t1: /* grouped */ js.UndefOr[scala.Boolean]) => min(t0, t1).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (nextPage != null) __obj.updateDynamic("nextPage")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => nextPage(t0).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => on(t0, t1, t2, t3).runNow()))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (prefetch != null) __obj.updateDynamic("prefetch")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => prefetch(t0).runNow()))
    if (prefetchPage != null) __obj.updateDynamic("prefetchPage")(js.Any.fromFunction2((t0: /* page */ js.UndefOr[scala.Double], t1: /* options */ js.UndefOr[js.Any]) => prefetchPage(t0, t1).runNow()))
    if (prefetchRange != null) __obj.updateDynamic("prefetchRange")(js.Any.fromFunction2((t0: /* start */ js.UndefOr[js.Any], t1: /* end */ js.UndefOr[js.Any]) => prefetchRange(t0, t1).runNow()))
    if (previousPage != null) __obj.updateDynamic("previousPage")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => previousPage(t0).runNow()))
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (purgePageCount != null) __obj.updateDynamic("purgePageCount")(purgePageCount.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction5((t0: /* property */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[js.Any], t2: /* anyMatch */ js.UndefOr[scala.Boolean], t3: /* caseSensitive */ js.UndefOr[scala.Boolean], t4: /* exactMatch */ js.UndefOr[scala.Boolean]) => query(t0, t1, t2, t3, t4).runNow()))
    if (queryBy != null) __obj.updateDynamic("queryBy")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => queryBy(t0, t1).runNow()))
    rejectChanges.foreach(p => __obj.updateDynamic("rejectChanges")(p.toJsFn))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3((t0: /* origin */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t2: /* prefix */ js.UndefOr[java.lang.String]) => relayEvents(t0, t1, t2).runNow()))
    if (reload != null) __obj.updateDynamic("reload")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => reload(t0).runNow()))
    if (!js.isUndefined(remoteFilter)) __obj.updateDynamic("remoteFilter")(remoteFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteGroup)) __obj.updateDynamic("remoteGroup")(remoteGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteSort)) __obj.updateDynamic("remoteSort")(remoteSort.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: /* records */ js.UndefOr[js.Any]) => remove(t0).runNow()))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction1((t0: /* silent */ js.UndefOr[scala.Boolean]) => removeAll(t0).runNow()))
    if (removeAt != null) __obj.updateDynamic("removeAt")(js.Any.fromFunction2((t0: /* index */ js.UndefOr[scala.Double], t1: /* count */ js.UndefOr[scala.Double]) => removeAt(t0, t1).runNow()))
    if (removeFilter != null) __obj.updateDynamic("removeFilter")(js.Any.fromFunction2((t0: /* toRemove */ js.UndefOr[js.Any], t1: /* applyFilters */ js.UndefOr[scala.Boolean]) => removeFilter(t0, t1).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => removeListener(t0, t1, t2).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    resumeAutoSync.foreach(p => __obj.updateDynamic("resumeAutoSync")(p.toJsFn))
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => resumeEvent(t0).runNow()))
    resumeEvents.foreach(p => __obj.updateDynamic("resumeEvents")(p.toJsFn))
    save.foreach(p => __obj.updateDynamic("save")(p.toJsFn))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setProxy != null) __obj.updateDynamic("setProxy")(js.Any.fromFunction1((t0: /* proxy */ js.UndefOr[js.Any]) => setProxy(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    sort.foreach(p => __obj.updateDynamic("sort")(p.toJsFn))
    if (!js.isUndefined(sortOnFilter)) __obj.updateDynamic("sortOnFilter")(sortOnFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(sortOnLoad)) __obj.updateDynamic("sortOnLoad")(sortOnLoad.asInstanceOf[js.Any])
    if (sortRoot != null) __obj.updateDynamic("sortRoot")(sortRoot.asInstanceOf[js.Any])
    if (sorters != null) __obj.updateDynamic("sorters")(sorters.asInstanceOf[js.Any])
    if (!js.isUndefined(statefulFilters)) __obj.updateDynamic("statefulFilters")(statefulFilters.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (storeId != null) __obj.updateDynamic("storeId")(storeId.asInstanceOf[js.Any])
    if (sum != null) __obj.updateDynamic("sum")(js.Any.fromFunction2((t0: /* field */ js.UndefOr[java.lang.String], t1: /* grouped */ js.UndefOr[scala.Boolean]) => sum(t0, t1).runNow()))
    suspendAutoSync.foreach(p => __obj.updateDynamic("suspendAutoSync")(p.toJsFn))
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => suspendEvent(t0).runNow()))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1((t0: /* queueSuspended */ js.UndefOr[scala.Boolean]) => suspendEvents(t0).runNow()))
    if (sync != null) __obj.updateDynamic("sync")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => sync(t0).runNow()))
    if (trailingBufferZone != null) __obj.updateDynamic("trailingBufferZone")(trailingBufferZone.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => un(t0, t1, t2).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStore]
  }
}

