package typingsJapgolly.winrtUwp.Windows.Web.Http.Headers

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a collection of the HTTP headers associated with an HTTP response. */
trait HttpResponseHeaderCollection extends StObject {
  
  /** Gets or sets the TimeSpan object that represents the value of an Age HTTP header on an HTTP response. */
  var age: Double
  
  /** Gets the HttpMethodHeaderValueCollection of HttpMethod objects that represent the value of an Allow HTTP header on an HTTP response. */
  var allow: HttpMethodHeaderValueCollection
  
  /**
    * Adds a new item to the end of the HttpResponseHeaderCollection .
    * @param name The name of the value to add.
    * @param value The item value to add.
    */
  def append(name: String, value: String): Unit
  
  /** Gets the HttpCacheDirectiveHeaderValueCollection of objects that represent the value of a Cache-Control HTTP header on an HTTP response. */
  var cacheControl: HttpCacheDirectiveHeaderValueCollection
  
  /** Removes all objects from the collection. */
  def clear(): Unit
  
  /** Gets the HttpConnectionOptionHeaderValueCollection of HttpConnectionOptionHeaderValue objects that represent the value of a Connection HTTP header on an HTTP response. */
  var connection: HttpConnectionOptionHeaderValueCollection
  
  /** Gets or sets the DateTime object that represents the value of a Date HTTP header on an HTTP response. */
  var date: js.Date
  
  /**
    * Retrieves an iterator to the first item in the HttpResponseHeaderCollection .
    * @return An object that can be used to enumerate the items in the collection. The iterator points to the first item in the HttpResponseHeaderCollection .
    */
  def first(): IIterator[IKeyValuePair[Any, Any]]
  
  /**
    * Returns an immutable view of the HttpResponseHeaderCollection .
    * @return The view of the HttpResponseHeaderCollection .
    */
  def getView(): IMapView[String, String]
  
  /**
    * Determines whether the HttpResponseHeaderCollection contains the specified key.
    * @param key The key associated with the item to locate.
    * @return true if the key is found; otherwise, false.
    */
  def hasKey(key: String): Boolean
  
  /**
    * Inserts or replaces an item in the HttpResponseHeaderCollection with the specified key and value.
    * @param key The key of the item to be inserted.
    * @param value The value of the item to insert.
    * @return true if an item with the specified key is an existing item that was replaced; otherwise false.
    */
  def insert(key: String, value: String): Boolean
  
  /** Gets or sets the Uri that represents the value or a Location HTTP header on an HTTP response. */
  var location: Uri
  
  /**
    * Lookup an item in the HttpResponseHeaderCollection .
    * @param key The key of the item to lookup.
    * @return The value of the item if found.
    */
  def lookup(key: String): String
  
  /** Gets the HttpChallengeHeaderValueCollection of HttpChallengeHeaderValue objects that represent the value of a Proxy-Authenticate HTTP header on an HTTP response. */
  var proxyAuthenticate: HttpChallengeHeaderValueCollection
  
  /**
    * Removes an item with a given key from the HttpResponseHeaderCollection .
    * @param key Key of the item to be removed.
    */
  def remove(key: String): Unit
  
  /** Gets or sets the HttpDateOrDeltaHeaderValue object that represent the value of a Retry-After HTTP header on an HTTP response. */
  var retryAfter: HttpDateOrDeltaHeaderValue
  
  /** Gets the number of objects in the HttpResponseHeaderCollection . */
  var size: Double
  
  /** Gets the HttpTransferCodingHeaderValueCollection of HttpTransferCodingHeaderValue objects that represent the value of a Transfer-Encoding HTTP header on an HTTP response. */
  var transferEncoding: HttpTransferCodingHeaderValueCollection
  
  /**
    * Try to append the specified item to the HttpResponseHeaderCollection without validation.
    * @param name The name of the item to append.
    * @param value The value of the item to append.
    * @return true if the item was appended; otherwise false.
    */
  def tryAppendWithoutValidation(name: String, value: String): Boolean
  
