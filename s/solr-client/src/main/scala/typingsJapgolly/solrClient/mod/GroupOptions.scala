package typingsJapgolly.solrClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupOptions extends js.Object {
  var cache: js.UndefOr[Double] = js.undefined
  var field: js.UndefOr[String | js.Array[String]] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var main: js.UndefOr[Boolean] = js.undefined
  var ngroups: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var on: js.UndefOr[Boolean] = js.undefined
  var sort: js.UndefOr[String] = js.undefined
  var truncate: js.UndefOr[Boolean] = js.undefined
}

object GroupOptions {
  @scala.inline
  def apply(
    cache: Int | Double = null,
    field: String | js.Array[String] = null,
    format: String = null,
    limit: Int | Double = null,
    main: js.UndefOr[Boolean] = js.undefined,
    ngroups: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    on: js.UndefOr[Boolean] = js.undefined,
    sort: String = null,
    truncate: js.UndefOr[Boolean] = js.undefined
  ): GroupOptions = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(main)) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (!js.isUndefined(ngroups)) __obj.updateDynamic("ngroups")(ngroups.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(on)) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(truncate)) __obj.updateDynamic("truncate")(truncate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupOptions]
  }
}

