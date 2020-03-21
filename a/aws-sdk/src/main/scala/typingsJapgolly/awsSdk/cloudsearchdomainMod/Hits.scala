package typingsJapgolly.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hits extends js.Object {
  /**
    * A cursor that can be used to retrieve the next set of matching documents when you want to page through a large result set.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * The total number of documents that match the search request.
    */
  var found: js.UndefOr[Long] = js.native
  /**
    * A document that matches the search request.
    */
  var hit: js.UndefOr[HitList] = js.native
  /**
    * The index of the first matching document.
    */
  var start: js.UndefOr[Long] = js.native
}

object Hits {
  @scala.inline
  def apply(
    cursor: String = null,
    found: Int | scala.Double = null,
    hit: HitList = null,
    start: Int | scala.Double = null
  ): Hits = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (found != null) __obj.updateDynamic("found")(found.asInstanceOf[js.Any])
    if (hit != null) __obj.updateDynamic("hit")(hit.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hits]
  }
}