  /** Gets the HttpChallengeHeaderValueCollection of HttpChallengeHeaderValue objects that represent the value of a WWW-Authenticate HTTP header on an HTTP response. */
  var wwwAuthenticate: HttpChallengeHeaderValueCollection
}
object HttpResponseHeaderCollection {
  
  inline def apply(
    age: Double,
    allow: HttpMethodHeaderValueCollection,
    append: (String, String) => Callback,
    cacheControl: HttpCacheDirectiveHeaderValueCollection,
    clear: Callback,
    connection: HttpConnectionOptionHeaderValueCollection,
    date: js.Date,
    first: CallbackTo[IIterator[IKeyValuePair[Any, Any]]],
    getView: CallbackTo[IMapView[String, String]],
    hasKey: String => Boolean,
    insert: (String, String) => Boolean,
    location: Uri,
    lookup: String => String,
    proxyAuthenticate: HttpChallengeHeaderValueCollection,
    remove: String => Callback,
    retryAfter: HttpDateOrDeltaHeaderValue,
    size: Double,
    transferEncoding: HttpTransferCodingHeaderValueCollection,
    tryAppendWithoutValidation: (String, String) => Boolean,
    wwwAuthenticate: HttpChallengeHeaderValueCollection
  ): HttpResponseHeaderCollection = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], allow = allow.asInstanceOf[js.Any], append = js.Any.fromFunction2((t0: String, t1: String) => (append(t0, t1)).runNow()), cacheControl = cacheControl.asInstanceOf[js.Any], clear = clear.toJsFn, connection = connection.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], first = first.toJsFn, getView = getView.toJsFn, hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), location = location.asInstanceOf[js.Any], lookup = js.Any.fromFunction1(lookup), proxyAuthenticate = proxyAuthenticate.asInstanceOf[js.Any], remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()), retryAfter = retryAfter.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], transferEncoding = transferEncoding.asInstanceOf[js.Any], tryAppendWithoutValidation = js.Any.fromFunction2(tryAppendWithoutValidation), wwwAuthenticate = wwwAuthenticate.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponseHeaderCollection]
  }
  
  extension [Self <: HttpResponseHeaderCollection](x: Self) {
    
    inline def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setAllow(value: HttpMethodHeaderValueCollection): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setAppend(value: (String, String) => Callback): Self = StObject.set(x, "append", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setCacheControl(value: HttpCacheDirectiveHeaderValueCollection): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setConnection(value: HttpConnectionOptionHeaderValueCollection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setFirst(value: CallbackTo[IIterator[IKeyValuePair[Any, Any]]]): Self = StObject.set(x, "first", value.toJsFn)
    
    inline def setGetView(value: CallbackTo[IMapView[String, String]]): Self = StObject.set(x, "getView", value.toJsFn)
    
    inline def setHasKey(value: String => Boolean): Self = StObject.set(x, "hasKey", js.Any.fromFunction1(value))
    
    inline def setInsert(value: (String, String) => Boolean): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    inline def setLocation(value: Uri): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLookup(value: String => String): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
    
    inline def setProxyAuthenticate(value: HttpChallengeHeaderValueCollection): Self = StObject.set(x, "proxyAuthenticate", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRetryAfter(value: HttpDateOrDeltaHeaderValue): Self = StObject.set(x, "retryAfter", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTransferEncoding(value: HttpTransferCodingHeaderValueCollection): Self = StObject.set(x, "transferEncoding", value.asInstanceOf[js.Any])
    
    inline def setTryAppendWithoutValidation(value: (String, String) => Boolean): Self = StObject.set(x, "tryAppendWithoutValidation", js.Any.fromFunction2(value))
    
    inline def setWwwAuthenticate(value: HttpChallengeHeaderValueCollection): Self = StObject.set(x, "wwwAuthenticate", value.asInstanceOf[js.Any])
  }
}
