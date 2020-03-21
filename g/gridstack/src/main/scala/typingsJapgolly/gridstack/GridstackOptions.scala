package typingsJapgolly.gridstack

import org.scalajs.dom.raw.Element
import typingsJapgolly.gridstack.gridstackStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gridstack Options
  * Defines the options for a Gridstack
  */
trait GridstackOptions extends js.Object {
  /**
    * accept widgets dragged from other grids or from outside (default: `false`). Can be:
    * `true` (uses `'.grid-stack-item'` class filter) or `false`,
    * string for explicit class name,
    * function returning a boolean. See [example](http://gridstack.github.io/gridstack.js/demo/two.html)
    */
  var acceptWidgets: js.UndefOr[
    Boolean | String | (js.Function2[/* i */ Double, /* element */ Element, Boolean])
  ] = js.undefined
  /**
    * if true the resizing handles are shown even if the user is not hovering over the widget (default?: false)
    */
  var alwaysShowResizeHandle: js.UndefOr[Boolean] = js.undefined
  /**
    * turns animation on (default?: true)
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  /**
    * if false gridstack will not initialize existing items (default?: true)
    */
  var auto: js.UndefOr[Boolean] = js.undefined
  /**
    * one cell height (default?: 60). Can be:
    *  an integer (px)
    *  a string (ex: '100px', '10em', '10rem', '10%')
    *  0 or null, in which case the library will not generate styles for rows. Everything must be defined in CSS files.
    *  'auto' - height will be calculated to match cell width (initial square grid).
    */
  var cellHeight: js.UndefOr[Double | String] = js.undefined
  /**
    * (internal?) unit for cellHeight (default? 'px')
    */
  var cellHeightUnit: js.UndefOr[String] = js.undefined
  /**
    * number of columns (default?: 12). Note: IF you change this, CSS also have to change. See https://github.com/gridstack/gridstack.js#change-grid-columns
    */
  var column: js.UndefOr[Double] = js.undefined
  /** class that implement drag'n'drop functionality for gridstack. If false grid will be static.
    * (default?: null - first available plugin will be used)
    */
  var ddPlugin: js.UndefOr[Boolean | Null | js.Any] = js.undefined
  /** disallows dragging of widgets (default?: false) */
  var disableDrag: js.UndefOr[Boolean] = js.undefined
  /** disables the onColumnMode when the window width is less than minWidth (default?: false) */
  var disableOneColumnMode: js.UndefOr[Boolean] = js.undefined
  /** disallows resizing of widgets (default?: false). */
  var disableResize: js.UndefOr[Boolean] = js.undefined
  /**
    * let user drag nested grid items out of a parent or not (default false)
    */
  var dragOut: js.UndefOr[Boolean] = js.undefined
  /**
    * allows to override jQuery UI draggable options. (default?: { handle?: '.grid-stack-item-content', scroll?: true, appendTo?: 'body', containment: null })
    */
  var draggable: js.UndefOr[js.Object] = js.undefined
  /**
    * enable floating widgets (default?: false) See example (http://gridstack.github.io/gridstack.js/demo/float.html)
    */
  var float: js.UndefOr[Boolean] = js.undefined
  /**
    * draggable handle selector (default?: '.grid-stack-item-content')
    */
  var handle: js.UndefOr[String] = js.undefined
  /** draggable handle class (e.g. 'grid-stack-item-content'). If set 'handle' is ignored (default?: null) */
  var handleClass: js.UndefOr[String] = js.undefined
  /**
    * widget class (default?: 'grid-stack-item')
    */
  var itemClass: js.UndefOr[String] = js.undefined
  /**
    * maximum rows amount. Default? is 0 which means no maximum rows
    */
  var maxRow: js.UndefOr[Double] = js.undefined
  /**
    * minimal width. If window width is less, grid will be shown in one column mode (default?: 768)
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  /**
    * set to true if you want oneColumnMode to use the DOM order and ignore x,y from normal multi column 
    * layouts during sorting. This enables you to have custom 1 column layout that differ from the rest. (default?: false)
    */
  var oneColumnModeDomSort: js.UndefOr[Boolean] = js.undefined
  /**
    * class for placeholder (default?: 'grid-stack-placeholder')
    */
  var placeholderClass: js.UndefOr[String] = js.undefined
  /** placeholder default content (default?: '') */
  var placeholderText: js.UndefOr[String] = js.undefined
  /**
    * if true widgets could be removed by dragging outside of the grid. It could also be a jQuery selector string,
    * in this case widgets will be removed by dropping them there (default?: false)
    * See example (http://gridstack.github.io/gridstack.js/demo/two.html)
    */
  var removable: js.UndefOr[Boolean | String] = js.undefined
  /**
    * time in milliseconds before widget is being removed while dragging outside of the grid. (default?: 2000)
    */
  var removeTimeout: js.UndefOr[Double] = js.undefined
  /**
    * allows to override jQuery UI resizable options. (default?: { autoHide?: true, handles?: 'se' })
    */
  var resizable: js.UndefOr[js.Object] = js.undefined
  /**
    * if true turns grid to RTL. Possible values are true, false, 'auto' (default?: 'auto')
    * See [example](http://gridstack.github.io/gridstack.js/demo/rtl.html)
    */
  var rtl: js.UndefOr[Boolean | auto] = js.undefined
  /**
    * makes grid static (default?: false).If true widgets are not movable/resizable.
    * You don't even need jQueryUI draggable/resizable. A CSS class
    * 'grid-stack-static' is also added to the container.
    */
  var staticGrid: js.UndefOr[Boolean] = js.undefined
  /**
    * vertical gap size (default?: 20). Can be:
    *  an integer (px)
    *  a string (ex: '2em', '20px', '2rem')
    */
  var verticalMargin: js.UndefOr[Double | String] = js.undefined
  /**
    * (internal?) unit for verticalMargin (default? 'px')
    */
  var verticalMarginUnit: js.UndefOr[String] = js.undefined
}

