package typingsJapgolly.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheDetails extends js.Object {
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.undefined
  /** Etag */
  var eTag: String
  /**
    * Expiration time of the cache entry.
    *
    * _(Format not documente but assumingly ISO 8601 -
    * `YYYY-MM-DDThh:mm:ss.sTZD`)_
    */
  var expires: js.UndefOr[String] = js.undefined
  /** The number of times the cache entry has been opened. */
  var hitCount: Double
  /**
    * The last time the cache entry was opened.
    *
    * _(Format not documente but assumingly ISO 8601 -
    * `YYYY-MM-DDThh:mm:ss.sTZD`)_
    */
  var lastAccess: String
}

object CacheDetails {
  @scala.inline
  def apply(eTag: String, hitCount: Double, lastAccess: String, comment: String = null, expires: String = null): CacheDetails = {
    val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], hitCount = hitCount.asInstanceOf[js.Any], lastAccess = lastAccess.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheDetails]
  }
}

