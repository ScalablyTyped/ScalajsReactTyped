package typingsJapgolly.httpCacheSemantics.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CachePolicy extends js.Object {
  /**
    * Returns updated, filtered set of response headers to return to clients receiving the cached response.
    * This function is necessary, because proxies MUST always remove hop-by-hop headers (such as `TE` and `Connection`)
    * and update response's `Age` to avoid doubling cache time.
    *
    * @example
    * cachedResponse.headers = cachePolicy.responseHeaders(cachedResponse);
    */
  def responseHeaders(): Headers
  /**
    * Use this method to update the cache after receiving a new response from the origin server.
    */
  def revalidatedPolicy(revalidationRequest: Request, revalidationResponse: Response): RevalidationPolicy
  /**
    * Returns updated, filtered set of request headers to send to the origin server to check if the cached
    * response can be reused. These headers allow the origin server to return status 304 indicating the
    * response is still fresh. All headers unrelated to caching are passed through as-is.
    *
    * Use this method when updating cache from the origin server.
    *
    * @example
    * updateRequest.headers = cachePolicy.revalidationHeaders(updateRequest);
    */
  def revalidationHeaders(newRequest: Request): Headers
  /**
    * This is the most important method. Use this method to check whether the cached response is still fresh
    * in the context of the new request.
    *
    * If it returns `true`, then the given `request` matches the original response this cache policy has been
    * created with, and the response can be reused without contacting the server. Note that the old response
    * can't be returned without being updated, see `responseHeaders()`.
    *
    * If it returns `false`, then the response may not be matching at all (e.g. it's for a different URL or method),
    * or may require to be refreshed first (see `revalidationHeaders()`).
    */
  def satisfiesWithoutRevalidation(newRequest: Request): Boolean
  /**
    * Returns `true` if the response can be stored in a cache.
    * If it's `false` then you MUST NOT store either the request or the response.
    */
  def storable(): Boolean
  /**
    * Returns approximate time in milliseconds until the response becomes stale (i.e. not fresh).
    *
    * After that time (when `timeToLive() <= 0`) the response might not be usable without revalidation. However,
    * there are exceptions, e.g. a client can explicitly allow stale responses, so always check with
    * `satisfiesWithoutRevalidation()`.
    */
  def timeToLive(): Double
  /**
    * Chances are you'll want to store the `CachePolicy` object along with the cached response.
    * `obj = policy.toObject()` gives a plain JSON-serializable object.
    */
  def toObject(): CachePolicyObject
}

object CachePolicy {
  @scala.inline
  def apply(
    responseHeaders: CallbackTo[Headers],
    revalidatedPolicy: (Request, Response) => CallbackTo[RevalidationPolicy],
    revalidationHeaders: Request => CallbackTo[Headers],
    satisfiesWithoutRevalidation: Request => CallbackTo[Boolean],
    storable: CallbackTo[Boolean],
    timeToLive: CallbackTo[Double],
    toObject: CallbackTo[CachePolicyObject]
  ): CachePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("responseHeaders")(responseHeaders.toJsFn)
    __obj.updateDynamic("revalidatedPolicy")(js.Any.fromFunction2((t0: typingsJapgolly.httpCacheSemantics.mod.Request, t1: typingsJapgolly.httpCacheSemantics.mod.Response) => revalidatedPolicy(t0, t1).runNow()))
    __obj.updateDynamic("revalidationHeaders")(js.Any.fromFunction1((t0: typingsJapgolly.httpCacheSemantics.mod.Request) => revalidationHeaders(t0).runNow()))
    __obj.updateDynamic("satisfiesWithoutRevalidation")(js.Any.fromFunction1((t0: typingsJapgolly.httpCacheSemantics.mod.Request) => satisfiesWithoutRevalidation(t0).runNow()))
    __obj.updateDynamic("storable")(storable.toJsFn)
    __obj.updateDynamic("timeToLive")(timeToLive.toJsFn)
    __obj.updateDynamic("toObject")(toObject.toJsFn)
    __obj.asInstanceOf[CachePolicy]
  }
}

