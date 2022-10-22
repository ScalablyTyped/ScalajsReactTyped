package typingsJapgolly.akamaiEdgeworkers.EW

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheKey extends StObject {
  
  /**
    * Specifies that the entire query string should be excluded from the cache key. By
    * default, the entire query string is part of the cache key.
    */
  def excludeQueryString(): Unit
  
  /**
    * Specifies that the named cookie is included in the cache key. Can be called multiple
    * times to include multiple cookies.
    *
    * @param name The name of the cookie to include in the cid
    */
  def includeCookie(name: String): Unit
  
  /**
    * Specifies that the named HTTP request header is included in the cache key. Can be
    * called multiple times to include multiple headers.
    *
    * @param name The name of the header to include in the cid
    */
  def includeHeader(name: String): Unit
  
  /**
    * Specifies that the named query argument is included in the cache key. Can be called
    * multiple times to include multiple query arguments. Calling this function will result
    * in all query arguments not explicitly included to be excluded from the cache key. By
    * default, the entire query string is part of the cache key. This would override previous
    * calls to "excludeQueryString()" or "includeQueryString()".
    *
    * @param name The name of the query arg to include in the cache key
    */
  def includeQueryArgument(name: String): Unit
  
  /**
    * Specifies that the entire query string should be included from the cache key. This is
    * done by default, however it is provided as an API to be reverted to the default.
    */
  def includeQueryString(): Unit
  
  /**
    * Specifies that the named variable is included in the cache key. Can be called multiple
    * times to include multiple variable.
    *
    * @param name The name of the variable to include in the cid
    */
  def includeVariable(name: String): Unit
}
object CacheKey {
  
  inline def apply(
    excludeQueryString: Callback,
    includeCookie: String => Callback,
    includeHeader: String => Callback,
    includeQueryArgument: String => Callback,
    includeQueryString: Callback,
    includeVariable: String => Callback
  ): CacheKey = {
    val __obj = js.Dynamic.literal(excludeQueryString = excludeQueryString.toJsFn, includeCookie = js.Any.fromFunction1((t0: String) => includeCookie(t0).runNow()), includeHeader = js.Any.fromFunction1((t0: String) => includeHeader(t0).runNow()), includeQueryArgument = js.Any.fromFunction1((t0: String) => includeQueryArgument(t0).runNow()), includeQueryString = includeQueryString.toJsFn, includeVariable = js.Any.fromFunction1((t0: String) => includeVariable(t0).runNow()))
    __obj.asInstanceOf[CacheKey]
  }
  
  extension [Self <: CacheKey](x: Self) {
    
    inline def setExcludeQueryString(value: Callback): Self = StObject.set(x, "excludeQueryString", value.toJsFn)
    
    inline def setIncludeCookie(value: String => Callback): Self = StObject.set(x, "includeCookie", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setIncludeHeader(value: String => Callback): Self = StObject.set(x, "includeHeader", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setIncludeQueryArgument(value: String => Callback): Self = StObject.set(x, "includeQueryArgument", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setIncludeQueryString(value: Callback): Self = StObject.set(x, "includeQueryString", value.toJsFn)
    
    inline def setIncludeVariable(value: String => Callback): Self = StObject.set(x, "includeVariable", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
