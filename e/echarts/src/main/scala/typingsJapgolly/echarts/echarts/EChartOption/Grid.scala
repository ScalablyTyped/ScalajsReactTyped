package typingsJapgolly.echarts.echarts.EChartOption

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Drawing grid in rectangular coordinate.
  * In a single grid, at most two X and Y axes each is allowed.
  * Line chart, bar chart, and scatter chart (bubble chart) can be drawn in grid.
  *
  * @see https://echarts.apache.org/en/option.html#grid
  */
trait Grid extends js.Object {
  /**
    * Background color of grid, which is transparent by default.
    * Attention: Works only if show: true is set.
    *
    * @default 'transparent'
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Border color of grid. Support the same color format as backgroundColor.
    * Attention: Works only if show: true is set.
    *
    * @default '#ccc'
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /**
    * Border width of grid.
    * Attention: Works only if show: true is set.
    *
    * @default 1
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * Distance between grid component and the bottom side of the container.
    * bottom value can be instant pixel value like 20; it can also be percentage value relative to container width like '20%'.
    *
    * @default 60
    */
  var bottom: js.UndefOr[Double | String] = js.undefined
  /**
    * Whether the grid region contains axis tick label of axis.
    * When containLabel is false:
    * grid.left grid.right grid.top grid.bottom grid.width grid.height decide the location
    * and size of the rectangle that is made of by xAxis and yAxis.
    * Setting to false will help when multiple grids need to be aligned at their axes.
    * When containLabel is true:
    * grid.left grid.right grid.top grid.bottom grid.width grid.height decide the location
    * and size of the rectangle that contains the axes and the labels of the axes.
    * Setting to true will help when the length of axis labels is dynamic and is hard to approximate.
    * This will avoid labels from overflowing the container or overlapping other components.
    *
    * @default false
    */
  var containLabel: js.UndefOr[Boolean] = js.undefined
  /**
    * Height of grid component. Adaptive by default.
    *
    * @default 'auto'
    */
  var height: js.UndefOr[Double | String] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option or API.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Distance between grid component and the left side of the container.
    * left value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%';
    * and it can also be 'left', 'center', or 'right'.
    * If the left value is set to be 'left', 'center', or 'right',
    * then the component will be aligned automatically based on position.
    *
    * @default '10%'
    */
  var left: js.UndefOr[Double | String] = js.undefined
  /**
    * Distance between grid component and the right side of the container.
    * right value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%'.
    *
    * @default '10%'
    */
  var right: js.UndefOr[Double | String] = js.undefined
  /**
    * Size of shadow blur. This attribute should be used along with
    * shadowColor,shadowOffsetX, shadowOffsetY to set shadow to component.
    * Attention:
    * This property works only if show: true is configured and
    * backgroundColor is defined other than transparent.
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  /**
    * Shadow color. Support same format as color.
    * Attention: This property works only if show: true configured.
    */
  var shadowColor: js.UndefOr[String] = js.undefined
  /**
    * Offset distance on the horizontal direction of shadow.
    * Attention: This property works only if show: true configured.
    *
    * @default 0
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  /**
    * Offset distance on the vertical direction of shadow.
    * Attention: This property works only if show: true configured.
    *
    * @default 0
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
  /**
    * Whether to show the grid in rectangular coordinate.
    *
    * @default false
    */
  var show: js.UndefOr[Boolean] = js.undefined
  /**
    * tooltip settings in the coordinate system component.
    * @see https://echarts.apache.org/en/option.html#grid.tooltip
    */
  var tooltip: js.UndefOr[Tooltip] = js.undefined
  /**
    * Distance between grid component and the top side of the container.
    * top value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%';
    * and it can also be 'top', 'middle', or 'bottom'.
    *
    * @default 60
    */
  var top: js.UndefOr[Double | String] = js.undefined
  /**
    * Width of grid component. Adaptive by default.
    *
    * @default 'auto'
    */
  var width: js.UndefOr[Double | String] = js.undefined
  /**
    * z value of all graphical elements in , which controls order of drawing graphical components.
    * Components with smaller z values may be overwritten by those with larger z values.
    * z has a lower priority to zlevel, and will not create new Canvas.
    *
    * @default 2
    */
  var z: js.UndefOr[Double] = js.undefined
  /**
    * zlevel value of all graphical elements in.
    * zlevel is used to make layers with Canvas.
    * Graphical elements with different zlevel values will be placed in different Canvases,
    * which is a common optimization technique.
    * We can put those frequently changed elements (like those with animations) to a seperate zlevel.
    * Notice that too many Canvases will increase memory cost, and should be used carefully on mobile phones to avoid crash.
    * Canvases with bigger zlevel will be placed on Canvases with smaller zlevel.
    *
    * @default 0
    */
  var zlevel: js.UndefOr[Double] = js.undefined
}

object Grid {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    borderColor: String = null,
    borderWidth: Int | Double = null,
    bottom: Double | String = null,
    containLabel: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    id: String = null,
    left: Double | String = null,
    right: Double | String = null,
    shadowBlur: Int | Double = null,
    shadowColor: String = null,
    shadowOffsetX: Int | Double = null,
    shadowOffsetY: Int | Double = null,
    show: js.UndefOr[Boolean] = js.undefined,
    tooltip: Tooltip = null,
    top: Double | String = null,
    width: Double | String = null,
    z: Int | Double = null,
    zlevel: Int | Double = null
  ): Grid = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (!js.isUndefined(containLabel)) __obj.updateDynamic("containLabel")(containLabel.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grid]
  }
}

