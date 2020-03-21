package typingsJapgolly.nano.mod

import typingsJapgolly.nano.nanoStrings.continuous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseScopeFollowUpdatesParams extends DocumentScopeFollowUpdatesParams {
  var db: String
}

object DatabaseScopeFollowUpdatesParams {
  @scala.inline
  def apply(
    db: String,
    feed: continuous = null,
    filter: String | FollowUpdatesParamsFilterFunction = null,
    headers: js.Any = null,
    heartbeat: Int | Double = null,
    inactivity_ms: Int | Double = null,
    include_docs: js.UndefOr[Boolean] = js.undefined,
    initial_retry_delay: Int | Double = null,
    max_retry_seconds: Int | Double = null,
    query_params: js.Any = null,
    response_grace_time: Int | Double = null,
    since: String = null
  ): DatabaseScopeFollowUpdatesParams = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    if (feed != null) __obj.updateDynamic("feed")(feed.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat.asInstanceOf[js.Any])
    if (inactivity_ms != null) __obj.updateDynamic("inactivity_ms")(inactivity_ms.asInstanceOf[js.Any])
    if (!js.isUndefined(include_docs)) __obj.updateDynamic("include_docs")(include_docs.asInstanceOf[js.Any])
    if (initial_retry_delay != null) __obj.updateDynamic("initial_retry_delay")(initial_retry_delay.asInstanceOf[js.Any])
    if (max_retry_seconds != null) __obj.updateDynamic("max_retry_seconds")(max_retry_seconds.asInstanceOf[js.Any])
    if (query_params != null) __obj.updateDynamic("query_params")(query_params.asInstanceOf[js.Any])
    if (response_grace_time != null) __obj.updateDynamic("response_grace_time")(response_grace_time.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseScopeFollowUpdatesParams]
  }
}

