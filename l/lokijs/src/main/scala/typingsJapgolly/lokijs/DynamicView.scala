package typingsJapgolly.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DynamicView class is a versatile 'live' view class which can have filters and sorts applied.
  *    Collection.addDynamicView(name) instantiates this DynamicView object and notifies it
  *    whenever documents are add/updated/removed so it can remain up-to-date. (chainable)
  *
  * @example
  * var mydv = mycollection.addDynamicView('test');  // default is non-persistent
  * mydv.applyFind({ 'doors' : 4 });
  * mydv.applyWhere(function(obj) { return obj.name === 'Toyota'; });
  * var results = mydv.data();
  *
  * @implements LokiEventEmitter
  */
@JSGlobal("DynamicView")
@js.native
class DynamicView[E /* <: js.Object */] protected () extends LokiEventEmitter {
  /**
    * @param collection - A reference to the collection to work against
    * @param name - The name of this dynamic view
    * @param [options] - (Optional) Pass in object with 'persistent' and/or 'sortPriority' options.
    * @param [options.persistent=false] - indicates if view is to main internal results array in 'resultdata'
    * @param [options.sortPriority='passive'] - 'passive' (sorts performed on call to data) or 'active' (after updates)
    * @param [options.minRebuildInterval] - minimum rebuild interval (need clarification to docs here)
    * @see {@link Collection#addDynamicView} to construct instances of DynamicView
    */
  def this(collection: Collection[E], name: String) = this()
  def this(collection: Collection[E], name: String, options: PartialDynamicViewOptions) = this()
  var cachedresultset: Resultset[E] | Null = js.native
  var collection: Collection[E] = js.native
  var filterPipeline: js.Array[AnonType] = js.native
  var name: String = js.native
  var options: PartialDynamicViewOptions = js.native
  var rebuildPending: Boolean = js.native
  var resultdata: js.Array[E with LokiObj] = js.native
  var resultsdirty: Boolean = js.native
  var resultset: Resultset[E] = js.native
  var sortCriteria: (js.Array[js.Tuple2[String, Boolean]]) | Null = js.native
  var sortDirty: Boolean = js.native
  var sortFunction: (js.Function2[/* a */ E with LokiObj, /* b */ E with LokiObj, Double]) | Null = js.native
  /**
    * Implementation detail.
    * _addFilter() - Add the filter object to the end of view's filter pipeline and apply the filter to the resultset.
    *
    * @param filter - The filter object. Refer to applyFilter() for extra details.
    */
  def _addFilter(filter: AnonType): Unit = js.native
  /**
    * Implementation detail.
    * _indexOfFilterWithId() - Find the index of a filter in the pipeline, by that filter's ID.
    *
    * @param [uid] - The unique ID of the filter.
    * @returns index of the referenced filter in the pipeline; -1 if not found.
    */
  def _indexOfFilterWithId(): Double = js.native
  def _indexOfFilterWithId(uid: String): Double = js.native
  def _indexOfFilterWithId(uid: Double): Double = js.native
  /**
    * applyFilter() - Adds or updates a filter in the DynamicView filter pipeline
    *
    * @param filter - A filter object to add to the pipeline.
    *    The object is in the format { 'type': filter_type, 'val', filter_param, 'uid', optional_filter_id }
    * @returns this DynamicView object, for further chain ops.
    */
  def applyFilter(filter: AnonType): this.type = js.native
  /**
    * applyFind() - Adds or updates a mongo-style query option in the DynamicView filter pipeline
    *
    * @param query - A mongo-style query object to apply to pipeline
    * @param [uid] - Optional: The unique ID of this filter, to reference it in the future.
    * @returns this DynamicView object, for further chain ops.
    */
  def applyFind(query: js.Any): this.type = js.native
  def applyFind(query: js.Any, uid: String): this.type = js.native
  def applyFind(query: js.Any, uid: Double): this.type = js.native
  /**
    * applySimpleSort() - Used to specify a property used for view translation.
    * @example
    * dv.applySimpleSort("name");
    *
    * @param propname - Name of property by which to sort.
    * @param [options] - boolean for sort descending or options object
    * @param [options.desc] - whether we should sort descending.
    * @param [options.disableIndexIntersect] - whether we should explicity not use array intersection.
    * @param [options.forceIndexIntersect] - force array intersection (if binary index exists).
    * @param [options.useJavascriptSorting] - whether results are sorted via basic javascript sort.
    * @returns this DynamicView object, for further chain ops.
    */
  def applySimpleSort(propname: String): this.type = js.native
  def applySimpleSort(propname: String, options: Boolean): this.type = js.native
  def applySimpleSort(propname: String, options: PartialSimplesortOptions): this.type = js.native
  /**
    * applySort() - Used to apply a sort to the dynamic view
    * @example
    * dv.applySort(function(obj1, obj2) {
    *   if (obj1.name === obj2.name) return 0;
    *   if (obj1.name > obj2.name) return 1;
    *   if (obj1.name < obj2.name) return -1;
    * });
    *
    * @param comparefun - a javascript compare function used for sorting
    * @returns this DynamicView object, for further chain ops.
    */
  def applySort(comparefun: js.Function2[/* a */ E with LokiObj, /* b */ E with LokiObj, Double]): this.type = js.native
  /**
    * applySortCriteria() - Allows sorting a resultset based on multiple columns.
    * @example
    * // to sort by age and then name (both ascending)
    * dv.applySortCriteria(['age', 'name']);
    * // to sort by age (ascending) and then by name (descending)
    * dv.applySortCriteria(['age', ['name', true]);
    * // to sort by age (descending) and then by name (descending)
    * dv.applySortCriteria(['age', true], ['name', true]);
    *
    * @param criteria - array of property names or subarray of [propertyname, isdesc] used evaluate sort order
    * @returns Reference to this DynamicView, sorted, for future chain operations.
    */
  def applySortCriteria(criteria: js.Array[js.Tuple2[String, Boolean]]): this.type = js.native
  /**
    * applyWhere() - Adds or updates a javascript filter function in the DynamicView filter pipeline
    *
    * @param fun - A javascript filter function to apply to pipeline
    * @param [uid] - Optional: The unique ID of this filter, to reference it in the future.
    * @returns this DynamicView object, for further chain ops.
    */
  def applyWhere(fun: js.Function1[/* obj */ js.Any, Boolean]): this.type = js.native
  def applyWhere(fun: js.Function1[/* obj */ js.Any, Boolean], uid: String): this.type = js.native
  def applyWhere(fun: js.Function1[/* obj */ js.Any, Boolean], uid: Double): this.type = js.native
  /**
    * branchResultset() - Makes a copy of the internal resultset for branched queries.
    *    Unlike this dynamic view, the branched resultset will not be 'live' updated,
    *    so your branched query should be immediately resolved and not held for future evaluation.
    *
    * @param transform - Optional name of collection transform, or an array of transform steps
    * @param [parameters] - optional parameters (if optional transform requires them)
    * @returns A copy of the internal resultset for branched queries.
    */
  def branchResultset(): Resultset[_] = js.native
  def branchResultset(transform: String): Resultset[_] = js.native
  def branchResultset(transform: String, parameters: js.Object): Resultset[_] = js.native
  def branchResultset(transform: js.Array[String | Transform]): Resultset[_] = js.native
  def branchResultset(transform: js.Array[String | Transform], parameters: js.Object): Resultset[_] = js.native
  /**
    * commit() - commits a transaction.
    *
    * @returns this DynamicView object, for further chain ops.
    */
  def commit(): this.type = js.native
  /**
    * count() - returns the number of documents representing the current DynamicView contents.
    *
    * @returns The number of documents representing the current DynamicView contents.
    */
  def count(): Double = js.native
  /**
    * data() - resolves and pending filtering and sorting, then returns document array as result.
    *
    * @param [options] - optional parameters to pass to resultset.data() if non-persistent
    * @param [options.forceClones] - Allows forcing the return of cloned objects even when
    *        the collection is not configured for clone object.
    * @param [options.forceCloneMethod] - Allows overriding the default or collection specified cloning method.
    *        Possible values include 'parse-stringify', 'jquery-extend-deep', 'shallow', 'shallow-assign'
    * @param [options.removeMeta] - Will force clones and strip $loki and meta properties from documents
    * @returns An array of documents representing the current DynamicView contents.
    */
  def data(): js.Array[E with LokiObj] = js.native
  def data(options: PartialGetDataOptions): js.Array[E with LokiObj] = js.native
  def evaluateDocument(objIndex: String): Unit = js.native
  def evaluateDocument(objIndex: String, isNew: Boolean): Unit = js.native
  /**
    * evaluateDocument() - internal method for (re)evaluating document inclusion.
    *    Called by : collection.insert() and collection.update().
    *
    * @param objIndex - index of document to (re)run through filter pipeline.
    * @param [isNew] - true if the document was just added to the collection.
    */
  def evaluateDocument(objIndex: Double): Unit = js.native
  def evaluateDocument(objIndex: Double, isNew: Boolean): Unit = js.native
  /**
    * mapReduce() - data transformation via user supplied functions
    *
    * @param mapFunction - this function accepts a single document for you to transform and return
    * @param reduceFunction - this function accepts many (array of map outputs) and returns single value
    * @returns The output of your reduceFunction
    */
  def mapReduce[U, R](
    mapFunction: js.Function3[/* value */ E, /* index */ Double, /* array */ js.Array[E], U],
    reduceFunction: js.Function1[/* ary */ js.Array[U], R]
  ): R = js.native
  /**
    * performSortPhase() - invoked synchronously or asynchronously to perform final sort phase (if needed)
    */
  def performSortPhase(): Unit = js.native
  def performSortPhase(options: AnonPersistent): Unit = js.native
  /**
    * queueRebuildEvent() - When the view is not sorted we may still wish to be notified of rebuild events.
    *     This event will throttle and queue a single rebuild event when batches of updates affect the view.
    */
  def queueRebuildEvent(): Unit = js.native
  /**
    * queueSortPhase : If the view is sorted we will throttle sorting to either :
    *    (1) passive - when the user calls data(), or
    *    (2) active - once they stop updating and yield js thread control
    */
  def queueSortPhase(): Unit = js.native
  /**
    * reapplyFilters() - Reapply all the filters in the current pipeline.
    *
    * @returns this DynamicView object, for further chain ops.
    */
  def reapplyFilters(): this.type = js.native
  /**
    * rematerialize() - internally used immediately after deserialization (loading)
    *    This will clear out and reapply filterPipeline ops, recreating the view.
    *    Since where filters do not persist correctly, this method allows
    *    restoring the view to state where user can re-apply those where filters.
    *
    * @param [options] - (Optional) allows specification of 'removeWhereFilters' option
    * @returns This dynamic view for further chained ops.
    * @fires DynamicView.rebuild
    */
  def rematerialize(): this.type = js.native
  def rematerialize(options: AnonRemoveWhereFilters): this.type = js.native
  def removeDocument(objIndex: String): Unit = js.native
  /**
    * removeDocument() - internal function called on collection.delete()
    */
  def removeDocument(objIndex: Double): Unit = js.native
  /**
    * removeFilter() - Remove the specified filter from the DynamicView filter pipeline
    *
    * @param uid - The unique ID of the filter to be removed.
    * @returns this DynamicView object, for further chain ops.
    */
  def removeFilter(uid: String): this.type = js.native
  def removeFilter(uid: Double): this.type = js.native
  /**
    * removeFilters() - Used to clear pipeline and reset dynamic view to initial state.
    *     Existing options should be retained.
    * @param [options] - configure removeFilter behavior
    * @param [options.queueSortPhase] - (default: false) if true we will async rebuild view (maybe set default to true in future?)
    */
  def removeFilters(): Unit = js.native
  def removeFilters(options: AnonQueueSortPhase): Unit = js.native
  /**
    * rollback() - rolls back a transaction.
    *
    * @returns this DynamicView object, for further chain ops.
    */
  def rollback(): this.type = js.native
  /**
    * startTransaction() - marks the beginning of a transaction.
    *
    * @returns this DynamicView object, for further chain ops.
    */
  def startTransaction(): this.type = js.native
  /**
    * toJSON() - Override of toJSON to avoid circular references
    */
  def toJSON(): DynamicView[E] = js.native
}

