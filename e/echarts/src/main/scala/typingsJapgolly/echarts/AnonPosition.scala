package typingsJapgolly.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPosition extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.label.emphasis
    */
  var emphasis: js.UndefOr[AnonFormatter] = js.undefined
  /**
    * Data label formatter, which supports string template
    * and callback function.
    * In either form, `\n` is supported to represent
    * a new line.
    *
    * **String template**
    *
    * Model variation includes:
    *
    * + `{a}`: series name.
    * + `{b}`: the name of a data item.
    * + `{c}`: the value of a data item.
    * + `{d}`: the percent.
    * + `{@xxx}: the value of a dimension named`'xxx'`,
    * for example,`{@product}`refers the value of`'product'\`
    * dimension。
    * + `{@[n]}: the value of a dimension at the index
    * of`n`, for example,`{@\[3\]}\` refers the value
    * at dimensions\[3\].
    *
    * **example:**
    *
    * ```
    * formatter: '{b}: {d}'
    *
    * ```
    *
    * **Callback function**
    *
    * Callback function is in form of:
    *
    * ```
    * (params: Object|Array) => string
    *
    * ```
    *
    * where `params` is the single dataset needed by
    * formatter, which is formed as:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markLine.data.1.label)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.label.formatter
    */
  var formatter: js.UndefOr[js.Function | String] = js.undefined
  /**
    * Positions of labels can be:
    *
    * + `'start'` starting point of the line.
    * + `'middle'` middle point of the line.
    * + `'end'` ending point of the line.
    *
    *
    * @default
    * "end"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.label.position
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * Whether show label or not.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.label.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object AnonPosition {
  @scala.inline
  def apply(
    emphasis: AnonFormatter = null,
    formatter: js.Function | String = null,
    position: String = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): AnonPosition = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPosition]
  }
}

