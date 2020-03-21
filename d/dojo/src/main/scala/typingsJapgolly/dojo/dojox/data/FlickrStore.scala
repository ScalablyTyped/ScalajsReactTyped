package typingsJapgolly.dojo.dojox.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/FlickrStore.html
  *
  *
  * @param args
  */
@JSGlobal("dojox.data.FlickrStore")
@js.native
class FlickrStore protected () extends js.Object {
  def this(args: js.Object) = this()
  /**
    *
    */
  var label: String = js.native
  /**
    *
    */
  var urlPreventCache: Boolean = js.native
  /**
    *
    */
  var urlRegistry: js.Object = js.native
  /**
    * See dojo/data/api/Read.close()
    *
    * @param request
    */
  def close(request: js.Any): Unit = js.native
  /**
    * See dojo/data/api/Read.containsValue()
    *
    * @param item
    * @param attribute
    * @param value
    */
  def containsValue(item: js.Any, attribute: js.Any, value: js.Any): Boolean = js.native
  /**
    * The error handler when there is an error fetching items.  This function should not be called
    * directly and is used by simpleFetch.fetch().
    *
    * @param errorData
    * @param requestObject
    */
  def errorHandler(errorData: js.Object, requestObject: js.Object): Unit = js.native
  /**
    * The simpleFetch mixin is designed to serve as a set of function(s) that can
    * be mixed into other datastore implementations to accelerate their development.
    * The simpleFetch mixin should work well for any datastore that can respond to a _fetchItems()
    * call by returning an array of all the found items that matched the query.  The simpleFetch mixin
    * is not designed to work for datastores that respond to a fetch() call by incrementally
    * loading items, or sequentially loading partial batches of the result
    * set.  For datastores that mixin simpleFetch, simpleFetch
    * implements a fetch method that automatically handles eight of the fetch()
    * arguments -- onBegin, onItem, onComplete, onError, start, count, sort and scope
    * The class mixing in simpleFetch should not implement fetch(),
    * but should instead implement a _fetchItems() method.  The _fetchItems()
    * method takes three arguments, the keywordArgs object that was passed
    * to fetch(), a callback function to be called when the result array is
    * available, and an error callback to be called if something goes wrong.
    * The _fetchItems() method should ignore any keywordArgs parameters for
    * start, count, onBegin, onItem, onComplete, onError, sort, and scope.
    * The _fetchItems() method needs to correctly handle any other keywordArgs
    * parameters, including the query parameter and any optional parameters
    * (such as includeChildren).  The _fetchItems() method should create an array of
    * result items and pass it to the fetchHandler along with the original request object --
    * or, the _fetchItems() method may, if it wants to, create an new request object
    * with other specifics about the request that are specific to the datastore and pass
    * that as the request object to the handler.
    *
    * For more information on this specific function, see dojo/data/api/Read.fetch()
    *
    * @param request               OptionalThe keywordArgs parameter may either be an instance ofconforming to dojo/data/api/Request or may be a simple anonymous objectthat may contain any of the following:{    query: query-object or query-string,    queryOptions: object,    onBegin: Function,    onItem: Function,    onComplete: Function,    onError: Function,    scope: object,    start: int    count: int    sort: array}All implementations should accept keywordArgs objects with any ofthe 9 standard properties: query, onBegin, onItem, onComplete, onErrorscope, sort, start, and count.  Some implementations may accept additionalproperties in the keywordArgs object as valid parameters, such as{includeOutliers:true}.The query parameterThe query may be optional in some data store implementations.The dojo/data/api/Read API does not specify the syntax or semanticsof the query itself -- each different data store implementationmay have its own notion of what a query should look like.However, as of dojo 0.9, 1.0, and 1.1, all the provided datastores in dojo.dataand dojox.data support an object structure query, where the object is a set ofname/value parameters such as { attrFoo: valueBar, attrFoo1: valueBar1}.  Most of thedijit widgets, such as ComboBox assume this to be the case when working with a datastorewhen they dynamically update the query.  Therefore, for maximum compatibility with dijitwidgets the recommended query parameter is a key/value object.  That does not mean that thethe datastore may not take alternative query forms, such as a simple string, a Date, a number,or a mix of such.  Ultimately, The dojo/data/api/Read API is agnostic about what the queryformat.Further note:  In general for query objects that accept strings as attributevalue matches, the store should also support basic filtering capability, such as (match any character) and ? (match single character).  An example query that is a query objectwould be like: { attrFoo: "value"}.  Which generally means match all items where they havean attribute named attrFoo, with a value that starts with 'value'.The queryOptions parameterThe queryOptions parameter is an optional parameter used to specify options that may modifythe query in some fashion, such as doing a case insensitive search, or doing a deep searchwhere all items in a hierarchical representation of data are scanned instead of just the rootitems.  It currently defines two options that all datastores should attempt to honor if possible:{    ignoreCase: boolean, // Whether or not the query should match case sensitively or not.  Default behaviour is false.    deep: boolean   // Whether or not a fetch should do a deep search of items and all child                    // items instead of just root-level items in a datastore.  Default is false.}The onBegin parameter.function(size, request);If an onBegin callback function is provided, the callback functionwill be called just once, before the first onItem callback is called.The onBegin callback function will be passed two arguments, thethe total number of items identified and the Request object.  If the total number isunknown, then size will be -1.  Note that size is not necessarily the size of thecollection of items returned from the query, as the request may have specified to return only asubset of the total set of items through the use of the start and count parameters.The onItem parameter.function(item, request);If an onItem callback function is provided, the callback functionwill be called as each item in the result is received. The callbackfunction will be passed two arguments: the item itself, and theRequest object.The onComplete parameter.function(items, request);If an onComplete callback function is provided, the callback functionwill be called just once, after the last onItem callback is called.Note that if the onItem callback is not present, then onComplete will be passedan array containing all items which matched the query and the request object.If the onItem callback is present, then onComplete is called as:onComplete(null, request).The onError parameter.function(errorData, request);If an onError callback function is provided, the callback functionwill be called if there is any sort of error while attempting toexecute the query.The onError callback function will be passed two arguments:an Error object and the Request object.The scope parameter.If a scope object is provided, all of the callback functions (onItem,onComplete, onError, etc) will be invoked in the context of the scopeobject.  In the body of the callback function, the value of the "this"keyword will be the scope object.   If no scope object is provided,the callback functions will be called in the context of dojo.global().For example, onItem.call(scope, item, request) vs.onItem.call(dojo.global(), item, request)The start parameter.If a start parameter is specified, this is a indication to the datastore toonly start returning items once the start number of items have been located andskipped.  When this parameter is paired with 'count', the store should be ableto page across queries with millions of hits by only returning subsets of thehits for each queryThe count parameter.If a count parameter is specified, this is a indication to the datastore toonly return up to that many items.  This allows a fetch call that may havemillions of item matches to be paired down to something reasonable.The sort parameter.If a sort parameter is specified, this is a indication to the datastore tosort the items in some manner before returning the items.  The array is an array ofjavascript objects that must conform to the following format to be applied to thefetching of items:{    attribute: attribute || attribute-name-string,    descending: true|false;   // Optional.  Default is false.}Note that when comparing attributes, if an item contains no value for the attribute(undefined), then it the default ascending sort logic should push it to the bottomof the list.  In the descending order case, it such items should appear at the top of the list.
    */
  def fetch(request: js.Object): Unit = js.native
  /**
    * The handler when items are sucessfully fetched.  This function should not be called directly
    * and is used by simpleFetch.fetch().
    *
    * @param items
    * @param requestObject
    */
  def fetchHandler(items: js.Array[_], requestObject: js.Object): Unit = js.native
  /**
    * See dojo/data/api/Read.getAttributes()
    *
    * @param item
    */
  def getAttributes(item: js.Any): js.Array[_] = js.native
  /**
    * See dojo/data/api/Read.getFeatures()
    *
    */
  def getFeatures(): js.Object = js.native
  /**
    * See dojo/data/api/Read.getLabel()
    *
    * @param item
    */
  def getLabel(item: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.getLabelAttributes()
    *
    * @param item
    */
  def getLabelAttributes(item: js.Any): js.Array[_] = js.native
  /**
    * See dojo/data/api/Read.getValue()
    *
    * @param item
    * @param attribute
    * @param defaultValue
    */
  def getValue(item: js.Any, attribute: js.Any, defaultValue: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.getValue()
    *
    * @param item
    * @param attribute
    */
  def getValues(item: js.Any, attribute: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.hasAttributes()
    *
    * @param item
    * @param attribute
    */
  def hasAttribute(item: js.Any, attribute: js.Any): Boolean = js.native
  /**
    * See dojo/data/api/Read.isItem()
    *
    * @param item
    */
  def isItem(item: js.Any): Boolean = js.native
  /**
    * See dojo/data/api/Read.isItemLoaded()
    *
    * @param item
    */
  def isItemLoaded(item: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.loadItem()
    *
    * @param keywordArgs
    */
  def loadItem(keywordArgs: js.Any): Unit = js.native
}

