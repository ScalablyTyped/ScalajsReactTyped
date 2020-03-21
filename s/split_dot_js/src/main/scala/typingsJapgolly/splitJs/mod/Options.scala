package typingsJapgolly.splitJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.splitJs.splitJsStrings.`col-resize`
import typingsJapgolly.splitJs.splitJsStrings.`row-resize`
import typingsJapgolly.splitJs.splitJsStrings.height
import typingsJapgolly.splitJs.splitJsStrings.horizontal
import typingsJapgolly.splitJs.splitJsStrings.vertical
import typingsJapgolly.splitJs.splitJsStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  // Cursor to display while dragging.
  var cursor: js.UndefOr[`col-resize` | `row-resize`] = js.undefined
  // Direction to split: horizontal or vertical.
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  // Called to set the style of each element.
  var elementStyle: js.UndefOr[
    js.Function3[
      /* dimension */ width | height, 
      /* elementSize */ Double, 
      /* gutterSize */ Double, 
      CSSStyleDeclarationPartial
    ]
  ] = js.undefined
  // Called to create each gutter element
  var gutter: js.UndefOr[
    js.Function2[/* index */ Double, /* direction */ horizontal | vertical, HTMLElement]
  ] = js.undefined
  // Gutter size in pixels.
  var gutterSize: js.UndefOr[Double] = js.undefined
  // Called to set the style of the gutter.
  var gutterStyle: js.UndefOr[
    js.Function2[/* dimension */ width | height, /* gutterSize */ Double, CSSStyleDeclarationPartial]
  ] = js.undefined
  // Minimum size of each element.
  var minSize: js.UndefOr[Double | js.Array[Double]] = js.undefined
  // Callback on drag.
  var onDrag: js.UndefOr[js.Function1[/* sizes */ js.Array[Double], Unit]] = js.undefined
  // Callback on drag end.
  var onDragEnd: js.UndefOr[js.Function1[/* sizes */ js.Array[Double], Unit]] = js.undefined
  // Callback on drag start.
  var onDragStart: js.UndefOr[js.Function1[/* sizes */ js.Array[Double], Unit]] = js.undefined
  // Initial sizes of each element in percents or CSS values.
  var sizes: js.UndefOr[js.Array[Double]] = js.undefined
  // Snap to minimum size offset in pixels.
  var snapOffset: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cursor: `col-resize` | `row-resize` = null,
    direction: horizontal | vertical = null,
    elementStyle: (/* dimension */ width | height, /* elementSize */ Double, /* gutterSize */ Double) => CallbackTo[CSSStyleDeclarationPartial] = null,
    gutter: (/* index */ Double, /* direction */ horizontal | vertical) => CallbackTo[HTMLElement] = null,
    gutterSize: Int | Double = null,
    gutterStyle: (/* dimension */ width | height, /* gutterSize */ Double) => CallbackTo[CSSStyleDeclarationPartial] = null,
    minSize: Double | js.Array[Double] = null,
    onDrag: /* sizes */ js.Array[Double] => Callback = null,
    onDragEnd: /* sizes */ js.Array[Double] => Callback = null,
    onDragStart: /* sizes */ js.Array[Double] => Callback = null,
    sizes: js.Array[Double] = null,
    snapOffset: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (elementStyle != null) __obj.updateDynamic("elementStyle")(js.Any.fromFunction3((t0: /* dimension */ typingsJapgolly.splitJs.splitJsStrings.width | typingsJapgolly.splitJs.splitJsStrings.height, t1: /* elementSize */ scala.Double, t2: /* gutterSize */ scala.Double) => elementStyle(t0, t1, t2).runNow()))
    if (gutter != null) __obj.updateDynamic("gutter")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* direction */ typingsJapgolly.splitJs.splitJsStrings.horizontal | typingsJapgolly.splitJs.splitJsStrings.vertical) => gutter(t0, t1).runNow()))
    if (gutterSize != null) __obj.updateDynamic("gutterSize")(gutterSize.asInstanceOf[js.Any])
    if (gutterStyle != null) __obj.updateDynamic("gutterStyle")(js.Any.fromFunction2((t0: /* dimension */ typingsJapgolly.splitJs.splitJsStrings.width | typingsJapgolly.splitJs.splitJsStrings.height, t1: /* gutterSize */ scala.Double) => gutterStyle(t0, t1).runNow()))
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: /* sizes */ js.Array[scala.Double]) => onDrag(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: /* sizes */ js.Array[scala.Double]) => onDragEnd(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: /* sizes */ js.Array[scala.Double]) => onDragStart(t0).runNow()))
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (snapOffset != null) __obj.updateDynamic("snapOffset")(snapOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

