package typingsJapgolly.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TickConfiguration extends js.Object {
  /**
    * The number of x axis ticks to show.
    * This option hides tick lines together with tick text. If this option is used on timeseries axis, the ticks position will be determined precisely and not nicely positioned (e.g. it will
    * have rough second value).
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * Show x axis outer tick.
    */
  var outer: js.UndefOr[Boolean] = js.undefined
  /**
    * Rotate x axis tick text. If you set negative value, it will rotate to opposite direction.
    */
  var rotate: js.UndefOr[Double] = js.undefined
  /**
    * Set the x values of ticks manually.
    * If this option is provided, the position of the ticks will be determined based on those values. This option works with timeseries data and the x values will be parsed accoding to the type
    * of the value and data.xFormat option.
    */
  var values: js.UndefOr[js.Array[Double | String]] = js.undefined
}

object TickConfiguration {
  @scala.inline
  def apply(
    count: Int | Double = null,
    outer: js.UndefOr[Boolean] = js.undefined,
    rotate: Int | Double = null,
    values: js.Array[Double | String] = null
  ): TickConfiguration = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(outer)) __obj.updateDynamic("outer")(outer.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TickConfiguration]
  }
}

