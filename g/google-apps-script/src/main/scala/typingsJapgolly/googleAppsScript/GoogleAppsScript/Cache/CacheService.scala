package typingsJapgolly.googleAppsScript.GoogleAppsScript.Cache

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait CacheService extends js.Object {
  def getDocumentCache(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Cache.Cache | Null
  def getScriptCache(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Cache.Cache | Null
  def getUserCache(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Cache.Cache | Null
}

object CacheService {
  @scala.inline
  def apply(
    getDocumentCache: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Cache.Cache | Null],
    getScriptCache: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Cache.Cache | Null],
    getUserCache: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Cache.Cache | Null]
  ): CacheService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDocumentCache")(getDocumentCache.toJsFn)
    __obj.updateDynamic("getScriptCache")(getScriptCache.toJsFn)
    __obj.updateDynamic("getUserCache")(getUserCache.toJsFn)
    __obj.asInstanceOf[CacheService]
  }
}

