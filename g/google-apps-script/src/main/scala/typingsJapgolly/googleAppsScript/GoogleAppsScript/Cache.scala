package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cache {
  
  /**
    * A reference to a particular cache.
    *
    * This class allows you to insert, retrieve, and remove items from a cache. This can be
    * particularly useful when you want frequent access to an expensive or slow resource. For example,
    * say you have an RSS feed at example.com that takes 20 seconds to fetch, but you want to speed up
    * access on an average request.
    *
    *     function getRssFeed() {
    *       var cache = CacheService.getScriptCache();
    *       var cached = cache.get("rss-feed-contents");
    *       if (cached != null) {
    *         return cached;
    *       }
    *       var result = UrlFetchApp.fetch("http://example.com/my-slow-rss-feed.xml"); // takes 20 seconds
    *       var contents = result.getContentText();
    *       cache.put("rss-feed-contents", contents, 1500); // cache for 25 minutes
    *       return contents;
    *     }
    */
  @js.native
  trait Cache extends StObject {
    
    def get(key: String): String | Null = js.native
    
    def getAll(keys: js.Array[String]): StringDictionary[Any] = js.native
    
    def put(key: String, value: String): Unit = js.native
    def put(key: String, value: String, expirationInSeconds: Integer): Unit = js.native
    
    def putAll(values: StringDictionary[Any]): Unit = js.native
    def putAll(values: StringDictionary[Any], expirationInSeconds: Integer): Unit = js.native
    
    def remove(key: String): Unit = js.native
    
    def removeAll(keys: js.Array[String]): Unit = js.native
  }
  
  /**
    * CacheService allows you to access a cache for short term storage of data.
    *
    * This class lets you get a specific cache instance. Public caches are for things that are not
    * dependent on which user is accessing your script. Private caches are for things which are
    * user-specific, like settings or recent activity.
    *
    * The data you write to the cache is not guaranteed to persist until its expiration time. You
    * must be prepared to get back null from all reads.
    */
  trait CacheService extends StObject {
    
    def getDocumentCache(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Cache.Cache | Null
    
    def getScriptCache(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Cache.Cache
    
    def getUserCache(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Cache.Cache
  }
  object CacheService {
    
    inline def apply(
      getDocumentCache: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Cache.Cache | Null],
      getScriptCache: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Cache.Cache],
      getUserCache: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Cache.Cache]
    ): CacheService = {
      val __obj = js.Dynamic.literal(getDocumentCache = getDocumentCache.toJsFn, getScriptCache = getScriptCache.toJsFn, getUserCache = getUserCache.toJsFn)
      __obj.asInstanceOf[CacheService]
    }
    
    extension [Self <: CacheService](x: Self) {
      
      inline def setGetDocumentCache(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Cache.Cache | Null]): Self = StObject.set(x, "getDocumentCache", value.toJsFn)
      
      inline def setGetScriptCache(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Cache.Cache]): Self = StObject.set(x, "getScriptCache", value.toJsFn)
      
      inline def setGetUserCache(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Cache.Cache]): Self = StObject.set(x, "getUserCache", value.toJsFn)
    }
  }
}
