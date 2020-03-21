package typingsJapgolly.meteor

import typingsJapgolly.meteor.Mongo.FieldSpecifier
import typingsJapgolly.meteor.Mongo.SortSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReactive extends js.Object {
  var fields: js.UndefOr[FieldSpecifier] = js.undefined
  var reactive: js.UndefOr[Boolean] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[SortSpecifier] = js.undefined
  var transform: js.UndefOr[js.Function | Null] = js.undefined
}

object AnonReactive {
  @scala.inline
  def apply(
    fields: FieldSpecifier = null,
    reactive: js.UndefOr[Boolean] = js.undefined,
    skip: Int | Double = null,
    sort: SortSpecifier = null,
    transform: js.Function = null
  ): AnonReactive = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(reactive)) __obj.updateDynamic("reactive")(reactive.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReactive]
  }
}

