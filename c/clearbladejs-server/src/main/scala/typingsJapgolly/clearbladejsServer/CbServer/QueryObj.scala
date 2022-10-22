package typingsJapgolly.clearbladejsServer.CbServer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryObj extends StObject {
  
  var OR: js.Array[Query]
  
  var URI: String
  
  def ascending(field: String): Unit
  
  def columns(columnsArray: js.Array[String]): Unit
  
  def descending(field: String): Unit
  
  def equalTo(field: String, value: QueryValue): Unit
  
  def fetch(callback: CbCallback): Unit
  
  def greaterThan(field: String, value: QueryValue): Unit
  
  def greaterThanEqualTo(field: String, value: QueryValue): Unit
  
  var id: String
  
  def lessThan(field: String, value: QueryValue): Unit
  
  def lessThanEqualTo(field: String, value: QueryValue): Unit
  
  var limit: Double
  
  def matches(field: String, pattern: QueryValue): Unit
  
  def notEqualTo(field: String, value: QueryValue): Unit
  
  var offset: Double
  
  def or(query: QueryObj): Unit
  
  var query: Query
  
  def remove(callback: CbCallback): Unit
  
  def setPage(pageSize: Double, pageNum: Double): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  def update(changes: js.Object, callback: CbCallback): Unit
  
  var user: APIUser
}
object QueryObj {
  
  inline def apply(
    OR: js.Array[Query],
    URI: String,
    ascending: String => Callback,
    columns: js.Array[String] => Callback,
    descending: String => Callback,
    equalTo: (String, QueryValue) => Callback,
    fetch: CbCallback => Callback,
    greaterThan: (String, QueryValue) => Callback,
    greaterThanEqualTo: (String, QueryValue) => Callback,
    id: String,
    lessThan: (String, QueryValue) => Callback,
    lessThanEqualTo: (String, QueryValue) => Callback,
    limit: Double,
    matches: (String, QueryValue) => Callback,
    notEqualTo: (String, QueryValue) => Callback,
    offset: Double,
    or: QueryObj => Callback,
    query: Query,
    remove: CbCallback => Callback,
    setPage: (Double, Double) => Callback,
    systemKey: String,
    systemSecret: String,
    update: (js.Object, CbCallback) => Callback,
    user: APIUser
  ): QueryObj = {
    val __obj = js.Dynamic.literal(OR = OR.asInstanceOf[js.Any], URI = URI.asInstanceOf[js.Any], ascending = js.Any.fromFunction1((t0: String) => ascending(t0).runNow()), columns = js.Any.fromFunction1((t0: js.Array[String]) => columns(t0).runNow()), descending = js.Any.fromFunction1((t0: String) => descending(t0).runNow()), equalTo = js.Any.fromFunction2((t0: String, t1: QueryValue) => (equalTo(t0, t1)).runNow()), fetch = js.Any.fromFunction1((t0: CbCallback) => fetch(t0).runNow()), greaterThan = js.Any.fromFunction2((t0: String, t1: QueryValue) => (greaterThan(t0, t1)).runNow()), greaterThanEqualTo = js.Any.fromFunction2((t0: String, t1: QueryValue) => (greaterThanEqualTo(t0, t1)).runNow()), id = id.asInstanceOf[js.Any], lessThan = js.Any.fromFunction2((t0: String, t1: QueryValue) => (lessThan(t0, t1)).runNow()), lessThanEqualTo = js.Any.fromFunction2((t0: String, t1: QueryValue) => (lessThanEqualTo(t0, t1)).runNow()), limit = limit.asInstanceOf[js.Any], matches = js.Any.fromFunction2((t0: String, t1: QueryValue) => (matches(t0, t1)).runNow()), notEqualTo = js.Any.fromFunction2((t0: String, t1: QueryValue) => (notEqualTo(t0, t1)).runNow()), offset = offset.asInstanceOf[js.Any], or = js.Any.fromFunction1((t0: QueryObj) => or(t0).runNow()), query = query.asInstanceOf[js.Any], remove = js.Any.fromFunction1((t0: CbCallback) => remove(t0).runNow()), setPage = js.Any.fromFunction2((t0: Double, t1: Double) => (setPage(t0, t1)).runNow()), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction2((t0: js.Object, t1: CbCallback) => (update(t0, t1)).runNow()), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryObj]
  }
  
  extension [Self <: QueryObj](x: Self) {
    
    inline def setAscending(value: String => Callback): Self = StObject.set(x, "ascending", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setColumns(value: js.Array[String] => Callback): Self = StObject.set(x, "columns", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    
    inline def setDescending(value: String => Callback): Self = StObject.set(x, "descending", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setEqualTo(value: (String, QueryValue) => Callback): Self = StObject.set(x, "equalTo", js.Any.fromFunction2((t0: String, t1: QueryValue) => (value(t0, t1)).runNow()))
    
    inline def setFetch(value: CbCallback => Callback): Self = StObject.set(x, "fetch", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setGreaterThan(value: (String, QueryValue) => Callback): Self = StObject.set(x, "greaterThan", js.Any.fromFunction2((t0: String, t1: QueryValue) => (value(t0, t1)).runNow()))
    
    inline def setGreaterThanEqualTo(value: (String, QueryValue) => Callback): Self = StObject.set(x, "greaterThanEqualTo", js.Any.fromFunction2((t0: String, t1: QueryValue) => (value(t0, t1)).runNow()))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLessThan(value: (String, QueryValue) => Callback): Self = StObject.set(x, "lessThan", js.Any.fromFunction2((t0: String, t1: QueryValue) => (value(t0, t1)).runNow()))
    
    inline def setLessThanEqualTo(value: (String, QueryValue) => Callback): Self = StObject.set(x, "lessThanEqualTo", js.Any.fromFunction2((t0: String, t1: QueryValue) => (value(t0, t1)).runNow()))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setMatches(value: (String, QueryValue) => Callback): Self = StObject.set(x, "matches", js.Any.fromFunction2((t0: String, t1: QueryValue) => (value(t0, t1)).runNow()))
    
    inline def setNotEqualTo(value: (String, QueryValue) => Callback): Self = StObject.set(x, "notEqualTo", js.Any.fromFunction2((t0: String, t1: QueryValue) => (value(t0, t1)).runNow()))
    
    inline def setOR(value: js.Array[Query]): Self = StObject.set(x, "OR", value.asInstanceOf[js.Any])
    
    inline def setORVarargs(value: Query*): Self = StObject.set(x, "OR", js.Array(value*))
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: CbCallback => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setSetPage(value: (Double, Double) => Callback): Self = StObject.set(x, "setPage", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (js.Object, CbCallback) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction2((t0: js.Object, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
