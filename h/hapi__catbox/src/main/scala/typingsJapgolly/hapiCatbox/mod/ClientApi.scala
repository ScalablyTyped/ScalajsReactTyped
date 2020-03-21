package typingsJapgolly.hapiCatbox.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientApi[T] extends js.Object {
  /**
    * drop(key) - remove an item from cache where:
    *  * key - a cache key object (see [ICacheKey]).
    */
  def drop(key: CacheKey): js.Promise[Unit]
  /**
    * get(key, callback) - retrieve an item from the cache engine if found where:
    *  * key - a cache key object (see [ICacheKey]).
    */
  def get(key: CacheKey): js.Promise[Null | CachedObject[T]]
  /** isReady() - returns true if cache engine determines itself as ready, false if it is not ready. */
  def isReady(): Boolean
  /**
    * set(key, value, ttl) - store an item in the cache for a specified length of time, where:
    *  * key - a cache key object (see [ICacheKey]).
    *  * value - the string or object value to be stored.
    *  * ttl - a time-to-live value in milliseconds after which the item is automatically removed from the cache (or is marked invalid).
    */
  def set(key: CacheKey, value: T, ttl: Double): js.Promise[Unit]
  /** start() - creates a connection to the cache server. Must be called before any other method is available. */
  def start(): js.Promise[Unit]
  /** stop() - terminates the connection to the cache server. */
  def stop(): Unit
  /** validateSegmentName(segment) - returns null if the segment name is valid (see below), otherwise should return an instance of Error with an appropriate message. */
  def validateSegmentName(segment: String): Null | js.Error
}

object ClientApi {
  @scala.inline
  def apply[T](
    drop: CacheKey => CallbackTo[js.Promise[Unit]],
    get: CacheKey => CallbackTo[js.Promise[Null | CachedObject[T]]],
    isReady: CallbackTo[Boolean],
    set: (CacheKey, T, Double) => CallbackTo[js.Promise[Unit]],
    start: CallbackTo[js.Promise[Unit]],
    stop: Callback,
    validateSegmentName: String => CallbackTo[Null | js.Error]
  ): ClientApi[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("drop")(js.Any.fromFunction1((t0: typingsJapgolly.hapiCatbox.mod.CacheKey) => drop(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.hapiCatbox.mod.CacheKey) => get(t0).runNow()))
    __obj.updateDynamic("isReady")(isReady.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction3((t0: typingsJapgolly.hapiCatbox.mod.CacheKey, t1: T, t2: scala.Double) => set(t0, t1, t2).runNow()))
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.updateDynamic("validateSegmentName")(js.Any.fromFunction1((t0: java.lang.String) => validateSegmentName(t0).runNow()))
    __obj.asInstanceOf[ClientApi[T]]
  }
}

