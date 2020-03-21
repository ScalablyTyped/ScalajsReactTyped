package typingsJapgolly.nyaapi.mod.pantsu

import typingsJapgolly.nyaapi.nyaapiStrings.b
import typingsJapgolly.nyaapi.nyaapiStrings.g
import typingsJapgolly.nyaapi.nyaapiStrings.k
import typingsJapgolly.nyaapi.nyaapiStrings.m
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  var c: js.UndefOr[Category] = js.undefined
  var dateType: js.UndefOr[String] = js.undefined
  var fromDate: js.UndefOr[String] = js.undefined
  var fromID: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[js.Array[String]] = js.undefined
  var maxSize: js.UndefOr[String] = js.undefined
  var maxage: js.UndefOr[String] = js.undefined
  var minSize: js.UndefOr[String] = js.undefined
  var n: js.UndefOr[Double] = js.undefined
  var order: js.UndefOr[Boolean] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var s: js.UndefOr[String] = js.undefined
  var sizeType: js.UndefOr[b | k | m | g] = js.undefined
  var sort: js.UndefOr[SortType] = js.undefined
  var term: js.UndefOr[String] = js.undefined
  var toDate: js.UndefOr[String] = js.undefined
  var userID: js.UndefOr[String] = js.undefined
}

object SearchOptions {
  @scala.inline
  def apply(
    c: Category = null,
    dateType: String = null,
    fromDate: String = null,
    fromID: String = null,
    lang: js.Array[String] = null,
    maxSize: String = null,
    maxage: String = null,
    minSize: String = null,
    n: Int | Double = null,
    order: js.UndefOr[Boolean] = js.undefined,
    page: Int | Double = null,
    s: String = null,
    sizeType: b | k | m | g = null,
    sort: SortType = null,
    term: String = null,
    toDate: String = null,
    userID: String = null
  ): SearchOptions = {
    val __obj = js.Dynamic.literal()
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    if (dateType != null) __obj.updateDynamic("dateType")(dateType.asInstanceOf[js.Any])
    if (fromDate != null) __obj.updateDynamic("fromDate")(fromDate.asInstanceOf[js.Any])
    if (fromID != null) __obj.updateDynamic("fromID")(fromID.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (maxage != null) __obj.updateDynamic("maxage")(maxage.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (sizeType != null) __obj.updateDynamic("sizeType")(sizeType.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (term != null) __obj.updateDynamic("term")(term.asInstanceOf[js.Any])
    if (toDate != null) __obj.updateDynamic("toDate")(toDate.asInstanceOf[js.Any])
    if (userID != null) __obj.updateDynamic("userID")(userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