object GridstackOptions {
  @scala.inline
  def apply(
    acceptWidgets: Boolean | String | (js.Function2[/* i */ Double, /* element */ Element, Boolean]) = null,
    alwaysShowResizeHandle: js.UndefOr[Boolean] = js.undefined,
    animate: js.UndefOr[Boolean] = js.undefined,
    auto: js.UndefOr[Boolean] = js.undefined,
    cellHeight: Double | String = null,
    cellHeightUnit: String = null,
    column: Int | Double = null,
    ddPlugin: Boolean | js.Any = null,
    disableDrag: js.UndefOr[Boolean] = js.undefined,
    disableOneColumnMode: js.UndefOr[Boolean] = js.undefined,
    disableResize: js.UndefOr[Boolean] = js.undefined,
    dragOut: js.UndefOr[Boolean] = js.undefined,
    draggable: js.Object = null,
    float: js.UndefOr[Boolean] = js.undefined,
    handle: String = null,
    handleClass: String = null,
    itemClass: String = null,
    maxRow: Int | Double = null,
    minWidth: Int | Double = null,
    oneColumnModeDomSort: js.UndefOr[Boolean] = js.undefined,
    placeholderClass: String = null,
    placeholderText: String = null,
    removable: Boolean | String = null,
    removeTimeout: Int | Double = null,
    resizable: js.Object = null,
    rtl: Boolean | auto = null,
    staticGrid: js.UndefOr[Boolean] = js.undefined,
    verticalMargin: Double | String = null,
    verticalMarginUnit: String = null
  ): GridstackOptions = {
    val __obj = js.Dynamic.literal()
    if (acceptWidgets != null) __obj.updateDynamic("acceptWidgets")(acceptWidgets.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysShowResizeHandle)) __obj.updateDynamic("alwaysShowResizeHandle")(alwaysShowResizeHandle.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto.asInstanceOf[js.Any])
    if (cellHeight != null) __obj.updateDynamic("cellHeight")(cellHeight.asInstanceOf[js.Any])
    if (cellHeightUnit != null) __obj.updateDynamic("cellHeightUnit")(cellHeightUnit.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (ddPlugin != null) __obj.updateDynamic("ddPlugin")(ddPlugin.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDrag)) __obj.updateDynamic("disableDrag")(disableDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(disableOneColumnMode)) __obj.updateDynamic("disableOneColumnMode")(disableOneColumnMode.asInstanceOf[js.Any])
    if (!js.isUndefined(disableResize)) __obj.updateDynamic("disableResize")(disableResize.asInstanceOf[js.Any])
    if (!js.isUndefined(dragOut)) __obj.updateDynamic("dragOut")(dragOut.asInstanceOf[js.Any])
    if (draggable != null) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(float)) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (handleClass != null) __obj.updateDynamic("handleClass")(handleClass.asInstanceOf[js.Any])
    if (itemClass != null) __obj.updateDynamic("itemClass")(itemClass.asInstanceOf[js.Any])
    if (maxRow != null) __obj.updateDynamic("maxRow")(maxRow.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(oneColumnModeDomSort)) __obj.updateDynamic("oneColumnModeDomSort")(oneColumnModeDomSort.asInstanceOf[js.Any])
    if (placeholderClass != null) __obj.updateDynamic("placeholderClass")(placeholderClass.asInstanceOf[js.Any])
    if (placeholderText != null) __obj.updateDynamic("placeholderText")(placeholderText.asInstanceOf[js.Any])
    if (removable != null) __obj.updateDynamic("removable")(removable.asInstanceOf[js.Any])
    if (removeTimeout != null) __obj.updateDynamic("removeTimeout")(removeTimeout.asInstanceOf[js.Any])
    if (resizable != null) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (rtl != null) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (!js.isUndefined(staticGrid)) __obj.updateDynamic("staticGrid")(staticGrid.asInstanceOf[js.Any])
    if (verticalMargin != null) __obj.updateDynamic("verticalMargin")(verticalMargin.asInstanceOf[js.Any])
    if (verticalMarginUnit != null) __obj.updateDynamic("verticalMarginUnit")(verticalMarginUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridstackOptions]
  }
}

