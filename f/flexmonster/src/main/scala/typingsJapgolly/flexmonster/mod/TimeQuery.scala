package typingsJapgolly.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeQuery extends js.Object {
  var between: js.UndefOr[js.Array[String]] = js.undefined
  var equal: js.UndefOr[String] = js.undefined
  var greater: js.UndefOr[String] = js.undefined
  var greater_equal: js.UndefOr[String] = js.undefined
  var less: js.UndefOr[String] = js.undefined
  var less_equal: js.UndefOr[String] = js.undefined
  var not_between: js.UndefOr[js.Array[String]] = js.undefined
  var not_equal: js.UndefOr[String] = js.undefined
}

object TimeQuery {
  @scala.inline
  def apply(
    between: js.Array[String] = null,
    equal: String = null,
    greater: String = null,
    greater_equal: String = null,
    less: String = null,
    less_equal: String = null,
    not_between: js.Array[String] = null,
    not_equal: String = null
  ): TimeQuery = {
    val __obj = js.Dynamic.literal()
    if (between != null) __obj.updateDynamic("between")(between.asInstanceOf[js.Any])
    if (equal != null) __obj.updateDynamic("equal")(equal.asInstanceOf[js.Any])
    if (greater != null) __obj.updateDynamic("greater")(greater.asInstanceOf[js.Any])
    if (greater_equal != null) __obj.updateDynamic("greater_equal")(greater_equal.asInstanceOf[js.Any])
    if (less != null) __obj.updateDynamic("less")(less.asInstanceOf[js.Any])
    if (less_equal != null) __obj.updateDynamic("less_equal")(less_equal.asInstanceOf[js.Any])
    if (not_between != null) __obj.updateDynamic("not_between")(not_between.asInstanceOf[js.Any])
    if (not_equal != null) __obj.updateDynamic("not_equal")(not_equal.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeQuery]
  }
}

