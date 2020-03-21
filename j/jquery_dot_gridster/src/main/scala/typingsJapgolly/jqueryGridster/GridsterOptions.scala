package typingsJapgolly.jqueryGridster

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jqueryGridster.jqueryGridsterStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridsterOptions extends js.Object {
  /**
    * A boolean to specify if the stylesheet should be generated or not
    **/
  var autogenerate_stylesheet: js.UndefOr[Boolean] = js.undefined
  /**
  	* If true, all the CSS required to  osition  	l widgets in their respective col umns and rows will be generated automatically and injectedt the<head> of thed cument.You can set this to false, and write your own CSS targeting rows and cols via data - attributes like so: [data - col = "1"] { left: 10px; }
  	* Default = true
  	**/
  var autogenerate_sytesheet: js.UndefOr[Boolean] = js.undefined
  /**
  	* Avoid that widgets loaded from the DOM can be overlapped.  It is helpful if the positions were bad stored in the database or if there was any conflict.
  	* Default = true
  	**/
  var avoid_overlapped_widgets: js.UndefOr[Boolean] = js.undefined
  /**
  	* An object with all options for Collision class you want to overwrite.  @see GridsterCollision or docs for more info.
  	**/
  var collision: js.UndefOr[GridsterCollision] = js.undefined
  /**
  	* An object with all options for Draggable class you want to overwrite.  @see GridsterDraggable or docs for more info.
  	**/
  var draggable: js.UndefOr[GridsterDraggable] = js.undefined
  /**
  	* Add more columns in addition to those that have been calculated.
  	* Default = 0
  	**/
  var extra_cols: js.UndefOr[Double] = js.undefined
  /**
  	* Add more rows in addition to those that have been calculated.
  	* Default = 0
  	**/
  var extra_rows: js.UndefOr[Double] = js.undefined
  /**
  	* The maximum columns possible (set to null for no maximum).
  	* Default = null
  	**/
  var max_cols: js.UndefOr[Double] = js.undefined
  /**
  	* The maximum number of columns that a widget can span.
  	* Default = 6
  	**/
  var max_size_x: js.UndefOr[Double] = js.undefined
  /**
  	* The minimum required columns.
  	* Default = 1
  	**/
  var min_cols: js.UndefOr[Double] = js.undefined
  /**
  	* The minimum required rows.
  	* Default = 15
  	**/
  var min_rows: js.UndefOr[Double] = js.undefined
  /**
  	* A string to differentiate one gridster from another
  	**/
  var namespace: js.UndefOr[String] = js.undefined
  /**
    * An object with all options for Resizable class you want to overwrite.  @see GridsterResizable or docs for more info.
    **/
  var resize: js.UndefOr[GridsterResizable] = js.undefined
  /**
  	* Return the data you want for each widget in the serialization.
  	**/
  var serialize_params: js.UndefOr[js.Function2[/* $w */ JQuery, /* wgd */ GridsterCoords, _]] = js.undefined
  /**
  	* Base widget dimensions in pixels.  The first index for the width and the second for the height.
  	* Default = [400, 225]
  	**/
  var widget_base_dimensions: js.UndefOr[js.Array[auto | Double]] = js.undefined
  /**
  	* Margin between widgets.  The first index for the horizontal margin (left, right) and the second for the vertical margin (top, bottom).
  	* Default = [10, 10]
  	**/
  var widget_margins: js.UndefOr[js.Array[Double]] = js.undefined
  /**
  	* Define who will be the draggable widgets.  Can be a CSS Selector String or a collection of HTMLElements.
  	* Type => string css selector
  	* Type => HTMLElement[]
  	* Default = 'li'
  	**/
  var widget_selector: js.UndefOr[String | js.Array[HTMLElement]] = js.undefined
}

object GridsterOptions {
  @scala.inline
  def apply(
    autogenerate_stylesheet: js.UndefOr[Boolean] = js.undefined,
    autogenerate_sytesheet: js.UndefOr[Boolean] = js.undefined,
    avoid_overlapped_widgets: js.UndefOr[Boolean] = js.undefined,
    collision: GridsterCollision = null,
    draggable: GridsterDraggable = null,
    extra_cols: Int | Double = null,
    extra_rows: Int | Double = null,
    max_cols: Int | Double = null,
    max_size_x: Int | Double = null,
    min_cols: Int | Double = null,
    min_rows: Int | Double = null,
    namespace: String = null,
    resize: GridsterResizable = null,
    serialize_params: (/* $w */ JQuery, /* wgd */ GridsterCoords) => CallbackTo[js.Any] = null,
    widget_base_dimensions: js.Array[auto | Double] = null,
    widget_margins: js.Array[Double] = null,
    widget_selector: String | js.Array[HTMLElement] = null
  ): GridsterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autogenerate_stylesheet)) __obj.updateDynamic("autogenerate_stylesheet")(autogenerate_stylesheet.asInstanceOf[js.Any])
    if (!js.isUndefined(autogenerate_sytesheet)) __obj.updateDynamic("autogenerate_sytesheet")(autogenerate_sytesheet.asInstanceOf[js.Any])
    if (!js.isUndefined(avoid_overlapped_widgets)) __obj.updateDynamic("avoid_overlapped_widgets")(avoid_overlapped_widgets.asInstanceOf[js.Any])
    if (collision != null) __obj.updateDynamic("collision")(collision.asInstanceOf[js.Any])
    if (draggable != null) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (extra_cols != null) __obj.updateDynamic("extra_cols")(extra_cols.asInstanceOf[js.Any])
    if (extra_rows != null) __obj.updateDynamic("extra_rows")(extra_rows.asInstanceOf[js.Any])
    if (max_cols != null) __obj.updateDynamic("max_cols")(max_cols.asInstanceOf[js.Any])
    if (max_size_x != null) __obj.updateDynamic("max_size_x")(max_size_x.asInstanceOf[js.Any])
    if (min_cols != null) __obj.updateDynamic("min_cols")(min_cols.asInstanceOf[js.Any])
    if (min_rows != null) __obj.updateDynamic("min_rows")(min_rows.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (serialize_params != null) __obj.updateDynamic("serialize_params")(js.Any.fromFunction2((t0: /* $w */ typingsJapgolly.jqueryGridster.JQuery, t1: /* wgd */ typingsJapgolly.jqueryGridster.GridsterCoords) => serialize_params(t0, t1).runNow()))
    if (widget_base_dimensions != null) __obj.updateDynamic("widget_base_dimensions")(widget_base_dimensions.asInstanceOf[js.Any])
    if (widget_margins != null) __obj.updateDynamic("widget_margins")(widget_margins.asInstanceOf[js.Any])
    if (widget_selector != null) __obj.updateDynamic("widget_selector")(widget_selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridsterOptions]
  }
}

