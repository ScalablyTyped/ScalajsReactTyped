package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesDependencywheelNodesOptions extends js.Object {
  /**
    * (Highcharts) The color of the auto generated node.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) The color index of the auto generated node, especially for
    * use in styled mode.
    */
  var colorIndex: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) An optional column index of where to place the node. The
    * default behaviour is to place it next to the preceding node. Note that
    * this option name is counter intuitive in inverted charts, like for
    * example an organization chart rendered top down. In this case the
    * "columns" are horizontal.
    */
  var column: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Individual data label for each node. The options are the
    * same as the ones for series.dependencywheel.dataLabels.
    */
  var dataLabels: js.UndefOr[
    SeriesSankeyDataLabelsOptionsObject | js.Array[SeriesSankeyDataLabelsOptionsObject]
  ] = js.undefined
  /**
    * (Highcharts) The id of the auto-generated node, refering to the `from` or
    * `to` setting of the link.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) An optional level index of where to place the node. The
    * default behaviour is to place it next to the preceding node. Alias of
    * `nodes.column`, but in inverted sankeys and org charts, the levels are
    * laid out as rows.
    */
  var level: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The name to display for the node in data labels and
    * tooltips. Use this when the name is different from the `id`. Where the id
    * must be unique for each node, this is not necessary for the name.
    */
  var name: js.UndefOr[String] = js.undefined
}

object SeriesDependencywheelNodesOptions {
  @scala.inline
  def apply(
    color: ColorString | GradientColorObject | PatternObject = null,
    colorIndex: Int | Double = null,
    column: Int | Double = null,
    dataLabels: SeriesSankeyDataLabelsOptionsObject | js.Array[SeriesSankeyDataLabelsOptionsObject] = null,
    id: String = null,
    level: Int | Double = null,
    name: String = null
  ): SeriesDependencywheelNodesOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorIndex != null) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesDependencywheelNodesOptions]
  }
}

